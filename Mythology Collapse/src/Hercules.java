import java.util.Scanner;

public class Hercules {
	final private static Scanner in = new Scanner(System.in);
	private static String answer_given, answer = null;
	private static int checkpoint = 1;
	private static boolean k = true;

	public static void main(String[] args) throws NoSuchAnswer {
		System.out.println("\nΤο ακόλουθο παιχνίδι θα βασιστεί πάνω σε ερωτήσεις σχετικά με τη ζωή του ήρωα και τους άθλους που διέπραξε.");
		System.out.println("\nΟ Ηρακλής ήταν αρχαίος μυθικός ήρωας, θεωρούμενος ως ο μέγιστος των Ελλήνων ηρώων."
				+ "\n\nΩς Άθλοι του Ηρακλέους έχουν καταγραφεί στην ελληνική μυθολογία δώδεκα κατορθώματα που έκανε ο μυθικός αυτός ήρωας,"
				+ "\nπροκειμένου να εξαγνισθεί για το φόνο της γυναίκας του και των παιδιών του, που είχε διαπράξει όταν τον τρέλανε η Ήρα."
				+ "\nΓια το σκοπό αυτό, ο Ηρακλής πήγε στο Μαντείο των Δελφών και πήρε χρησμό, σύμφωνα με τον οποίο έπρεπε να υπηρετήσει"
				+ "\nγια δώδεκα χρόνια τον Ευρυσθέα, βασιλιά της Τίρυνθας, και να πραγματοποιήσει τους άθλους που του πρόσταζε εκείνος.");
				
		while (checkpoint != 10) {
			if (checkpoint == 1) {
				answer_given = fatherOfHercules();
			} else if (checkpoint == 2) {
				answer_given = jealousyOfHera(answer_given);
			} else if (checkpoint == 3) {
				answer_given = roadChoosing();
			} else if (checkpoint == 4) {
				answer_given = howHeDealt();
			} else if (checkpoint == 5) {
				answer_given = killingHydra();
			} else if (checkpoint == 6) {
				answer_given = pathDigging();
			} else if (checkpoint == 7) {
				answer_given = minotaurFeat();
			} else if (checkpoint == 8) {
				answer_given = theBelt();
			} else if (checkpoint == 9) {
				answer_given = dwarfBrothers();
			} else if (checkpoint == 10) {
				wifeBetrayal();
			}
		}
	}

	// 1η Ερώτηση: answer η απάντηση που θα δώσει ο χρήστης. Έπειτα αυτό επιστρέφει
	// ως το "answer_given"

	private static String fatherOfHercules() throws NoSuchAnswer {
		checkpoint++;
		System.out.println("\nΠοιός ήταν ο πατέρας του Ηρακλή;\n" 
						+ " 1)Δίας.\n" 
						+ " 2)Αμφιτρύωνας.");
		answer = in.next();
		
		if (answer.equals("1") || (answer.equals("2"))) {
			return answer;
			
		} else {
			throw new NoSuchAnswer();
		}
	}

