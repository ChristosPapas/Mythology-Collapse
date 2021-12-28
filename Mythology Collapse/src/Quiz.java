package mythologyCollapse;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

//	Class Quiz displays random questions out of 20  and checks the correctness of the answer given 
public class Quiz {
	private static int counter=0;
	private static Random rand = new Random();
	//	Table availableQuestions declares that none of the questions has been displayed yet
	private static boolean [] availableQuestions = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
	public static int answerQuiz;
	private static Scanner input= new Scanner(System.in);
	private static int answer;
	
	//	Check if the answer given by the player is within appropriate bounds depending on number of answers and variable type 
	//	and then returns the answer.
	public static int takeAnAnswer(int noOfAnswers) {
		do {
			//	check correctiveness of type
			checkAnswer(noOfAnswers); 
			//	ensure the answer number is within bounds
			if (answer > noOfAnswers || answer<=0) {					
				System.out.printf("Πρέπει να πληκτρολογήσεις έναν ακέραιο μεταξύ 1 και %d.\nΠροσπάθησε ξανά!\n",noOfAnswers);
			}	
		} while (answer > noOfAnswers || answer<=0);
		return answer;
	}
		
	
	//	Check the type of variable through an exception handling 
	private static void  checkAnswer(int noOfAnswers) {
		boolean continueLoop=true;
		do {
			try {
				answer= input.nextInt();
				continueLoop=false;
			}catch(InputMismatchException exception){
				input.nextLine(); //	erases input so that the user can try again without terminating the program
				System.out.printf("Πρέπει να πληκτρολογήσεις έναν ακέραιο μεταξύ 1 και %d.\nΠροσπάθησε ξανά!\n",noOfAnswers);
			}
		}while(continueLoop);	
	}
	
	
	//	chooses a non displayed question and returns true when the answer is correct or false otherwise
	public  boolean questionPicker() {
		boolean result;
		availabilityCheckRestore();	//	Check the availability of non displayed questions and if it is 0, the table is being restored
		int question = checkAvailability();	//	Choose randomly a non displayed question
		//	Print question and return the correctiveness of the answer
		switch (question) {
			case 1:
				 result = question1();
				break;
			case 2:
				 result = question2();
				break;
			case 3:
				result = question3();
				break;
			case 4:
				result = question4();
				break;
			case 5:
				result = question5();
				break;
			case 6:
				result = question6();
				break;
			case 7:
				result = question7();
				break;
			case 8:
				result = question8();
				break;
			case 9:
				result = question9();
				break;
			case 10:
				result = question10();
				break;
			case 11:
				result = question11();
				break;
			case 12:
				result = question12();
				break;
			case 13:
				result = question13();
				break;
			case 14:
				result = question14();
				break;
			case 15:
				result = question15();
				break;
			case 16:
				result = question16();
				break;
			case 17:
				result = question17();
				break;
			case 18:
				result = question18();
				break;
			case 19:
				result = question19();
				break;
			default:
				result = question20();
				break;
		}
		counter++;	//	counts how many questions have been displayed
		return result; //returns a boolean value depending on whether the player has answered the question true or false
	}
	
	//	Choose randomly a question among the 20 given, checking to have not been displayed and return the number of question
	private  int checkAvailability(){
		int q;
		do{
			q = rand.nextInt(20) + 1;	
		}while(availableQuestions[q-1] == false);
		availableQuestions[q-1] = true;	//	when the question is used its cell in table takes the 'false' value
		return q;
	}
	
	//	Display  the corresponding question and read the answer from the player. Also returns the result of the answer.
	
