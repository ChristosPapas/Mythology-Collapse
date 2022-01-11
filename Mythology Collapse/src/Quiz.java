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
	private static Graphics panel = new Graphics();
	
	//	Check if the answer given by the player is within appropriate bounds depending on number of answers and variable type 
	//	and then returns the answer.
	public static int takeAnAnswer(int noOfAnswers) {
		String s1 = null;
		do {
			//	check correctiveness of type
			checkAnswer(noOfAnswers); 
			//	ensure the answer number is within bounds
			if (answer > noOfAnswers || answer<=0) {					
				s1 = String.valueOf(System.out.printf("Πρέπει να πληκτρολογήσεις έναν ακέραιο μεταξύ 1 και %d.\nΠροσπάθησε ξανά!\n",noOfAnswers));
				panel.setMessage(s1);
			}	
		} while (answer > noOfAnswers || answer<=0);
		return answer;
	}
		
	
	//	Check the type of variable through an exception handling 
	private static void  checkAnswer(int noOfAnswers) {
		boolean continueLoop=true;
		String s1 = null;
		String ans;
		int i;
		do {
			try {
				ans = panel.getMessage(); //take the player's answer as a String value
				
				boolean check = false;
				while(i <= noOfAnswers || check == true){
					if (ans.equals(Integer.toString(i))){
					check = true;	// when check becomes true we have found an integer value from 1 to noOfAnswers 
					}
				}	
				continueLoop=false;
			}catch(InputMismatchException exception){
				s1 = String.valueOf(System.out.printf("Πρέπει να πληκτρολογήσεις έναν ακέραιο μεταξύ 1 και %d.\nΠροσπάθησε ξανά!\n",noOfAnswers));
				panel.setMessage(s1);
			}
		}while(continueLoop);	
		answer = Integer.parseInt(i);	//convert i value which contains the number of answer into an integer value
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
		panel.setMessage("Τι εννοούμε με τη φράση δούρειος ίππος;");
		panel.setMessage("1. Τρόπος εξαπάτησης");
		panel.setMessage("2. Γρήγορο άλογο");
		panel.setMessage("3. Θεϊκό σχέδιο");
		panel.setMessage("4. Πολεμικό άρμα");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
		
	

	private  boolean  question2() {
		panel.setMessage("Ποιοι ήταν οι γονείς του Αχιλλέα;");
		panel.setMessage("1. Ο Πηλέας και η Θέτιδα");
		panel.setMessage("2. Ο Δίας και η Θέτιδα");
		panel.setMessage("3. Ο Δίας και η Αλκμήνη");
		panel.setMessage("4. Ο Αθάμας και η Νεφέλη");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private  boolean  question3() {
		panel.setMessage("Ποιος κατασκεύασε την πανοπλία του Αχιλλέα;");
		panel.setMessage("1. Ο Θεός Άρης");
		panel.setMessage("2. Ο Θεός Ήφαιστος");
		panel.setMessage("3. Η θαλασσινή θεά Θέτιδα");
		panel.setMessage("4. Η θεά Αθηνά");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private  boolean  question4() {
		panel.setMessage("Τι είναι το Ίλιον;");
		panel.setMessage("1. Η πόλη της Τροίας");
		panel.setMessage("2. Ο ήλιος");
		panel.setMessage("3. Ο Τρωικός πόλεμος");
		panel.setMessage("4. Το ποίημα που εξιστορεί τον Τρωικό πόλεμο");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean  question5() {
		panel.setMessage("Τι εννοούμε με τη φράση μήλο της Έριδας;");
		panel.setMessage("1. Αιτία για τσακωμό");
		panel.setMessage("2. Νόστιμο φρούτο");
		panel.setMessage("3. Πτώση ενός μήλου");
		panel.setMessage("4. Πολύτιμο δώρο");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean question6() {
		panel.setMessage("Τίνος ιδέα ήταν ο Δούρειος ίππος;");
		panel.setMessage("1. Του γερο-Νέστορα");
		panel.setMessage("2. Του Αγαμέμνονα");
		panel.setMessage("3. Του Οδυσσέα");
		panel.setMessage("4. Του Μενέλαου");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean  question7() {
		panel.setMessage("Ποιος μάντης έδωσε χρησμό στους Αχαιούς ότι θα έπαιρναν την Τροία σε δέκα χρόνια;");
		panel.setMessage("1. Ο Φινέας");
		panel.setMessage("2. Ο Κάλχας");
		panel.setMessage("3. Ο Τειρεσίας");
		panel.setMessage("4. Ο Άνιος");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean  question8() {
		panel.setMessage("Ποιος σκότωσε τον Έκτορα;");
		panel.setMessage("1. Ο Αγαμέμνονας");
		panel.setMessage("2. Ο Αίαντας");
		panel.setMessage("3. Ο Αχιλλέας");
		panel.setMessage("4. Ο Οδυσσέας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean  question9() {
		panel.setMessage("Ποια ήταν η ωραία γυναίκα, που έγινε αφορμή για τον Τρωικό πόλεμο;");
		panel.setMessage("1. Η Ανδρομάχη, γυναίκα του Έκτορα");
		panel.setMessage("2. Η Χρυσηίδα, κόρη του ιερέα Χρύση");
		panel.setMessage("3. Η Ιφιγένεια, κόρη του βασιλιά Αγαμέμνονα");
		panel.setMessage("4. Η Ελένη, γυναίκα του βασιλιά Μενέλαου");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean  question10() {
		panel.setMessage("Πώς σκοτώθηκε ο Αχιλλέας;");
		panel.setMessage("1. Χτυπήθηκε από κοντάρι στον λαιμό");
		panel.setMessage("2. Χτυπήθηκε από φαρμακωμένο βέλος στη δεξιά φτέρνα του");
		panel.setMessage("3. Τον έπνιξαν δυο τεράστια φίδια σταλμένα από τον θεό Ποσειδώνα");
		panel.setMessage("4. Κεραυνοβολήθηκε από τον θεό Δία");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private  boolean  question11() {
		panel.setMessage("Γιατί ο Αχιλλέας αποσύρθηκε στη σκηνή του και έπαψε να πολεμάει τον δέκατο χρόνο της πολιορκίας;");
		panel.setMessage("1. Κατάλαβε ότι δεν είχε νόημα ο πόλεμος, επειδή τα τείχη της Τροίας ήταν απόρθητα");
		panel.setMessage("2. Θύμωσε με τον Αγαμέμνονα, γιατί δεν σεβάστηκε τον Χρύση που ήταν ιερέας του Απόλλωνα");
		panel.setMessage("3. Θύμωσε, επειδή ο Αγαμέμνονας του πήρε τη σκλάβα Βρισηίδα.");
		panel.setMessage("4. Θύμωσε, επειδή ο Αγαμέμνονας δεν τον άφησε να γίνει αυτός αρχηγός των Αχαιών");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean question12() {
		panel.setMessage("Τι έκανε ο Αχιλλέας, όταν ο Πάτροκλος του ζήτησε να πολεμήσει εκείνος στη θέση του;");
		panel.setMessage("1. Δεν δέχτηκε, επειδή φοβόταν μήπως τον αναγνωρίσουν οι Τρώες και τον σκοτώσουν");
		panel.setMessage("2. Δέχτηκε. Του έδωσε την πανοπλία του, ενώ του είπε να κυνηγήσει τους Τρώες και να εισβάλει στην πόλη τους");
		panel.setMessage("3. Δεν δέχτηκε, επειδή είχε ορκιστεί να μην πολεμήσει με κανέναν τρόπο");
		panel.setMessage("4. Δέχτηκε. Του έδωσε την πανοπλία του, ενώ του είπε να διώξει τους Τρώες από το στρατόπεδο των Αχαιών και να γυρίσει πίσω");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean question13() {
		panel.setMessage("Ποιος σκότωσε τον Αχιλλέα;");
		panel.setMessage("1. Ο Απόλλωνας");
		panel.setMessage("2. Ο Πάρης");
		panel.setMessage("3. Ο Έκτορας");
		panel.setMessage("4. Ο Αγαμέμνονας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question14() {
		panel.setMessage("Ποιος αρχαίος ποιητής έγραψε για τον Τρωικό πόλεμο και για τις περιπέτειες του Οδυσσέα;");
		panel.setMessage("1. Ο Πίνδαρος");
		panel.setMessage("2. Ο Ευριπίδης");
		panel.setMessage("3. Ο Ησίοδος");
		panel.setMessage("4. Ο Όμηρος");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private boolean question15() {
		panel.setMessage("Τι έκανε ο Αχιλλέας, όταν ο Πρίαμος του ζήτησε το σώμα του νεκρού Έκτορα;");
		panel.setMessage("1. Οργίστηκε και σκότωσε τον Πρίαμο");
		panel.setMessage("2. Συγκινήθηκε και του το έδωσε, αφού πρώτα διέταξε να το πλύνουν και να το στολίσουν");
		panel.setMessage("3. Του το έδωσε, επειδή φοβήθηκε μήπως θυμώσουν οι θεοί αν δεν σεβαστεί την επιθυμία του Πριάμου");
		panel.setMessage("4. Δεν δέχτηκε και έδιωξε τον Πρίαμο θυμωμένος");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question16() {
		panel.setMessage("Θυσιάστηκε τελικά η Ιφιγένεια στην Αυλίδα;");
		panel.setMessage("1. Όχι, την ώρα της θυσίας η θεά Άρτεμις πήρε την Ιφιγένεια από τον βωμό και άφησε στη θέση της ένα ελάφι");
		panel.setMessage("2. Όχι, η Ιφιγένεια δεν δέχτηκε να θυσιαστεί");
		panel.setMessage("3. Όχι, η μητέρα της Ιφιγένειας δεν την άφησε να πάει στην Αυλίδα για να θυσιαστεί");
		panel.setMessage("4. Ναι, η Ιφιγένεια θυσιάστηκε στη θεά Άρτεμη για το καλό της πατρίδας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean question17() {
		panel.setMessage("Ποιος σκότωσε τον Πάτροκλο;");
		panel.setMessage("1. Ο Πάρης");
		panel.setMessage("2. Ο θεός Απόλλωνας");
		panel.setMessage("3. Ο Πρίαμος");
		panel.setMessage("4. Ο Έκτορας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private boolean question18() {
		panel.setMessage("Ποιοι θεοί και θεές υποστήριζαν φανερά τους Αχαιούς;");
		panel.setMessage("1. Η Αφροδίτη, ο Απόλλωνας και ο Άρης");
		panel.setMessage("2. Η Ήρα, η Αθηνά και ο Ποσειδώνας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question19() {
		panel.setMessage("Γιατί τα πλοία των Αχαιών έμεναν αραγμένα στην Αυλίδα και δεν ξεκινούσαν για την εκστρατεία;");
		panel.setMessage("1. Ο θεός Δίας εμπόδιζε τους ανέμους να φυσήξουν, γιατί δεν ήθελε να πολεμήσουν οι Αχαιοί με τους Τρώες");
		panel.setMessage("2. Η θεά Αφροδίτη εμπόδιζε τους ανέμους να φυσήξουν, γιατί ήθελε να προστατέψει τους Τρώες");
		panel.setMessage("3. Η θεά Άρτεμις εμπόδιζε τους ανέμους να φυσήξουν, γιατί ο Αγαμέμνονας είχε σκοτώσει το ιερό ελάφι της");
		panel.setMessage("4. Οι βασιλιάδες των Αχαιών δεν μπορούσαν να συμφωνήσουν ποιος θα ήταν ο αρχηγός της εκστρατείας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean question20() {
		panel.setMessage("Τι παραστάσεις είχε οι ασπίδα του Αχιλλέα;");
		panel.setMessage("1. Παραστάσεις ειρηνικές");
		panel.setMessage("2. Παραστάσεις με στοιχεία της φύσης (ήλιο, φεγγάρι κλπ)");
		panel.setMessage("3. Παραστάσεις που αφορούν τον πόλεμο αλλά και την ειρήνη");
		panel.setMessage("4. Σκηνές από την επιλογή του αρχηγού τηε εκστρατείας");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}

	//	Print messages for the correctiveness (or not) and returns the result of the question
	private  boolean questionResult(int correct) { 
		 if (answerQuiz == correct) {
			panel.setMessage("Σωστή απάντηση!");
			return true;
		} else {
			panel.setMessage("Λυπάμαι, λάθος απάντηση!");
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