	private static String jealousyOfHera(String already_answered) throws NoSuchAnswer {
		checkpoint++;

		if (already_answered.equals("1")) {
			if (k) {
				System.out.println("\nΣύμφωνα με τη μυθολογία αυτή είναι η σωστή απάντηση παρότι η Αλκμήνη,"
								+ "\nμητέρα του Ηρακλή, ήταν παντρεμένη με τον Αμφιτρύωνα,"
								+ "\nο Δίας πήρε τη μορφή του Αμφιτρύωνα και κοιμήθηκε με την Αλκμήνη.");
				k = false;
			}
			
			System.out.println("\nΗ Ήρα, η γυναίκα του Δία, τον ζήλευε όταν γεννήθηκε ο Ηρακλής και αν ναι πως αντέδρασε;"
							+ "\n 1)Ναι." 
							+ "\n 2)Όχι.");
			answer = in.next();

			if (answer.equals("1")) {
				System.out.println("\n 1)Η Ήρα έστειλε φίδια για να σκοτώσουν τον Ηρακλή."
						+ "\n 2)Η Ήρα πήγε η ίδια να σκοτώσει τον Ηρακλή.");
				answer = in.next();

				if (answer.equals("1")) {
					System.out.println("\nΗ Ήρα η οποία ζήλευε θανάσιμα τον Δία για τις απιστίες του προκειμένου να τον εκδικηθεί"
									+ "\nέστειλε στην κούνια του βρέφους Ηρακλή δύο φίδια, αλλά αυτός κατάφερε να τα στραγγαλίσει.");

				} else if (answer.equals("2")) {
					System.out.println("\n 1)Η Ήρα απέτυχε και δεν σταμάτησε να αναζητεί τρόπο εκδίκησης."
									+ "\n 2)Η Ήρα πέτυχε τον στόχο της και ο Ηρακλής πέθανε.");
					answer = in.next();

					if (answer.equals("1")) {
						System.out.println("\nΗ Ήρα μετά από κάποια χρόνια κατάφερε να βρει τρόπο να σκοτώσει τον Ηρακλή,"
										+ "\nπαίρνοντας την μορφή ενός φίλου και πνίγοντάς τον στον ύπνο του");

					} else if (answer.equals("2")) {
						System.out.println("Ο Ηρακλής πέθανε πολύ νωρίς στην Ιστορία. \n");
						reset();

					} else {
						throw new NoSuchAnswer();
					}

				} else {
					throw new NoSuchAnswer();
				}

			} else if (answer.equals("2")) {
				System.out.println("\nΔεν ζήλευε, οπότε ο Ηρακλής δεν έμαθε ποτέ τις πραγματικές του δυνάμεις.");
				ordinaryPerson();
				return "1";

			} else {
				throw new NoSuchAnswer();
			}

		} else if (answer.equals("2")) {
			checkpoint--;
			System.out.println("\nΟ θετός πατέρας του Ηρακλή, ο Αμφιτρύωνας, ανέλαβε να τον μεγαλώσει. Είχαν μια άριστη σχέση πατέρα και γιού,"
							+ "\nπερνόντας αρκετό χρόνο μαζί και κάνοντας διάφορα πράγματα. Τον δίδαξε την τέχνη του ηνιόχου,"
							+ "\nπήγαιναν για ψάρεμα και για κυνήγι και για τον Ηρακλή..."
							+ "\nο Αμφιτρύωνας ήταν κάτι σαν το πρότυπό του.");
			ordinaryPerson(); // Η Ιστορία με πατέρα τον Αμφιτρύωνα.
		}
		return answer;
	}

