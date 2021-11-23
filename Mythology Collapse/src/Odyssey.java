package odyssey;
import java.util.*;

public class Odyssey {
static int answer;
static int answer2;
static Scanner input = new Scanner (System.in);
	
	public static void ithaki() {
		System.out.println("Όταν ο Οδυσσέας φτάνει στην Ιθάκη, μαθαίνει ότι η πολύχρονη απουσία του έχει αφήσει εκτεθειμένη την γυναίκα του,\n"
				+ "την Πηνελόπη, η οποία περιτριγυρίζεται από φιλόδοξους μνηστήρες.\n"
				+ "Η μόνη ελπίδα για να εισχωρήσει στο παλάτι και να σώσει την οικογένεια και τον θρόνο του είναι μια θεϊκή παρέμβαση. Θα βοηθήσει η Αθηνά αυτή τη φορά τον Οδυσσέα, ή θα τον αφήσει στο έλεος της μοίρας?\n\n"
				+ "1: Η Αθηνά θα τον βοηθήσει ή 2: Η Αθηνά δεν θα τον βοηθήσει. (πληκτρολόγησε τον αριθμό της απάντησης)");
		answer = input.nextInt();
		checkAnswer(2);
		
//έκβαση ανάλογα την απάντηση
		if (answer==1) {
			System.out.println("Η Αθηνά αποφασίζει να βοηθήσει τον Οδυσσέα για ακόμη μια φορά και έτσι, τον μεταμφιέζει σε ζητιάνο ώστε οι μνηστήρες να μην μπορέσουν να τον υποπτευθούν.\n"
					+ "Ωστόσο, σε μια επίσκεψή του στο παλάτι, η υπηρέτρια που καλείται να περιποιηθεί τον ξένο, αναγνωρίζει το σημάδι που έχει στο πόδι του και ανακαλύπτει ότι έχει μπροστά της\n"
					+ "το χαμένο βασιλιά.\n\n"
					+ "Οργανώνονται, λοιπόν, αγώνες τοξοβολίας, στους οποίους παίρνει μέρος και ο ίδιος πετυχαίνοντας μια δοκιμασία που μόνο ο Οδυσσέας είχε καταφέρει μέχρι τότε.\n"
					+ "Αμέσως, πετάει τα κουρέλια που φοράει και αποκαλύπτει ποιος είναι. Ξεκινάει ένα ανθρωποκυνηγητό με τον Οδυσσέα και το γιο του, Τηλέμαχο, να κυνηγάνε τους μνηστήρες και εκείνοι να τρέχου για τη ζωή τους.\n"
					+ "Τελικά, ο Οδυσσέας έχει πλέον μετά τα πολύχρονα βάσανά του να κερδίσει ξανά τη θέση του στο παλάτι και στην οικογένειά του.");
		} else {
			System.out.println("Χωρίς τη βοήθεια της Αθηνάς, ο Οδυσσέας αναγνωρίζεται αμέσως από τους μνηστήρες και ανήμπορος ως ήταν, χώρις όπλα για να πολεμήσει θανατώνεται τελικά από τους φιλόδοξους κατακτητές του θρόνου του...");
			death();
		}
	}
	
	
	
	public static void seirines () {
		System.out.println("Μετά το χρησμό του μάντη Τειρεσία, το καράβι του Οδυσσέα οδηγείται στις Σειρήνες.\n"
				+ "Εκεί ο Οδυσσέας πάνω στη λαχτάρα να ακούσει το τραγούδι των σειρήνων φτάνει στο  δίλημμα για το αν θα δεθεί ή όχι στο καταρτι.\n\n"
				+ "1: Θα δεθεί στο κατάρτι ή 2: Δεν θα δεθεί στο κατάρτι (Πληκτρολόγησε τον αριθμό της επιλεγμένης απάντησης.)");
		answer = input.nextInt();
		checkAnswer(2);
		
//έκβαση ανάλογα την απάντηση
		if (answer == 1) {
			System.out.println("Αφού κλείνει τα αυτιά των συντρόφων του με κερί, ο Οδυσσέας δένεται στο κατάρτι.\n"
					+ "Όταν πλησιάζουν στις σειρήνες, ο ίδιος μαγεύεται και παρακαλά τους ναύτες να τον λύσουν. Εκείνοι, όμως, δε τον ακούνε και συνεχίζουν την πορεία τους αποφεύγοντας τα δολοφονικά τέρατα.");
			skyla(illness);
		} else {
			System.out.println("Ο Οδυσσέας νομίζοντας ότι μπορεί να αντισταθεί στις σειρήνες, βουλώνει τα αυτιά των συντρόφων του με κερί και παραμένει να ακούει τις σειρήνες να τραγουδούν.\n"
					+ "Το μαγευτικό τους τραγούδι, όμως, τον παρασέρνει και πέφτει στη θάλασσα, όπου και πνίγεται...");
			death();
		}	
	}
	
	
	
