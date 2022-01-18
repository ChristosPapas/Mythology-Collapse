package MythologyCollapse;

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
	private static Graphics panel;
	
	public Quiz(Graphics panel) {
		Quiz.panel = panel;
	}
	
	//	Check if the answer given by the player is within appropriate bounds depending on number of answers and variable type 
	//	and then returns the answer.
	public static int takeAnAnswer(int noOfAnswers) {
		String s1 = null;
		do {
			//	check correctiveness of type
			try {
				checkAnswer(noOfAnswers);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			//	ensure the answer number is within bounds
			if (answer > noOfAnswers || answer<=0) {					
				s1 = String.valueOf(System.out.printf("Πρέπει να πληκτρολογήσεις έναν ακέραιο μεταξύ 1 και %d. Προσπάθησε ξανά!",noOfAnswers));
				
				System.out.println(s1);
				panel.setMessage(s1);
			}	
		} while (answer > noOfAnswers || answer<=0);
		return answer;
	}
		
	
	//	Check the type of variable through an exception handling 
	private static void  checkAnswer(int noOfAnswers) throws InterruptedException{
		String ans;
		int i;
		boolean check;
		do {	
			i = 0 ;
			check = false;
				ans = panel.getInputInt(); //take the player's answer as a String value
				while(i < noOfAnswers && check == false){
					i++;
					if (ans.equals(Integer.toString(i))){
					check = true;	// when check becomes true we have found an integer value from 1 to noOfAnswers
					}
				}	
			if(!check){
				panel.errorInputMessage(noOfAnswers);
			}
		}while(check == false);	
		answer = i;	//convert i value which contains the number of answer into an integer value
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
		panel.addMessage("<html>Τι εννοούμε με τη φράση δούρειος ίππος;<html>");
		panel.addMessage("<html><br/>1. Τρόπος εξαπάτησης<html>");
		panel.addMessage("<html><br/>2. Γρήγορο άλογο<html>");
		panel.addMessage("<html><br/>3. Θεϊκό σχέδιο<html>");
		panel.addMessage("<html><br/>4. Πολεμικό άρμα<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
		
	

	private  boolean  question2() {
		panel.addMessage("<html>Ποιοι ήταν οι γονείς του Αχιλλέα;<html>");
		panel.addMessage("<html><br/>1. Ο Πηλέας και η Θέτιδα<html>");
		panel.addMessage("<html><br/>2. Ο Δίας και η Θέτιδα<html>");
		panel.addMessage("<html><br/>3. Ο Δίας και η Αλκμήνη<html>");
		panel.addMessage("<html><br/>4. Ο Αθάμας και η Νεφέλη<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private  boolean  question3() {
		panel.addMessage("<html>Ποιος κατασκεύασε την πανοπλία του Αχιλλέα;<html>");
		panel.addMessage("<html><br/>1. Ο Θεός Άρης<html>");
		panel.addMessage("<html><br/>2. Ο Θεός Ήφαιστος<html>");
		panel.addMessage("<html><br/>3. Η θαλασσινή θεά Θέτιδα<html>");
		panel.addMessage("<html><br/>4. Η θεά Αθηνά<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private  boolean  question4() {
		panel.addMessage("<html>Τι είναι το Ίλιον;<html>");
		panel.addMessage("<html><br/>1. Η πόλη της Τροίας<html>");
		panel.addMessage("<html><br/>2. Ο ήλιος<html>");
		panel.addMessage("<html><br/>3. Ο Τρωικός πόλεμος<html>");
		panel.addMessage("<html><br/>4. Το ποίημα που εξιστορεί τον Τρωικό πόλεμο<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean  question5() {
		panel.addMessage("<html>Τι εννοούμε με τη φράση μήλο της Έριδας;<html>");
		panel.addMessage("<html><br/>1. Αιτία για τσακωμό<html>");
		panel.addMessage("<html><br/>2. Νόστιμο φρούτο<html>");
		panel.addMessage("<html><br/>3. Πτώση ενός μήλου<html>");
		panel.addMessage("<html><br/>4. Πολύτιμο δώρο<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean question6() {
		panel.addMessage("<html>Τίνος ιδέα ήταν ο Δούρειος ίππος;<html>");
		panel.addMessage("<html><br/>1. Του γερο-Νέστορα<html>");
		panel.addMessage("<html><br/>2. Του Αγαμέμνονα<html>");
		panel.addMessage("<html><br/>3. Του Οδυσσέα<html>");
		panel.addMessage("<html><br/>4. Του Μενέλαου<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean  question7() {
		panel.addMessage("<html>Ποιος μάντης έδωσε χρησμό στους Αχαιούς ότι θα έπαιρναν την Τροία σε δέκα χρόνια;<html>");
		panel.addMessage("<html><br/>1. Ο Φινέας<html>");
		panel.addMessage("<html><br/>2. Ο Κάλχας<html>");
		panel.addMessage("<html><br/>3. Ο Τειρεσίας<html>");
		panel.addMessage("<html><br/>4. Ο Άνιος<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean  question8() {
		panel.addMessage("<html>Ποιος σκότωσε τον Έκτορα;<html>");
		panel.addMessage("<html><br/>1. Ο Αγαμέμνονας<html>");
		panel.addMessage("<html><br/>2. Ο Αίαντας<html>");
		panel.addMessage("<html><br/>3. Ο Αχιλλέας<html>");
		panel.addMessage("<html><br/>4. Ο Οδυσσέας<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean  question9() {
		panel.addMessage("<html>Ποια ήταν η ωραία γυναίκα, που έγινε αφορμή για τον Τρωικό πόλεμο;<html>");
		panel.addMessage("<html><br/>1. Η Ανδρομάχη, γυναίκα του Έκτορα<html>");
		panel.addMessage("<html><br/>2. Η Χρυσηίδα, κόρη του ιερέα Χρύση<html>");
		panel.addMessage("<html><br/>3. Η Ιφιγένεια, κόρη του βασιλιά Αγαμέμνονα<html>");
		panel.addMessage("<html><br/>4. Η Ελένη, γυναίκα του βασιλιά Μενέλαου<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean  question10() {
		panel.addMessage("<html>Πώς σκοτώθηκε ο Αχιλλέας;<html>");
		panel.addMessage("<html><br/>1. Χτυπήθηκε από κοντάρι στον λαιμό<html>");
		panel.addMessage("<html><br/>2. Χτυπήθηκε από φαρμακωμένο βέλος στη δεξιά φτέρνα του<html>");
		panel.addMessage("<html><br/>3. Τον έπνιξαν δυο τεράστια φίδια σταλμένα από τον θεό Ποσειδώνα<html>");
		panel.addMessage("<html><br/>4. Κεραυνοβολήθηκε από τον θεό Δία<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private  boolean  question11() {
		panel.addMessage("<html>Γιατί ο Αχιλλέας αποσύρθηκε στη σκηνή του και έπαψε να πολεμάει τον δέκατο χρόνο της πολιορκίας;<html>");
		panel.addMessage("<html><br/>1. Κατάλαβε ότι δεν είχε νόημα ο πόλεμος, επειδή τα τείχη της Τροίας ήταν απόρθητα<html>");
		panel.addMessage("<html><br/>2. Θύμωσε με τον Αγαμέμνονα, γιατί δεν σεβάστηκε τον Χρύση που ήταν ιερέας του Απόλλωνα<html>");
		panel.addMessage("<html><br/>3. Θύμωσε, επειδή ο Αγαμέμνονας του πήρε τη σκλάβα Βρισηίδα.<html>");
		panel.addMessage("<html><br/>4. Θύμωσε, επειδή ο Αγαμέμνονας δεν τον άφησε να γίνει αυτός αρχηγός των Αχαιών<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean question12() {
		panel.addMessage("<html>Τι έκανε ο Αχιλλέας, όταν ο Πάτροκλος του ζήτησε να πολεμήσει εκείνος στη θέση του;<html>");
		panel.addMessage("<html><br/>1. Δεν δέχτηκε, επειδή φοβόταν μήπως τον αναγνωρίσουν οι Τρώες και τον σκοτώσουν<html>");
		panel.addMessage("<html><br/>2. Δέχτηκε. Του έδωσε την πανοπλία του, ενώ του είπε να κυνηγήσει τους Τρώες και να εισβάλει στην πόλη τους<html>");
		panel.addMessage("<html><br/>3. Δεν δέχτηκε, επειδή είχε ορκιστεί να μην πολεμήσει με κανέναν τρόπο<html>");
		panel.addMessage("<html><br/>4. Δέχτηκε. Του έδωσε την πανοπλία του, ενώ του είπε να διώξει τους Τρώες από το στρατόπεδο των Αχαιών και να γυρίσει πίσω<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private  boolean question13() {
		panel.addMessage("<html>Ποιος σκότωσε τον Αχιλλέα;<html>");
		panel.addMessage("<html><br/>1. Ο Απόλλωνας<html>");
		panel.addMessage("<html><br/>2. Ο Πάρης<html>");
		panel.addMessage("<html><br/>3. Ο Έκτορας<html>");
		panel.addMessage("<html><br/>4. Ο Αγαμέμνονας<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question14() {
		panel.addMessage("<html>Ποιος αρχαίος ποιητής έγραψε για τον Τρωικό πόλεμο και για τις περιπέτειες του Οδυσσέα;<html>");
		panel.addMessage("<html><br/>1. Ο Πίνδαρος<html>");
		panel.addMessage("<html><br/>2. Ο Ευριπίδης<html>");
		panel.addMessage("<html><br/>3. Ο Ησίοδος<html>");
		panel.addMessage("<html><br/>4. Ο Όμηρος<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private boolean question15() {
		panel.addMessage("<html>Τι έκανε ο Αχιλλέας, όταν ο Πρίαμος του ζήτησε το σώμα του νεκρού Έκτορα;<html>");
		panel.addMessage("<html><br/>1. Οργίστηκε και σκότωσε τον Πρίαμο<html>");
		panel.addMessage("<html><br/>2. Συγκινήθηκε και του το έδωσε, αφού πρώτα διέταξε να το πλύνουν και να το στολίσουν<html>");
		panel.addMessage("<html><br/>3. Του το έδωσε, επειδή φοβήθηκε μήπως θυμώσουν οι θεοί αν δεν σεβαστεί την επιθυμία του Πριάμου<html>");
		panel.addMessage("<html><br/>4. Δεν δέχτηκε και έδιωξε τον Πρίαμο θυμωμένος<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question16() {
		panel.addMessage("<html>Θυσιάστηκε τελικά η Ιφιγένεια στην Αυλίδα;<html>");
		panel.addMessage("<html><br/>1. Όχι, την ώρα της θυσίας η θεά Άρτεμις πήρε την Ιφιγένεια από τον βωμό και άφησε στη θέση της ένα ελάφι<html>");
		panel.addMessage("<html><br/>2. Όχι, η Ιφιγένεια δεν δέχτηκε να θυσιαστεί<html>");
		panel.addMessage("<html><br/>3. Όχι, η μητέρα της Ιφιγένειας δεν την άφησε να πάει στην Αυλίδα για να θυσιαστεί<html>");
		panel.addMessage("<html><br/>4. Ναι, η Ιφιγένεια θυσιάστηκε στη θεά Άρτεμη για το καλό της πατρίδας<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(1);
	}
	
	private boolean question17() {
		panel.addMessage("<html>Ποιος σκότωσε τον Πάτροκλο;<html>");
		panel.addMessage("<html><br/>1. Ο Πάρης<html>");
		panel.addMessage("<html><br/>2. Ο θεός Απόλλωνας<html>");
		panel.addMessage("<html><br/>3. Ο Πρίαμος<html>");
		panel.addMessage("<html><br/>4. Ο Έκτορας<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(4);
	}
	
	private boolean question18() {
		panel.addMessage("<html>Ποιοι θεοί και θεές υποστήριζαν φανερά τους Αχαιούς;<html>");
		panel.addMessage("<html><br/>1. Η Αφροδίτη, ο Απόλλωνας και ο Άρης<html>");
		panel.addMessage("<html><br/>2. Η Ήρα, η Αθηνά και ο Ποσειδώνας<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(2);
	}
	
	private boolean question19() {
		panel.addMessage("<html>Γιατί τα πλοία των Αχαιών έμεναν αραγμένα στην Αυλίδα και δεν ξεκινούσαν για την εκστρατεία;<html>");
		panel.addMessage("<html><br/>1. Ο θεός Δίας εμπόδιζε τους ανέμους να φυσήξουν, γιατί δεν ήθελε να πολεμήσουν οι Αχαιοί με τους Τρώες<html>");
		panel.addMessage("<html><br/>2. Η θεά Αφροδίτη εμπόδιζε τους ανέμους να φυσήξουν, γιατί ήθελε να προστατέψει τους Τρώες<html>");
		panel.addMessage("<html><br/>3. Η θεά Άρτεμις εμπόδιζε τους ανέμους να φυσήξουν, γιατί ο Αγαμέμνονας είχε σκοτώσει το ιερό ελάφι της<html>");
		panel.addMessage("<html><br/>4. Οι βασιλιάδες των Αχαιών δεν μπορούσαν να συμφωνήσουν ποιος θα ήταν ο αρχηγός της εκστρατείας<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}
	
	private boolean question20() {
		panel.addMessage("<html>Τι παραστάσεις είχε οι ασπίδα του Αχιλλέα;<html>");
		panel.addMessage("<html><br/>1. Παραστάσεις ειρηνικές<html>");
		panel.addMessage("<html><br/>2. Παραστάσεις με στοιχεία της φύσης (ήλιο, φεγγάρι κλπ)<html>");
		panel.addMessage("<html><br/>3. Παραστάσεις που αφορούν τον πόλεμο αλλά και την ειρήνη<html>");
		panel.addMessage("<html><br/>4. Σκηνές από την επιλογή του αρχηγού τηε εκστρατείας<html>");
		answerQuiz = takeAnAnswer(4);
		return questionResult(3);
	}

	//	Print messages for the correctiveness (or not) and returns the result of the question
	private  boolean questionResult(int correct) { 
		 if (answerQuiz == correct) {
			panel.addMessage("<html>Σωστή απάντηση!<html>");
			return true;
		} else {
			panel.addMessage("<html>Λυπάμαι, λάθος απάντηση!<html>");
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