	private static String roadChoosing() throws NoSuchAnswer {
		checkpoint++;
		System.out.println("\nΟ μύθος που σώθηκε από τον Ξενοφώντα, μας διηγείται το περιστατικό εκείνο, όταν ο Ηρακλής καθισμένος σε κάποιο σταυροδρόμι,"
						+ "\nείδε να περνούν από μπροστά του δύο πανέμορφες κοπέλες. Η μια του έδειξε έναν εύκολο δρόμο, φαρδύ και ίσιο, που αν τον ακολουθούσε,"
						+ "\nθα χαιρόταν τη ζωή, αλλά θα έκανε ένα σωρό κακές πράξεις που θα τον καταδίκαζαν στην κρίση των ανθρώπων. Αυτή ήταν η Κακία."
						+ "\nΗ άλλη κόρη, η Αρετή, του έδειξε ένα δύσκολο δρόμο, γεμάτο κοφτερές πέτρες και αγκάθια, στενό και δύσβατο, που θα τον βάδιζε δύσκολα,"
						+ "\nαλλά θα κέρδιζε στο τέλος του την αναγνώριση από τους συνανθρώπους του.");
		
		System.out.println("\nΠοιόν δρόμο τελικά επέλεξε ο Ηρακλής;" 
						+ " \n1)Της Αρετής." 
						+ " \n2)Της Κακίας.");
		answer = in.next();
		
		if (answer.equals("1")) {
			System.out.println("\nΟ Ηρακλής ακολούθησε την Αρετή, προτιμώντας να υποφέρει για να διαβεί το δύσβατο δρόμο της, αλλά να γνωρίσει τη δόξα και την τιμή"
							+ "\nμε τις καλές του πράξεις και την αρετή του. Με την επιλογή του αυτήν η Ήρα συνέχισε να ζηλεύει και παρέσυρε τον Ηρακλή στο να"
							+ "\nσκοτώσει τη γυναίκα του και τα παιδιά του.");

		} else if (answer.equals("2")) {
			System.out.println("\nΟ Ηρακλής μεγάλωσε με πολλές γυναίκες και πολλά παιδιά σε ένα ανέμελο δρόμο με πολλές χαρές."
							+ "\nΠαρόλα αυτά η Ήρα συνέχισε να ζηλεύει και τρέλανε τον Ηρακλή οδηγώντας τον να σκοτώσει τη γυναίκα του και τα τρία παιδιά του.");
			
			System.out.println("\nΠως συνέχισε ο Ηρακλής την ζωή του;"
					+ " \n1)Άρχισε να αναπολεί το παρελθόν του και μετάνιωσε για ότι έκανε με παρακίνηση της Ήρας.\n"
					+ " \n2)Συνέχισε με την ανέμελη ζωή του.");
			answer = in.next();

			if (answer.equals("1")) {
				System.out.println("\nΠροσπάθησε να βρει έναν τρόπο για να διορθώσει ότι είχε κάνει.");

			} else if (answer.equals("2")) {
				System.out.println("\nΣτα πλαίσια μιας φυσιολογικής και ανέμελης ζωής, έφτασε σε μεγάλη ηλικία πεθαίνοντας από φυσικά αίτια.");
				reset();

			} else {
				throw new NoSuchAnswer();
			}

		} else {
			throw new NoSuchAnswer();
		}

		return answer;
	}

	private static String howHeDealt() throws NoSuchAnswer {
		checkpoint++;
		System.out.println("\nΠως έπραξε ο Ηρακλής όταν συνειδητοποίησε τι έκανε;"
						+ " \n1)Πήγε στο μαντείο των Δελφών για να μάθει πως μπορούσε να επανορθώσει."
						+ " \n2)Αυτοκτόνησε από την θλίψη του.");
		answer = in.next();

		if (answer.equals("1")) {
			System.out.println("\nΌταν συνειδητοποίησε τι έκανε, αποφάσισε να πάει στο Μαντείο των Δελφών για να πάρει χρησμό, ώστε να μάθει με ποιον τρόπο"
							+ "\nθα μπορούσε να εξαγνισθεί. Σύμφωνα με τον χρησμό, έπρεπε να υπηρετήσει για δώδεκα χρόνια τον Ευρυσθέα, βασιλιά των Μυκηνών,"
							+ "\nκαι να πραγματοποιήσει τους άθλους που θα του πρόσταζε εκείνος.");
		
		} else if (answer.equals("2")) {
			System.out.println("\nΟι τύψεις που τον έπνιγαν τον οδήγησα να αυτοκτονήσει από την θλίψη του και έτσι πέθανε νωρίς στην ιστορία.");
			reset();

		} else {
			throw new NoSuchAnswer();
		}

		return answer;

	}