	public static void skyla (boolean illness) {
		System.out.println("Σειρά έχουν η Σκύλλα και η Χάρυβδη, ένα εξακέφαλο τέρας και μια τεράστια ρουφήχτρα,\n"
				+ "τις οποίες επιδεικτικά καταφέρνουν να απογύγουν.");
		if (illness) {
			System.out.println("ο Οδυσσέας λαμβάνει το αντίδοτο της ασθένειάς του");
			timer.cancel();
		}
		ilios();
	}
	
	
	public static void ilios () {
		System.out.println("Πλέον προοδευτικά προς το νησί του ήλιου. Εκεί οι σύντροφοι πεινασμένοι αναζητούν τροφή στα βόδια του θεού.\n"
				+ "Θα ταρφούν τελικά, όμως με τα ιερά ζώα? Και αν ναι πώς θα εξελιχθεί η προφητεία του Τειρεσία?\n\n"
				+ "1: Θα τραφούν με τα βόδια ή 2: Δεν θα τραφούν με τα βόδια; (Πληκτρολόγησε την απάντηση)");
		answer = input.nextInt();
		checkAnswer(2);
		

		if (answer == 1) {
			System.out.println("Οι σύντροφοι που πέθαιναν από την πείνα, τρέφονται τελικά από τα βόδια.\n\n"
					+ "Ο Δίας βλεποντας όλο αυτό το διάστημα τη δυστυχία του ήρωά μας αποφασίζει να του δώσει μια ευκαιρία να γυρίσει στην Ιθάκη.\n"
					+ "Του προτείνει να φτάσει άμεσα στην Ιθάκη με αντάλλαγμα ένα πολύ αγαπημένο του πρόσωπο. Τι θα κάνει άραγε ο Οδυσσέας;\n\n"
					+ "1: Θα δεχτεί την προσφορά του Δία ή 2: Δεν θα δεχτεί την προσφορά του Δία (Πληκτρολόγησε την επιθυμητή απάντηση)");
			answer2 = input.nextInt();
			checkAnswer(2);
			if (answer2 == 1) {
				System.out.println("Ο Δίας τον στέλνει με ευνοϊκούς ανέμους στην Ιθάκη αλλά φτάνοντας εκεί αντιλαμβάνεται ότι ο αγαπημένος του γιος ο Τηλέμαχος είναι νεκρός");
				ithaki();
			} else {
				System.out.println("Ο Δίας για τους τιμωρήσει για την ασέβειά τους στέλνει καταιγίδα που τους σκοτώνει όλους πέρα από τον Οδυσσέα.\n"
						+ "Εκείνος καταλήγει ναυαγός στο νησί της Καλυψώς που τον περιθάλπει, τον ερωτεύεται και τον κρατάει εκεί για 7 ολόκληρα χρόνια.");
				kalipso();
			}
		} else {
			System.out.println("Ο Οδυσσέας καταλήγει αν πείσει τους συντρόφους του να μη φάνε τα βόδια και έτσι η προφητεία του Τειρεσία εκπληρώνεται και γυρνάνε τελικά στην πατρίδα ");
			ithaki();
		}
	}
	
	
	public static void kalipso () {
		System.out.println("Εκεί ο Οδυσσέας θα ξεχάσει άραγε την πατρίδα και τη γυναίκα του ή θα θελήσει με την βοήθεια της Αθηνάς να επιστρέψει στα πολυαγαπημένα του πρόσωπα ?\n\n"
				+ "1: Θα ζητήσει τη βοήθεια της Αθηνάς ή 2: Δεν θα ζητήσει τη βοήθεια της Αθηνάς. (Πληκτρολόγησε τον αριθμό της επιθυμητής απάντησης)");
		answer = input.nextInt();
		checkAnswer(2);
		if (answer == 2) {
			System.out.println("Η καρτερικότητα και η αγάπη της Καλυψώς κατά την παραμονή του στο νησί, μάγεψε τελικά τον Οδυσσέα.\n"
					+ "Η πατρίδα και η οικογένειά του αποτελούσαν πλέον ένα πεθαμένο όνειρο για το Οδυσσέα που αποφάσισε να περάσει την υπόλοιπη ζωή του με την κοπέλα που τον έσωσε.");
			
		} else {
			System.out.println("Η Αθηνά, βλέποντας τον Οδυσσέα επι 7 χρόνια να νοσταλγεί την πολυαγαπημένη του πατρίδα , πείθει την Καλυψώ να του επιτρέψει να πάρει τον δρόμο της επιστροφής.");
			faiakes();
		}
	}
	
	
	public static void teiresias() {
		System.out.println("Επόμενη στάση στο ατέλειωτο ταξίδι ειναι ο Άδης. Εκει συναντάει τον μάντη τειρεσία ο οποίος έχει ένα πολύ σημαντικό χρησμό για την εξέλιξη της ιστορίας. Δεν θα πρέπει να φάει τα βόδια του θεού ήλιου, αν θέλει να επιστρέψει στην Ιθάκη.  Για να πάρει το χρησμό πρέπει να απαντήσει σωστά σε ένα κουίζ.");
		Random rand = new Random();
		int rand1 = rand.nextInt(20); //from 0 to 19
		
		do {
			if(availableQuestions[rand1] == false) {
				rand1 = rand.nextInt(20);
			}
		} while (availableQuestions[rand1] == false);
		
		availableQuestions[rand1] = false;
		
		if (questionPicker(rand1+1) == false) {
			System.out.println("Ο Οδυσσέας θα αναγκαστεί να συνεχίσει το ταξίδι του έχοντας χάσει αυτή τη σημαντική πληροφορία");
		}
		
		seirines();
	}
	
	
	public static void faiakes() {
		System.out.println("Στο δρόμο για την Ιθάκη, η μοίρα τον στέλνει στο νησί των Φαιάκων, όπου και αποκαλύπτει ότι πολέμησε στην Τροία μαζί με τους Αχαιούς.  Οι Φαίακες που εξυμνούσαν τους Αχαιούς δέχονται να τον βοηθήσουν, όμως πρέπει να πειστούν ότι ο Οδυσσέας τους λέει αλήθεια. Του κάνουν λοιπόν 3 ερωτήσεις για τον πόλεμο στην Τροία.");
		int counter = 0;
		Random rand = new Random();
		int rand1;
		
		for (int i=0;i<3;i++) {
			rand1 = rand.nextInt(20);
			do {
				if(availableQuestions[rand1] == false) {
					rand1 = rand.nextInt(20);
				}
			} while (availableQuestions[rand1] == false);
			availableQuestions[rand1] = false;
			if (questionPicker(rand1+1)) {
				counter++;
			}
		}
		
		if (counter >= 2) {
			System.out.println("Οι φαίακες πείθονται για τη γενναιότητα και τη συμμετοχή του στον πόλεμο και παραχωρούν στον Οδυσσέα εφόδια και ένα πλοίο για να γυρίσει στην Ιθάκη. ");
		} else {
			System.out.println("Οι φαίακες δεν πιστεύουν στην συμμετοχή του στονπόλεμο. Τον διώχνουν θυμωμένοι και δεν του δίνουν εξοπλισμό, ικανό να επιστρέψει στην Ιθάκη. \r\n"
					+ "\r\n"
					+ "Περιπλανώμενος για καιρό με τη σχεδία του φτάνει στο νησί των μουσών.  Εκεί οι μούσες τον φροντίζουν, του δίνουν φαγητό και βλέποντας πόσο πιστός είναι στους θεούς και ειδικά στην Αθηνά τον βοηθούν με εξοπλισμό να φύγει και να σαλπάρει για την πολυαγαπημένη Ιθάκη.");
		}
		
		ithaki();
	}
	
	
	
	
	

	
	
	
	
	
	
	
	public static void checkAnswer(int noOfAnswers) {
		do {
			if (answer > noOfAnswers) {
				System.out.println("λάθος απάντηση. παρακαλώ δοκίμασε ξανά");
				answer = input.nextInt();
			}	
		} while (answer > noOfAnswers);
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//quiz methods and code
	static boolean [] availableQuestions = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
	static int answerQuiz;
	static Scanner in = new Scanner (System.in);
	
	public static boolean questionPicker (int questionNo) {
		boolean returnVariable;
		switch (questionNo) {
			case 1:
				returnVariable = question1();
				break;
			case 2:
				returnVariable = question2();
				break;
			case 3:
				returnVariable = question3();
				break;
			case 4:
				returnVariable = question4();
				break;
			case 5:
				returnVariable = question5();
				break;
			case 6:
				returnVariable = question6();
				break;
			case 7:
				returnVariable = question7();
				break;
			case 8:
				returnVariable = question8();
				break;
			case 9:
				returnVariable = question9();
				break;
			case 10:
				returnVariable = question10();
				break;
			case 11:
				returnVariable = question11();
				break;
			case 12:
				returnVariable = question12();
				break;
			case 13:
				returnVariable = question13();
				break;
			case 14:
				returnVariable = question14();
				break;
			case 15:
				returnVariable = question15();
				break;
			case 16:
				returnVariable = question16();
				break;
			case 17:
				returnVariable = question17();
				break;
			case 18:
				returnVariable = question18();
				break;
			case 19:
				returnVariable = question19();
				break;
			default:
				returnVariable = question20();
				break;
		}
		return returnVariable;
	}
	
	public static boolean question1() {
		System.out.println("Τι εννοούμε με τη φράση δούρειος ίππος;");
		System.out.println("1. Τρόπος εξαπάτησης");
		System.out.println("2. Γρήγορο άλογο");
		System.out.println("3. Θεϊκό σχέδιο");
		System.out.println("4. Πολεμικό άρμα");
		answerQuiz = in.nextInt();
		if (answerQuiz == 1) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question2() {
		System.out.println("Ποιοι ήταν οι γονείς του Αχιλλέα;");
		System.out.println("1. Ο Πηλέας και η Θέτιδα");
		System.out.println("2. Ο Δίας και η Θέτιδα");
		System.out.println("3. Ο Δίας και η Αλκμήνη");
		System.out.println("4. Ο Αθάμας και η Νεφέλη");
		answerQuiz = in.nextInt();
		if (answerQuiz == 1) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question3() {
		System.out.println("Ποιος κατασκεύασε την πανοπλία του Αχιλλέα;");
		System.out.println("1. Ο Θεός Άρης");
		System.out.println("2. Ο Θεός Ήφαιστος");
		System.out.println("3. Η θαλασσινή θεά Θέτιδα");
		System.out.println("4. Η θεά Αθηνά");
		answerQuiz = in.nextInt();
		if (answerQuiz == 2) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question4() {
		System.out.println("Τι είναι το Ίλιον;");
		System.out.println("1. Η πόλη της Τροίας");
		System.out.println("2. Ο ήλιος");
		System.out.println("3. Ο Τρωικός πόλεμος");
		System.out.println("4. Το ποίημα που εξιστορεί τον Τρωικό πόλεμο");
		answerQuiz = in.nextInt();
		if (answerQuiz == 1) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		
		}
	}
	
	public static boolean question5() {
		System.out.println("Τι εννοούμε με τη φράση μήλο της Έριδας;");
		System.out.println("1. Αιτία για τσακωμό");
		System.out.println("2. Νόστιμο φρούτο");
		System.out.println("3. Πτώση ενός μήλου");
		System.out.println("4. Πολύτιμο δώρο");
		answerQuiz = in.nextInt();
		if (answerQuiz == 1) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		
		}
	}
	
	public static boolean question6() {
		System.out.println("Τίνος ιδέα ήταν ο Δούρειος ίππος;");
		System.out.println("1. Του γερο-Νέστορα");
		System.out.println("2. Του Αγαμέμνονα");
		System.out.println("3. Του Οδυσσέα");
		System.out.println("4. Του Μενέλαου");
		answerQuiz = in.nextInt();
		if (answerQuiz == 3) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		
		}
	}
	
	public static boolean question7() {
		System.out.println("Ποιος μάντης έδωσε χρησμό στους Αχαιούς ότι θα έπαιρναν την Τροία σε δέκα χρόνια;");
		System.out.println("1. Ο Φινέας");
		System.out.println("2. Ο Κάλχας");
		System.out.println("3. Ο Τειρεσίας");
		System.out.println("4. Ο Άνιος");
		answerQuiz = in.nextInt();
		if (answerQuiz == 4) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		
		}
	}
	
