package odyssey;
import java.util.Scanner;

public class Quiz {
	static int answer;
	static Scanner in = new Scanner (System.in);
	static boolean [] availableQuestions = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
	
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
		answer = in.nextInt();
		if (answer == 1) {
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
		answer = in.nextInt();
		if (answer == 1) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question3() {
		System.out.println("Ποιος κατασκεύασε την πανοπλία του Αχιλλέα;");
		System.out.println("1. Ο Θεός ’ρης");
		System.out.println("2. Ο Θεός Ήφαιστος");
		System.out.println("3. Η θαλασσινή θεά Θέτιδα");
		System.out.println("4. Η θεά Αθηνά");
		answer = in.nextInt();
		if (answer == 2) {
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
		answer = in.nextInt();
		if (answer == 1) {
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
		answer = in.nextInt();
		if (answer == 1) {
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
		answer = in.nextInt();
		if (answer == 3) {
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
		System.out.println("4. Ο ’νιος");
		answer = in.nextInt();
		if (answer == 4) {
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
		answer = in.nextInt();
		if (answer == 3) {
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
		answer = in.nextInt();
		if (answer == 4) {
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
		answer = in.nextInt();
		if (answer == 2) {
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
		answer = in.nextInt();
		if (answer == 3) {
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
		answer = in.nextInt();
		if (answer == 4) {
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
		answer = in.nextInt();
		if (answer == 2) {
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
		answer = in.nextInt();
		if (answer == 4) {
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
		answer = in.nextInt();
		if (answer == 2) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question16() {
		System.out.println("Θυσιάστηκε τελικά η Ιφιγένεια στην Αυλίδα;");
		System.out.println("1. Όχι, την ώρα της θυσίας η θεά ’ρτεμις πήρε την Ιφιγένεια από τον βωμό και άφησε στη θέση της ένα ελάφι");
		System.out.println("2. Όχι, η Ιφιγένεια δεν δέχτηκε να θυσιαστεί");
		System.out.println("3. Όχι, η μητέρα της Ιφιγένειας δεν την άφησε να πάει στην Αυλίδα για να θυσιαστεί");
		System.out.println("4. Ναι, η Ιφιγένεια θυσιάστηκε στη θεά ’ρτεμη για το καλό της πατρίδας");
		answer = in.nextInt();
		if (answer == 1) {
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
		answer = in.nextInt();
		if (answer == 4) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	public static boolean question18() {
		System.out.println("Ποιοι θεοί και θεές υποστήριζαν φανερά τους Αχαιούς;");
		System.out.println("1. Η Αφροδίτη, ο Απόλλωνας και ο ’ρης");
		System.out.println("2. Η Ήρα, η Αθηνά και ο Ποσειδώνας");
		answer = in.nextInt();
		if (answer == 2) {
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
		System.out.println("3. Η θεά ’ρτεμις εμπόδιζε τους ανέμους να φυσήξουν, γιατί ο Αγαμέμνονας είχε σκοτώσει το ιερό ελάφι της");
		System.out.println("4. Οι βασιλιάδες των Αχαιών δεν μπορούσαν να συμφωνήσουν ποιος θα ήταν ο αρχηγός της εκστρατείας");
		
		answer = in.nextInt();
		if (answer == 3) {
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
		
		answer = in.nextInt();
		if (answer == 3) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι λάθος απάντηση");
			return false;
		}
	}
	
	
}