	private static String killingHydra() throws NoSuchAnswer {
		checkpoint++;
		// System.out.println("Αφήγηση σχετικά με την Λερναία Ύδρα.");
		System.out.println("\nΤο δεύτερο κατόρθωμά του Ηρακλή είχε να κάνει με την Λερναία Ύδρα, ενός φιδιού με εννέα κεφάλια που ζούσε στη λίμνη Λέρνη και"
						+ "\nσκορπούσε τη συμφορά στους κατοίκους της περιοχής. Στη θέση κάθε κεφαλιού που έκοβες όμως ξεπετιόνταν άλλα δύο, "
						+ "\nκαι έτσι η εξόντωση της ήταν αρκετά δύσκολη.");

		System.out.println("\nΜε ποιόν τρόπο προσπάθησε,λοιπόν, να νικήσει την Λερναία Ύδρα;"
				+ " \n1)Καθώς έκοβε το κεφάλι, έκαβε ταυτόχρονα και τις πληγές"
				+ " \n2)Προσπάθησε να καρφώσει την καρδία της Λερναίας Ύδρας."
				+ " \n3)Δεν προσπάθησε και απλώς έτρεξε να ξεφύγει");
		answer = in.next();

		if (answer.equals("1")) {
			System.out.println("\nΑφού στη θέση κάθε κεφαλιού που έκοβε ο Ηρακλής ξεπετιόνταν άλλα δύο,"
							+ "\nαναγκάστηκε όταν έκοβε ένα κεφάλι να καίει με φωτιά το κόψιμο."
							+ "\nΉταν ο μοναδικός τρόπος να καταφέρει να την νικήσει"
							+ "\nΎστερα, αφού σκότωσε το θηρίο, βούτηξε στο αίμα του τα βέλη του και τα κατέστησε θανατηφόρα.");

		} else if (answer.equals("2")) {
			System.out.println("\nΤα κατάφερε, αλλά η Λερναία Ύδρα δεν πέθανε και έτσι ο Ηρακλής σκοτώθηκε.");
			reset();

		} else if (answer.equals("3")) {
			System.out.println("\nΤι έκανε μετά;" 
							+ " \n1)Σταμάτησε να τρέχει και ξανά σκέφτηκε τον τρόπο αντιμετώπισης."
							+ " \n2)Συνέχισε να τρέχει μέχρι που γύρισε τον Ευρυσθέα.");
			answer = in.next();

			if (answer.equals("1")) {
				System.out.println("\nΟ Ηρακλής προσπαθεί ξανά να βρει κάποιον τρόπο να εξοντώσει την Λερναία Ύδρα.");
			} else if (answer.equals("2")) {
				System.out.println("\nΟ Ευρυσθέας του υπενθύμισε γιατί κάνει τους άθλους του και πως έπρεπε να τα καταφέρει.");
				System.out.println("\nΠως έπραξε ο Ηρακλής μετά από αυτήν την υπενθύμιση;"
								+ " \n1)Γύρισε πίσω στην Λερναία Ύδρα για να την αντιμετωπίσει."
								+ " \n2)Αυτοκτόνησε από την θλίψη του.\n");
				answer = in.next();

				if (answer.equals("1")) {
					System.out.println("\nΗ ιστορία με την Λερναία Ύδρα αρχίζει και πάλι");

				} else if (answer.equals("2")) {
					System.out.println("Αυτοκτόνησε από την θλίψη και το άγχος του που δεν μπόρεσε να φέρει εις πέρας τους άθλους του.");
					reset();

				} else {
					throw new NoSuchAnswer();
				}

			} else {
				throw new NoSuchAnswer();
			}

		} else {
			throw new NoSuchAnswer();
		}
		return answer;
	}

