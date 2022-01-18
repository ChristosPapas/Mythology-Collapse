import java.util.Scanner;
public class Perseas  {
	private boolean helmet; //variable indicating whether the player has taken the helmet
	private boolean sack;    //variable indicating whether the player has taken the sack
	private boolean sandals;  //variable indicating whether the player has taken the sandals
	private boolean shield;   //variable indicating whether the player has taken the shield
	private boolean sword;    //variable indicating whether the player has taken the sword
	private boolean key=false;  //variable indicating whether the player has taken the key
	private boolean hammer=false;  //variable indicating whether the player has taken the hammer
	private static Quiz q ; //initiating Quiz Object
	Graphics panel;
	public Perseas(Graphics panel)  {  //constructor of the Perseas class
		this.panel=panel;
		q=new Quiz(panel);  //initialize graphics
		initiateStory();   //Method that initiates the story
	}
	private void initiateStory()  { //Method that initiates the story
		helmet=false; //initializing the helmet
		sack=false;   //initializing the sack
		sandals=false;  //initializing the sandals
		shield=false;	//initializing the shield
		sword=false;    //initializing the sword
		panel.setMessage("<html> � ������� ������ ��� ��� ������ �� ��� ������, �� ����� �� ���� ��� ������� �������. <br>"
				+ "��� �������� ��� ������� �� ��� ����� ��� �� ��� ����, ��� ���� ������� ������������� <br>"
				+ "��� ��� �� �������� ��� ������� �� ������ �� ����������� �� �������� ����: <br> <html>");   //Showing the initial message
		showMenu(); //method that shoes the menu
	}
	private void showMenu()  {   //������� ��� ��������� �� �����
		String message="<html> ������� ���� ��� �� �������� ���� ������ �� ����������: <br>" ;//constructing a message  
		int counter=0; //initialize a counter that shows the number that corresponds to each option
		int helmetcounter=0; //initialize a counter that corresponds to the helmet
		int sackcounter=0;   //initialize a counter that corresponds to the sack
		int sandalscounter=0;  //initialize a counter that corresponds to the sandals
		int shieldcounter=0;  //initialize a counter that corresponds to the shield
		int swordcounter=0;   //initialize a counter that corresponds to the sword
		if(!helmet) {
			counter++;
			message = message + "���� "+counter+" ��� �� ������ ��� ������������ ���� ���� �� ���������� ������� ��� ����� ��� <br>"; //updating message
			helmetcounter=counter;
		}
		if(!sack) {
			counter++;
			message = message + "���� "+counter+" ��� �� ������ ��� ������ ���� <br>"; //updating message
			sackcounter=counter;
		}
		if(!sandals) {
			counter++;
			message = message + "���� "+counter+" ��� �� ������ �� ������� ��������, ������ � ����� - �������, ����� �� �����, ��� ���� ��� ��������.<br>"; //updating message
			sandalscounter=counter;
		}
		if(!shield) {
			counter++;
			message = message + "���� "+counter+" ��� �� ������ ��� ���������� ������, ��' ���� �� ������ �� ������ ��� ��������. <br>"; //updating message
			shieldcounter=counter;
		}
		if(!sword) {
			counter++;
			message = message + "���� "+counter+" ��� �� ������ �� ������� ����� � �������, �� �� ����� �� ����� ��� ������ ����� ��� �������. <br>";  //updating message
			swordcounter=counter;
		}
		panel.addMessage(message + "<html>"); //showing message
		int choice = q.takeAnAnswer(counter);
		//depending on the user's choice the appropriate method is activated
		if(choice==helmetcounter) {
			helmetTale();
		}else if(choice==sackcounter) {
			sackTale();
		}else if(choice==sandalscounter) {
			sandalsTale();
		}else if(choice==shieldcounter) {
			sackTale();
		}else if(choice==swordcounter) {
			swordTale();
		}
	}
	private void flowadministrator(String story,String choice)  { //method that manages the flow of the program 
		if(story.equals("sackTale")) { 
			if(choice.equals("outsideCity")) {
				panel.addMessage("<html> O ������� ������ ��� ��� ������ ��� �������� ���� ����� �� ��� ������ �� ��������. � ������� ������ ���� ��� ���������<html> ");
				panel.addMessage("<html> ����� ��� ��� �������� �������� �� ���������? <html>");
				panel.addMessage("<html> 1) ������������ �� ��� ������. <html>");
				panel.addMessage("<html> 2) ���������� ���� ������ <html> ");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					flowadministrator("sackTale","westEast");
				}
				if(choice1==2) {
					flowadministrator("sackTale","confrontGuard");
				}
			}	
			if(choice.equals("westEast")) {
				panel.setMessage("<html> ��� �������� �� �������� �������� <html>");
				panel.addMessage("<html> �� ���������� ������ ��� ����� <html>");
				panel.addMessage("<html> �� ���������� ��������� ��� ����� <html>");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					panel.setMessage("<html> ����������� �� ���������� ������ ��� ����� . <br>"
							+ "��� ����� ��� �������� ���� �������. ��� ������������ <br>"
							+ "��� ���������� ��� ��� ����������� ��� �������� ���� <br>"
							+ "����� �� ������ ���� ���� ���� ���� ���� �������� ���������� <br> <html>");
					flowadministrator("sackTale", "West");
				}
				if(choice1==2) {
					panel.setMessage(" <html> ����� �������� ���� �� ��������� ��������� <br>"
							+ " ��� ���������� ����. �� ������ ����� <html>");
					flowadministrator("sackTale", "East");
				}
			}
			if(choice.equals("confrontGuard")) {                                                           
				confrontGuard();
				showMenu();
			}
			if(choice.equals("West")) {																
				westStory();
				panel.setMessage("<html> � ����� ���������� ���� ��� ��� �� ������ ��� ����� <html>");
				flowadministrator("sackTale","outsideCity");
			}
			if(choice.equals("East")) {																
				eastStory();
				panel.setMessage("<html> � ����� ���������� ���� ��� ��� �� ������ ��� ����� <html>");
				flowadministrator("sackTale","outsideCity");
			}
		}
		if(story.equals("swordTale")) { 
			if(choice.equals("1")) {
				panel.setMessage("<html> �� ������� ��� ������� ���� <br>"
						+ "���������� ��� ������ ��� �� �� �������� ��� ������� ����. ������ ���� � �������� ����� ������������ ��� <br>"
						+ "��� ������� ��� ������ ��� ����� �� ����� ��� ��� ������ �� ����� <br> <html>");
				sword=true;
				showMenu();
			}else if(choice.equals("2")) {
				aelasTale();
			}else if(choice.equals("3")) {
				panel.setMessage("<html> � �������� ����� ��������� ��� ��� ��������� ��� ������ �� ����� ��� ������ ��� �� ���������� ��� �� �����. <br>"
						+ "��� ���� ������� ��� ������ �� ��� ����. ��� �� ��� ������ �� ����� ������ �� ��������� ���� ���� �������� �������: <br>"
						+ "����� ���� ���� �� ���� ��� �� �����; <br> <html>");
				panel.addMessage("<html> ��� �������������� �� �������� ��� ��������: <br>"
						+ "1) �������� <br>"
						+ "2) ���� <br> <html>");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					panel.setMessage("<html> � �������� ��� ����� �����. � ����� ��� ����� �� ����� <html>");
					helmet=true;
					showMenu();
				}else {
					panel.setMessage("<html> � �������� ����� ����� ��� � �������� �������� ��� �������� ��� ������ <html>");
					deathMessage();
				}
			}
		}
	}
	private void helmetTale() { //the method that represents the story to get the helmet
	       panel.setMessage("<html> ��� �� ��������� ��� ������������ ��� ��� � ����� ��� ����� ��� ���� �������: <br>"
	                       + "�� �� ������������� � ���� ��� �� ���������� �� ��� ������; <br>"
                            + "1) ������ <br> "
                            + "2)  ������� <br> <html>");
	       int choice = q.takeAnAnswer(2);
            if(choice==1) {
		      panel.setMessage("<html> � �������� ��� ����� �����. � ������� ������� ��� ������������ <html>");
		      showMenu();
	       }else {
	    	   	  panel.setMessage("<html> � �������� ��� ����� �����. � ������� ��� ������� ��� ������������.<br>");
                  panel.addMessage(" ����� ��� ������� �������� <br>"               
                                   + "� ���� ���� � ���� ���: <br>"
                                   + "1) ������� <br>"
                                   + "2) ���� ������ <br> <html>");
                   choice=q.takeAnAnswer(2);
                   if(choice==2) {
                	 panel.setMessage("<html> � �������� ��� ����� �����. � ������� ������� ��� ������������ <html>");
		             showMenu();
	              }else {
	            	  	  panel.setMessage("<html> � �������� ��� ����� �����. � ������� ��� ������� ��� ������������ <html>");                     
                          deathMessage();
                   }
	       }
	}       
	private void sandalsTale()  { //the method that represents the story to get the sandals 
			 panel.setMessage("<html> ��� �� ��������� �� ������� �������� � ����� ��� ����� ��� ���� �������: <br>"
	                         + "���� ������� ��������� �� ������� ������� �� ��� ��������; <br>"
                              + "1) ������� <br>"
                              + "2) ������� <br> <html>");
             int choice = q.takeAnAnswer(2);
             if(choice==1) {
		        panel.setMessage("<html> � �������� ��� ����� �����. � ������� ������� �� ������� �������� <html>");
		        showMenu();
	         }else {
          	         panel.setMessage("<html> � �������� ��� ����� �����. � ������� ��� ������� �� ������� ��������. <br>");
          	         panel.addMessage("<html> ����� ��� ������� �������� <br>"               
                                     + "��� ����� � �������� �������; <br>"
                                     + "1) �������� ����� ����� ����� <br>"
                                     + "2) � ������ ��� ��� ������� ��� ���� ��� ������� ��� ������ <br> <html>");
	                 choice = q.takeAnAnswer(2);
                     if(choice==2) {
		               panel.setMessage("<html> � �������� ��� ����� �����. � ������� ������� �� ������� �������� <html>");
		               showMenu();
	                }else {
                            panel.setMessage("<html> � �������� ��� ����� �����. � ������� ��� ������� �� ������� �������� <html>");                     
                            deathMessage();
                     }
              }
	}
	private void sackTale()  {  //the method that represents the story to get the sack
		panel.setMessage("<html> O �������  ������ ��� ������  ��� ������� �������. <br>"
				+ " �������� �������� ����������� �������� ��� � ����� ��� � ������ ��������� ���� ��� �� ����� ��� ����� ���. <br> <html>");
		flowadministrator("sackTale","outsideCity");
		
	}
	private void swordTale() { //the method that represents the story to get the sword
		panel.setMessage("<html> � ����� ������� ��� ������ ���� ���� ��� ����������� (������� ���� ��� ����� ��� ����� ��� �������).<br> "
				+ "��� �� ��������� �� ������ ����� ��� �� �������� ��� ������� ������ �� ������������� ��� ������� ��� ����������� ����: <br> "
				+ "���� � ������� ������ ��� ��� ���� �� ����� ����� ��� ����������� ��� ����� 2 ��������: <br>"
				+ "1) �� �������� �� ��� ��������� ������� ��� ������� �� ��������� �� ����� <br>"
				+ "2) �� ��� �������� ���� ���������� ��� �������� ��� ������� ��� ��� ��������� �� ����������� ��� ����� <br> <html>");
		panel.addMessage("<html> ��� �������������� �� �������� ����� �������� <html>");
		panel.addMessage("<html> 1) �������������� ��� �� ��� ��� �������� � ������� ������� �� ����� ��� ��� ���������� ���� ������� <html>");
		panel.addMessage("<html> 2) � ������� �������� �� ��� ������� ��� ������� �� ���������� �������� <br>"
				+"��� ������� ��� �� ��� ��� �� ��� �������� ���� ���� �������� ��� ��������  <html>");
		panel.addMessage("<html> 3) � ������� �������� �� �������� ��� ������ ��� ���� �� ����������a �� ����� <html>");
		int choice = q.takeAnAnswer(3);
		String Schoice=String.valueOf(choice);
		flowadministrator("swordTale",Schoice);
	}
	private void aelasTale() {  //aelasTale is a substory of the swordTale
		panel.setMessage("<html> � ������� ��� � ����� ������������ �������� ��� ������� (������� ��� ����). <br>"
				+ "���� ��� ����� �������� ������� ����� �������� ���� ������ ��� ��������� �� ������� ������. <br> "
				+ "� �������� ����� ������ ��� �������� ��� ������ �� ���� �� �� �� ������ ���� <br> <html>");
		panel.addMessage("<html> ��������������� ����� �������� ��� ������ <html>");
		panel.addMessage("<html> ���������� �� ������ �� ������� ������ <html>");
		int choice = q.takeAnAnswer(2);
		if(choice==1) {
			panel.setMessage("<html> �� ���������� ��� �������� ��������������� ����� �������� ��� ������ ��� �������������� ����. <br>"
			  		+ "�� ����� ������ ���� ������ ����� ��� ���������� �� ������ �� ����� ��� ����� ���� ������� �� ��������� <br>"
			  		+ " �� ������� ���� ������� ���������� ����� �������� ��� ���������. ���� ������ ���� ������� � �������. <br>"
			  		+ " ��������� ���� ������ ��� ������ �� ���� ������ ��������� ��� ������� ��� ������� ���. � ����� ���������� �� �������� ��� ������ <br> <html>");
			panel.addMessage("<html> 1) �� ��������� ���� ������� ����� ������� ���� ������������ ��� ������ <html>");
			panel.addMessage("<html> 2) �� ����������� ��� ���������� ���� ��� ��� ��������� ��� ��������� <html>");
			choice = q.takeAnAnswer(2);
			if(choice==1) {
				panel.setMessage(" <html> �� �������� ������ ���� �� ���������� �� ���������� ��� ���� �� ��������� ��� �� ���������� ����� ���������� ��� ������. <br>"
				  		+ "To ���������� ����������� ��� ������� ���������� ���� ���� �� ���������� �� ���������� ��� ���� �� ������� �� ����. <br>"
				  		+ "���� ��� ���� ��� ����� � ������� ������ ��� ���� �� �������� ��� ������ ��������������. <br> <html>");
				panel.addMessage("<html> �� ��� �� �������� ������? <html>");
				panel.addMessage("<html> 1) ��������� ��� ������� ��� �������� �� ���� <html>");
				panel.addMessage("<html> 2) ������� ��� �� ����� ��� ����� ���������� ���� ��� ��� �� ����� <html>");
				choice = q.takeAnAnswer(2);
				if(choice==1) {
					panel.setMessage("<html>  ������� ���������� ��� ���� ��� �������� ���. � �������� �� �������� ��� ��  ������������ ��� ������ ��� ����� <br>" 
							  +"��� ���������� ������ ��� �� ������� ��� �������. � ������� �������� ��� �� �������� ��� �� ��������� ��� ���������� ��� <br> <html>");
					shield=true;
					showMenu();
			    }
			    if(choice==2) {
					  sword=true;
					  showMenu();
				}
			  }
			  if(choice==2) {
				  panel.setMessage("<html> �� ���������� ��� ���� ���������� ���� ��� ��� ��������� ��������� ����. � ������� ����������� �� �������� ������. <br>" 
						  +"���� ��� ���������� ��� ������� �� ���������� ��� ������� ���� ��������� ������ ��� ������ <br>"
						  + "��� ��������� �� �������� �������� ��� ������ ���� ���������, �� ����� ��� ���������� ��� ����� <br>." 
						  +"O ������� ��������� ��� ������ ������������� ��� ����� ��� �����:  <br> <html>");
				  panel.addMessage("<html> 1) ���������� �� ��� �������� ��� ������ <html>");
				  panel.addMessage("<html> 2) ������� ��� ������ ����� <html>");
				  choice = q.takeAnAnswer(2);
				  if(choice==1) {
					  panel.setMessage("<html> ���������� � ����� ������� ��� ������ ���� �� ���������� ����������� ��� ������� ���. <br>"
					  		+ " ���� �������� ������ ���� ��� ���� ��� ��������� �� ��� <br>"
					  		+ "������� ��� ������ ����� ��� �������� ��� ������ ��� ������� ���. <br>"
					  		+ "������������ ��� �������� ����� �� ��� ����� �� ����� <br> <html>");
					  showMenu();
				  }
				  if(choice==2) {
					  panel.setMessage("<html> ���������� � ����� ������� ��� ������ ���� �� ���������� ����������� ��� ������� ���. <br>"
					  		+ "���������� ��� ������ ��� ��� ������� ��� ����� �� ����� ��� �� ��������� ������� ���� ���� ���������. <br> <html>");
					  sword=true;
					  showMenu();
				  }
			  }
		}
		if(choice==2) { 
			panel.setMessage("<html> �� ���������� ��� ���� ���������� �� ������ ���� �� �������� ��� ������. <br>"
					+ "���� �� �������� ��� �������� ���� ���������� �� �������� ��� ������� ������ �� ������� �����. <br>"
					+ "�������� ��� ��������� ��� ������� �� ���������� �� ������� ������� ��� �������. <br>"
					+ "� �������� ����� ������ ��� ��� ����� ���� ��� ����� ��� ������ <br> <html>");
			choice = q.takeAnAnswer(2);
			if(choice==1) {
				panel.setMessage("<html> H ���� ������ ������� �� ��� ������� ������ ���� �� ���������� ������������ ��� <html>");
				deathMessage();
			}
			if(choice==2) {
				panel.setMessage("<html> ���� �� ������� ��� �������� ���������� ���������� <br>"
						+ "���� ������� ��������� � ������ ���� ���������� ��� �� ������ ��� ������. <br> "
						+ "�� �� ������� ��� ������� ������ ��� ������ �� ������� �������� <br> <html>");
				panel.setMessage("<html> � �������� ��� ����� �� ����� <html>");
			    sword=true;
			    showMenu();
			}
		}
	}
	public void confrontGuard() {  //confront guard is a substory of the sackTale
		panel.setMessage("<html> ���������� ���� ������ <html>");
		if(sword) {
			panel.addMessage("<html> ������ ����� �� ����� ������ ��� ������  <br>"
					+ "���� ���� ������ �� ������ ���� ����. ��� �������������� <br>"
					+ "�� �������� ��������	<br> <html>");
			int count=0;
			int keycounter=0;
			int hammercounter=0;
			if(key) {
				panel.addMessage("<html>" + (++count) +") �������� ��� ����� �� �� ������ ��� ����� <html>");
				keycounter=count;
			}
			if(hammer) {
				panel.addMessage("<html>" + (++count)+") ����� ��� ����� �� �� �����");
				hammercounter=count;
			}
			panel.addMessage("<html>" + (++count)+") ����� ��� ����� �� �� ����� ���");
			int handcounter=count;
			int choice1=q.takeAnAnswer(count);
			if(choice1 == hammercounter) {
				panel.setMessage("<html> �������� �� �������� ��� ����� ���� ���� <br> "
						+ "����� �������� ��� ������� ���� ��� �������� �������. �� ������? <br> <html>");     
				panel.addMessage("<html> 1) ���������� ���� ������? <html>");
				panel.addMessage("<html> 2) ������ �� ����������������� �� �� ������� <br> <html>");
				choice1=q.takeAnAnswer(count);
				if(choice1 == 1) {
					panel.setMessage("<html> ���������� ���� ������ ������ ���� <br>"
							+ "�� �������� ��� ������� ����������� <br> <html");
					deathMessage();
				}
				if(choice1 == 2) {
					panel.setMessage("<html> �� ���������� ��� ������� ��� ������� ���� ������� ��� ������ <html>");
					panel.addMessage("<html> � �������� ��� ���������� ��� ���� ��� ������ �������� �� �������� ��� <br>"
							+ "�� ��� ����� ��� ������ ���� ��� ���� ���: �� ����������� ����� �� ��� ������� ���<html> <html>");
					panel.addMessage("<html> ����� ����������� ��� �������� ��� �������; <html>");
					panel.addMessage("<html> 1. � ���� ���� <html>");
					panel.addMessage("<html> 2. � ���� �������� <html>");
					panel.addMessage("<html> 3. � ��������� ��� ������ <html>");
					panel.addMessage("<html> 4. � ��� ����� <html>");
					choice1=q.takeAnAnswer(4);
					if (choice1 == 4) {
						panel.setMessage("<html> ����� �������� ��������� ��� ������ ���� <html>");
						sack=true;
					} else {
						panel.setMessage("<html> � �������� ��� ����� ������. � �������� ��� ������� <br> <html>");
						deathMessage();
					}
				}
			}
			if (choice1 == handcounter ) {
				panel.setMessage("<html> ��� �������� �� ������� ��� ����� �� �� ����� ���  <html>");
				flowadministrator("sackTale", "outsideCity");
			}
			if (choice1 == keycounter) {
				panel.setMessage("<html> �������� ���� ���� ���� �� �� ������� ������ ��� ����� <br>"
						+ "� ������� �� ����������� ��� ��� ������ ����� ���� ������� ��� ������ <br> <html>");
				panel.addMessage("<html> � �������� ����������� ��� ����� �� �������� ������  <br>"
						+ "������ �� ������ ��� ��� �� ������ ��� ������ ����. <html>");
				panel.addMessage("<html> �������� ��� �� ��� ���������� ����� �� ��� ������� �� ��� ��� ����� <html>");
				panel.addMessage("<html> ����� ���� �� ������ ��� �������; <html>");
				panel.addMessage("<html> 1. � ������ ��� � ������ <html>");
				panel.addMessage("<html> 2. � ���� ��� � ������ <html>");
				panel.addMessage("<html> 3. � ���� ��� � ������� <html>");
				panel.addMessage("<html> 4. � ������ ��� � ������ <html>");
				choice1=q.takeAnAnswer(4);
				if (choice1 == 4) {
					panel.setMessage("<html> ����� �������� ��������� ��� ������ ���� <html>");
					sack=true;
				} else {
					panel.setMessage("<html> � �������� ��� ����� ������. � �������� ��� ������� <html>");
					deathMessage();
				}
			}
		} else {
			panel.setMessage("<html> � ������� ��� ���������� ������ ��� ����� �� ����� <html>");
			flowadministrator("sackTale", "outsideCity");
		}
	}
	public void westStory()  { //westStory is a substory of the sackTale where the player goes to the West
		panel.setMessage("<html> ����������� �� ���������� ������ ��� �����. <br>"
				+ "��� ����� ��� �������� ���� �������. ��� ������������ ��� <br>"
				+ "���������� ��� ��� ����������� ��� �������� ���� ����� �� ������ <br>"
				+ " ���� ���� ���� ���� ���� �������� ���������� <br> <html>");
		panel.addMessage("<html> ����������� �� ������������� ��� ������� <html>");
		panel.addMessage("<html> ����������� ��� ������� ���� ���� ���� ��� ����������� <br>"
				+ "��� ����� ���� ���� ����� ��� ������� ������� ������� <html>");
		panel.addMessage("<html> ����� ��� �������� �������� <html>");
		panel.addMessage("<html> 1) ���������� ���� ���� ���� ��� ����� ������ <html>");
		panel.addMessage("<html> 2) ����� ��������� ������������ ���� ������� �� ������� ������ <html>");
		int choice1=q.takeAnAnswer(2);
		if (choice1 == 1) {
			panel.setMessage("<html> �� �� ��� �������� ��� ����� ���������������� ��� ��������� <br>"
					+ "��� ��� ������ ��� ��� ���������� ��� ���� �� ������� ��� �������. <br>"
					+ "� �������� ������������ ��� ���� ������ ���� ������� �������  ��� <br>"
					+ "��������� ������� ���� �������  <html>");
			panel.addMessage("<html> ����� ��� �������� ��������: <html>");
			panel.addMessage("<html> 1) �������� ���� �������� ��� �������� <html>");
			panel.addMessage("<html> 2) ����������� �� ���������� ��� ��� ���� <html>");
			choice1=q.takeAnAnswer(2);
			if (choice1 == 1) {
				panel.setMessage("<html> � ��������� ��� ���������������� ���� ���� ��������� ��� ����� <br>" 
						+ "������� ��� ������� ��� ������� � ������ ��� ������ �� ������� �������. �������� �� �������� ��� <br>"
						+ "��� ��� ���� ���������� �� ��� ����� ��� ������ ����� �� ���������� ����� �� ���� ������� <html>");
				panel.addMessage("�� �������� �� �� ����� ���� ��� ������;");
				panel.addMessage("1. ����� ��� �������");
				panel.addMessage("2. ������� ������");
				panel.addMessage("3. ����� ���� �����");
				panel.addMessage("4. �������� ����");
				choice1=q.takeAnAnswer(4);
				if (choice1 == 4) {
					panel.setMessage("<html> ����� �������� ��������� ��� ������ ���� <html>");
					sack=true;
				} else {
					panel.setMessage("<html> � �������� ��� ����� �����. � �������� ��� ������� <html>");
					deathMessage();
				}
			}
			if (choice1==2) {
				panel.setMessage("<html> �� ������� ��� ������� ����������� ���������� ��� ��� ���� ��� ������ <html>");
				deathMessage();
			}
		}
		if (choice1 == 2) {
			panel.setMessage("<html> O �������� ���������� ������ ���� ���� ���� <br>"
					+ "�� �� ��� ������� ���� ������ ���������� �� �������� ���� ���� ���� <br>"
					+ "����� �������� ��� ���� �� ����� �� ������� ������� ��� �� ����������� ��� �������� ����� ��������� ��� ������� <br>"
					+ "���� ������ �� ����� ��� �������� ��� � �������� ���� ������ ������������� ��� �� ������� <br>"
					+ "��� ������������ ��� ��������� ���� �������� ��� ��� ��� ���� ��� ������ ��� ������ ���� <br> <html>");
			sack=true;
		}
	}
	public void eastStory() { //eastStory is a substory of the sackTale where the player goes to the East
		panel.setMessage("<html> ����� �������� ���� �� ��������� ���������� ��� ���������� ����. �� ������ ����� <html>");
		panel.addMessage("<html> 1) ���������� ���� ������� <html>");
		panel.addMessage("<html> 2) ������ ���� ������� ��� ����� <html>");
		panel.addMessage("<html> 3) ����������� ���� ��� �� ������ ��� ����� <html>");
		int choice1=q.takeAnAnswer(3);
		while (choice1 != 3) {
			if (choice1 == 1 ) {
				    panel.setMessage("<html> ���� ���� ��� ��������� ��� ����� ���� ����� ����������� ��� ���������� ��� <html>");
				    panel.addMessage("<html> � ������ ������������ ��� ��� ������� ��� ��� ����������� �� ��� ����� �� <br>"
							+ "������ ��� ����� �� ����������� ����� �� ��� ������� ��� <br> <html>");
				    panel.addMessage("<html> ����� ������ ����� ������ ����� ������� ��� �� �������� ��� ����� �� ���� ������; <html>");
				    panel.addMessage("<html> 1. � ������ <html>" );
				    panel.addMessage("<html> 2. � ������ <html>");
				    panel.addMessage("<html> 3. � ��������� <html>");
				    panel.addMessage("<html> 4. � ����� <html>");
					choice1=q.takeAnAnswer(4);
					if (choice1 ==4 ) {
						panel.setMessage("<html> ���������� ����� �������� �� ������ ��� ����� <html>");
						key=true;
					} else {
						panel.setMessage("<html> ���������� ����� <html>");
					}
			}else if (choice1 == 2 ) {
				panel.setMessage("<html> � �������� ������ ��� ������� ��� ��� ��������������� �� ��� ����� ��� ��� �� ����������� <br ><html>");
				panel.addMessage("<html> 1) To ����� <html>");
				panel.addMessage("<html> 2) ��� ����� ������ ���������� ��� �� ������ ��� ����� ��� ����� <html>");
				choice1=q.takeAnAnswer(2);
				if (choice1==1) {
					panel.setMessage("<html> ������������ ����� �� ����� <html>");
					sword=true;
				} else {
					panel.setMessage("<html> ������������ ����� �� ����� <html>");
					hammer=true;
				}
			}
			panel.addMessage("<html> �������� �� �� ������ ���� <html>");
			panel.addMessage("<html> 1) ���������� ���� ������� <html>");
			panel.addMessage("<html> 2) ������ ���� ������� ��� ����� <html>");
			panel.addMessage("<html> 3) ����������� ���� ��� �� ������ ��� ����� <html>");
			choice1=q.takeAnAnswer(3);
		}
	}
	private void deathMessage() { //method that shows the death message and redirects the user to the menu
		panel.addMessage("<html> ������ �� ��������, ���� 1 �� ��� �� ����������� �� ������� <br>"
				+ "� 2 �� ��� �� ���������� ��� ��� ���� � 3 �� ��� �� ��� ��� ��������� checkpoint <br> <html>");
		Scanner in=new Scanner(System.in);
		int choice=q.takeAnAnswer(3);
		if(choice==2) {
			initiateStory();
		}else if (choice==3) {
			showMenu();
		}
	}
}
