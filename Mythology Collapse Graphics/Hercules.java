public class Hercules {
	private static int answer_given, answer;
	private static int checkpoint = 1;
	private static boolean k = true, father_zeus = true;
	private static Graphics panel;
	private static Quiz q;

/*****************************************************
 * Beginning of story of Hercules. Checking the checkpoint
 * and running the corresponding story part.
 *****************************************************/
	public Hercules(Graphics panel) {
		this.panel=panel;
		q=new Quiz(panel);
		panel.setMessage("<html> Το ακόλουθο παιχνίδι θα βασιστεί πάνω σε ερωτήσεις σχετικά με τη ζωή του ήρωα και τους άθλους που διέπραξε.<br> <html>");
		panel.addMessage("<html> Ο Ηρακλής ήταν αρχαίος μυθικός ήρωας, θεωρούμενος ως ο μέγιστος των Ελλήνων ηρώων.<br>"
				+ "Ως Άθλοι του Ηρακλέους έχουν καταγραφεί στην ελληνική μυθολογία δώδεκα κατορθώματα που έκανε ο μυθικός αυτός ήρωας,<br>"
				+ "προκειμένου να εξαγνισθεί για το φόνο της γυναίκας του και των παιδιών του, που είχε διαπράξει όταν τον τρέλανε η Ήρα.<br>"
				+ "Για το σκοπό αυτό, ο Ηρακλής πήγε στο Μαντείο των Δελφών και πήρε χρησμό, σύμφωνα με τον οποίο έπρεπε να υπηρετήσει <br>"
				+ "για δώδεκα χρόνια τον Ευρυσθέα, βασιλιά της Τίρυνθας, και να πραγματοποιήσει τους άθλους που του πρόσταζε εκείνος.<br> <html>");
				
		while (checkpoint != 10) {
			if (checkpoint == 1) {
				assert checkpoint == 1 : "Wrong checkpoint";
				answer_given = fatherOfHercules();
			} else if (checkpoint == 2) {
				assert checkpoint == 2 : "Wrong checkpoint";
				jealousyOfHera(answer_given);
			} else if (checkpoint == 3) {
				assert checkpoint == 3 : "Wrong checkpoint";
				roadChoosing();
			} else if (checkpoint == 4) {
				assert checkpoint == 4 : "Wrong checkpoint";
				howHeDealt();
			} else if (checkpoint == 5) {
				assert checkpoint == 5 : "Wrong checkpoint";
				killingHydra();
			} else if (checkpoint == 6) {
				assert checkpoint == 6 : "Wrong checkpoint";
				assert k == true : "Wrong boolean";
				k=true;
				pathDigging();
			} else if (checkpoint == 7) {
				assert checkpoint == 7 : "Wrong checkpoint";
				minotaurFeat();
			} else if (checkpoint == 8) {
				assert checkpoint == 8 : "Wrong checkpoint";
				theBelt();
			} else if (checkpoint == 9) {
				assert checkpoint == 9 : "Wrong checkpoint";
				dwarfBrothers();
			} else if (checkpoint == 10) {
				assert checkpoint == 10 : "Wrong checkpoint";
				wifeBetrayal();
			}
		}
		endingTitles();
	}

	/*****************************************************
	 * The first story part about Hercules father.
	 * Returns the player's answer.
	 *****************************************************/

	private static int fatherOfHercules() {
		assert checkpoint == 1 : "Wrong checkpoint";
		
		/*****************************************************
		 * checkpoint is getting increased as the first method
		 * is ran.
		 *****************************************************/
		
		checkpoint++;
		panel.addMessage("<html> Ποιός ήταν ο πατέρας του Ηρακλή; <br>" 
						+ "1)Δίας. <br>" 
						+ "2)Αμφιτρύωνας. <br> <html>");
		answer = q.takeAnAnswer(2);
		assert answer == 1 || answer == 2 : "No such answer";
		return answer;
	}
	
	/*****************************************************
	 * The second story part about the jealousy of Hera.
	 * Checks the previous given answer and continuous
	 * the story accordingly.
	 *****************************************************/
	
	private static void jealousyOfHera(int answer_given) {
		assert checkpoint == 2 : "Wrong checkpoint";		
		checkpoint++;
		assert (answer_given == 1 || answer_given == 2) : "wrong answer_given";
		if (answer_given == 1) {
			
			/*****************************************************
			 * "k" is a boolean where it checks if the "print"
			 * has already been printed before.
			 *****************************************************/
			
			if (k) {
				panel.setMessage("<html> Σύμφωνα με τη μυθολογία αυτή είναι η σωστή απάντηση παρότι η Αλκμήνη, <br>"
								+ "μητέρα του Ηρακλή, ήταν παντρεμένη με τον Αμφιτρύωνα,<br>"
								+ "Δίας πήρε τη μορφή του Αμφιτρύωνα και κοιμήθηκε με την Αλκμήνη. <html>");
				k = false;
			}
			
			panel.addMessage("<html>Η Ήρα, η γυναίκα του Δία, τον ζήλευε όταν γεννήθηκε ο Ηρακλής και αν ναι πως αντέδρασε;<br>"
							+ "1)Ναι.<br>" 
							+ "2)Όχι.<html>");
			answer = q.takeAnAnswer(2);

			if (answer == 1) {
				panel.setMessage("<html> 1)Η Ήρα έστειλε φίδια για να σκοτώσουν τον Ηρακλή.<br>"
								+ "2)Η Ήρα πήγε η ίδια να σκοτώσει τον Ηρακλή. <html>");
				answer = q.takeAnAnswer(2);

				if (answer == 1) {
					panel.setMessage("<html>Η Ήρα η οποία ζήλευε θανάσιμα τον Δία για τις απιστίες του προκειμένου να τον εκδικηθεί <br>"
									+ "\nέστειλε στην κούνια του βρέφους Ηρακλή δύο φίδια, αλλά αυτός κατάφερε να τα στραγγαλίσει. <html>");

				} else if (answer == 2) {
					panel.setMessage("<html> 1)Η Ήρα απέτυχε και δεν σταμάτησε να αναζητεί τρόπο εκδίκησης. <br>"
									+ " 2)Η Ήρα πέτυχε τον στόχο της και ο Ηρακλής πέθανε. <html>");
					answer = q.takeAnAnswer(2);
					
					if (answer == 1) {
						panel.setMessage("<html> Η Ήρα μετά από κάποια χρόνια κατάφερε να βρει τρόπο να σκοτώσει τον Ηρακλή, <br>"
										+ "παίρνοντας την μορφή ενός φίλου και πνίγοντάς τον στον ύπνο του <html>");

					} else if (answer == 2) {
						panel.setMessage("<html> Ο Ηρακλής πέθανε πολύ νωρίς στην Ιστορία.<html>");
						reset();
					}
				}
			} 
			
			else if (answer == 2) {
				panel.setMessage("<html> Δεν ζήλευε, οπότε ο Ηρακλής δεν έμαθε ποτέ τις πραγματικές του δυνάμεις. <html>");
				ordinaryPerson();
				answer = 1;
			}

		} else if (answer_given == 2) {
			checkpoint--;
			father_zeus = false;
			panel.setMessage("<html>Ο θετός πατέρας του Ηρακλή, ο Αμφιτρύωνας, ανέλαβε να τον μεγαλώσει. Είχαν μια άριστη σχέση πατέρα και γιού, <br>"
							+ "περνόντας αρκετό χρόνο μαζί και κάνοντας διάφορα πράγματα. <br>"
							+ "Πήγαιναν για ψάρεμα και για κυνήγι και για τον Ηρακλή... <br>"
							+ " Αμφιτρύωνας ήταν κάτι σαν το πρότυπό του. <html>");
			ordinaryPerson(); // Η Ιστορία με πατέρα τον Αμφιτρύωνα.
		}
		
	}
	
	/*****************************************************
	 * The third story part about Hercules having to choose
	 * which road he is going to take.
	 * It changes the overall story depending on the path
	 * he takes.
	 *****************************************************/

	private static void roadChoosing() {
		assert checkpoint == 3 : "Wrong checkpoint";
		checkpoint++;
		panel.setMessage("<html> Ο μύθος που σώθηκε από τον Ξενοφώντα, μας διηγείται το περιστατικό εκείνο, όταν ο Ηρακλής καθισμένος σε κάποιο σταυροδρόμι, <br>"
						+ "είδε να περνούν από μπροστά του δύο πανέμορφες κοπέλες. Η μια του έδειξε έναν εύκολο δρόμο, φαρδύ και ίσιο, που αν τον ακολουθούσε,<br>"
						+ "θα χαιρόταν τη ζωή, αλλά θα έκανε ένα σωρό κακές πράξεις που θα τον καταδίκαζαν στην κρίση των ανθρώπων. Αυτή ήταν η Κακία.<br>"
						+ "Η άλλη κόρη, η Αρετή, του έδειξε ένα δύσκολο δρόμο, γεμάτο κοφτερές πέτρες και αγκάθια, στενό και δύσβατο, που θα τον βάδιζε δύσκολα,<br>"
						+ "αλλά θα κέρδιζε στο τέλος του την αναγνώριση από τους συνανθρώπους του.<br> <html>");
		
		panel.addMessage("<html> Ποιόν δρόμο τελικά επέλεξε ο Ηρακλής; <br>" 
						+ "1)Της Αρετής. <br>" 
						+ "2)Της Κακίας. <br> <html>");
		answer = q.takeAnAnswer(2);
		
		if (answer == 1) {
			panel.setMessage("\nΟ Ηρακλής ακολούθησε την Αρετή, προτιμώντας να υποφέρει για να διαβεί το δύσβατο δρόμο της, αλλά να γνωρίσει τη δόξα και την τιμή"
							+ "\nμε τις καλές του πράξεις και την αρετή του. Με την επιλογή του αυτήν η Ήρα συνέχισε να ζηλεύει και παρέσυρε τον Ηρακλή στο να"
							+ "\nσκοτώσει τη γυναίκα του και τα παιδιά του.");

		} else if (answer == 2) {
			panel.setMessage("\nΟ Ηρακλής μεγάλωσε με πολλές γυναίκες και πολλά παιδιά σε ένα ανέμελο δρόμο με πολλές χαρές."
							+ "\nΠαρόλα αυτά η Ήρα συνέχισε να ζηλεύει και τρέλανε τον Ηρακλή οδηγώντας τον να σκοτώσει τη γυναίκα του και τα τρία παιδιά του.");
			
			panel.addMessage("<html> Πως συνέχισε ο Ηρακλής την ζωή του; <br>"
					+ "1)Άρχισε να αναπολεί το παρελθόν του και μετάνιωσε για ότι έκανε με παρακίνηση της Ήρας. <br>"
					+ "2)Συνέχισε με την ανέμελη ζωή του. <html>");
			answer = q.takeAnAnswer(2);

			if (answer == 1) {
				panel.setMessage("<html> Προσπάθησε να βρει έναν τρόπο για να διορθώσει ότι είχε κάνει.<html>");

			} else if (answer == 2) {
				panel.setMessage("<html> Στα πλαίσια μιας φυσιολογικής και ανέμελης ζωής, έφτασε σε μεγάλη ηλικία πεθαίνοντας από φυσικά αίτια. <html>");
				reset();

			} 

		}
		
		
	}
	
	/*****************************************************
	 * The fourth story part about Hercules realizing his
	 * actions (killing his family).
	 *****************************************************/

	private static void howHeDealt() {
		assert checkpoint == 4 : "Wrong checkpoint";
		checkpoint++;
		panel.setMessage("<html> Πως έπραξε ο Ηρακλής όταν συνειδητοποίησε τι έκανε; <br>"
						+ " 1)Πήγε στο μαντείο των Δελφών για να μάθει πως μπορούσε να επανορθώσει.<br>"
						+ " 2)Αυτοκτόνησε από την θλίψη του. <html>");
		answer = q.takeAnAnswer(2);

		if (answer == 1) {
			panel.setMessage("<html> Όταν συνειδητοποίησε τι έκανε, αποφάσισε να πάει στο Μαντείο των Δελφών για να πάρει χρησμό, ώστε να μάθει με ποιον τρόπο <br>"
							+ "θα μπορούσε να εξαγνισθεί. Σύμφωνα με τον χρησμό, έπρεπε να υπηρετήσει για δώδεκα χρόνια τον Ευρυσθέα, βασιλιά των Μυκηνών, <br>"
							+ "και να πραγματοποιήσει τους άθλους που θα του πρόσταζε εκείνος. <html>");
		
		} else if (answer == 2) {
			panel.setMessage("<html> Οι τύψεις που τον έπνιγαν τον οδήγησα να αυτοκτονήσει και έτσι πέθανε νωρίς στην ιστορία. <html>");
			reset();

		}

	}
	
	/*****************************************************
	 * The fifth story part where the story as we know it
	 * really begins.
	 *****************************************************/

	private static void killingHydra() {
		assert checkpoint == 5 : "Wrong checkpoint";
		checkpoint++;
		// panel.setMessage("Αφήγηση σχετικά με την Λερναία Ύδρα.");
		panel.setMessage("<html> Το δεύτερο κατόρθωμά του Ηρακλή είχε να κάνει με την Λερναία Ύδρα, ενός φιδιού με εννέα κεφάλια που ζούσε στη λίμνη Λέρνη και <br>"
						+ "σκορπούσε τη συμφορά στους κατοίκους της περιοχής. Στη θέση κάθε κεφαλιού που έκοβες όμως ξεπετιόνταν άλλα δύο, <br>"
						+ "και έτσι η εξόντωση της ήταν αρκετά δύσκολη. <html>");

		panel.addMessage("<html> Με ποιόν τρόπο προσπάθησε,λοιπόν, να νικήσει την Λερναία Ύδρα; <br>"
				+ " 1)Καθώς έκοβε το κεφάλι, έκαβε ταυτόχρονα και τις πληγές <br>"
				+ " 2)Προσπάθησε να καρφώσει την καρδία της Λερναίας Ύδρας. <br>"
				+ " 3)Δεν προσπάθησε και απλώς έτρεξε να ξεφύγει <html>");
		answer = q.takeAnAnswer(3);

		if (answer == 1) {
			panel.setMessage("<html> Αφού στη θέση κάθε κεφαλιού που έκοβε ο Ηρακλής ξεπετιόνταν άλλα δύο, <br>"
							+ "αναγκάστηκε όταν έκοβε ένα κεφάλι να καίει με φωτιά το κόψιμο. <br>"
							+ "Ήταν ο μοναδικός τρόπος να καταφέρει να την νικήσει <br>"
							+ "Ύστερα, αφού σκότωσε το θηρίο, βούτηξε στο αίμα του τα βέλη του και τα κατέστησε θανατηφόρα. <html>");

		} else if (answer == 2) {
			panel.setMessage("<html> Τα κατάφερε, αλλά η Λερναία Ύδρα δεν πέθανε και έτσι ο Ηρακλής σκοτώθηκε. <html>");
			reset();

		} else if (answer == 3) {
			panel.setMessage("<html> Τι έκανε μετά; <br>" 
							+ " 1)Σταμάτησε να τρέχει και ξανά σκέφτηκε τον τρόπο αντιμετώπισης. <br>"
							+ " 2)Συνέχισε να τρέχει μέχρι που γύρισε τον Ευρυσθέα. <html>");
			answer = q.takeAnAnswer(2);

			if (answer == 1) {
				panel.addMessage("<html> Ο Ηρακλής προσπαθεί ξανά να βρει κάποιον τρόπο να εξοντώσει την Λερναία Ύδρα. <html>");
			
			} else if (answer == 2) {
				panel.setMessage("<html> Ο Ευρυσθέας του υπενθύμισε γιατί κάνει τους άθλους του και πως έπρεπε να τα καταφέρει.<html>");
				panel.addMessage("<html> Πως έπραξε ο Ηρακλής μετά από αυτήν την υπενθύμιση; <br>"
								+ "\n 1)Γύρισε πίσω στην Λερναία Ύδρα για να την αντιμετωπίσει. <br>"
								+ "\n 2)Αυτοκτόνησε από την θλίψη του. <html>");
				answer = q.takeAnAnswer(2);

				if (answer == 1) {
					panel.setMessage("<html> Η ιστορία με την Λερναία Ύδρα αρχίζει και πάλι <html>");

				} else if (answer == 2) {
					panel.setMessage("<html> Αυτοκτόνησε από την θλίψη και το άγχος του που δεν μπόρεσε να φέρει εις πέρας τους άθλους του. <html>");
					reset();

				}
			}
		}

	}
	
	/*****************************************************
	 * The sixth story part about Hercules having to decide
	 * where he will dig the path that the water will pass
	 * through.
	 *****************************************************/

	private static void pathDigging() {
		assert checkpoint == 6 : "Wrong checkpoint";
		checkpoint++;
		panel.setMessage("<html> Ένας άλλος άθλος του Ηρακλή ήταν να καθαρίσει τους στάβλους του Αυγεία,<br>"
				+ "του πλούσιου βασιλιά με τα 3.000 βόδια, που από την κοπριά που είχε μαζευτεί εκεί από τριάντα χρόνια,<br>"
				+ "που είχαν να καθαριστούν οι στάβλοι, είχε πρόβλημα όλο το χωριό. <html>");
		
		panel.addMessage("<html>Ο Ηρακλής πού έσκαψε για να κατευθύνει τα νερά του Πηνειού και του Αλφειού,<br>"
						+ "ώστε να καθαρίσουν οι στάβλοι του Αυγεία;<br>"
						+ " 1)Στα θεμέλια των στάβλων.<br>" 
						+ " 2)Μέσα στους ίδιους τους στάβλους. <html>");
		answer = q.takeAnAnswer(2);

		if (answer == 1) {
			panel.setMessage("<html> Ο Ηρακλής με αυτόν τον τρόπο κατάφερε να κάνει τα νερά να παρασύρουν <br>"
							+ "την κοπρία από τους στάβλους και να καθαριστεί το μέρος. <html>");

		} else if (answer == 2) {
			panel.setMessage("<html> Τι αποτελέσματα είχε αυτό στους στάβλους και στην περιοχή; <br>"
							+ " 1)Καταστράφηκαν οι στάβλοι εντελώς. <br>" 
							+ " 2)Δεν επηρρεάστηκαν καθόλου. <html>");
			answer = q.takeAnAnswer(2);

			if (answer == 1) {
				panel.setMessage("<html> Έσπασαν οι φράχτες,τα ζώα το έσκασαν και κατέστερψαν την πόλη, με αποτέλεσμα <br>"
						+ "οι κάτοικοι να ζητήσουν την ευθανασία του Ηρακλή ως εκδίκηση για τις περιουσίες τους που καταστράφηκαν. <html>");
				reset();

			} else if (answer == 2) {
				panel.setMessage("<html> Δεν είχε κανένα αποτέλεσμα στους στάβλους και στην γύρω περιοχή. <br>"
								+ "Ο Ηρακλής συνέχισε κανονικά τη ζωή του ως ένας συνηθισμένος άνθρωπος, <br>"
								+ "καθώς δεν είχε την ψυχική δύναμη να συνεχίσει. <html>");
				ordinaryPerson();
			}	
		}
		
		
	}
	
	/*****************************************************
	 * The seventh story part where Hercules had to capture
	 * the minotaur.
	 *****************************************************/

	private static void minotaurFeat() {
		assert checkpoint == 7 : "Wrong checkpoint";
		checkpoint++;
		if (k) {
			panel.setMessage("<html> Όσον αφορά τον έβδομο άθλο του Ηρακλή, αυτός ήταν να καταφέρει να αιχμαλωτήσει τον ταύρο της Κρήτης <br>"
					+ "ή αλλιώς μινώταυρο και να τον πάει ζωντανό στον Ευρυσθέα <html>");
		}
		panel.addMessage("<html> Με ποιον τρόπο κατάφερε λοιπόν ο Ηρακλής να ολοκληρώσει τον έβδομο άθλο; <br>"
						+ " 1)Χρησιμοποίησε δίχτυ για να τον ακινητοποιήσει και μετά τον κουβάλησε; <br>"
						+ " 2)Προσπάθησε πρώτα να τον δαμάσει; <html>");
		answer = q.takeAnAnswer(2);
		k = false;
		
		switch (answer) {

		case 1:
			break;

		case 2:
			panel.setMessage("<html> Ποιό το αποτέλεσμα; <br>"
							+ " 1)Πέτυχε και υπάκουε τις εντολές του Ηρακλή; <br>" 
							+ " 2)Απέτυχε. <html>");
			answer = q.takeAnAnswer(2);

			if (answer == 1) {
				panel.setMessage("<html> 1)Πρόσταξε τον Ταύρο να παραδωθεί στον Ευρυσθέα.<br>"
						+ " 2)Πρόσταξε το ταύρο να πάει να σκοτώσει τον Ευρυσθέα. <br>"
						+ " 3)Πρόσταξε τον ταύρο να τον βοηθήσει να πάρει εκδίκηση από την Ήρα. <html>");
				answer = q.takeAnAnswer(3);

				//panel.setMessage("Συνειδητοποίησε ότι παρά την δυσκολία των άθλων,\n"
					//	+ "πρέπει να συνεχίσει ώστε να φτάσει στη λύτρωση.");
				if (answer == 1) {
					panel.setMessage("<html> Ο μινώταυρος μετά από αρκετή επιμονή τον υπάκουσε <html>");
					
				} else if (answer == 2) {
					panel.setMessage("<html> Συνειδητοποίησε ότι παρά την δυσκολία των άθλων, πρέπει να συνεχίσει ώστε να φτάσει στη λύτρωση <br>"
									+ "και όχι να σκοτώσει τον Ευρυσθέα. <html>");
					reset();

				} else if (answer == 3) {
					answer = 1;
				}

			} else if (answer == 2){
				panel.setMessage("<html> Την ώρα που προσπαθούσε να τον δαμάσει,ο μινώταυρος τον χτύπησε με δύναμε και τον σκότωσε. <html>");
				reset();
			
			}
		}	
	}
	
	/*****************************************************
	 * The eighth story part that Hercules gets the Belt
	 * for Eurystheas' daughter.
	 *****************************************************/

	private static void theBelt() {
		assert checkpoint == 8 : "Wrong checkpoint";
		panel.setMessage("<html> Μετά από το κατόρθωμα αυτό του Ηρακλέους, η κόρη του Ευρυσθέα, η Αδμήτη, ζήτησε να της φέρει τη ζώνη της Ιππολύτης,<br>"
				   +"της βασίλισσας των Αμαζόνων, κι ο Ευρυσθέας διέταξε τον Ηρακλή να εκτελέσει την επιθυμία της κόρης του. Ο Ηρακλής, <br>"
				   +"μετά από πολλές περιπέτειες, βρήκε τον πολεμικό λαό των Αμαζόνων και προσπάθησε να πάρει τη ζώνη της βασίλισσάς τους. <br>"
				   +"Αυτές όμως τον αντιμετώπισαν τόσο άγρια και με πολύ θυμό αρνήθηκαν να του δώσουν αυτό που ήθελε, ώστε ο Ηρακλής αναγκάστηκε να <br>"
				   +"σκοτώσει την Ιππολύτη και να πάρει τη ζώνη. <html>");
		panel.addMessage("<html> Τι έκανε εφόσον απέκτησε τη ζώνη; <br>" 
						+ " 1)Tην παρέδωσε στην κόρη του Ευρυσθέα. <br>"
						+ " 2)Την πήγε στον Άρη ζητώντας του ως αντάλλαγμα βοήθεια για να εκδικηθεί την Ήρα για το χαμό της οικογένειάς του. <html>");
		answer = q.takeAnAnswer(2);
		
		if (answer == 1) {
			panel.setMessage("<html> Έπειτα συνέχισε με τους υπόλοιπους άθλους του <html>");

		} else if (answer == 2) {
			panel.setMessage("<html> Η Ήρα του είχε προκαλέσει πολλά δεινά στη ζωή του και σε αυτόν τον άθλο μεταμορφώθηκε σε αμαζόνα και ξεσήκωσε τις υπόλοιπες. <br>"
					   		+"Έτσι ξύπνησε το μίσος του για εκείνη και γι'αυτό ζήτησε τον θάνατο της από τον Άρη.<html>");
			panel.addMessage("<html> Έτσι λοιπόν ο Άρης με τον Μινώταυρο και τη βοήθεια άλλων θεών, σκότωσαν την Ήρα για εκδίκηση.<html>");
			reset();

		}
	}
	
	/*****************************************************
	 * The ninth story part that talks about Antaios' brothers
	 * who tried to kill Hercules.
	 *****************************************************/

	private static void dwarfBrothers() {
		assert checkpoint == 9 : "Wrong checkpoint";
		checkpoint++;
		panel.setMessage("<html> Οι Πυγμαίοι, νάνοι αδελφοί του Ανταίου, επιτέθηκαν για εκδίκηση στον Ηρακλή ενώ αυτός κοιμόταν. <br>"
						+ "Τι συνέβη μετά; <br>"
						+ "1)Λόγω της ασήμαντης επιθεσής τους, ο Ηρακλής τους παγίδευσε στη λεοντή του και τους πήγε στον Ευρυσθέα. <br>" 
						+ "2)Τον έδεσαν με σχοινιά στο έδαφος.<br>"
						+ "3)Κατάφεραν να τον τυφλώσουν και να πάρουν εκδίκηση για τον αδελφό τους. <html>");
		answer = q.takeAnAnswer(3);

		if (answer == 1) {
			panel.setMessage("<html> Έτσι ο Ηρακλής εκπλήρωσε και αυτόν τον άθλο του <html>");

		} else if (answer == 2) {
			panel.setMessage("<html> Έπειτα τι έγινε; <br>"
							+ "1)Tα σκοινιά ήταν πολύ μικρά και ο Ηρακλής κατάφερε να σπάσει τα δεσμά του. <br>"
					 		+"2)Ο Ηρακλής δεν κατάφερε να ελευθερωθεί. <html>");
			answer = q.takeAnAnswer(2);
			
			if (answer == 1) {
				panel.setMessage("<html> Έτσι ο Ηρακλής τους παγίδευσε στη λεοντή του και τους πήγε στον Ευρυσθέα. <html>");

			} else if (answer == 2) {
				panel.setMessage("<html> Οι Πυγμαίοι πήραν την εκδίκηση τους. <html>");
				reset();
			
			}
		} else if (answer == 3) {
			panel.setMessage("<html> Οι Πυγμαίοι πήραν την εκδίκηση τους. <html>");
			reset();
			
		}	
	}
	
	/*****************************************************
	 * The tenth and last story part in which Hercules
	 * wife betrays him wanting or not.
	 *****************************************************/

	private static void wifeBetrayal() {
		assert checkpoint == 10 : "Wrong checkpoint";
		checkpoint++;
		panel.setMessage("<html> Ο Ηρακλής σκότωσε τον Νέσσο, ο οποίος προσπάθησε να κλέψει την γυναίκα του με δηλητηριασμένα βέλη.Τη στιγμή που ο Νέσσος πέθαινε <br>"
				   		+" από τα δηλητηριασμένα βέλη του Ηρακλή, εκμυστηρεύθηκε στη Δηιάνειρα ότι ο σύζυγός της δεν την αγαπούσε πια, και ότι για να ξανακερδίσει <br>"
				   		+" την αγάπη του, έπρεπε να του δώσει να φορέσει έναν χιτώνα, αφού τον βουτήξει πρώτα μέσα στο αίμα του νεκρού κενταύρου. <br>"
				   		+" Η Δηιάνειρα, η οποία δεν ήξερε ότι το αίμα του Νέσσου ήταν δηλητηριασμένο από τα βέλη, έδωσε τον χιτώνα στον ήρωα. <html>");
		panel.addMessage("<html> Όταν η Δηιάνειρα πρόσφερε τον χειτώνα στον Ηρακλή, ο Ηρακλής τι έκανε; <br>"
				+ " 1)Ο Ηρακλής φόρεσε τον χιτώνα και από τον έντονο πόνο παρακάλεσε να τον κάψουν. <br>"
				+ " 2)Ο Ηρακλής είχε παρατηρήσει ότι η γυναίκα του γέμισε τον χιτώνα με αίμα. <html>");
		answer = q.takeAnAnswer(2);

		if (answer == 1) {
			//Τίτλοι τέλους
			panel.setMessage("<html> Ο Φιλοκτήτης τότε τον λυπήθηκε και άναψε τη φωτιά πάνω στην κορυφή του βουνού Οίτη και ο Ηρακλής κάηκε ζωντανός. <br>"
					   			+"Ακόμη και σήμερα, η υψηλότερη κορυφή αυτού του βουνού ονομάζεται Πυρά. <html>");
			
		} else if (answer == 2) {
			panel.setMessage("<html> Πως έπραξε μετά λοιπόν ο ήρωας; <br>"
							+ " 1)Ο Ηρακλής δεν φόρεσε τον χιτώνα και παράτησε τη γυναίκα του. <br>"
							+ " 2)Ο Ηρακλής από αντίδραση, φόρεσε τον χιτώνα στη γυναίκα του. <html>");
			answer = q.takeAnAnswer(2);
			
			if (answer == 1){
				//Τίτλοι τέλους
				panel.setMessage("<html> Έζησε μια ζωή ελεύθερος και μόνος του, περνόντας τον χρόνο του καθημερινά με κυνήγι και ψάρεμα.<html>");
			
			} else if (answer == 2){
				//Τίτλοι τέλους
				panel.setMessage("<html> Καθώς νόμιζε πως η γυναίκα του ήθελε να τον βλάψει απόφασισε να το κάνει πρώτος εκείνος.  <br>"
								+ "Είδε την γυναίκα του να πεθαίνει σιγά σιγά από τους πόνους <html>");
			
			}
			
		}
	}
	
	/*****************************************************
	 * ordinaryPerson is a story that Hercules is displayed
	 * either as a common mortal or he has forgotten the
	 * reason he is doing the feats.
	 *****************************************************/

	private static void ordinaryPerson() {
		checkpoint--;
		if (father_zeus) {
			panel.setMessage("<html> Ο Ηρακλής έπειτα εκπαιδεύτηκε για να μάθει νέες τέχνες. <html>");
		}
		teachers();
		moreJobs();
		answer_given = sthingMissing();
		if (answer_given == 1) {
			oikogeneiarxhs();
			relationKids();
		} else if (answer_given == 2){
			periodia();
		}
	}

	private static void teachers() {
		String teacher1 = "του ηνιόχου";
		String teacher2 = "της οπλασκίας";
		String teacher3 = "της πάλης";
		panel.setMessage("<html> Με ποιους εκπαιδεύτηκε ο Ηρακλής; <br>"
						+ " 1) Αμφιτρύωνα. <br>"
						+ " 2) Κάστορα. <br>"
						+ " 3) Αίλυκος. <html>");
		answer = q.takeAnAnswer(3);
		panel.setMessage("<html> Ο Ηρακλής έμαθε την τέχνη <html> ");
		if (answer == 1) {
			panel.addMessage("<html>" + teacher1 + "και άρχισε να δουλεύει ως ηνίοχος. <html> ");
		} else if (answer == 2) {
			panel.addMessage("<html>" + teacher2 + "και άρχισε να δουλεύει ως μισθοφόρος. <html>");
		} else {
			panel.addMessage("<html>" + teacher3 + "και άρχισε να δουλεύει ως παλεστής. <html>");
		}
	}
	
	private static void moreJobs() {
		panel.setMessage("<html> Ο Ηρακλής όμως επειδή κουράστηκε από την μονοτονία της δουλειάς του, <br>"
						+ "αποφάσησε να ασχοληθεί και με κάτι άλλο. <html>");
		panel.addMessage("<html> Με τι άλλο ασχολήθηκε ο Ηρακλής; <br>"
				+ " 1)Τόξο. <br>"
				+ " 2)Επιστήμη. <br>"
				+ " 3)Μουσική. <html>");
		answer = q.takeAnAnswer(3);
		panel.setMessage("<html> Ο Ηρακλής έπειτα συνδίασε όλες τις ικανότητές του και τις γνώσεις του, αλλά κάτι του έλλειπε. <html>");
	}
	
	private static int sthingMissing() {
		panel.setMessage("<html> Τι έκανε για την έλλειψη αυτή που ένιωθε μέσα του; <br>"
						+ " 1)Έγινε οικογενειάρχης. <br>"
						+ " 2)Έγινε ταξιδιώτης. <html>");
		answer = q.takeAnAnswer(2);
		if (answer == 1) {
			panel.setMessage("<html> Ο Ηρακλής αποφάσισε να νοικοκυρευτεί και βρήκε μία καλή γυναίκα. <html>");
			return answer;
		} else {
			panel.setMessage("<html> Ο Ηρακλής αποφάσισε να επιδείξει τις ικανότητές του στον κόσμο <br>"
							+ "και έτσι ξεκίνησε τις περιοδίες του. <html>");
			panel.addMessage("<html> Κατάφερε να βγάλει χρήματα στο ταξίδι του;  <br>"
							+ " 1)Ναι. <br>"
							+ " 2)Όχι. <html>");
			answer = q.takeAnAnswer(2);
			if (answer == 1) {
				panel.setMessage("<html> Ο Ηρακλής αφού έβγαλε χρήματα πήρε την απόφαση να φτιάξει την δική του οικογένεια. <html>");
				return answer;
			} else {
				panel.setMessage("<html> Ο Ηρακλής συνέχισε τις περιοδίες του. <html>");
				return answer;
			}
		}
	}
	
	private static void oikogeneiarxhs() {
		panel.setMessage("<html> Ο Ηρακλής πόσα παιδιά έκανε; <br>"
						+ " 1)1 κόρη <br>"
						+ " 2)2 γιους. <html>");
		answer = q.takeAnAnswer(2);
		 
	}
	
	private static void relationKids() {
		panel.setMessage("<html> Ο Ηρακλής με όλες τις κακουχίες που είχε περάσει προσπαθούσε πάνω από όλα να είναι καλός πατέρας.<br>"
						+ "Πώς πιστεύεται ότι ήταν η σχέση μεταξύ του Ηρακλή και τα παιδιά του; <br>"
						+ " 1)Αγαπημένη και ομαλή. <br>"
						+ " 2)Πάντα εκδικητική και ανταγωνιστική. <html>");
		answer = q.takeAnAnswer(2);
		panel.setMessage("\nΈπειτα από αρκετά χρόνια πως πιστεύεται ότι κατέληξε η ζωή του ήρωας;");
		if (answer == 1) {
			panel.addMessage("<html> 1)Πεθαίνοντας άφησε ολόκληρη την περιουσία του στην οικογένειά του έχοντας μεταλαμπαδεύσει στα παιδιά του <br>"
							+ "όσα περισσότερες γνώσεις μπορούσε. <br>"
							+ " 2)Λόγω κακής διαχείρησης των οικονομικών τους απέκτησαν χρέη με αποτέλεσμα με το θάνατο του Ηρακλή, <br>"
							+ "ολόκληρη η περιουσία του πέρασε στην πολιτεία και η οικογένειά του προσπάθησε να πορευτεί <br>"
							+ "στην ζωή έχοντας λίγα πράγματα στην κατοχή τους. <html>");
		} else if (answer == 2) {
			panel.addMessage("<html> 1)Η γυναίκα του τον σκότωσε καθώς αυτή υπολόγιζε μόνο το χρήμα και <br>"
							+ "ήθελε να πάρει ολόκληρη την περιουσία του στα χέρια της. <br>"
							+ " 2)Ο Ηρακλής αποστασιοποιήθηκε από ολόκληρη την οικογένειά του, <br>"
							+ " καθώς ήθελε να ζήσει με γαλήνει μόνος του μέχρι τον θάνατο. <html>");
		}
		answer = q.takeAnAnswer(2);
	}
	
	private static void periodia() {
		panel.setMessage("<html> Ο Ηρακλής παρά το μακρύ και πολλών χρόνων ταξίδι του δεν ήθελε να φτιάξει οικογένεια. <br>"
						+ " Τι έκανε όμως ο Ηρακλής όμως; <br>"
						+ " 1)Έκανε περιστασιακές δουλειές προσπαθώντας να τα βγάλει ως προς το ζην. <br>"
						+ " 2)Παρατήρησε ότι δεν έβγαζε αρκετά χρήματα και έγινε ένας κλέφτης. <html>");
		answer = q.takeAnAnswer(2);
		if (answer == 2) {
			panel.setMessage("<html> Δυστυχώς κάποια στιγμή πιάσανε τον Ηρακλή και τον φυλάκισαν, <br>"
							+ "όπου και πέρασε τα υπόλοιπα χρόνια της ζωής του. <html>");
		}
	}
	
	/*****************************************************
	 * reset is a method in which the story is getting
	 * reseted as Hercules has died or something close to
	 * that.
	 *****************************************************/
	
	private static void reset() {
		
		/*****************************************************
		 * The checkpoint is getting set 2 positions back so
		 * the player has another chance to continuing the
		 * story.
		 *****************************************************/
		
		checkpoint--;
	}

	private static void endingTitles() {
		panel.setMessage("<html> Με αυτόν τον τρόπο και μετά από πολλά χρόνια τελείωσε η ζωή του μυθικού <br>"
						+ " αυτού ήρωα. <br>"
						+ "<br>"
						+ "<br>		THE END <html>");
		panel.addMessage("<html> Επιμέλεια και Παραγωγή: Mythology Collapse <html>");
	}
}