	public static boolean question8() {
		System.out.println("Ποιος σκότωσε τον Έκτορα;");
		System.out.println("1. Ο Αγαμέμνονας");
		System.out.println("2. Ο Αίαντας");
		System.out.println("3. Ο Αχιλλέας");
		System.out.println("4. Ο Οδυσσέας");
		answerQuiz = in.nextInt();
		if (answerQuiz == 3) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		
		}
	}
	
	public static boolean question9() {
		System.out.println("Ποια ήταν η ωραία γυναίκα, που έγινε αφορμή για τον Τρωικό πόλεμο;");
		System.out.println("1. Η Ανδρομάχη, γυναίκα του Έκτορα");
		System.out.println("2. Η Χρυσηίδα, κόρη του ιερέα Χρύση");
		System.out.println("3. Η Ιφιγένεια, κόρη του βασιλιά Αγαμέμνονα");
		System.out.println("4. Η Ελένη, γυναίκα του βασιλιά Μενέλαου");
		answerQuiz = in.nextInt();
		if (answerQuiz == 4) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question10() {
		System.out.println("Πώς σκοτώθηκε ο Αχιλλέας;");
		System.out.println("1. Χτυπήθηκε από κοντάρι στον λαιμό");
		System.out.println("2. Χτυπήθηκε από φαρμακωμένο βέλος στη δεξιά φτέρνα του");
		System.out.println("3. Τον έπνιξαν δυο τεράστια φίδια σταλμένα από τον θεό Ποσειδώνα");
		System.out.println("4. Κεραυνοβολήθηκε από τον θεό Δία");
		answerQuiz = in.nextInt();
		if (answerQuiz == 2) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question11() {
		System.out.println("Γιατί ο Αχιλλέας αποσύρθηκε στη σκηνή του και έπαψε να πολεμάει τον δέκατο χρόνο της πολιορκίας;");
		System.out.println("1. Κατάλαβε ότι δεν είχε νόημα ο πόλεμος, επειδή τα τείχη της Τροίας ήταν απόρθητα");
		System.out.println("2. Θύμωσε με τον Αγαμέμνονα, γιατί δεν σεβάστηκε τον Χρύση που ήταν ιερέας του Απόλλωνα");
		System.out.println("3. Θύμωσε, επειδή ο Αγαμέμνονας του πήρε τη σκλάβα Βρισηίδα.");
		System.out.println("4. Θύμωσε, επειδή ο Αγαμέμνονας δεν τον άφησε να γίνει αυτός αρχηγός των Αχαιών");
		answerQuiz = in.nextInt();
		if (answerQuiz == 3) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question12() {
		System.out.println("Τι έκανε ο Αχιλλέας, όταν ο Πάτροκλος του ζήτησε να πολεμήσει εκείνος στη θέση του;");
		System.out.println("1. Δεν δέχτηκε, επειδή φοβόταν μήπως τον αναγνωρίσουν οι Τρώες και τον σκοτώσουν");
		System.out.println("2. Δέχτηκε. Του έδωσε την πανοπλία του, ενώ του είπε να κυνηγήσει τους Τρώες και να εισβάλει στην πόλη τους");
		System.out.println("3. Δεν δέχτηκε, επειδή είχε ορκιστεί να μην πολεμήσει με κανέναν τρόπο");
		System.out.println("4. Δέχτηκε. Του έδωσε την πανοπλία του, ενώ του είπε να διώξει τους Τρώες από το στρατόπεδο των Αχαιών και να γυρίσει πίσω");
		answerQuiz = in.nextInt();
		if (answerQuiz == 4) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question13() {
		System.out.println("Ποιος σκότωσε τον Αχιλλέα;");
		System.out.println("1. Ο Απόλλωνας");
		System.out.println("2. Ο Πάρης");
		System.out.println("3. Ο Έκτορας");
		System.out.println("4. Ο Αγαμέμνονας");
		answerQuiz = in.nextInt();
		if (answerQuiz == 2) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question14() {
		System.out.println("Ποιος αρχαίος ποιητής έγραψε για τον Τρωικό πόλεμο και για τις περιπέτειες του Οδυσσέα;");
		System.out.println("1. Ο Πίνδαρος");
		System.out.println("2. Ο Ευριπίδης");
		System.out.println("3. Ο Ησίοδος");
		System.out.println("4. Ο Όμηρος");
		answerQuiz = in.nextInt();
		if (answerQuiz == 4) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question15() {
		System.out.println("Τι έκανε ο Αχιλλέας, όταν ο Πρίαμος του ζήτησε το σώμα του νεκρού Έκτορα;");
		System.out.println("1. Οργίστηκε και σκότωσε τον Πρίαμο");
		System.out.println("2. Συγκινήθηκε και του το έδωσε, αφού πρώτα διέταξε να το πλύνουν και να το στολίσουν");
		System.out.println("3. Του το έδωσε, επειδή φοβήθηκε μήπως θυμώσουν οι θεοί αν δεν σεβαστεί την επιθυμία του Πριάμου");
		System.out.println("4. Δεν δέχτηκε και έδιωξε τον Πρίαμο θυμωμένος");
		answerQuiz = in.nextInt();
		if (answerQuiz == 2) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question16() {
		System.out.println("Θυσιάστηκε τελικά η Ιφιγένεια στην Αυλίδα;");
		System.out.println("1. Όχι, την ώρα της θυσίας η θεά Άρτεμις πήρε την Ιφιγένεια από τον βωμό και άφησε στη θέση της ένα ελάφι");
		System.out.println("2. Όχι, η Ιφιγένεια δεν δέχτηκε να θυσιαστεί");
		System.out.println("3. Όχι, η μητέρα της Ιφιγένειας δεν την άφησε να πάει στην Αυλίδα για να θυσιαστεί");
		System.out.println("4. Ναι, η Ιφιγένεια θυσιάστηκε στη θεά Άρτεμη για το καλό της πατρίδας");
		answerQuiz = in.nextInt();
		if (answerQuiz == 1) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question17() {
		System.out.println("Ποιος σκότωσε τον Πάτροκλο;");
		System.out.println("1. Ο Πάρης");
		System.out.println("2. Ο θεός Απόλλωνας");
		System.out.println("3. Ο Πρίαμος");
		System.out.println("4. Ο Έκτορας");
		answerQuiz = in.nextInt();
		if (answerQuiz == 4) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question18() {
		System.out.println("Ποιοι θεοί και θεές υποστήριζαν φανερά τους Αχαιούς;");
		System.out.println("1. Η Αφροδίτη, ο Απόλλωνας και ο Άρης");
		System.out.println("2. Η Ήρα, η Αθηνά και ο Ποσειδώνας");
		answerQuiz = in.nextInt();
		if (answerQuiz == 2) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question19() {
		System.out.println("Γιατί τα πλοία των Αχαιών έμεναν αραγμένα στην Αυλίδα και δεν ξεκινούσαν για την εκστρατεία;");
		System.out.println("1. Ο θεός Δίας εμπόδιζε τους ανέμους να φυσήξουν, γιατί δεν ήθελε να πολεμήσουν οι Αχαιοί με τους Τρώες");
		System.out.println("2. Η θεά Αφροδίτη εμπόδιζε τους ανέμους να φυσήξουν, γιατί ήθελε να προστατέψει τους Τρώες");
		System.out.println("3. Η θεά Άρτεμις εμπόδιζε τους ανέμους να φυσήξουν, γιατί ο Αγαμέμνονας είχε σκοτώσει το ιερό ελάφι της");
		System.out.println("4. Οι βασιλιάδες των Αχαιών δεν μπορούσαν να συμφωνήσουν ποιος θα ήταν ο αρχηγός της εκστρατείας");
		
		answerQuiz = in.nextInt();
		if (answerQuiz == 3) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question20() {
		System.out.println("Τι παραστάσεις είχε οι ασπίδα του Αχιλλέα;");
		System.out.println("1. Παραστάσεις ειρηνικές");
		System.out.println("2. Παραστάσεις με στοιχεία της φύσης (ήλιο, φεγγάρι κλπ)");
		System.out.println("3. Παραστάσεις που αφορούν τον πόλεμο αλλά και την ειρήνη");
		System.out.println("4. Οι βασιλιάδες των Αχαιών δεν μπορούσαν να συμφωνήσουν ποιος θα ήταν ο αρχηγός της εκστρατείας");
		
		answerQuiz = in.nextInt();
		if (answerQuiz == 3) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
}