	private static String pathDigging() throws NoSuchAnswer {
		checkpoint++;
		System.out.println("\nΈνας άλλος άθλος του Ηρακλή ήταν να καθαρίσει τους στάβλους του Αυγεία,"
				+ "\nτου πλούσιου βασιλιά με τα 3.000 βόδια, που από την κοπριά που είχε μαζευτεί εκεί από τριάντα χρόνια,"
				+ "\nπου είχαν να καθαριστούν οι στάβλοι, είχε πρόβλημα όλο το χωριό. ");
		
		System.out.println("\nΟ Ηρακλής πού έσκαψε για να κατευθύνει τα νερά του Πηνειού και του Αλφειού,"
						+ "\nώστε να καθαρίσουν οι στάβλοι του Αυγεία;"
						+ "\n\n1) Στα θεμέλια των στάβλων." 
						+ "\n2) Μέσα στους ίδιους τους στάβλους.");
		answer = in.next();

		if (answer.equals("1")) {
			System.out.println("\nΟ Ηρακλής με αυτόν τον τρόπο κατάφερε να κάνει τα νερά να παρασύρουν"
							+ "\nτην κοπρία από τους στάβλους και να καθαριστεί το μέρος.");

		} else if (answer.equals("2")) {
			System.out.println("\nΤι αποτελέσματα είχε αυτό στους στάβλους και στην περιοχή;"
							+ " \n\n1)Καταστράφηκαν οι στάβλοι εντελώς." 
							+ " \n2)Δεν επηρρεάστηκαν καθόλου.");
			answer = in.next();

			if (answer.equals("1")) {
				System.out.println("\nΈσπασαν οι φράχτες,τα ζώα το έσκασαν και κατέστερψαν την πόλη, με αποτέλεσμα"
						+ "\nοι κάτοικοι να ζητήσουν την ευθανασία του Ηρακλή ως εκδίκηση για τις περιουσίες τους που καταστράφηκαν.");
				reset();

			} else if (answer.equals("2")) {
				System.out.println("\nΔεν είχε κανένα αποτέλεσμα στους στάβλους και στην γύρω περιοχή. "
								+ "\nΟ Ηρακλής συνέχισε κανονικά τη ζωή του ως ένας συνηθισμένος άνθρωπος.");
				ordinaryPerson();

			} else {
				throw new NoSuchAnswer();
			}
			
		} else {
			throw new NoSuchAnswer();
		}
		
		return answer;
	}

	// q7
	private static String minotaurFeat() throws NoSuchAnswer {
		checkpoint++;
		System.out.println("\nΜε ποιον τρόπο κατάφερε ο Ηρακλής να ολοκληρώσει τον έβδομο άθλο;"
						+ "\n1)Χρησιμοποίησε δίχτυ για να τον ακινητοποιήσει και μετά τον κουβάλησε;"
						+ "\n2)Προσπάθησε πρώτα να τον δαμάσει;");
		answer = in.next();

		switch (answer) {

		case "1":
			break;

		case "2":
			System.out.println(" \n1)Πέτυχε και υπάκουε τις εντολές του Ηρακλή;" 
							+ " \n2)Απέτυχε.");
			answer = in.next();

			if (answer.equals("1")) {
				System.out.println("\n1)Πρόσταξε τον Ταύρο να παραδωθεί στον Ευρυσθέα.\n"
						+ "\n2)Πρόσταξε το ταύρο να πάει να σκοτώσει τον Ευρυσθέα."
						+ "\n3)Πρόσταξε τον ταύρο να τον βοηθήσει να πάρει εκδίκηση από την Ήρα.");

				//System.out.println("Συνειδητοποίησε ότι παρά την δυσκολία των άθλων,\n"
					//	+ "πρέπει να συνεχίσει ώστε να φτάσει στη λύτρωση.");
				if (answer.equals("1")) {
					
				} else if (answer.equals("2")) {
					System.out.println("\nΣυνειδητοποίησε ότι παρά την δυσκολία των άθλων, πρέπει να συνεχίσει ώστε να φτάσει στη λύτρωση.");
					reset();

				} else if (answer.equals("3")) {
					return "1";
				}

			} else if (answer.equals("2")){
				System.out.println("Σκοτώθηκε.");
				reset();
			
			} else { 
				throw new NoSuchAnswer();
			}

			break;

		default:
			throw new NoSuchAnswer();
		}

		return answer;
	}

	// q8
	private static String theBelt() throws NoSuchAnswer {
		System.out.println("\nΤι έκανε εφόσον απέκτησε τη ζώνη;" 
						+ " \n1)Tην παρέδωσε στην κόρη του Ευρυσθέα."
						+ " \n2)Την πήγε στον Άρη ζητώντας του ως αντάλλαγμα βοήθεια για να εκδικηθεί την Ήρα για το χαμό της οικογένειάς του.");
		answer = in.next();
		
		if (answer.equals("1")) {

		} else if (answer.equals("2")) {
			System.out.println("\nO Άρης με τον Μινόταυρο και τη βοήθεια άλλων θεών, σκότωσαν την Ήρα.");
			reset();

		} else {
			throw new NoSuchAnswer();
		}

		return answer;
	}

