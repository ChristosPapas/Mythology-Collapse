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
		panel.setImage("/resources/medusa.png");
		q=new Quiz(panel);  //initialize graphics
		initiateStory();   //Method that initiates the story
	}
	private void initiateStory()  { //Method that initiates the story
		helmet=false; //initializing the helmet
		sack=false;   //initializing the sack
		sandals=false;  //initializing the sandals
		shield=false;	//initializing the shield
		sword=false;    //initializing the sword
		panel.setMessage("<html> Ï ÐåñóÝáò öåýãåé áðü ôçí ÓÝñéöï ìå Ýíá êáñÜâé, ìå óêïðü íá âñåé ôçí Ãïñãüíá ÌÝäïõóá. <br>"
				+ "Óôç äéáäñïìÞ ôïõ óõíáíôÜ ôç èåÜ ÁèçíÜ êáé ôï èåü ÅñìÞ, áðü ôïõò ïðïßïõò ðëçñïöïñåßôáé <br>"
				+ "ðùò ãéá íá óêïôþóåé ôçí ÌÝäïõóá èá ðñÝðåé íá ðñïìçèåõôåß ôá ðáñáêÜôù üðëá: <br> <html>");   //Showing the initial message
		showMenu(); //method that shoes the menu
	}
	private void showMenu()  {   //ìÝèïäïò ðïõ åìöáíßæåé ôï ìåíïõ
		String message="<html> Åðßëåîå ðïéï áðü ôá ðáñáêÜôù üðëá èÝëåôå íá áðïêôÞóåôå: <br>" ;//constructing a message  
		int counter=0; //initialize a counter that shows the number that corresponds to each option
		int helmetcounter=0; //initialize a counter that corresponds to the helmet
		int sackcounter=0;   //initialize a counter that corresponds to the sack
		int sandalscounter=0;  //initialize a counter that corresponds to the sandals
		int shieldcounter=0;  //initialize a counter that corresponds to the shield
		int swordcounter=0;   //initialize a counter that corresponds to the sword
		if(!helmet) {
			counter++;
			message = message + "Ðáôá "+counter+" ãéá íá ðÜñåéò ôçí ðåñéêåöáëáßá Ýôóé þóôå íá ðëçóéÜóåéò áüñáôïò ôïí óôü÷ï óïõ <br>"; //updating message
			helmetcounter=counter;
		}
		if(!sack) {
			counter++;
			message = message + "Ðáôá "+counter+" ãéá íá ðÜñåéò ôïí ìáãéêü óÜêï <br>"; //updating message
			sackcounter=counter;
		}
		if(!sandals) {
			counter++;
			message = message + "Ðáôá "+counter+" ãéá íá ðÜñåéò ôá öôåñùôÜ óáíäÜëéá, åðåéäÞ ç Ãïñãþ - ÌÝäïõóá, Ýìåíå óå âñÜ÷ï, óôç ìÝóç ôçò èÜëáóóáò.<br>"; //updating message
			sandalscounter=counter;
		}
		if(!shield) {
			counter++;
			message = message + "Ðáôá "+counter+" ãéá íá ðÜñåéò ôçí áóôñáöôåñÞ áóðßäá, áð' üðïõ èá Ýâëåðå ôï êåöÜëé ôçò ÌÝäïõóáò. <br>"; //updating message
			shieldcounter=counter;
		}
		if(!sword) {
			counter++;
			message = message + "Ðáôá "+counter+" ãéá íá ðÜñåéò ôï êïöôåñü óðáèß Þ äñåðÜíé, ìå ôï ïðïßï èá Ýêïâå ôïí óêëçñü ëáéìü ôçò Ãïñãïýò. <br>";  //updating message
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
				panel.addMessage("<html> O ÐåñóÝáò æçôÜåé áðü ôïí öñïõñü ðïõ óôÝêåôáé óôçí ðüñôá íá ôïí áöÞóåé íá åéóÝëèåé. Ï öñïõñüò ðáñüëá áõôÜ ôïí åìðïäßæåé<html> ");
				panel.addMessage("<html> Ðïéåò áðï ôéò ðáñáêÜôù åðéëïãÝò èá åðéëÝãáôå? <html>");
				panel.addMessage("<html> 1) ÓõìâéâÜæåóôå ìå ôïí öñïõñü. <html>");
				panel.addMessage("<html> 2) Åðéôßèåóôå óôïí öñïõñü <html> ");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					flowadministrator("sackTale","westEast");
				}
				if(choice1==2) {
					flowadministrator("sackTale","confrontGuard");
				}
			}	
			if(choice.equals("westEast")) {
				panel.setMessage("<html> Óáò äßíïíôáé ïé ðáñáêÜôù åðéëïãÝò <html>");
				panel.addMessage("<html> Íá êéíåéèåßôå äõôéêÜ ôçò ðüëçò <html>");
				panel.addMessage("<html> Íá êéíåéèåßôå áíáôïëéêÜ ôçò ðüëçò <html>");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					panel.setMessage("<html> Áðïöáóßæåôå íá êéíåéèåßôå äõôéêÜ ôçò ðüëçò . <br>"
							+ "Óôï äñüìï óáò âñßóêåôå Ýíáí ãÝñïíôá. Ôïõ åîéóôïñåßåôå <br>"
							+ "ôçí ðåñéðÝôåéÜ óáò êáé éó÷õñßæåôáé üôé ãíùñßæåé Ýíáí <br>"
							+ "ôñüðï íá ìðåßôå ìÝóá óôçí ðüëç ìÝóï åíüò ìõóôçêïý ðåñÜóìáôïò <br> <html>");
					flowadministrator("sackTale", "West");
				}
				if(choice1==2) {
					panel.setMessage(" <html> Êáèþò êéíåßóôå ðñïò ôá áíáôïëéêÜ óõíáíôÜôå <br>"
							+ " ìßá êáéíïýñãéá ðüëç. Ôé êÜíåôå ðñþôá <html>");
					flowadministrator("sackTale", "East");
				}
			}
			if(choice.equals("confrontGuard")) {                                                           
				confrontGuard();
				showMenu();
			}
			if(choice.equals("West")) {																
				westStory();
				panel.setMessage("<html> Ï ÁÝëáò åðéóôñÝöåé ðÜëé Ýîù áðü ôá ôïé÷ïò ôçò ðüëçò <html>");
				flowadministrator("sackTale","outsideCity");
			}
			if(choice.equals("East")) {																
				eastStory();
				panel.setMessage("<html> Ï ÁÝëáò åðéóôñÝöåé ðÜëé Ýîù áðü ôá ôïé÷ïò ôçò ðüëçò <html>");
				flowadministrator("sackTale","outsideCity");
			}
		}
		if(story.equals("swordTale")) { 
			if(choice.equals("1")) {
				panel.setMessage("<html> Ïé öñïõñïß ôïõ âáóéëéÜ ÁÝëá <br>"
						+ "åìðïäßæïõí ôïí ÐåñóÝá áðü ôï íá óêïôþóåé ôïí âáóéëéÜ ôïõò. Ðáñüëá áõôÜ ï âáóéëéÜò üíôáò óïêáñéóìÝíïò áðü <br>"
						+ "ôçí áíäñåßá ôïõ ÐåñóÝá ôïõ äßíåé ôï óðáèß êáé ôïí áöÞíåé íá öýãåé <br> <html>");
				sword=true;
				showMenu();
			}else if(choice.equals("2")) {
				aelasTale();
			}else if(choice.equals("3")) {
				panel.setMessage("<html> Ï âáóéëéÜò ÁÝëáò óïêÜñåôáé áðü ôçí áíôßäñáóç ôïõ ÐåñóÝá íá äþóåé ôïí áäåñöü ôïõ óå áíôÜëëáãìá ãéá ôï óðáèß. <br>"
						+ "Ãéá áýôï êëåßíåé ôïí ðåñóÝá óå Ýíá êåëß. Ãéá íá ôïí áöÞóåé íá öýãåé ðñÝðåé íá áðáíôÞóåé óùôÜ óôçí ðáñáêÜôù åñþôçóç: <br>"
						+ "Ðïéïò èåüò Ý÷åé ùò éåñü æþï ôá Üëïãá; <br> <html>");
				panel.addMessage("<html> Óáò ðáñïõóéÜæïíôáé ïé ðáñáêÜôù äýï åðéëïãÝò: <br>"
						+ "1) Äéüíõóïò <br>"
						+ "2) Äéáò <br> <html>");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé óùóôÞ. Ï ÁÝëáò óáò äßíåé ôï óðáèß <html>");
					helmet=true;
					showMenu();
				}else {
					panel.setMessage("<html> Ç áðÜíôçóç åßíáé ëÜèïò êáé ï âáóéëéÜò äéáôÜæåé ôçí åêôÝëåóç ôïõ ÐåñóÝá <html>");
					deathMessage();
				}
			}
		}
	}
	private void helmetTale() { //the method that represents the story to get the helmet
	       panel.setMessage("<html> Ãéá íá áðïêôÞóåé ôçí ðåñéêåöáëáßá ôïõ ¢äç ç ÁèÞíá ôïõ êÜíåé ôçí åîÞò åñþôçóç: <br>"
	                       + "Óå ôé ìåôáìïñöþèçêå ï Äßáò ãéá íá óõíåõñåèåß ìå ôçí Åõñþðç; <br>"
                            + "1) Ôáýñïò <br> "
                            + "2)  Óýííåöï <br> <html>");
	       int choice = q.takeAnAnswer(2);
            if(choice==1) {
		      panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé óùóôÞ. Ï ÐåñóÝáò ðáßñíåé ôçí ðåñéêåöáëáßá <html>");
		      showMenu();
	       }else {
	    	   	  panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé ëáèüò. Ï ÐåñóÝáò äåí ðáßñíåé ôçí ðåñéêåöáëáßá.<br>");
                  panel.addMessage(" ¸÷åôå ìßá äåýôåñç åõêáéñßá <br>"               
                                   + "Ï ¢äçò Þôáí ï èåüò ôïõ: <br>"
                                   + "1) ÐïëÝìïõ <br>"
                                   + "2) ÊÜôù Êüóìïõ <br> <html>");
                   choice=q.takeAnAnswer(2);
                   if(choice==2) {
                	 panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé óùóôÞ. Ï ÐåñóÝáò ðáßñíåé ôçí ðåñéêåöáëáßá <html>");
		             showMenu();
	              }else {
	            	  	  panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé ëáèüò. Ï ÐåñóÝáò äåí ðáßñíåé ôçí ðåñéêåöáëáßá <html>");                     
                          deathMessage();
                   }
	       }
	}       
	private void sandalsTale()  { //the method that represents the story to get the sandals 
			 panel.setMessage("<html> Ãéá íá áðïêôÞóåé ôá öôåñùôÜ óáíäÜëéá ï ÅñìÞò ôïõ êÜíåé ôçí åîÞò åñþôçóç: <br>"
	                         + "Ðïéá èåüôçôá óõíäÝåôáé ìå äåóìïýò áßìáôïò ìå ôçí Áöñïäßôç; <br>"
                              + "1) Ïõñáíüò <br>"
                              + "2) Ùêåáíüò <br> <html>");
             int choice = q.takeAnAnswer(2);
             if(choice==1) {
		        panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé óùóôÞ. Ï ÐåñóÝáò ðáßñíåé ôá öôåñùôÜ óáíäÜëéá <html>");
		        showMenu();
	         }else {
          	         panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé ëáèüò. Ï ÐåñóÝáò äåí ðáßñíåé ôá öôåñùôÜ óáíäÜëéá. <br>");
          	         panel.addMessage("<html> ¸÷åôå ìßá äåýôåñç åõêáéñßá <br>"               
                                     + "Ðùò Ýãéíå ï Á÷éëëÝáò Üôñùôïò; <br>"
                                     + "1) ÌåãÜëùóå äßðëá óôïõò èåïýò <br>"
                                     + "2) Ç ìçôÝñá ôïõ ôïí âïýôçîå óôá íåñÜ ôïõ ðïôáìïý ôçò Óôýãáò <br> <html>");
	                 choice = q.takeAnAnswer(2);
                     if(choice==2) {
		               panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé óùóôÞ. Ï ÐåñóÝáò ðáßñíåé ôá öôåñùôÜ óáíäÜëéá <html>");
		               showMenu();
	                }else {
                            panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé ëáèüò. Ï ÐåñóÝáò äåí ðáßñíåé ôá öôåñùôÜ óáíäÜëéá <html>");                     
                            deathMessage();
                     }
              }
	}
	private void sackTale()  {  //the method that represents the story to get the sack
		panel.setMessage("<html> O Ðåñóåáò  öôÜíåé óôï ðáëÜôé  ôïõ âáóéëéÜ Áêßíïïõ. <br>"
				+ " Ñùôþíôáò êÜðïéïõò ðåñáóôéêïýò ìáèáßíåé üôé ï óÜêïò êáé ç áóðßäá âñßóêåôáé ðßóù áðü ôá ôïß÷ç ôçò ðüëçò ôïõ. <br> <html>");
		flowadministrator("sackTale","outsideCity");
		
	}
	private void swordTale() { //the method that represents the story to get the sword
		panel.setMessage("<html> Ç ÁèçíÜ ïäÞãçóå ôïí ÐåñóÝá óôçí ÷þñá ôùí Õðåñâïñåßùí (ìõèéêüò ëáüò ðïõ æïýóå óôá âïõíÜ ôçò ÅëëÜäáò).<br> "
				+ "Ãéá íá áðïêôÞóåé ôï ìõèéêü óðáèß ðïõ èá óêïôþóåé ôçí ÌÝäïõóá ðñÝðåé íá áíôéìåôùðßóåé ôïí âáóéëéÜ ôùí Õðåñâïñåßùí ÁÝëá: <br> "
				+ "¼ôáí ï ÐåñóÝáò ÆçôÜåé áðü ôïí ÁÝëá ôï óðáèß áõôüò ôïõ ðáñïõóéÜæåé ôéò åîåßò 2 åðéëïãÝò: <br>"
				+ "1) Íá èõóéÜóåé ôï ðéï óçìáíôéêü Üíèñùðï ãéá åêåßíïí ìå áíôÜëáãìá ôï óðáèß <br>"
				+ "2) Íá ôïí ÂïçèÞóåé óôçí åêóôñáôåßá ôïõ åíáíôßïí ôïõ áäåñöïý ôïõ ðïõ ðñïóðáèåß íá óöåôåñéóôåß ôïí èñüíï <br> <html>");
		panel.addMessage("<html> Óáò ðáñïõóéÜæïíôáé ïé ðáñáêÜôù ôñåéò åðéëïãÝò <html>");
		panel.addMessage("<html> 1) Áíéêáíïðïßçôïò êáé ìå ôéò äýï åðéëïãÝò ï ðåñóÝáò áñðÜæåé ôï óðáèß ôïõ êáé åðéôßèåôáé óôïí âáóéëéÜ <html>");
		panel.addMessage("<html> 2) Ï ðåñóÝáò óõìöùíåß ìå ôçí ðñüôáóç ôïõ ÂáóéëéÜ íá óõììá÷ßóåé åíáíôßïí <br>"
				+"ôïõ áäåñöïý ôïõ ìå ôïí üñï íá ôïí âïçèÞóåé óôçí ìÜ÷ç åíáíôßïí ôçò ìÝäïõóáò  <html>");
		panel.addMessage("<html> 3) Ï ÐåñóÝáò óõìöùíåß íá èõóéÜóåé ôïí Áäåñöü ôïõ ÌÜíç ìå áíôÜëëáãáìa ôï óðáèß <html>");
		int choice = q.takeAnAnswer(3);
		String Schoice=String.valueOf(choice);
		flowadministrator("swordTale",Schoice);
	}
	private void aelasTale() {  //aelasTale is a substory of the swordTale
		panel.setMessage("<html> Ï ÐåñóÝáò êáé ï ÁÝëáò åêóôñáôåýïõí åíáíôßïí ôïõ Áâäçñïõ (áäåñöüò ôïõ ÁÝëá). <br>"
				+ "ÌåôÜ áðü ìÝñåò ôáîéäéïý öôÜíïõí óôïõò ðñüðïäåò åíüò âïõíïý ðïõ âñßóêåôáé óå å÷èñéêü Ýäáöïò. <br> "
				+ "Ï âáóéëéÜò áÝëáò æçôÜåé ôçí óõìâïõëÞ ôïõ ÐåñóÝá ùò ðñïò ôï ôé èá êÜíïõí ìåôÜ <br> <html>");
		panel.addMessage("<html> Óôñáôïðáéäåýïõí óôïõò ðñüðïäåò ôïõ âïõíïý <html>");
		panel.addMessage("<html> Óõíå÷ßæïõí ôï âÜäåéí óå å÷èñéêü Ýäáöïò <html>");
		int choice = q.takeAnAnswer(2);
		if(choice==1) {
			panel.setMessage("<html> Ïé óôñáôéþôåò ôïõ âáóéëåéÜ óôñáôïðáéäåýïõí óôïõò ðñüðïäåò ôïõ âïõíïý êáé äéáíõêôåñåýïõí åêåß. <br>"
			  		+ "Ôï âñÜäõ ñß÷íåé ðïëõ éó÷õñÞ âñï÷Þ ðïõ ìåôáôñÝðåé ôï Ýäáöïò óå ëÜóðç êáé êÜíåé ðïëý äýóêïëï ôï ðåñðÜôçìá <br>"
			  		+ " Ôï åðüìåíï ðñùß îõðíÜíå áêïýãïíôáò Þ÷ïõò ôýìðáíùí êáé óÜëðéããùí. Ðñïò ìåãÜëç ôïõò Ýêðëçîç ï Áâäçñïò. <br>"
			  		+ " âñßóêåôáé óôçí êïñõöÞ ôïõ âïõíïý ìå Ýíáí óôñáôü ôñéðëÜóéï áðü åêåßíïí ôïõ áäåñöïý ôïõ. Ï ÁÝëáò îáíáæçôÜåé ôç óõìâïõëÞ ôïõ ÐåñóÝá <br> <html>");
			panel.addMessage("<html> 1) Íá åðéôåèïýí êáôá ìÝôáéðù óôïõò å÷èñïýò ôïõò áíåâáßíïíôáò ôçí ðëáãéÜ <html>");
			panel.addMessage("<html> 2) Íá ðáñáìåßíïõí óôï óôñáôüðåäï ðßóù áðü ôéò ðñü÷åéñÝò ôïõ ï÷õñþóåéò <html>");
			choice = q.takeAnAnswer(2);
			if(choice==1) {
				panel.setMessage(" <html> Ôï Ãëéóôåñü Ýäáöïò Ý÷åé ùò áðïôÝëåóìá ïé óôñáôéþôåò ôïõ ÁÝëá íá ãëõóôñïýí êáé íá ðáñáðáôïýí êáèþò áíåâáßíïõí ôçí ðëáãéÜ. <br>"
				  		+ "To áñéèìçôéêü ðëåïíåêôçìá ôïõ Áâäçñïõ õðåñéó÷õåé óôçí ìÜ÷ç ìå áðïôÝëåóìá ïé óôñáôéþôåò ôïõ áÝëá íá ôñáðïýí óå öõãÞ. <br>"
				  		+ "ÌÝóá óôï ÷Üïò ôçò ìÜ÷çò ï ðåñóÝáò âëÝðåé ôïí ÁÝëá íá êïéôåôáé óôï Ýäáöïò ôñáõìáôéóìÝíïò. <br> <html>");
				panel.addMessage("<html> Ôé áðï ôá ðáñáêÜôù êÜíåôå? <html>");
				panel.addMessage("<html> 1) Äéáóþæåôå ôïí âáóéëéÜ êáé ôñÝðåóôå óå öõãÞ <html>");
				panel.addMessage("<html> 2) Öåýãåôå áðü ôï ðåäßï ôçò ìÜ÷çò ðáßñíïíôáò ìáæß óáò êáé ôï óðáèß <html>");
				choice = q.takeAnAnswer(2);
				if(choice==1) {
					panel.setMessage("<html>  ÐåñóÝáò åðéóôñÝöåé ôïí ÁÝëá óôï âáóßëåéü ôïõ. Ï âáóéëéÜò ìÞ îÝñïíôáò ðùò íá  åõ÷áñéóôÞóåé ôïí ÐåñóÝá ôïõ äßíåé <br>" 
							  +"ìßá áóôñáöôåñÞ áóðßäá ãéá íá íéêÞóåé ôçí ÌÝäïõóá. Ï ðåñóÝáò áðï÷ùñåß áðü ôï âáóßëåéï ãéá íá óõíå÷ßóåé ôçí ðåñéðÝôåéÜ ôïõ <br> <html>");
					shield=true;
					showMenu();
			    }
			    if(choice==2) {
					  sword=true;
					  showMenu();
				}
			  }
			  if(choice==2) {
				  panel.setMessage("<html> Ïé óôñáôéùôåò ôïõ Áåëá ðáñáìÝíïõí ðßóù áðü ôéò ðñü÷åéñÝò ï÷õñþóåéò ôïõò. Ï Áâäçñïò áíáãêÜæåôáé íá åðéôåèåß ðñþôïò. <br>" 
						  +"ÐáñÜ ôçí áñéèìçôéêÞ ôïõ õðåñï÷Þ ïé óôñáôéþôåò ôïõ ðÝöôïõí óôéò ãëõóôåñÝò ðëáãÝò ôïõ âïõíïý <br>"
						  + "êáé áäõíáôïýí íá óçêùèïõí åîáéôßáò ôçò âáñéÜò ôïõò ðáíïðëßáò, ôá Üëïãá ôïõ âõèßæïíôáé óôç ëÜóðç <br>." 
						  +"O ÐåñóÝáò åíôùðßæåé ôïí ¢âäçñï ôñáõìáôéóìÝíï óôï ðåäßï ôçò ìÜ÷çò:  <br> <html>");
				  panel.addMessage("<html> 1) Áðïöáóßæåé íá ôïí óêïôþóåé ôïí ¢âäçñï <html>");
				  panel.addMessage("<html> 2) Ðáßñíåé ôïí ¢âäçñï üìçñï <html>");
				  choice = q.takeAnAnswer(2);
				  if(choice==1) {
					  panel.setMessage("<html> ÁíáðÜíôå÷á ï áÝëáò êåäßæåé ôïí ðüëåìï ðáñá ôï áñéèìçôéêü ðëåïíÝêôçìá ôïõ áäåñöïý ôïõ. <br>"
					  		+ " ¼ôáí ìáèáßíåé ðáñüëá áõôÜ ôçí ôý÷ç ôïõ íåõñéÜæåé ìå ôéò <br>"
					  		+ "äñÜóåéò ôïõ ðåñóÝá êáèùò äåí åðéäßùêå ôïí èÜíáôï ôïõ áäåñöïý ôïõ. <br>"
					  		+ "ÅîïñãéóìÝíïò ôïí åîïñßóåé ÷ùñßò íá ôïõ äþóåé ôï óðáèß <br> <html>");
					  showMenu();
				  }
				  if(choice==2) {
					  panel.setMessage("<html> ÁíáðÜíôå÷á ï áÝëáò êåäßæåé ôïí ðüëåìï ðáñá ôï áñéèìçôéêü ðëåïíÝêôçìá ôïõ áäåñöïý ôïõ. <br>"
					  		+ "Åõ÷áñéóôåß ôïí ÐåñóÝá ãéá ôéò äñÜóåéò ôïõ äßíåé ôï óðáèß êáé ôï ðñïóöåñåé óõìá÷éá üðùò åß÷å õðïó÷åèåß. <br> <html>");
					  sword=true;
					  showMenu();
				  }
			  }
		}
		if(choice==2) { 
			panel.setMessage("<html> Ïé óôñáôéþôåò ôïõ ÁÝëá óõíå÷ßæïõí ôï âáäåéí êáôá ôç äéÜñêåéá ôçò íý÷ôáò. <br>"
					+ "Êáôá ôç äéÜñêåéá ôïõ ôáîéäéïý ôïõò ðáñáôçñïýí óå áðüóôáóç ôïí å÷èñéêü óôñáôü óå áíïé÷ôü ðåäßï. <br>"
					+ "Åîáéôßáò ôïõ óêïôáäéïý äåí ìðïñïýí íá åíôïðßóïõí ôï áêñéâÝò ìÝãåèïò ôïõ óôñáôïõ. <br>"
					+ "Ï âáóéëéÜò áÝëáò æçôÜåé ãéá ìßá áêüìá öïñÜ ôçí Üðïøç ôïõ ÐåñóÝá <br> <html>");
			choice = q.takeAnAnswer(2);
			if(choice==1) {
				panel.setMessage("<html> H êáôÜ ìÝôùðï åðßèåóç ìå ôïí å÷èñéêü óôñáôü Ý÷åé ùò áðïôÝëåóìá ïëïêëçñøôéêÞ Þôá <html>");
				deathMessage();
			}
			if(choice==2) {
				panel.setMessage("<html> Êáôá ôç äéñêåéá ôçò ôáêôéêçò õðï÷ùñçóçò åíôïðßæïõí <br>"
						+ "åíáí å÷èñéêï áíé÷íåõôç ï ïðïßïò ôïõò ðëçñïöïñåß ãéá ôá ó÷åäéá ôùí å÷èñùí. <br> "
						+ "Ìå ôç âïÞèåéÜ ôïõ óôçíïõí åíåäñá êáé íéêïõò ôï å÷èñéêï âáóéëåéï <br> <html>");
				panel.setMessage("<html> Ï âáóéëéáò óáò äßíåé ôï óðáèß <html>");
			    sword=true;
			    showMenu();
			}
		}
	}
	public void confrontGuard() {  //confront guard is a substory of the sackTale
		panel.setMessage("<html> Åðéôßèåóôå óôïí öñïõñü <html>");
		if(sword) {
			panel.addMessage("<html> ÅðåéäÞ Ý÷åôå ôï óðáèß íéêÜôå ôïí öñïõñü  <br>"
					+ "ôþñá üìùò ðñÝðåé íá ìðåßôå óôçí ðüëç. Óáò ðáñïõóéÜæïíôáé <br>"
					+ "ïé ðáñáêÜôù åðéëïãÝò	<br> <html>");
			int count=0;
			int keycounter=0;
			int hammercounter=0;
			if(key) {
				panel.addMessage("<html>" + (++count) +") Áíïßãåôå ôçí ðüñôá ìå ôï êëåéäß ôçò ðüëçò <html>");
				keycounter=count;
			}
			if(hammer) {
				panel.addMessage("<html>" + (++count)+") ÓðÜôå ôçí ðüñôá ìå ôï óöõñß");
				hammercounter=count;
			}
			panel.addMessage("<html>" + (++count)+") ÓðÜôå ôçí ðüñôá ìå ôá ÷Ýñéá óáò");
			int handcounter=count;
			int choice1=q.takeAnAnswer(count);
			if(choice1 == hammercounter) {
				panel.setMessage("<html> Áíïßîáôå ìå åðéôõ÷ßá ôçí ðüñôá áëëÜ ôþñá <br> "
						+ "Ý÷åôå ôñáâÞîåé ôçí ðñïóï÷Þ üëïõ ôïõ å÷èñéêïý óôñáôïý. Ôé êÜíåôå? <br> <html>");     
				panel.addMessage("<html> 1) Åðéôßèåóôå êáôá ìÝôùðï? <html>");
				panel.addMessage("<html> 2) ÆçôÜôå íá äéáðñáãìáôåõôåßôå ìå ôï ÂáóéëéÜ <br> <html>");
				choice1=q.takeAnAnswer(count);
				if(choice1 == 1) {
					panel.setMessage("<html> ÅðéôÞèåóôå êáôÜ ìÝôùðï ðáñüëá áõôÜ <br>"
							+ "ïé äõíÜìåéò ôïõ âáóéëéÜ õðåñéó÷ýïõí <br> <html");
					deathMessage();
				}
				if(choice1 == 2) {
					panel.setMessage("<html> Ïé óôñáôéþôåò ôïõ âáóéëéÜ óáò ïäçãïýí óôçí áßèïõóá ôïõ èñüíïõ <html>");
					panel.addMessage("<html> Ï âáóéëéÜò óáò õðïäÝ÷åôáé êáé ëÝåé üôé åðåéäÞ èáõìÜæåé ôï êïõñÜãéï óáò <br>"
							+ "èá óáò äþóåé ôïí ìáãéêü óÜêï õðü Ýíáí üñï: Íá áðááíôÞóåôå óùóôÜ óå ìßá åñþôçóÞ ôïõ<html> <html>");
					panel.addMessage("<html> Ðïéïò êáôáóêåýáóå ôçí ðáíïðëßá ôïõ Á÷éëëÝá; <html>");
					panel.addMessage("<html> 1. Ï Èåüò ¢ñçò <html>");
					panel.addMessage("<html> 2. Ï Èåüò ¹öáéóôïò <html>");
					panel.addMessage("<html> 3. Ç èáëáóóéíÞ èåÜ ÈÝôéäá <html>");
					panel.addMessage("<html> 4. Ç èåÜ ÁèçíÜ <html>");
					choice1=q.takeAnAnswer(4);
					if (choice1 == 4) {
						panel.setMessage("<html> ÓùóôÞ áðÜíôçóç ëáìâÜíåôå ôïí ìáãéêü óÜêï <html>");
						sack=true;
					} else {
						panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé ëÜáèïò. Ï âáóéëéÜò óáò åêôåëåß <br> <html>");
						deathMessage();
					}
				}
			}
			if (choice1 == handcounter ) {
				panel.setMessage("<html> Äåí ìðïñåßôå íá óðÜóåôå ôçí ðüñôá ìå ôá ÷åñéá óáò  <html>");
				flowadministrator("sackTale", "outsideCity");
			}
			if (choice1 == keycounter) {
				panel.setMessage("<html> Ìðáßíåôå ìÝóá óôçí ðüëç ìå ôï ôéìéôêü êëåéäß ôçò ðüëçò <br>"
						+ "Ï öñïõñüò ôï áíáãíùñßæåé êáé óáò ïäçãåß Üìåóá óôçí áßèïõóá ôïõ èñüíïõ <br> <html>");
				panel.addMessage("<html> Ï âáóéëéÜò áíáãíùñßæåé êáé áõôüò ôï ôéìçôéêü êëåéäß  <br>"
						+ "áêïýåé ôï áßôçìÜ óáò ãéá íá ðÜñåôå ôïí ìáãéêü óÜêï. <html>");
				panel.addMessage("<html> ÁíáöÝñåé üôé áí ôïõ áðáíôÞóáôå óùóôÜ óå ìßá åñþôçóç èá óáò ôïí äþóåé <html>");
				panel.addMessage("<html> Ðïéïé Þôáí ïé ãïíåßò ôïõ Á÷éëëÝá; <html>");
				panel.addMessage("<html> 1. Ï ÐçëÝáò êáé ç ÈÝôéäá <html>");
				panel.addMessage("<html> 2. Ï Äßáò êáé ç ÈÝôéäá <html>");
				panel.addMessage("<html> 3. Ï Äßáò êáé ç ÁëêìÞíç <html>");
				panel.addMessage("<html> 4. Ï ÁèÜìáò êáé ç ÍåöÝëç <html>");
				choice1=q.takeAnAnswer(4);
				if (choice1 == 4) {
					panel.setMessage("<html> ÓùóôÞ áðÜíôçóç ëáìâÜíåôå ôïí ìáãéêü óÜêï <html>");
					sack=true;
				} else {
					panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé ëÜáèïò. Ï âáóéëéÜò óáò åêôåëåß <html>");
					deathMessage();
				}
			}
		} else {
			panel.setMessage("<html> Ï öñïõñüò óáò áðïêñïýùåé åðåéäÞ äåí Ý÷åôå ôï óðáèß <html>");
			flowadministrator("sackTale", "outsideCity");
		}
	}
	public void westStory()  { //westStory is a substory of the sackTale where the player goes to the West
		panel.setMessage("<html> Áðïöáóßæåôå íá êéíåéèåßôå äõôéêÜ ôçò ðüëçò. <br>"
				+ "Óôï äñüìï óáò âñßóêåôå Ýíáí ãÝñïíôá. Ôïõ åîéóôïñåßåôå ôçí <br>"
				+ "ðåñéðÝôåéÜ óáò êáé éó÷õñßæåôáé üôé ãíùñßæåé Ýíáí ôñüðï íá ìðåßôå <br>"
				+ " ìÝóá óôçí ðüëç ìÝóï åíüò ìõóôçêïý ðåñÜóìáôïò <br> <html>");
		panel.addMessage("<html> Áðïöáóßæåôå íá åìðéóôåõôåßôå ôïí ãÝñïíôá <html>");
		panel.addMessage("<html> Áêïëïõèåßôå ôïí ãÝñïíôá ðßóù óôçí ðüëç óáò õðïäåéêíýåé <br>"
				+ "ìßá ìéêñÞ ðýëç óôçí ïðïßá äåí õðÜñ÷åé êáíÝíáò öñïõñüò <html>");
		panel.addMessage("<html> ¸÷åôå ôéò ðáñáêÜôù åðéëïãÝò <html>");
		panel.addMessage("<html> 1) ÅéóÝñ÷åóôå óôçí ðüëç ìÝóù ôçò ðýëçò ðñþôïé <html>");
		panel.addMessage("<html> 2) ¼íôáò äõóðéóôïé õðïäéêíåßåôå óôïí ãÝñïíôá íá ðåñÜóåé ðñþôïò <html>");
		int choice1=q.takeAnAnswer(2);
		if (choice1 == 1) {
			panel.setMessage("<html> Ìå ôï ðïõ áíïßãåôå ôçí ðüñôá óõíçäåéôïðïéåßôå üôé ðñüêåéôáé <br>"
					+ "ãéá ìßá åíÝäñá êáé óáò ðåñéìÝíïõí áðü ðßóù ïé öñïõñïß ôïõ âáóéëéÜ. <br>"
					+ "Ï ãÝñïíôáò áðïäçêíýåôáé üôé Þôáí ôåëéêÜ Ýíáò êçíõãüò êåöáëþí  ðïõ <br>"
					+ "÷ñùóôïýóå ÷ñÞìáôá óôïí âáóéëéÜ  <html>");
			panel.addMessage("<html> ¸÷åôå ôéò ðáñáêÜôù åðéëïãÝò: <html>");
			panel.addMessage("<html> 1) ÐïëåìÜôå ôïõò Öñïõñïýò ôïõ âáóéëåéÜ <html>");
			panel.addMessage("<html> 2) Ðñïóðáèåßôå íá áðïäñÜóåôå áðü ôçí ðüëç <html>");
			choice1=q.takeAnAnswer(2);
			if (choice1 == 1) {
				panel.setMessage("<html> Ç áíáôáñá÷Þ ðïõ ðñáãìáôïðïéåßôáé óôçí ðüëç åîááéôßáò ôçò ìÜ÷çò <br>" 
						+ "ôñáâÜåé ôçí ðñïóï÷Þ ôïõ âáóéëéÜ ï ïðïßïò óáò âëÝðåé íá ìÜ÷åóôå ãåííáßá. ÈáõìÜæåé ôï êïõñÜãéï óáò <br>"
						+ "êáé ãéá áõôü áðïöáóßæåé íá óáò äþóåé ôïí ìáãéêü óÜêêï áí áðáíôçóåôå óùóôÜ óå ìßáá åñþôçóç <html>");
				panel.addMessage("Ôé åííïïýìå ìå ôç öñÜóç ìÞëï ôçò ¸ñéäáò;");
				panel.addMessage("1. Áéôßá ãéá ôóáêùìü");
				panel.addMessage("2. Íüóôéìï öñïýôï");
				panel.addMessage("3. Ðôþóç åíüò ìÞëïõ");
				panel.addMessage("4. Ðïëýôéìï äþñï");
				choice1=q.takeAnAnswer(4);
				if (choice1 == 4) {
					panel.setMessage("<html> ÓùóôÞ áðÜíôçóç ëáìâÜíåôå ôïí ìáãéêü óÜêï <html>");
					sack=true;
				} else {
					panel.setMessage("<html> Ç áðÜíôçóÞ óáò åßíáé ëÜèïò. Ï âáóéëéÜò óáò åêôåëåß <html>");
					deathMessage();
				}
			}
			if (choice1==2) {
				panel.setMessage("<html> Ïé öñïõñïß ôïõ âáóéëéÜ õðåñéó÷ýïõí áñéèìçôéêÜ êáé ãéá áõôü óáò íéêÜíå <html>");
				deathMessage();
			}
		}
		if (choice1 == 2) {
			panel.setMessage("<html> O ãÝñïíôáò åéóÝñ÷åôáé ðñþôïò ìÝóá óôçí ðüëç <br>"
					+ "ìå ôï ðïõ ìðáßíåé üìùò áêïýôå áíáôáñá÷Ýò íá îååóðÜíå ìÝóá óôçí ðüëç <br>"
					+ "Êáèþò ìðáßíåôå êáé óåéò íá äåßôå ôé ãßíåôáé âëÝðåôå üôé ïé óôñááôéþôåò ôïõ âáóéëåéÜ Ý÷ïõí öõëáêßóåé ôïí ãÝñïíôá <br>"
					+ "üôáí ñùôÜôå ôé Ýãéíå óáò áðáíôÜíå üôé ï ãÝñïíôáò Þôáí ÷ñüíéá êáôáæçïýìåíïò áðü ôï âáóéëéÜ <br>"
					+ "óáò åõ÷áñéóôïýíå ðïõ âïçèÞóáôå óôçí öõëÜêçóÞ ôïõ êáé ãéá áõôü óáò äßíïõí ôïí ìáãéêü óÜêï <br> <html>");
			sack=true;
		}
	}
	public void eastStory() { //eastStory is a substory of the sackTale where the player goes to the East
		panel.setMessage("<html> Êáèþò êéíåßóôå ðñïò ôá áíáôïëéêÜ óõíáíôÜôáé ìßá êáéíïýñãéá ðüëç. Ôé êÜíåôå ðñþôá <html>");
		panel.addMessage("<html> 1) ÅéóÝñ÷åóôå óôçí åêëçóßá <html>");
		panel.addMessage("<html> 2) ÌéëÜôå óôïí ìáñáãêü ôçò ðüëçò <html>");
		panel.addMessage("<html> 3) ÅðéóôñÝöåôå ðßóù áðü ôá ôïß÷ïé ôçò ðüëçò <html>");
		int choice1=q.takeAnAnswer(3);
		while (choice1 != 3) {
			if (choice1 == 1 ) {
				    panel.setMessage("<html> ÌÝóá óôïí íáü óõíáíôÜôå Ýíá éåñÝá óôïí ïðïßï åîéóôïñåßôå ôçí ðåñéðÝôåéÜ óáò <html>");
				    panel.addMessage("<html> Ï éåñÝáò óõíáñðÜæåôáé áðü ôçí éóôïñßá óáò êáé äéáôåßèåôáé íá óáò äþóåé ôï <br>"
							+ "êëåéäß ôçò ðüëçò áí áðááíôÞóåôå óùóôÜ óå ìßá åñþôçóç ôïõ <br> <html>");
				    panel.addMessage("<html> Ðïéïò ìÜíôçò Ýäùóå ÷ñçóìü óôïõò Á÷áéïýò üôé èá Ýðáéñíáí ôçí Ôñïßá óå äÝêá ÷ñüíéá; <html>");
				    panel.addMessage("<html> 1. Ï ÖéíÝáò <html>" );
				    panel.addMessage("<html> 2. Ï ÊÜë÷áò <html>");
				    panel.addMessage("<html> 3. Ï Ôåéñåóßáò <html>");
				    panel.addMessage("<html> 4. Ï ¢íéïò <html>");
					choice1=q.takeAnAnswer(4);
					if (choice1 ==4 ) {
						panel.setMessage("<html> ÁðáíôÞóáôå óùóôÜ ðáßñíåôå ôï êëåéäß ôçò ðüëçò <html>");
						key=true;
					} else {
						panel.setMessage("<html> ÁðáíôÞóáôå ëÜèïò <html>");
					}
			}else if (choice1 == 2 ) {
				panel.setMessage("<html> Ï Ìáñáãêüò áêïýåé ôçí éóôïñßá óáò êáé ðñïèõìïðïéåßôáé íá óáò äþóåé Ýíá áðü ôá áíôéêåéìåíá <br ><html>");
				panel.addMessage("<html> 1) To óðáèß <html>");
				panel.addMessage("<html> 2) ¸íá óöõñß åéäéêÜ öôéïáãìÝíï ãéá íá óðÜóåé ôçí ðüñôá ôçò ðüëçò <html>");
				choice1=q.takeAnAnswer(2);
				if (choice1==1) {
					panel.setMessage("<html> Óõã÷áñçôÞñéá ðÞñåò ôï óðáèß <html>");
					sword=true;
				} else {
					panel.setMessage("<html> Óõã÷áñçôÞñéá ðÞñåò ôï óöõñß <html>");
					hammer=true;
				}
			}
			panel.addMessage("<html> ÅðéëÝîôå ôé èá êÜíåôå ìåôÜ <html>");
			panel.addMessage("<html> 1) ÅéóÝñ÷åóôå óôçí åêëçóßá <html>");
			panel.addMessage("<html> 2) ÌéëÜôå óôïí ìáñáãêü ôçò ðüëçò <html>");
			panel.addMessage("<html> 3) ÅðéóôñÝöåôå ðßóù áðü ôá ôïß÷ïé ôçò ðüëçò <html>");
			choice1=q.takeAnAnswer(3);
		}
	}
	private void deathMessage() { //method that shows the death message and redirects the user to the menu
		panel.addMessage("<html> Å÷áóåò ôï ðáé÷íßäé, ðÜôá 1 áí èåò íá óôáìáôÞóåéò íá ðáßæåéò <br>"
				+ "Þ 2 áí èåò íá îåêéíÞóåéò áðü ôçí áñ÷Þ Þ 3 áí èåò íá ðáò óôï ôåëåõôáßï checkpoint <br> <html>");
		Scanner in=new Scanner(System.in);
		int choice=q.takeAnAnswer(3);
		if(choice==2) {
			initiateStory();
		}else if (choice==3) {
			showMenu();
		}
	}
}
