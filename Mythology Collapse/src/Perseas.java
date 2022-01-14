import java.util.Scanner;
public class Perseas  {
	private boolean helmet; //μεταβλητή που δείχνει αν ο παίκτης έχει πάρει το κράνος
	private boolean sack;    //μεταβλητή που δείχνει αν ο παίκτης έχει πάρει τον σάακο
	private boolean sandals;  //μεταβλητή που δείχνει αν ο παίκτης έχει πάρει τα σανδάλια
	private boolean shield;   //μεταβλητή που δείχνει αν ο παίκτης έχει πάρει την ασπίδα
	private boolean sword;    //μεταβλητή που δείχνει αν ο παίκτης έχει πάρει το σπαθί
	private boolean key=false;  //μεταβλητή που δείχνει αν ο παίκτης έχει πάρει το κλειδί
	private boolean hammer=false;  //μεταβλητή που δείχνει αν ο παίκτης έχει πάρει το σφυρι
	public Perseas()  {  //κατασκεβαστης της κλάσης Περσέας
		initiateStory();   //εκκίνηση ιστορίας
	}
	private void initiateStory()  { //μεθοδος που εκεινει την ιστορία
		helmet=false; //αρχικοποίηση του κράνους
		sack=false;   //αρχικοποίηση του σάκου
		sandals=false;  //αρχικοποίηση των σανδαλιών
		shield=false;	//αρχικοποίηση της ασπίδας
		sword=false;
		System.out.println("Ο Περσέας φεύγει από την Σέριφο με ένα καράβι, με σκοπό να βρει την Γοργόνα Μέδουσα. \n"
				+ "Στη διαδρομή του συναντά τη θεά Αθηνά και το θεό Ερμή, από τους οποίους πληροφορείται \n"
				+ "πως για να σκοτώσει την Μέδουσα θα πρέπει να προμηθευτεί τα παρακάτω όπλα: \n");   //εμφάνιση αρχικού μηνύματος
		showMenu(); //εμφάνιση μενου
	}
	private void showMenu()  {   //μέθοδος που εμφανίζει το μενου
		String message="Επίλεξε ποιο από τα παρακάτω όπλα θέλετε να αποκτήσετε: \n" //κατασκευαζω ενα μήνυμα που θα εμφανιστει στην οθονη του Χρήστη
					+"Για να μπορέσει να πολεμήσει τη Μέδουσα θα πρέπει να χει τουλάχιστον 3/5 όπλα.\n"; 
		int counter=0; //αρχικοποιω εναν μετρητη που δείχνει τον αριθμό που αντιστοιχει σε κάθε επιλογη
		int helmetcounter=0; //μετρητης που αντιστοιχει στην επιλογη του κράνους
		int sackcounter=0;   //μετρητης που αντιστοιχει στην επιλογη του σάκου
		int sandalscounter=0;  //μετρητης που αντιστοιχει στην επιλογη για τα σανδαλια
		int shieldcounter=0;  //μετρητης που αντιστοιχει στην επιλογη για την ασπίδα
		int swordcounter=0;   //μετρητης που αντιστοιχει στην επιλογη για το σπαθί
		if(!helmet) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις την περικεφαλαία έτσι ώστε να πλησιάσεις αόρατος τον στόχο σου \n"; //ενημέρωση του μηνύματος
			helmetcounter=counter;
		}
		if(!sack) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις τον μαγικό σάκο \n"; //ενημέρωση του μηνύματος
			sackcounter=counter;
		}
		if(!sandals) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις τα φτερωτά σανδάλια, επειδή η Γοργώ - Μέδουσα, έμενε σε βράχο, στη μέση της θάλασσας.\n"; //ενημέρωση του μηνύματος
			sandalscounter=counter;
		}
		if(!shield) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις την αστραφτερή ασπίδα, απ' όπου θα έβλεπε το κεφάλι της Μέδουσας. \n"; //ενημέρωση του μηνύματος
			shieldcounter=counter;
		}
		if(!sword) {
			counter++;
			message = message + "Πατα "+counter+" για να πάρεις το κοφτερό σπαθί ή δρεπάνι, με το οποίο θα έκοβε τον σκληρό λαιμό της Γοργούς. \n";  //ενημέρωση του μηνύματος
			swordcounter=counter;
		}
		System.out.println(message); //εμφανιση μηνυματος
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		while(!(choice>=1 & choice<=counter)) {
			choice = in.nextInt();
			System.out.println("Δωσε μια έγκυρη τιμή");
		} 
		//αναλογα με την επιλογη του χρήστη ενεργοποιειται η καταλληλη μέθοδος 
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
	private void flowadministrator(String story,String choice)  { //μέθοδος που διαχειρίζεται τη ροή του προγράμματος 
		if(story.equals("sackTale")) { //ροη της ιστορίας με τον σάκο
			if(choice.equals("outsideCity")) {
				System.out.println("O Περσέας ζητάει από τον φρουρό που στέκεται στην πόρτα να τον αφήσει να εισέλθει. Ο φρουρός παρόλα αυτά τον εμποδίζει ");
				System.out.println("Ποιες απο τις παρακάτω επιλογές θα επιλέγατε?");
				System.out.println("1) Συμβιβάζεστε με τον φρουρό.");
				System.out.println("2) Επιτίθεστε στον φρουρό \n");
				Scanner in=new Scanner(System.in);
				int choice1=in.nextInt();
				while(choice1!=1 && choice1!=2 ) {
					System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
					choice1=in.nextInt();
				}
				if(choice1==1) {
					flowadministrator("sackTale","westEast");
				}
				if(choice1==2) {
					flowadministrator("sackTale","confrontGuard");
				}
			}	
			if(choice.equals("westEast")) {
				System.out.println("Σας δίνονται οι παρακάτω επιλογές ");
				System.out.println("Να κινειθείτε δυτικά της πόλης ");
				System.out.println("Να κινειθείτε ανατολικά της πόλης ");
				Scanner in = new Scanner(System.in);
				int choice1=in.nextInt();
				while(choice1!=1 && choice1!=2 ) {
					System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
					choice1=in.nextInt();
				}
				if(choice1==1) {
					System.out.println("Αποφασίζετε να κινειθείτε δυτικά της πόλης . \n"
							+ "Στο δρόμο σας βρίσκετε έναν γέροντα. Του εξιστορείετε \n"
							+ "την περιπέτειά σας και ισχυρίζεται ότι γνωρίζει έναν \n"
							+ "τρόπο να μπείτε μέσα στην πόλη μέσο ενός μυστηκού περάσματος \n");
					flowadministrator("sackTale", "West");
				}
				if(choice1==2) {
					System.out.println("Καθώς κινείστε προς τα ανατολικά συναντάται \n"
							+ " μία καινούργια πόλη. Τι κάνετε πρώτα");
					flowadministrator("sackTale", "East");
				}
			}
			if(choice.equals("confrontGuard")) {                                                           
				confrontGuard();
				showMenu();
			}
			if(choice.equals("West")) {																
				westStory();
				System.out.println("Ο Αέλας επιστρέφει πάλι έξω από τα τοιχος της πόλης");
				flowadministrator("sackTale","outsideCity");
			}
			if(choice.equals("East")) {																
				eastStory();
				System.out.println("Ο Αέλας επιστρέφει πάλι έξω από τα τοιχος της πόλης");
				flowadministrator("sackTale","outsideCity");
			}
		}
		if(story.equals("swordTale")) { // ιστορία με το σπαθί
			if(choice.equals("1")) {
				System.out.println("Οι φρουροί του βασιλιά Αέλα \n"
						+ "εμποδίζουν τον Περσέα από το να σκοτώσει τον βασιλιά τους. Παρόλα αυτά ο βασιλιάς όντας σοκαρισμένος από \n"
						+ "την ανδρεία του Περσέα του δίνει το σπαθί και τον αφήνει να φύγει");
				sword=true;
				showMenu();
			}else if(choice.equals("2")) {
				aelasTale();
			}else if(choice.equals("3")) {
				System.out.println("Ο βασιλιάς Αέλας σοκάρεται από την αντίδραση του Περσέα να δώσει τον αδερφό του σε αντάλλαγμα για το σπαθί. \r\n"
						+ "Για αύτο κλείνει τον περσέα σε ένα κελί. Για να τον αφήσει να φύγει πρέπει να απαντήσει σωτά στην παρακάτω ερώτηση: \r\n"
						+ "Ποιος θεός έχει ως ιερό ζώο τα άλογα;\r\n");
				System.out.println("Σας παρουσιάζονται οι παρακάτω δύο επιλογές: \r\n"
						+ "1) Διόνυσος\r\\n"
						+ "2) Διας");
				Scanner in=new Scanner(System.in);
				int choice1=in.nextInt();
				while(choice1!=1 && choice1!=2 ) {
					System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
					choice1=in.nextInt();
				}
				if(choice1==1) {
					System.out.println("απάντησή σας είναι σωστή. Ο Αέλας σας δίνει το σπαθί");
					helmet=true;
					showMenu();
				}else {
					System.out.println("Η απάντηση είναι λάθος και ο βασιλιάς διατάζει την εκτέλεση του Περσέα");
					deathMessage();
				}
			}
		}
	}
	private void helmetTale() { //ιστορία με την περικεφαλαία
	       System.out.println(" Για να αποκτήσει την περικεφαλαία του Άδη η Αθήνα του κάνει την εξής ερώτηση:\r\n"
	                       + "Σε τι μεταμορφώθηκε ο Δίας για να συνευρεθεί με την Ευρώπη;\r\n"
                            + "1) Ταύρος\r\n"
                            + "2)  Σύννεφο");
            Scanner in=new Scanner(System.in);
	       int choice=in.nextInt();	
            while(choice!=1 && choice!=2 ) {
	               System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
		       choice=in.nextInt();
	       }
            if(choice==1) {
		      System.out.println(" Η απάντησή σας είναι σωστή. Ο Περσέας παίρνει την περικεφαλαία");
		      showMenu();
	       }else {
          	      System.out.println(" Η απάντησή σας είναι λαθός. Ο Περσέας δεν παίρνει την περικεφαλαία.");
                   System.out.println(" Έχετε μία δεύτερη ευκαιρία\r\n"               
                                   + "Ο Άδης ήταν ο θεός του:\r\n"
                                   + "1) Πολέμου\r\n"
                                   + "2) Κάτω Κόσμου");
                   choice=in.nextInt();
                   while(choice!=1 && choice!=2 ) {
	                     System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
		             choice=in.nextInt();
	              }
                   if(choice==2) {
		             System.out.println(" Η απάντησή σας είναι σωστή. Ο Περσέας παίρνει την περικεφαλαία");
		             showMenu();
	              }else {
                          System.out.println(" Η απάντησή σας είναι λαθός. Ο Περσέας δεν παίρνει την περικεφαλαία");                     
                          deathMessage();
                   }
	       }
	}       
	private void sandalsTale()  { //ιστορία με τα σανδάλια
	         System.out.println(" Για να αποκτήσει τα φτερωτά σανδάλια ο Ερμής του κάνει την εξής ερώτηση:\r\n"
	                         + "Ποια θεότητα συνδέεται με δεσμούς αίματος με την Αφροδίτη;\r\n"
                              + "1) Ουρανός\r\n"
                              + "2) Ωκεανός");
             Scanner in=new Scanner(System.in);
	         int choice=in.nextInt();	
              while(choice!=1 && choice!=2 ) {
	                System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
		        choice=in.nextInt();
	         }
              if(choice==1) {
		        System.out.println(" Η απάντησή σας είναι σωστή. Ο Περσέας παίρνει τα φτερωτά σανδάλια");
		        showMenu();
	         }else {
          	        System.out.println(" Η απάντησή σας είναι λαθός. Ο Περσέας δεν παίρνει τα φτερωτά σανδάλια.");
                     System.out.println(" Έχετε μία δεύτερη ευκαιρία\r\n"               
                                     + "Πως έγινε ο Αχιλλέας άτρωτος;\r\n"
                                     + "1) Μεγάλωσε δίπλα στους θεούς\r\n"
                                     + "2) Η μητέρα του τον βούτηξε στα νερά του ποταμού της Στύγας");
	                choice=in.nextInt();	
                     while(choice!=1 && choice!=2 ) {
	                        System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
		                choice=in.nextInt();
	                }
                     if(choice==2) {
		               System.out.println(" Η απάντησή σας είναι σωστή. Ο Περσέας παίρνει τα φτερωτά σανδάλια");
		               showMenu();
	                }else {
                            System.out.println(" Η απάντησή σας είναι λαθός. Ο Περσέας δεν παίρνει τα φτερωτά σανδάλια");                     
                            deathMessage();
                     }
              }
	}
	private void sackTale()  { //chris
		System.out.println("O Περσεας  φτάνει στο παλάτι  του βασιλιά Ακίνοου.\r\n"
				+ " Ρωτώντας κάποιους περαστικούς μαθαίνει ότι ο σάκος και η ασπίδα βρίσκεται πίσω από τα τοίχη της πόλης του .");
		flowadministrator("sackTale","outsideCity");
		
	}
	private void swordTale() { //ιστορία με το σπαθί
		System.out.println("Η Αθηνά οδήγησε τον Περσέα στην χώρα των Υπερβορείων (μυθικός λαός που ζούσε στα βουνά της Ελλάδας).\r\n\""
				+ "Για να αποκτήσει το μυθικό σπαθί που θα σκοτώσει την Μέδουσα πρέπει να αντιμετωπίσει τον βασιλιά των Υπερβορείων Αέλα:\r\n"
				+ "Όταν ο Περσέας Ζητάει από τον Αέλα το σπαθί αυτός του παρουσιάζει τις εξείς 2 επιλογές:\r\n"
				+ "1) Να θυσιάσει το πιο σημαντικό άνθρωπο για εκείνον με αντάλαγμα το σπαθί\r\n"
				+ "2) Να τον Βοηθήσει στην εκστρατεία του εναντίον του αδερφού του που προσπαθεί να σφετεριστεί τον θρόνο");
		System.out.println("Σας παρουσιάζονται οι παρακάτω τρεις επιλογές");
		System.out.println("1) Ανικανοποίητος και με τις δύο επιλογές ο περσέας αρπάζει το σπαθί του και επιτίθεται στον βασιλιά");
		System.out.println("2) Ο περσέας συμφωνεί με την πρόταση του Βασιλιά να συμμαχίσει εναντίον "
				+"του αδερφού του με τον όρο να τον βοηθήσει στην μάχη εναντίον της μέδουσας");
		System.out.println("3) Ο Περσέας συμφωνεί να θυσιάσει τον Αδερφό του Μάνη με αντάλλαγαμa το σπαθί ");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice!=1 && choice!=2 && choice!=3) {
			System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
  			choice=in.nextInt();
		}
		String Schoice=String.valueOf(choice);
		flowadministrator("swordTale",Schoice);
	}
	private void aelasTale() { //ιστορία του Αέλα
		System.out.println("Ο Περσέας και ο Αέλας εκστρατεύουν εναντίον του Αβδηρου (αδερφός του Αέλα). \r\n"
				+ "Μετά από μέρες ταξιδιού φτάνουν στους πρόποδες ενός βουνού που βρίσκεται σε εχθρικό έδαφος. \r\n "
				+ "Ο βασιλιάς αέλας ζητάει την συμβουλή του Περσέα ως προς το τι θα κάνουν μετά");
		System.out.println("Στρατοπαιδεύουν στους πρόποδες του βουνού");
		System.out.println("Συνεχίζουν το βάδειν σε εχθρικό έδαφος");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice!=1 && choice!=2) {
			System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
			choice=in.nextInt();
		}
		if(choice==1) {
			  System.out.println("Οι στρατιώτες του βασιλειά στρατοπαιδεύουν στους πρόποδες του βουνού και διανυκτερεύουν εκεί. \r\n"
			  		+ "Το βράδυ ρίχνει πολυ ισχυρή βροχή που μετατρέπει το έδαφος σε λάσπη και κάνει πολύ δύσκολο το περπάτημα\r\n"
			  		+ " Το επόμενο πρωί ξυπνάνε ακούγοντας ήχους τύμπανων και σάλπιγγων. Προς μεγάλη τους έκπληξη ο Αβδηρος. \r\n"
			  		+ " βρίσκεται στην κορυφή του βουνού με έναν στρατό τριπλάσιο από εκείνον του αδερφού του. Ο Αέλας ξαναζητάει τη συμβουλή του Περσέα ");
			  System.out.println("1) Να επιτεθούν κατα μέταιπω στους εχθρούς τους ανεβαίνοντας την πλαγιά");
			  System.out.println("2) Να παραμείνουν στο στρατόπεδο πίσω από τις πρόχειρές του οχυρώσεις");
			  choice=in.nextInt();
			  while(choice!=1 && choice!=2) {
				  System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
				  choice=in.nextInt();
			  }
			  if(choice==1) {
				  System.out.println("Το Γλιστερό έδαφος έχει ως αποτέλεσμα οι στρατιώτες του Αέλα να γλυστρούν και να παραπατούν καθώς ανεβαίνουν την πλαγιά. \r\n"
				  		+ "To αριθμητικό πλεονεκτημα του Αβδηρου υπερισχυει στην μάχη με αποτέλεσμα οι στρατιώτες του αέλα να τραπούν σε φυγή. \r\n"
				  		+ "Μέσα στο χάος της μάχης ο περσέας βλέπει τον Αέλα να κοιτεται στο έδαφος τραυματισμένος. ");
				  System.out.println("Τι απο τα παρακάτω κάνετε?");
				  System.out.println("1) Διασώζετε τον βασιλιά και τρέπεστε σε φυγή");
				  System.out.println("2) Φεύγετε από το πεδίο της μάχης παίρνοντας μαζί σας και το σπαθί");
				  choice=in.nextInt();
				  while(choice!=1 && choice!=2) {
					  System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
					  choice=in.nextInt();
				  }
				  if(choice==1) {
					  System.out.println(" Περσέας επιστρέφει τον Αέλα στο βασίλειό του. Ο βασιλιάς μή ξέροντας πως να  ευχαριστήσει τον Περσέα του δίνει\r\n" 
							  +"μία αστραφτερή ασπίδα για να νικήσει την Μέδουσα. Ο περσέας αποχωρεί από το βασίλειο για να συνεχίσει την περιπέτειά του");
					  shield=true;
					  showMenu();
				  }
				  if(choice==2) {
					  sword=true;
					  showMenu();
				  }
			  }
			  if(choice==2) {
				  System.out.println("Οι στρατιωτες του Αελα παραμένουν πίσω από τις πρόχειρές οχυρώσεις τους. Ο Αβδηρος αναγκάζεται να επιτεθεί πρώτος.\r\n" 
						  +"Παρά την αριθμητική του υπεροχή οι στρατιώτες του πέφτουν στις γλυστερές πλαγές του βουνού \r\n"
						  + "και αδυνατούν να σηκωθουν εξαιτίας της βαριάς τους πανοπλίας, τα άλογα του βυθίζονται στη λάσπη \r\n." 
						  +"O Περσέας εντωπίζει τον Άβδηρο τραυματισμένο στο πεδίο της μάχης:  ");
				  System.out.println("1) Αποφασίζει να τον σκοτώσει τον Άβδηρο ");
				  System.out.println("2) Παίρνει τον Άβδηρο όμηρο");
				  choice=in.nextInt();
				  while(choice!=1 && choice!=2) {
					  System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
					  choice=in.nextInt();
				  }
				  if(choice==1) {
					  System.out.println("Αναπάντεχα ο αέλας κεδίζει τον πόλεμο παρα το αριθμητικό πλεονέκτημα του αδερφού του.\r\n"
					  		+ " Όταν μαθαίνει παρόλα αυτά την τύχη του νευριάζει με τις \r\n"
					  		+ "δράσεις του περσέα καθως δεν επιδίωκε τον θάνατο του αδερφού του. \r\n"
					  		+ "Εξοργισμένος τον εξορίσει χωρίς να του δώσει το σπαθί \r\n");
					  showMenu();
				  }
				  if(choice==2) {
					  System.out.println("Αναπάντεχα ο αέλας κεδίζει τον πόλεμο παρα το αριθμητικό πλεονέκτημα του αδερφού του. \r\n"
					  		+ "Ευχαριστεί τον Περσέα για τις δράσεις του δίνει το σπαθί και το προσφερει συμαχια όπως είχε υποσχεθεί.");
					  sword=true;
					  showMenu();
				  }
			  }
		}
		if(choice==2) {
			System.out.println("Οι στρατιώτες του Αέλα συνεχίζουν το βαδειν κατα τη διάρκεια της νύχτας. \r\n"
					+ "Κατα τη διάρκεια του ταξιδιού τους παρατηρούν σε απόσταση τον εχθρικό στρατό σε ανοιχτό πεδίο. \r\n"
					+ "Εξαιτίας του σκοταδιού δεν μπορούν να εντοπίσουν το ακριβές μέγεθος του στρατου. \r\n"
					+ "Ο βασιλιάς αέλας ζητάει για μία ακόμα φορά την άποψη του Περσέα \r\n");
			choice=in.nextInt();
			while(choice!=1 && choice!=2) {
				System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
			    choice=in.nextInt();
			}
			if(choice==1) {
				System.out.println( "H κατά μέτωπο επίθεση με τον εχθρικό στρατό έχει ως αποτέλεσμα ολοκληρψτική ήτα");
				deathMessage();
			}
			if(choice==2) {
				System.out.println("Κατα τη διρκεια της τακτικης υποχωρησης εντοπίζουν εναν εχθρικο ανιχνευτη ο οποίος τους πληροφορεί για τα σχεδια των εχθρων. \r\n "
						+ "Με τη βοήθειά του στηνουν ενεδρα και νικους το εχθρικο βασιλειο");
			    System.out.println("Ο βασιλιας σας δίνει το σπαθί");
			    sword=true;
			    showMenu();
			}
		}
	}
	public void confrontGuard() { //μέθοδος που περιγράφει τη συνάντηση με τον φρουρό
		System.out.println("Επιτίθεστε στον φρουρό");
		if(sword) {
			System.out.println("Επειδή έχετε το σπαθί νικάτε τον φρουρό  \n"
					+ "τώρα όμως πρέπει να μπείτε στην πόλη. Σας παρουσιάζονται \n"
					+ "οι παρακάτω επιλογές	");
			int count=0;
			int keycounter=0;
			int hammercounter=0;
			if(key) {
				System.out.println(++count+") Ανοίγετε την πόρτα με το κλειδί της πόλης");
				keycounter=count;
			}
			if(hammer) {
				System.out.println(++count+") Σπάτε την πόρτα με το σφυρί");
				hammercounter=count;
			}
			System.out.println(++count+") Σπάτε την πόρτα με τα χέρια σας");
			int handcounter=count;
			Scanner in = new Scanner(System.in);
			int choice1=in.nextInt();
			while(!(choice1>0 & choice1<=count)) {
				System.out.println("Εισάγετε μία έγκυρη επιλογή");
				choice1=in.nextInt();
			}
			if(choice1 == hammercounter) {
				System.out.println("Ανοίξατε με επιτυχία την πόρτα αλλά τώρα "
						+ "έχετε τραβήξει την προσοχή όλου του εχθρικού στρατού. Τι κάνετε?");     
				System.out.println("1) Επιτίθεστε κατα μέτωπο?");
				System.out.println("2) Ζητάτε να διαπραγματευτείτε με το Βασιλιά");
				choice1=in.nextInt();
				while(!(choice1>0 & choice1<=count)) {
					System.out.println("Εισάγετε μία έγκυρη επιλογή");
					choice1=in.nextInt();
				}
				if(choice1 == 1) {
					System.out.println("Επιτήθεστε κατά μέτωπο παρόλα αυτά \n"
							+ "οι δυνάμεις του βασιλιά υπερισχύουν");
					deathMessage();
				}
				if(choice1 == 2) {
					System.out.println("Οι στρατιώτες του βασιλιά σας οδηγούν στην αίθουσα του θρόνου ");
					System.out.println("Ο βασιλιάς σας υποδέχεται και λέει ότι επειδή θαυμάζει το κουράγιο σας"
							+ "θα σας δώσει τον μαγικό σάκο υπό έναν όρο: Να απααντήσετε σωστά σε μία ερώτησή του");
					System.out.println("Ποιος κατασκεύασε την πανοπλία του Αχιλλέα;");
					System.out.println("1. Ο Θεός Άρης");
					System.out.println("2. Ο Θεός Ήφαιστος");
					System.out.println("3. Η θαλασσινή θεά Θέτιδα");
					System.out.println("4. Η θεά Αθηνά");
					choice1=in.nextInt();  
					while(!(choice1>0 & choice1<=4)) {
						System.out.println("Εισάγετε μία έγκυρη επιλογή");
						choice1=in.nextInt();
					}
					if (choice1 == 4) {
						System.out.println("Σωστή απάντηση λαμβάνετε τον μαγικό σάκο");
						sack=true;
					} else {
						System.out.println("Η απάντησή σας είναι λάαθος. Ο βασιλιάς σας εκτελεί");
						deathMessage();
					}
				}
			}
			if (choice1 == handcounter ) {
				System.out.println("Δεν μπορείτε να σπάσετε την πόρτα με τα χερια σας \n");
				flowadministrator("sackTale", "outsideCity");
			}
			if (choice1 == keycounter) {
				System.out.println("Μπαίνετε μέσα στην πόλη με το τιμιτκό κλειδί της πόλης \n"
						+ "Ο φρουρός το αναγνωρίζει και σας οδηγεί άμεσα στην αίθουσα του θρόνου \n");
				System.out.println("Ο βασιλιάας αναγνωρίζει και αυτός το τιμητικό κλειδί  \n"
						+ "ακούει το αίτημά σας για να πάρετε τον μαγικό σάκο. ");
				System.out.println("Αναφέρει ότι αν του απαντήσατε σωστά σε μία ερώτηση θα σας τον δώσει");
				System.out.println("Ποιοι ήταν οι γονείς του Αχιλλέα;");
				System.out.println("1. Ο Πηλέας και η Θέτιδα");
				System.out.println("2. Ο Δίας και η Θέτιδα");
				System.out.println("3. Ο Δίας και η Αλκμήνη");
				System.out.println("4. Ο Αθάμας και η Νεφέλη");
				choice1=in.nextInt();
				while(!(choice1>0 & choice1<=4)) {
					System.out.println("Εισάγετε μία έγκυρη επιλογή");
					choice1=in.nextInt();
				}
				if (choice1 == 4) {
					System.out.println("Σωστή απάντηση λαμβάνετε τον μαγικό σάκο");
					sack=true;
				} else {
					System.out.println("Η απάντησή σας είναι λάαθος. Ο βασιλιάς σας εκτελεί");
					deathMessage();
				}
			}
		} else {
			System.out.println("Ο φρουρός σας αποκρούωει επειδή δεν έχετε το σπαθί");
			flowadministrator("sackTale", "outsideCity");
		}
	}
	public void westStory()  {
		System.out.println("Αποφασίζετε να κινειθείτε δυτικά της πόλης. \n"
				+ "Στο δρόμο σας βρίσκετε έναν γέροντα. Του εξιστορείετε την \n"
				+ "περιπέτειά σας και ισχυρίζεται ότι γνωρίζει έναν τρόπο να μπείτε \n"
				+ " μέσα στην πόλη μέσο ενός μυστηκού περάσματος \n");
		System.out.println("Αποφασίζετε να εμπιστευτείτε τον γέροντα");
		System.out.println("Ακολουθείτε τον γέροντα πίσω στην πόλη σας υποδεικνύει \n"
				+ "μία μικρή πύλη στην οποία δεν υπάρχει κανένας φρουρός");
		System.out.println("Έχετε τις παρακάτω επιλογές");
		System.out.println("1) Εισέρχεστε στην πόλη μέσω της πύλης πρώτοι");
		System.out.println("2) Όντας δυσπιστοι υποδικνείετε στον γέροντα να περάσει πρώτος");
		Scanner in=new Scanner(System.in);
		int choice1=in.nextInt();
		while(!(choice1>0 & choice1<=2)) {
			System.out.println("Εισάγετε μία έγκυρη επιλογή");
			choice1=in.nextInt();
		}
		if (choice1 == 1) {
			System.out.println("Με το που ανοίγετε την πόρτα συνηδειτοποιείτε ότι πρόκειται \n"
					+ "για μία ενέδρα και σας περιμένουν από πίσω οι φρουροί του βασιλιά. \n"
					+ "Ο γέροντας αποδηκνύεται ότι ήταν τελικά ένας κηνυγός κεφαλών  που \n"
					+ "χρωστούσε χρήματα στον βασιλιά ");
			System.out.println("Έχετε τις παρακάτω επιλογές:");
			System.out.println("1) Πολεμάτε τους Φρουρούς του βασιλειά");
			System.out.println("2) Προσπαθείτε να αποδράσετε από την πόλη");
			choice1=in.nextInt();
			while(!(choice1>0 & choice1<=2)) {
				System.out.println("Εισάγετε μία έγκυρη επιλογή");
				choice1=in.nextInt();
			}
			if (choice1 == 1) {
				System.out.println("Η αναταραχή που πραγματοποιείται στην πόλη εξααιτίας της μάχης \n" 
						+ "τραβάει την προσοχή του βασιλιά ο οποίος σας βλέπει να μάχεστε γενναία. Θαυμάζει το κουράγιο σας \n"
						+ "και για αυτό αποφασίζει να σας δώσει τον μαγικό σάκκο αν απαντησετε σωστά σε μίαα ερώτηση");
				System.out.println("Τι εννοούμε με τη φράση μήλο της Έριδας;");
				System.out.println("1. Αιτία για τσακωμό");
				System.out.println("2. Νόστιμο φρούτο");
				System.out.println("3. Πτώση ενός μήλου");
				System.out.println("4. Πολύτιμο δώρο");
				choice1=in.nextInt();
				while(!(choice1>0 & choice1<=4)) {
					System.out.println("Εισάγετε μία έγκυρη επιλογή");
					choice1=in.nextInt();
				}
				if (choice1 == 4) {
					System.out.println("Σωστή απάντηση λαμβάνετε τον μαγικό σάκο");
					sack=true;
				} else {
					System.out.println("Η απάντησή σας είναι λάθος. Ο βασιλιάς σας εκτελεί");
					deathMessage();
				}
			}
			if (choice1==2) {
				System.out.println("Οι φρουροί του βασιλιά υπερισχύουν αριθμητικά και για αυτό σας νικάνε");
				deathMessage();
			}
		}
		if (choice1 == 2) {
			System.out.println("O γέροντας εισέρχεται πρώτος μέσα στην πόλη \n"
					+ "με το που μπαίνει όμως ακούτε αναταραχές να ξεεσπάνε μέσα στην πόλη \n"
					+ "Καθώς μπαίνετε και σεις να δείτε τι γίνεται βλέπετε ότι οι στραατιώτες του βασιλειά έχουν φυλακίσει τον γέροντα \n"
					+ "όταν ρωτάτε τι έγινε σας απαντάνε ότι ο γέροντας ήταν χρόνια καταζηούμενος από το βασιλιά \n"
					+ "σας ευχαριστούνε που βοηθήσατε στην φυλάκησή του και για αυτό σας δίνουν τον μαγικό σάκο");
			sack=true;
		}
	}
	public void eastStory() {
		System.out.println("Καθώς κινείστε προς τα ανατολικά συναντάται μία καινούργια πόλη. Τι κάνετε πρώτα");
		System.out.println("1) Εισέρχεστε στην εκλησία");
		System.out.println("2) Μιλάτε στον μαραγκό της πόλης");
		System.out.println("3) Επιστρέφετε πίσω από τα τοίχοι της πόλης");
		Scanner in=new Scanner(System.in);
		int choice1=in.nextInt();
		while(!(choice1>0 & choice1<=3)) {
			System.out.println("Εισάγετε μία έγκυρη επιλογή");
			choice1=in.nextInt();
		}
		while (choice1 != 3) {
			if (choice1 == 1 ) {
					System.out.println("Μέσα στον ναό συναντάτε ένα ιερέα στον οποίο εξιστορείτε την περιπέτειά σας");
					System.out.println("Ο ιερέας συναρπάζεται από την ιστορία σας και διατείθεται να σας δώσει το \n"
							+ "κλειδί της πόλης αν απααντήσετε σωστά σε μία ερώτηση του");
					System.out.println("Ποιος μάντης έδωσε χρησμό στους Αχαιούς ότι θα έπαιρναν την Τροία σε δέκα χρόνια;");
					System.out.println("1. Ο Φινέας");
					System.out.println("2. Ο Κάλχας");
					System.out.println("3. Ο Τειρεσίας");
					System.out.println("4. Ο Άνιος");
					choice1=in.nextInt();
					while(!(choice1>0 & choice1<=4)) {
						System.out.println("Εισάγετε μία έγκυρη επιλογή");
						choice1=in.nextInt();
					}
					if (choice1 ==4 ) {
						System.out.println("Απαντήσατε σωστά παίρνετε το κλειδί της πόλης");
						key=true;
					} else {
						System.out.println("Απαντήσατε λάθος");
					}
			}else if (choice1 == 2 ) {
				System.out.println("Ο Μαραγκός ακούει την ιστορία σας και προθυμοποιείται να σας δώσει ένα από τα αντικειμενα ");
				System.out.println("1) To σπαθί");
				System.out.println("2) Ένα σφυρί ειδικά φτιοαγμένο για να σπάσει την πόρτα της πόλης");
				choice1=in.nextInt();
				while(!(choice1>0 & choice1<=2)) {
					System.out.println("Εισάγετε μία έγκυρη επιλογή");
					choice1=in.nextInt();
				}
				if (choice1==1) {
					System.out.println("Συγχαρητήρια πήρες το σπαθί");
					sword=true;
				} else {
					System.out.println("Συγχαρητήρια πήρες το σφυρί");
					hammer=true;
				}
			}
			System.out.println("Επιλέξτε τι θα κάνετε μετά");
			System.out.println("1) Εισέρχεστε στην εκλησία");
			System.out.println("2) Μιλάτε στον μαραγκό της πόλης");
			System.out.println("3) Επιστρέφετε πίσω από τα τοίχοι της πόλης");
			choice1=in.nextInt();
			while(!(choice1>0 & choice1<=3)) {
				System.out.println("Εισάγετε μία έγκυρη επιλογή");
				choice1=in.nextInt();
			}
		}
	}
	private void deathMessage() { //μήνυμα θανατου
		System.out.println("Εχασες το παιχνίδι, πάτα 1 αν θες να σταματήσεις να παίζεις \r\n"
				+ "ή 2 αν θες να ξεκινήσεις από την αρχή ή 3 αν θες να πας στο τελευταίο checkpoint");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice!=1 && choice!=2 && choice!=3) {
			System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
			choice=in.nextInt();
		}
		if(choice==2) {
			initiateStory();
		}else if (choice==3) {
			showMenu();
		}
	}
	public static void main (String[] args) {
		Perseas story = new Perseas();
	}
}