	private static String dwarfBrothers() throws NoSuchAnswer {
		checkpoint++;
		System.out.println("\nΟι Πυγμαίοι, νάνοι αδελφοί του Ανταίου, επιτέθηκαν για εκδίκηση στον Ηρακλή ενώ αυτός κοιμόταν."
						+ "\nΤι συνέβη μετά;"
						+ " \n\n1)Λόγω της ασήμαντης επιθεσής τους, ο Ηρακλής τους παγίδευσε στη λεοντή του και τους πήγε στον Ευρυσθέα." 
						+ " \n2)Τον έδεσαν με σχοινιά στο έδαφος."
						+ " \n3)Κατάφεραν να τον τυφλώσουν και να πάρουν εκδίκηση για τον αδελφό τους.");
		answer = in.next();

		if (answer.equals("1")) {

		} else if (answer.equals("2")) {
			System.out.println(" \n1)Tα σκοινιά ήταν πολύ μικρά και ο Ηρακλής κατάφερε να σπάσει τα δεσμά του."
					 		+" \n2)Ο Ηρακλής δεν κατάφερε να ελευθερωθεί.");
			answer = in.next();
			
			if (answer.equals("1")) {
				System.out.println("\nΈπειτα ο Ηρακλής τους παγίδευσε στη λεοντή του και τους πήγε στον Ευρυσθέα.");

			} else if (answer.equals("2")) {
				System.out.println("\nΟι Πυγμαίοι πήραν την εκδίκηση τους.");
				reset();
			
			} else {
				throw new NoSuchAnswer();
			}

		} else if (answer.equals("3")) {
			System.out.println("\nΟι Πυγμαίοι πήραν την εκδίκηση τους.");
			reset();
			
		} else {
			throw new NoSuchAnswer();
		}
		
		return answer;
	}

	// 10
	private static void wifeBetrayal() throws NoSuchAnswer {
		checkpoint++;
		System.out.println("\nΌταν η Δηιάνειρα πρόσφερε τον χειτώνα στον Ηρακλή, ο Ηρακλής τι έκανε;"
				+ " \n1)Ο Ηρακλής φόρεσε τον χιτώνα και από τον έντονο πόνο παρακάλεσε να τον κάψουν."
				+ " \n2)Ο Ηρακλής είχε παρατηρήσει ότι η γυναίκα του γέμισε τον χιτώνα με αίμα.");
		answer = in.next();

		if (answer.equals("1")) {
			//Τίτλοι τέλους
			
		} else if (answer.equals("2")) {
			System.out.println(" \n1)Ο Ηρακλής δεν φόρεσε τον χιτώνα και παράτησε τη γυναίκα του.\n"
							+ "	\n2)Ο Ηρακλής από αντίδραση, φόρεσε τον χιτώνα στη γυναίκα του.");
			answer = in.next();
			
			if (answer.equals("1")){
				//Τίτλοι τέλους
			
			} else if (answer.equals("2")){
				//Τίτλοι τέλους
			
			} else {
				throw new NoSuchAnswer();
			}
			
		} else {
			throw new NoSuchAnswer();
		}
System.out.println();
		//Τίτλοι τέλους
	}

	private static void ordinaryPerson() {
		checkpoint--;
		System.out.println("\nΟ Ηρακλής είχε μια φυσιολογική και ανέμελη ζωή. Ήταν αρκετά δραστήριος και του άρεσε το κυνηγί και το ψάρεμα."
				+ "\nΖούσε αρμονικά με την οικογένεια του και περνούσε πολύ από τον ελεύθερο χρόνο με τα παιδιά του, "
				+ "\nκάνοντας διάφορα πράγματα μαζί τους.");
	}

	private static void reset() {
		checkpoint--;
	}
}