	private  boolean  question1() {
		System.out.println("Τι εννοούμε με τη φράση δούρειος ίππος;");
		System.out.println("1. Τρόπος εξαπάτησης");
		System.out.println("2. Γρήγορο άλογο");
		System.out.println("3. Θεϊκό σχέδιο");
		System.out.println("4. Πολεμικό άρμα");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
		
	

	private  boolean  question2() {
		System.out.println("Ποιοι ήταν οι γονείς του Αχιλλέα;");
		System.out.println("1. Ο Πηλέας και η Θέτιδα");
		System.out.println("2. Ο Δίας και η Θέτιδα");
		System.out.println("3. Ο Δίας και η Αλκμήνη");
		System.out.println("4. Ο Αθάμας και η Νεφέλη");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private  boolean  question3() {
		System.out.println("Ποιος κατασκεύασε την πανοπλία του Αχιλλέα;");
		System.out.println("1. Ο Θεός Άρης");
		System.out.println("2. Ο Θεός Ήφαιστος");
		System.out.println("3. Η θαλασσινή θεά Θέτιδα");
		System.out.println("4. Η θεά Αθηνά");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private  boolean  question4() {
		System.out.println("Τι είναι το Ίλιον;");
		System.out.println("1. Η πόλη της Τροίας");
		System.out.println("2. Ο ήλιος");
		System.out.println("3. Ο Τρωικός πόλεμος");
		System.out.println("4. Το ποίημα που εξιστορεί τον Τρωικό πόλεμο");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean  question5() {
		System.out.println("Τι εννοούμε με τη φράση μήλο της Έριδας;");
		System.out.println("1. Αιτία για τσακωμό");
		System.out.println("2. Νόστιμο φρούτο");
		System.out.println("3. Πτώση ενός μήλου");
		System.out.println("4. Πολύτιμο δώρο");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean question6() {
		System.out.println("Τίνος ιδέα ήταν ο Δούρειος ίππος;");
		System.out.println("1. Του γερο-Νέστορα");
		System.out.println("2. Του Αγαμέμνονα");
		System.out.println("3. Του Οδυσσέα");
		System.out.println("4. Του Μενέλαου");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean  question7() {
		System.out.println("Ποιος μάντης έδωσε χρησμό στους Αχαιούς ότι θα έπαιρναν την Τροία σε δέκα χρόνια;");
		System.out.println("1. Ο Φινέας");
		System.out.println("2. Ο Κάλχας");
		System.out.println("3. Ο Τειρεσίας");
		System.out.println("4. Ο Άνιος");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean  question8() {
		System.out.println("Ποιος σκότωσε τον Έκτορα;");
		System.out.println("1. Ο Αγαμέμνονας");
		System.out.println("2. Ο Αίαντας");
		System.out.println("3. Ο Αχιλλέας");
		System.out.println("4. Ο Οδυσσέας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean  question9() {
		System.out.println("Ποια ήταν η ωραία γυναίκα, που έγινε αφορμή για τον Τρωικό πόλεμο;");
		System.out.println("1. Η Ανδρομάχη, γυναίκα του Έκτορα");
		System.out.println("2. Η Χρυσηίδα, κόρη του ιερέα Χρύση");
		System.out.println("3. Η Ιφιγένεια, κόρη του βασιλιά Αγαμέμνονα");
		System.out.println("4. Η Ελένη, γυναίκα του βασιλιά Μενέλαου");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean  question10() {
		System.out.println("Πώς σκοτώθηκε ο Αχιλλέας;");
		System.out.println("1. Χτυπήθηκε από κοντάρι στον λαιμό");
		System.out.println("2. Χτυπήθηκε από φαρμακωμένο βέλος στη δεξιά φτέρνα του");
		System.out.println("3. Τον έπνιξαν δυο τεράστια φίδια σταλμένα από τον θεό Ποσειδώνα");
		System.out.println("4. Κεραυνοβολήθηκε από τον θεό Δία");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private  boolean  question11() {
		System.out.println("Γιατί ο Αχιλλέας αποσύρθηκε στη σκηνή του και έπαψε να πολεμάει τον δέκατο χρόνο της πολιορκίας;");
		System.out.println("1. Κατάλαβε ότι δεν είχε νόημα ο πόλεμος, επειδή τα τείχη της Τροίας ήταν απόρθητα");
		System.out.println("2. Θύμωσε με τον Αγαμέμνονα, γιατί δεν σεβάστηκε τον Χρύση που ήταν ιερέας του Απόλλωνα");
		System.out.println("3. Θύμωσε, επειδή ο Αγαμέμνονας του πήρε τη σκλάβα Βρισηίδα.");
		System.out.println("4. Θύμωσε, επειδή ο Αγαμέμνονας δεν τον άφησε να γίνει αυτός αρχηγός των Αχαιών");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean question12() {
		System.out.println("Τι έκανε ο Αχιλλέας, όταν ο Πάτροκλος του ζήτησε να πολεμήσει εκείνος στη θέση του;");
		System.out.println("1. Δεν δέχτηκε, επειδή φοβόταν μήπως τον αναγνωρίσουν οι Τρώες και τον σκοτώσουν");
		System.out.println("2. Δέχτηκε. Του έδωσε την πανοπλία του, ενώ του είπε να κυνηγήσει τους Τρώες και να εισβάλει στην πόλη τους");
		System.out.println("3. Δεν δέχτηκε, επειδή είχε ορκιστεί να μην πολεμήσει με κανέναν τρόπο");
		System.out.println("4. Δέχτηκε. Του έδωσε την πανοπλία του, ενώ του είπε να διώξει τους Τρώες από το στρατόπεδο των Αχαιών και να γυρίσει πίσω");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean question13() {
		System.out.println("Ποιος σκότωσε τον Αχιλλέα;");
		System.out.println("1. Ο Απόλλωνας");
		System.out.println("2. Ο Πάρης");
		System.out.println("3. Ο Έκτορας");
		System.out.println("4. Ο Αγαμέμνονας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question14() {
		System.out.println("Ποιος αρχαίος ποιητής έγραψε για τον Τρωικό πόλεμο και για τις περιπέτειες του Οδυσσέα;");
		System.out.println("1. Ο Πίνδαρος");
		System.out.println("2. Ο Ευριπίδης");
		System.out.println("3. Ο Ησίοδος");
		System.out.println("4. Ο Όμηρος");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private boolean question15() {
		System.out.println("Τι έκανε ο Αχιλλέας, όταν ο Πρίαμος του ζήτησε το σώμα του νεκρού Έκτορα;");
		System.out.println("1. Οργίστηκε και σκότωσε τον Πρίαμο");
		System.out.println("2. Συγκινήθηκε και του το έδωσε, αφού πρώτα διέταξε να το πλύνουν και να το στολίσουν");
		System.out.println("3. Του το έδωσε, επειδή φοβήθηκε μήπως θυμώσουν οι θεοί αν δεν σεβαστεί την επιθυμία του Πριάμου");
		System.out.println("4. Δεν δέχτηκε και έδιωξε τον Πρίαμο θυμωμένος");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question16() {
		System.out.println("Θυσιάστηκε τελικά η Ιφιγένεια στην Αυλίδα;");
		System.out.println("1. Όχι, την ώρα της θυσίας η θεά Άρτεμις πήρε την Ιφιγένεια από τον βωμό και άφησε στη θέση της ένα ελάφι");
		System.out.println("2. Όχι, η Ιφιγένεια δεν δέχτηκε να θυσιαστεί");
		System.out.println("3. Όχι, η μητέρα της Ιφιγένειας δεν την άφησε να πάει στην Αυλίδα για να θυσιαστεί");
		System.out.println("4. Ναι, η Ιφιγένεια θυσιάστηκε στη θεά Άρτεμη για το καλό της πατρίδας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean question17() {
		System.out.println("Ποιος σκότωσε τον Πάτροκλο;");
		System.out.println("1. Ο Πάρης");
		System.out.println("2. Ο θεός Απόλλωνας");
		System.out.println("3. Ο Πρίαμος");
		System.out.println("4. Ο Έκτορας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private boolean question18() {
		System.out.println("Ποιοι θεοί και θεές υποστήριζαν φανερά τους Αχαιούς;");
		System.out.println("1. Η Αφροδίτη, ο Απόλλωνας και ο Άρης");
		System.out.println("2. Η Ήρα, η Αθηνά και ο Ποσειδώνας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question19() {
		System.out.println("Γιατί τα πλοία των Αχαιών έμεναν αραγμένα στην Αυλίδα και δεν ξεκινούσαν για την εκστρατεία;");
		System.out.println("1. Ο θεός Δίας εμπόδιζε τους ανέμους να φυσήξουν, γιατί δεν ήθελε να πολεμήσουν οι Αχαιοί με τους Τρώες");
		System.out.println("2. Η θεά Αφροδίτη εμπόδιζε τους ανέμους να φυσήξουν, γιατί ήθελε να προστατέψει τους Τρώες");
		System.out.println("3. Η θεά Άρτεμις εμπόδιζε τους ανέμους να φυσήξουν, γιατί ο Αγαμέμνονας είχε σκοτώσει το ιερό ελάφι της");
		System.out.println("4. Οι βασιλιάδες των Αχαιών δεν μπορούσαν να συμφωνήσουν ποιος θα ήταν ο αρχηγός της εκστρατείας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean question20() {
		System.out.println("Τι παραστάσεις είχε οι ασπίδα του Αχιλλέα;");
		System.out.println("1. Παραστάσεις ειρηνικές");
		System.out.println("2. Παραστάσεις με στοιχεία της φύσης (ήλιο, φεγγάρι κλπ)");
		System.out.println("3. Παραστάσεις που αφορούν τον πόλεμο αλλά και την ειρήνη");
		System.out.println("4. Σκηνές από την επιλογή του αρχηγού τηε εκστρατείας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}

	//	Print messages for the correctiveness (or not) and returns the result of the question
	private  boolean questionResult(int correct) { 
		 if (answerQuiz == correct) {
			System.out.println("Σωστή απάντηση!");
			return true;
		} else {
			System.out.println("Λυπάμαι, λάθος απάντηση!");
			return false;
		}
	}
	
	
	//checks for available number of questions and if not one then restores availability
	private static void availabilityCheckRestore() { 
		if (counter == 20) {
			for (int i=0; i<availableQuestions.length;i++) {
				availableQuestions[i] = true;
			}
		}
	}
	
}
