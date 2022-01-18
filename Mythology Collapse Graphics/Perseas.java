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
		panel.setMessage("<html> Ο Περσέας φεύγει από την Σέριφο με ένα καράβι, με σκοπό να βρει την Γοργόνα Μέδουσα. <br>"
				+ "Στη διαδρομή του συναντά τη θεά Αθηνά και το θεό Ερμή, από τους οποίους πληροφορείται <br>"
				+ "πως για να σκοτώσει την Μέδουσα θα πρέπει να προμηθευτεί τα παρακάτω όπλα: <br> <html>");   //Showing the initial message
		showMenu(); //method that shoes the menu
	}
	private void showMenu()  {   //μέθοδος που εμφανίζει το μενου
		String message="<html> Επίλεξε ποιο από τα παρακάτω όπλα θέλετε να αποκτήσετε: <br>" ;//constructing a message  
		int counter=0; //initialize a counter that shows the number that corresponds to each option
		int helmetcounter=0; //initialize a counter that corresponds to the helmet
		int sackcounter=0;   //initialize a counter that corresponds to the sack
		int sandalscounter=0;  //initialize a counter that corresponds to the sandals
		int shieldcounter=0;  //initialize a counter that corresponds to the shield
		int swordcounter=0;   //initialize a counter that corresponds to the sword
		if(!helmet) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις την περικεφαλαία έτσι ώστε να πλησιάσεις αόρατος τον στόχο σου <br>"; //updating message
			helmetcounter=counter;
		}
		if(!sack) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις τον μαγικό σάκο <br>"; //updating message
			sackcounter=counter;
		}
		if(!sandals) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις τα φτερωτά σανδάλια, επειδή η Γοργώ - Μέδουσα, έμενε σε βράχο, στη μέση της θάλασσας.<br>"; //updating message
			sandalscounter=counter;
		}
		if(!shield) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις την αστραφτερή ασπίδα, απ' όπου θα έβλεπε το κεφάλι της Μέδουσας. <br>"; //updating message
			shieldcounter=counter;
		}
		if(!sword) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις το κοφτερό σπαθί ή δρεπάνι, με το οποίο θα έκοβε τον σκληρό λαιμό της Γοργούς. <br>";  //updating message
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
				panel.addMessage("<html> O Περσέας ζητάει από τον φρουρό που στέκεται στην πόρτα να τον αφήσει να εισέλθει. Ο φρουρός παρόλα αυτά τον εμποδίζει<html> ");
				panel.addMessage("<html> Ποιες απο τις παρακάτω επιλογές θα επιλέγατε? <html>");
				panel.addMessage("<html> 1) Συμβιβάζεστε με τον φρουρό. <html>");
				panel.addMessage("<html> 2) Επιτίθεστε στον φρουρό <html> ");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					flowadministrator("sackTale","westEast");
				}
				if(choice1==2) {
					flowadministrator("sackTale","confrontGuard");
				}
			}	
			if(choice.equals("westEast")) {
				panel.setMessage("<html> Σας δίνονται οι παρακάτω επιλογές <html>");
				panel.addMessage("<html> Να κινειθείτε δυτικά της πόλης <html>");
				panel.addMessage("<html> Να κινειθείτε ανατολικά της πόλης <html>");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					panel.setMessage("<html> Αποφασίζετε να κινειθείτε δυτικά της πόλης . <br>"
							+ "Στο δρόμο σας βρίσκετε έναν γέροντα. Του εξιστορείετε <br>"
							+ "την περιπέτειά σας και ισχυρίζεται ότι γνωρίζει έναν <br>"
							+ "τρόπο να μπείτε μέσα στην πόλη μέσο ενός μυστηκού περάσματος <br> <html>");
					flowadministrator("sackTale", "West");
				}
				if(choice1==2) {
					panel.setMessage(" <html> Καθώς κινείστε προς τα ανατολικά συναντάτε <br>"
							+ " μία καινούργια πόλη. Τι κάνετε πρώτα <html>");
					flowadministrator("sackTale", "East");
				}
			}
			if(choice.equals("confrontGuard")) {                                                           
				confrontGuard();
				showMenu();
			}
			if(choice.equals("West")) {																
				westStory();
				panel.setMessage("<html> Ο Αέλας επιστρέφει πάλι έξω από τα τοιχος της πόλης <html>");
				flowadministrator("sackTale","outsideCity");
			}
			if(choice.equals("East")) {																
				eastStory();
				panel.setMessage("<html> Ο Αέλας επιστρέφει πάλι έξω από τα τοιχος της πόλης <html>");
				flowadministrator("sackTale","outsideCity");
			}
		}
		if(story.equals("swordTale")) { 
			if(choice.equals("1")) {
				panel.setMessage("<html> Οι φρουροί του βασιλιά Αέλα <br>"
						+ "εμποδίζουν τον Περσέα από το να σκοτώσει τον βασιλιά τους. Παρόλα αυτά ο βασιλιάς όντας σοκαρισμένος από <br>"
						+ "την ανδρεία του Περσέα του δίνει το σπαθί και τον αφήνει να φύγει <br> <html>");
				sword=true;
				showMenu();
			}else if(choice.equals("2")) {
				aelasTale();
			}else if(choice.equals("3")) {
				panel.setMessage("<html> Ο βασιλιάς Αέλας σοκάρεται από την αντίδραση του Περσέα να δώσει τον αδερφό του σε αντάλλαγμα για το σπαθί. <br>"
						+ "Για αύτο κλείνει τον περσέα σε ένα κελί. Για να τον αφήσει να φύγει πρέπει να απαντήσει σωτά στην παρακάτω ερώτηση: <br>"
						+ "Ποιος θεός έχει ως ιερό ζώο τα άλογα; <br> <html>");
				panel.addMessage("<html> Σας παρουσιάζονται οι παρακάτω δύο επιλογές: <br>"
						+ "1) Διόνυσος <br>"
						+ "2) Διας <br> <html>");
				int choice1 = q.takeAnAnswer(2);
				if(choice1==1) {
					panel.setMessage("<html> Η απάντησή σας είναι σωστή. Ο Αέλας σας δίνει το σπαθί <html>");
					helmet=true;
					showMenu();
				}else {
					panel.setMessage("<html> Η απάντηση είναι λάθος και ο βασιλιάς διατάζει την εκτέλεση του Περσέα <html>");
					deathMessage();
				}
			}
		}
	}
	private void helmetTale() { //the method that represents the story to get the helmet
	       panel.setMessage("<html> Για να αποκτήσει την περικεφαλαία του ’δη η Αθήνα του κάνει την εξής ερώτηση: <br>"
	                       + "Σε τι μεταμορφώθηκε ο Δίας για να συνευρεθεί με την Ευρώπη; <br>"
                            + "1) Ταύρος <br> "
                            + "2)  Σύννεφο <br> <html>");
	       int choice = q.takeAnAnswer(2);
            if(choice==1) {
		      panel.setMessage("<html> Η απάντησή σας είναι σωστή. Ο Περσέας παίρνει την περικεφαλαία <html>");
		      showMenu();
	       }else {
	    	   	  panel.setMessage("<html> Η απάντησή σας είναι λαθός. Ο Περσέας δεν παίρνει την περικεφαλαία.<br>");
                  panel.addMessage(" Έχετε μία δεύτερη ευκαιρία <br>"               
                                   + "Ο ’δης ήταν ο θεός του: <br>"
                                   + "1) Πολέμου <br>"
                                   + "2) Κάτω Κόσμου <br> <html>");
                   choice=q.takeAnAnswer(2);
                   if(choice==2) {
                	 panel.setMessage("<html> Η απάντησή σας είναι σωστή. Ο Περσέας παίρνει την περικεφαλαία <html>");
		             showMenu();
	              }else {
	            	  	  panel.setMessage("<html> Η απάντησή σας είναι λαθός. Ο Περσέας δεν παίρνει την περικεφαλαία <html>");                     
                          deathMessage();
                   }
	       }
	}       
	private void sandalsTale()  { //the method that represents the story to get the sandals 
			 panel.setMessage("<html> Για να αποκτήσει τα φτερωτά σανδάλια ο Ερμής του κάνει την εξής ερώτηση: <br>"
	                         + "Ποια θεότητα συνδέεται με δεσμούς αίματος με την Αφροδίτη; <br>"
                              + "1) Ουρανός <br>"
                              + "2) Ωκεανός <br> <html>");
             int choice = q.takeAnAnswer(2);
             if(choice==1) {
		        panel.setMessage("<html> Η απάντησή σας είναι σωστή. Ο Περσέας παίρνει τα φτερωτά σανδάλια <html>");
		        showMenu();
	         }else {
          	         panel.setMessage("<html> Η απάντησή σας είναι λαθός. Ο Περσέας δεν παίρνει τα φτερωτά σανδάλια. <br>");
          	         panel.addMessage("<html> Έχετε μία δεύτερη ευκαιρία <br>"               
                                     + "Πως έγινε ο Αχιλλέας άτρωτος; <br>"
                                     + "1) Μεγάλωσε δίπλα στους θεούς <br>"
                                     + "2) Η μητέρα του τον βούτηξε στα νερά του ποταμού της Στύγας <br> <html>");
	                 choice = q.takeAnAnswer(2);
                     if(choice==2) {
		               panel.setMessage("<html> Η απάντησή σας είναι σωστή. Ο Περσέας παίρνει τα φτερωτά σανδάλια <html>");
		               showMenu();
	                }else {
                            panel.setMessage("<html> Η απάντησή σας είναι λαθός. Ο Περσέας δεν παίρνει τα φτερωτά σανδάλια <html>");                     
                            deathMessage();
                     }
              }
	}
	private void sackTale()  {  //the method that represents the story to get the sack
		panel.setMessage("<html> O Περσεας  φτάνει στο παλάτι  του βασιλιά Ακίνοου. <br>"
				+ " Ρωτώντας κάποιους περαστικούς μαθαίνει ότι ο σάκος και η ασπίδα βρίσκεται πίσω από τα τοίχη της πόλης του. <br> <html>");
		flowadministrator("sackTale","outsideCity");
		
	}
	private void swordTale() { //the method that represents the story to get the sword
		panel.setMessage("<html> Η Αθηνά οδήγησε τον Περσέα στην χώρα των Υπερβορείων (μυθικός λαός που ζούσε στα βουνά της Ελλάδας).<br> "
				+ "Για να αποκτήσει το μυθικό σπαθί που θα σκοτώσει την Μέδουσα πρέπει να αντιμετωπίσει τον βασιλιά των Υπερβορείων Αέλα: <br> "
				+ "Όταν ο Περσέας Ζητάει από τον Αέλα το σπαθί αυτός του παρουσιάζει τις εξείς 2 επιλογές: <br>"
				+ "1) Να θυσιάσει το πιο σημαντικό άνθρωπο για εκείνον με αντάλαγμα το σπαθί <br>"
				+ "2) Να τον Βοηθήσει στην εκστρατεία του εναντίον του αδερφού του που προσπαθεί να σφετεριστεί τον θρόνο <br> <html>");
		panel.addMessage("<html> Σας παρουσιάζονται οι παρακάτω τρεις επιλογές <html>");
		panel.addMessage("<html> 1) Ανικανοποίητος και με τις δύο επιλογές ο περσέας αρπάζει το σπαθί του και επιτίθεται στον βασιλιά <html>");
		panel.addMessage("<html> 2) Ο περσέας συμφωνεί με την πρόταση του Βασιλιά να συμμαχίσει εναντίον <br>"
				+"του αδερφού του με τον όρο να τον βοηθήσει στην μάχη εναντίον της μέδουσας  <html>");
		panel.addMessage("<html> 3) Ο Περσέας συμφωνεί να θυσιάσει τον Αδερφό του Μάνη με αντάλλαγαμa το σπαθί <html>");
		int choice = q.takeAnAnswer(3);
		String Schoice=String.valueOf(choice);
		flowadministrator("swordTale",Schoice);
	}
	private void aelasTale() {  //aelasTale is a substory of the swordTale
		panel.setMessage("<html> Ο Περσέας και ο Αέλας εκστρατεύουν εναντίον του Αβδηρου (αδερφός του Αέλα). <br>"
				+ "Μετά από μέρες ταξιδιού φτάνουν στους πρόποδες ενός βουνού που βρίσκεται σε εχθρικό έδαφος. <br> "
				+ "Ο βασιλιάς αέλας ζητάει την συμβουλή του Περσέα ως προς το τι θα κάνουν μετά <br> <html>");
		panel.addMessage("<html> Στρατοπαιδεύουν στους πρόποδες του βουνού <html>");
		panel.addMessage("<html> Συνεχίζουν το βάδειν σε εχθρικό έδαφος <html>");
		int choice = q.takeAnAnswer(2);
		if(choice==1) {
			panel.setMessage("<html> Οι στρατιώτες του βασιλειά στρατοπαιδεύουν στους πρόποδες του βουνού και διανυκτερεύουν εκεί. <br>"
			  		+ "Το βράδυ ρίχνει πολυ ισχυρή βροχή που μετατρέπει το έδαφος σε λάσπη και κάνει πολύ δύσκολο το περπάτημα <br>"
			  		+ " Το επόμενο πρωί ξυπνάνε ακούγοντας ήχους τύμπανων και σάλπιγγων. Προς μεγάλη τους έκπληξη ο Αβδηρος. <br>"
			  		+ " βρίσκεται στην κορυφή του βουνού με έναν στρατό τριπλάσιο από εκείνον του αδερφού του. Ο Αέλας ξαναζητάει τη συμβουλή του Περσέα <br> <html>");
			panel.addMessage("<html> 1) Να επιτεθούν κατα μέταιπω στους εχθρούς τους ανεβαίνοντας την πλαγιά <html>");
			panel.addMessage("<html> 2) Να παραμείνουν στο στρατόπεδο πίσω από τις πρόχειρές του οχυρώσεις <html>");
			choice = q.takeAnAnswer(2);
			if(choice==1) {
				panel.setMessage(" <html> Το Γλιστερό έδαφος έχει ως αποτέλεσμα οι στρατιώτες του Αέλα να γλυστρούν και να παραπατούν καθώς ανεβαίνουν την πλαγιά. <br>"
				  		+ "To αριθμητικό πλεονεκτημα του Αβδηρου υπερισχυει στην μάχη με αποτέλεσμα οι στρατιώτες του αέλα να τραπούν σε φυγή. <br>"
				  		+ "Μέσα στο χάος της μάχης ο περσέας βλέπει τον Αέλα να κοιτεται στο έδαφος τραυματισμένος. <br> <html>");
				panel.addMessage("<html> Τι απο τα παρακάτω κάνετε? <html>");
				panel.addMessage("<html> 1) Διασώζετε τον βασιλιά και τρέπεστε σε φυγή <html>");
				panel.addMessage("<html> 2) Φεύγετε από το πεδίο της μάχης παίρνοντας μαζί σας και το σπαθί <html>");
				choice = q.takeAnAnswer(2);
				if(choice==1) {
					panel.setMessage("<html>  Περσέας επιστρέφει τον Αέλα στο βασίλειό του. Ο βασιλιάς μή ξέροντας πως να  ευχαριστήσει τον Περσέα του δίνει <br>" 
							  +"μία αστραφτερή ασπίδα για να νικήσει την Μέδουσα. Ο περσέας αποχωρεί από το βασίλειο για να συνεχίσει την περιπέτειά του <br> <html>");
					shield=true;
					showMenu();
			    }
			    if(choice==2) {
					  sword=true;
					  showMenu();
				}
			  }
			  if(choice==2) {
				  panel.setMessage("<html> Οι στρατιωτες του Αελα παραμένουν πίσω από τις πρόχειρές οχυρώσεις τους. Ο Αβδηρος αναγκάζεται να επιτεθεί πρώτος. <br>" 
						  +"Παρά την αριθμητική του υπεροχή οι στρατιώτες του πέφτουν στις γλυστερές πλαγές του βουνού <br>"
						  + "και αδυνατούν να σηκωθουν εξαιτίας της βαριάς τους πανοπλίας, τα άλογα του βυθίζονται στη λάσπη <br>." 
						  +"O Περσέας εντωπίζει τον ’βδηρο τραυματισμένο στο πεδίο της μάχης:  <br> <html>");
				  panel.addMessage("<html> 1) Αποφασίζει να τον σκοτώσει τον ’βδηρο <html>");
				  panel.addMessage("<html> 2) Παίρνει τον ’βδηρο όμηρο <html>");
				  choice = q.takeAnAnswer(2);
				  if(choice==1) {
					  panel.setMessage("<html> Αναπάντεχα ο αέλας κεδίζει τον πόλεμο παρα το αριθμητικό πλεονέκτημα του αδερφού του. <br>"
					  		+ " Όταν μαθαίνει παρόλα αυτά την τύχη του νευριάζει με τις <br>"
					  		+ "δράσεις του περσέα καθως δεν επιδίωκε τον θάνατο του αδερφού του. <br>"
					  		+ "Εξοργισμένος τον εξορίσει χωρίς να του δώσει το σπαθί <br> <html>");
					  showMenu();
				  }
				  if(choice==2) {
					  panel.setMessage("<html> Αναπάντεχα ο αέλας κεδίζει τον πόλεμο παρα το αριθμητικό πλεονέκτημα του αδερφού του. <br>"
					  		+ "Ευχαριστεί τον Περσέα για τις δράσεις του δίνει το σπαθί και το προσφερει συμαχια όπως είχε υποσχεθεί. <br> <html>");
					  sword=true;
					  showMenu();
				  }
			  }
		}
		if(choice==2) { 
			panel.setMessage("<html> Οι στρατιώτες του Αέλα συνεχίζουν το βαδειν κατα τη διάρκεια της νύχτας. <br>"
					+ "Κατα τη διάρκεια του ταξιδιού τους παρατηρούν σε απόσταση τον εχθρικό στρατό σε ανοιχτό πεδίο. <br>"
					+ "Εξαιτίας του σκοταδιού δεν μπορούν να εντοπίσουν το ακριβές μέγεθος του στρατου. <br>"
					+ "Ο βασιλιάς αέλας ζητάει για μία ακόμα φορά την άποψη του Περσέα <br> <html>");
			choice = q.takeAnAnswer(2);
			if(choice==1) {
				panel.setMessage("<html> H κατά μέτωπο επίθεση με τον εχθρικό στρατό έχει ως αποτέλεσμα ολοκληρψτική ήτα <html>");
				deathMessage();
			}
			if(choice==2) {
				panel.setMessage("<html> Κατα τη διρκεια της τακτικης υποχωρησης εντοπίζουν <br>"
						+ "εναν εχθρικο ανιχνευτη ο οποίος τους πληροφορεί για τα σχεδια των εχθρων. <br> "
						+ "Με τη βοήθειά του στηνουν ενεδρα και νικους το εχθρικο βασιλειο <br> <html>");
				panel.setMessage("<html> Ο βασιλιας σας δίνει το σπαθί <html>");
			    sword=true;
			    showMenu();
			}
		}
	}
	public void confrontGuard() {  //confront guard is a substory of the sackTale
		panel.setMessage("<html> Επιτίθεστε στον φρουρό <html>");
		if(sword) {
			panel.addMessage("<html> Επειδή έχετε το σπαθί νικάτε τον φρουρό  <br>"
					+ "τώρα όμως πρέπει να μπείτε στην πόλη. Σας παρουσιάζονται <br>"
					+ "οι παρακάτω επιλογές	<br> <html>");
			int count=0;
			int keycounter=0;
			int hammercounter=0;
			if(key) {
				panel.addMessage("<html>" + (++count) +") Ανοίγετε την πόρτα με το κλειδί της πόλης <html>");
				keycounter=count;
			}
			if(hammer) {
				panel.addMessage("<html>" + (++count)+") Σπάτε την πόρτα με το σφυρί");
				hammercounter=count;
			}
			panel.addMessage("<html>" + (++count)+") Σπάτε την πόρτα με τα χέρια σας");
			int handcounter=count;
			int choice1=q.takeAnAnswer(count);
			if(choice1 == hammercounter) {
				panel.setMessage("<html> Ανοίξατε με επιτυχία την πόρτα αλλά τώρα <br> "
						+ "έχετε τραβήξει την προσοχή όλου του εχθρικού στρατού. Τι κάνετε? <br> <html>");     
				panel.addMessage("<html> 1) Επιτίθεστε κατα μέτωπο? <html>");
				panel.addMessage("<html> 2) Ζητάτε να διαπραγματευτείτε με το Βασιλιά <br> <html>");
				choice1=q.takeAnAnswer(count);
				if(choice1 == 1) {
					panel.setMessage("<html> Επιτήθεστε κατά μέτωπο παρόλα αυτά <br>"
							+ "οι δυνάμεις του βασιλιά υπερισχύουν <br> <html");
					deathMessage();
				}
				if(choice1 == 2) {
					panel.setMessage("<html> Οι στρατιώτες του βασιλιά σας οδηγούν στην αίθουσα του θρόνου <html>");
					panel.addMessage("<html> Ο βασιλιάς σας υποδέχεται και λέει ότι επειδή θαυμάζει το κουράγιο σας <br>"
							+ "θα σας δώσει τον μαγικό σάκο υπό έναν όρο: Να απααντήσετε σωστά σε μία ερώτησή του<html> <html>");
					panel.addMessage("<html> Ποιος κατασκεύασε την πανοπλία του Αχιλλέα; <html>");
					panel.addMessage("<html> 1. Ο Θεός ’ρης <html>");
					panel.addMessage("<html> 2. Ο Θεός Ήφαιστος <html>");
					panel.addMessage("<html> 3. Η θαλασσινή θεά Θέτιδα <html>");
					panel.addMessage("<html> 4. Η θεά Αθηνά <html>");
					choice1=q.takeAnAnswer(4);
					if (choice1 == 4) {
						panel.setMessage("<html> Σωστή απάντηση λαμβάνετε τον μαγικό σάκο <html>");
						sack=true;
					} else {
						panel.setMessage("<html> Η απάντησή σας είναι λάαθος. Ο βασιλιάς σας εκτελεί <br> <html>");
						deathMessage();
					}
				}
			}
			if (choice1 == handcounter ) {
				panel.setMessage("<html> Δεν μπορείτε να σπάσετε την πόρτα με τα χερια σας  <html>");
				flowadministrator("sackTale", "outsideCity");
			}
			if (choice1 == keycounter) {
				panel.setMessage("<html> Μπαίνετε μέσα στην πόλη με το τιμιτκό κλειδί της πόλης <br>"
						+ "Ο φρουρός το αναγνωρίζει και σας οδηγεί άμεσα στην αίθουσα του θρόνου <br> <html>");
				panel.addMessage("<html> Ο βασιλιάς αναγνωρίζει και αυτός το τιμητικό κλειδί  <br>"
						+ "ακούει το αίτημά σας για να πάρετε τον μαγικό σάκο. <html>");
				panel.addMessage("<html> Αναφέρει ότι αν του απαντήσατε σωστά σε μία ερώτηση θα σας τον δώσει <html>");
				panel.addMessage("<html> Ποιοι ήταν οι γονείς του Αχιλλέα; <html>");
				panel.addMessage("<html> 1. Ο Πηλέας και η Θέτιδα <html>");
				panel.addMessage("<html> 2. Ο Δίας και η Θέτιδα <html>");
				panel.addMessage("<html> 3. Ο Δίας και η Αλκμήνη <html>");
				panel.addMessage("<html> 4. Ο Αθάμας και η Νεφέλη <html>");
				choice1=q.takeAnAnswer(4);
				if (choice1 == 4) {
					panel.setMessage("<html> Σωστή απάντηση λαμβάνετε τον μαγικό σάκο <html>");
					sack=true;
				} else {
					panel.setMessage("<html> Η απάντησή σας είναι λάαθος. Ο βασιλιάς σας εκτελεί <html>");
					deathMessage();
				}
			}
		} else {
			panel.setMessage("<html> Ο φρουρός σας αποκρούωει επειδή δεν έχετε το σπαθί <html>");
			flowadministrator("sackTale", "outsideCity");
		}
	}
	public void westStory()  { //westStory is a substory of the sackTale where the player goes to the West
		panel.setMessage("<html> Αποφασίζετε να κινειθείτε δυτικά της πόλης. <br>"
				+ "Στο δρόμο σας βρίσκετε έναν γέροντα. Του εξιστορείετε την <br>"
				+ "περιπέτειά σας και ισχυρίζεται ότι γνωρίζει έναν τρόπο να μπείτε <br>"
				+ " μέσα στην πόλη μέσο ενός μυστηκού περάσματος <br> <html>");
		panel.addMessage("<html> Αποφασίζετε να εμπιστευτείτε τον γέροντα <html>");
		panel.addMessage("<html> Ακολουθείτε τον γέροντα πίσω στην πόλη σας υποδεικνύει <br>"
				+ "μία μικρή πύλη στην οποία δεν υπάρχει κανένας φρουρός <html>");
		panel.addMessage("<html> Έχετε τις παρακάτω επιλογές <html>");
		panel.addMessage("<html> 1) Εισέρχεστε στην πόλη μέσω της πύλης πρώτοι <html>");
		panel.addMessage("<html> 2) Όντας δυσπιστοι υποδικνείετε στον γέροντα να περάσει πρώτος <html>");
		int choice1=q.takeAnAnswer(2);
		if (choice1 == 1) {
			panel.setMessage("<html> Με το που ανοίγετε την πόρτα συνηδειτοποιείτε ότι πρόκειται <br>"
					+ "για μία ενέδρα και σας περιμένουν από πίσω οι φρουροί του βασιλιά. <br>"
					+ "Ο γέροντας αποδηκνύεται ότι ήταν τελικά ένας κηνυγός κεφαλών  που <br>"
					+ "χρωστούσε χρήματα στον βασιλιά  <html>");
			panel.addMessage("<html> Έχετε τις παρακάτω επιλογές: <html>");
			panel.addMessage("<html> 1) Πολεμάτε τους Φρουρούς του βασιλειά <html>");
			panel.addMessage("<html> 2) Προσπαθείτε να αποδράσετε από την πόλη <html>");
			choice1=q.takeAnAnswer(2);
			if (choice1 == 1) {
				panel.setMessage("<html> Η αναταραχή που πραγματοποιείται στην πόλη εξααιτίας της μάχης <br>" 
						+ "τραβάει την προσοχή του βασιλιά ο οποίος σας βλέπει να μάχεστε γενναία. Θαυμάζει το κουράγιο σας <br>"
						+ "και για αυτό αποφασίζει να σας δώσει τον μαγικό σάκκο αν απαντησετε σωστά σε μίαα ερώτηση <html>");
				panel.addMessage("Τι εννοούμε με τη φράση μήλο της Έριδας;");
				panel.addMessage("1. Αιτία για τσακωμό");
				panel.addMessage("2. Νόστιμο φρούτο");
				panel.addMessage("3. Πτώση ενός μήλου");
				panel.addMessage("4. Πολύτιμο δώρο");
				choice1=q.takeAnAnswer(4);
				if (choice1 == 4) {
					panel.setMessage("<html> Σωστή απάντηση λαμβάνετε τον μαγικό σάκο <html>");
					sack=true;
				} else {
					panel.setMessage("<html> Η απάντησή σας είναι λάθος. Ο βασιλιάς σας εκτελεί <html>");
					deathMessage();
				}
			}
			if (choice1==2) {
				panel.setMessage("<html> Οι φρουροί του βασιλιά υπερισχύουν αριθμητικά και για αυτό σας νικάνε <html>");
				deathMessage();
			}
		}
		if (choice1 == 2) {
			panel.setMessage("<html> O γέροντας εισέρχεται πρώτος μέσα στην πόλη <br>"
					+ "με το που μπαίνει όμως ακούτε αναταραχές να ξεεσπάνε μέσα στην πόλη <br>"
					+ "Καθώς μπαίνετε και σεις να δείτε τι γίνεται βλέπετε ότι οι στραατιώτες του βασιλειά έχουν φυλακίσει τον γέροντα <br>"
					+ "όταν ρωτάτε τι έγινε σας απαντάνε ότι ο γέροντας ήταν χρόνια καταζηούμενος από το βασιλιά <br>"
					+ "σας ευχαριστούνε που βοηθήσατε στην φυλάκησή του και για αυτό σας δίνουν τον μαγικό σάκο <br> <html>");
			sack=true;
		}
	}
	public void eastStory() { //eastStory is a substory of the sackTale where the player goes to the East
		panel.setMessage("<html> Καθώς κινείστε προς τα ανατολικά συναντάται μία καινούργια πόλη. Τι κάνετε πρώτα <html>");
		panel.addMessage("<html> 1) Εισέρχεστε στην εκλησία <html>");
		panel.addMessage("<html> 2) Μιλάτε στον μαραγκό της πόλης <html>");
		panel.addMessage("<html> 3) Επιστρέφετε πίσω από τα τοίχοι της πόλης <html>");
		int choice1=q.takeAnAnswer(3);
		while (choice1 != 3) {
			if (choice1 == 1 ) {
				    panel.setMessage("<html> Μέσα στον ναό συναντάτε ένα ιερέα στον οποίο εξιστορείτε την περιπέτειά σας <html>");
				    panel.addMessage("<html> Ο ιερέας συναρπάζεται από την ιστορία σας και διατείθεται να σας δώσει το <br>"
							+ "κλειδί της πόλης αν απααντήσετε σωστά σε μία ερώτηση του <br> <html>");
				    panel.addMessage("<html> Ποιος μάντης έδωσε χρησμό στους Αχαιούς ότι θα έπαιρναν την Τροία σε δέκα χρόνια; <html>");
				    panel.addMessage("<html> 1. Ο Φινέας <html>" );
				    panel.addMessage("<html> 2. Ο Κάλχας <html>");
				    panel.addMessage("<html> 3. Ο Τειρεσίας <html>");
				    panel.addMessage("<html> 4. Ο ’νιος <html>");
					choice1=q.takeAnAnswer(4);
					if (choice1 ==4 ) {
						panel.setMessage("<html> Απαντήσατε σωστά παίρνετε το κλειδί της πόλης <html>");
						key=true;
					} else {
						panel.setMessage("<html> Απαντήσατε λάθος <html>");
					}
			}else if (choice1 == 2 ) {
				panel.setMessage("<html> Ο Μαραγκός ακούει την ιστορία σας και προθυμοποιείται να σας δώσει ένα από τα αντικειμενα <br ><html>");
				panel.addMessage("<html> 1) To σπαθί <html>");
				panel.addMessage("<html> 2) Ένα σφυρί ειδικά φτιοαγμένο για να σπάσει την πόρτα της πόλης <html>");
				choice1=q.takeAnAnswer(2);
				if (choice1==1) {
					panel.setMessage("<html> Συγχαρητήρια πήρες το σπαθί <html>");
					sword=true;
				} else {
					panel.setMessage("<html> Συγχαρητήρια πήρες το σφυρί <html>");
					hammer=true;
				}
			}
			panel.addMessage("<html> Επιλέξτε τι θα κάνετε μετά <html>");
			panel.addMessage("<html> 1) Εισέρχεστε στην εκλησία <html>");
			panel.addMessage("<html> 2) Μιλάτε στον μαραγκό της πόλης <html>");
			panel.addMessage("<html> 3) Επιστρέφετε πίσω από τα τοίχοι της πόλης <html>");
			choice1=q.takeAnAnswer(3);
		}
	}
	private void deathMessage() { //method that shows the death message and redirects the user to the menu
		panel.addMessage("<html> Εχασες το παιχνίδι, πάτα 1 αν θες να σταματήσεις να παίζεις <br>"
				+ "ή 2 αν θες να ξεκινήσεις από την αρχή ή 3 αν θες να πας στο τελευταίο checkpoint <br> <html>");
		Scanner in=new Scanner(System.in);
		int choice=q.takeAnAnswer(3);
		if(choice==2) {
			initiateStory();
		}else if (choice==3) {
			showMenu();
		}
	}
}
