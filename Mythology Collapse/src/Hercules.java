import java.util.Scanner;

public class Hercules {
	private static Scanner in= new Scanner(System.in);
	private static String answer_given, answer = null;
	private static int checkpoint=1;
	
	/* q1:Ποιος ήταν ο Πατέρας του Ηρακλή
 * q2:Η Ήρα ζήλευε τον τον Δία και αν ναι πως αντέδρασε;
 * q3:Ποιον δρόμο επέλεξε ο Ηρακλής;
 * q4:Πως έπραξε όταν συνειδητοποίησε τι έκανε;
 * q5:
 */
	public static void main(String []args) throws NoSuchAnswer {
		System.out.println("Η αρχή του παιχνιδιού...");
		while (checkpoint != 10) {
			if (checkpoint == 1) {
				answer_given=q1();
			} else if(checkpoint == 2) {
				answer_given=q2(answer_given);
			} else if (checkpoint == 3) {
				answer_given=q3(answer_given);
			} else if (checkpoint == 4) {
				answer_given=q4(answer_given);
			} else if (checkpoint == 5) {
				answer_given=q5(answer_given);
			} else if (checkpoint == 6) {
				answer_given=q6(answer_given);}
		}
		/*} else if (checkpoint == 7) {
		answer_given=q7(answer_given);
		} else if (checkpoint == 8) {
		answer_given=q8(answer_given);
		} else if (checkpoint == 9) {
		answer_given=q9(answer_given);
		} else if (checkpoint == 10) {
		answer_given=q10(answer_given);*/
	}

	// 1η Ερώτηση: answer η απάντηση που θα δώσει ο χρήστης. Έπειτα αυτό επιστρέφει ως το "answer_given"
	
	private static String q1() throws NoSuchAnswer{
		checkpoint++;
		System.out.println("Ποιός ήταν ο πατέρας του Ηρακλή;\n "
							+ "1)Δίας.\n "
							+ "2)Αμφιτρύωνας.");
		answer = in.next();
		if (answer.equals("1") || (answer.equals("2"))) {
		return answer;}
		else { throw new NoSuchAnswer();}
	}

	private static String q2(String already_answered) throws NoSuchAnswer{
		checkpoint++;
		if (already_answered.equals("1")){
		
			System.out.println("Η Ήρα ζήλευε τον Δία και αν ναι πως αντέδρασε;\n "
								+ "1)Ναι.\n "
								+ "2)Όχι.");
			answer = in.next();
			
			if (answer.equals ("1")) {
				System.out.println(" 1)Η Ήρα έστειλα φίδια για να σκοτώσουν τον Ηρακλή.\n"
								 + " 2)Η Ήρα πήγε η ίδια να σκοτώσει τον Ηρακλή.");
				answer = in.next();
				if (answer.equals("1")) {
					
				} else if (answer.equals("2")) {
					System.out.println(" 1)Η Ήρα απέτυχε και δεν σταμάτησε να αναζητεί τρόπο εκδίκησης.\n "
									 + " 2)Η Ήρα πέτυχε τον στόχο της και ο Ηρακλής πέθανε.");
					answer = in.next();
					if (answer.equals("1")) {
						
					} else if (answer.equals("2")) {
						System.out.println("Ο Ηρακλής πέθανε πολύ νωρίς στην Ιστορία. \n");
						reset();

					} else { throw new NoSuchAnswer();}

				} else { throw new NoSuchAnswer();}
			
			} else if (answer.equals ("2")){
				System.out.println("Δεν ζήλευε, οπότε ο Ηρακλής δεν έμαθε ποτέ τις πραγματικές του δυνάμεις. \n");
				ordinaryPerson();
				return answer = "1";
			} else { throw new NoSuchAnswer();}	
		
		} else if (answer.equals("2")){
			checkpoint--;
			ordinaryPerson(); //Η Ιστορία με πατέρα τον Αμφιτρύωνα.
		  }
		return answer;
	}
	
	private static String q3(String already_answered) throws NoSuchAnswer{
		checkpoint++;
			System.out.println("Ποιόν δρόμο επέλεξε ο Ηρακλής;\n "
				+"1)Της Αρετής. \n "
				+"2)Της Κακίας. \n ");
			answer = in.next();
			if(answer.equals("1")) {
				//	System.out.println("Η Ήρα συνέχισε να ζηλεύει και παρέσυρε τον Ηρακλή στο να σκοτώσει τη γυναίκα του και τα παιδιά του.");
					return answer;
			} else if (answer.equals("2")){
					System.out.println("Ο Ηρακλής μεγάλωσε με πολλές γυναίκες και πολλά παιδιά σε ένα ανέμελο δρόμο με πολλές χαρές. Παρόλα αυτά η Ήρα συνέχισε να ζηλεύει και τρέλανε τον Ηρακλή οδηγώντας τον να σκοτώσει τη γυναίκα του και τα τρία παιδιά του.");
		 	        System.out.println("Πως συνέχισε ο Ηρακλής την ζωή του;\n "
					+ "1)Άρχισε να αναπολέι το παρελθόν του και μετάνιωσε για ότι έκανε με παρακίνηση της Ήρας. \n "
					+ "2)Συνέχισε με την ανέμελη ζωή του. \n ");
			        answer = in.next();
			        if(answer.equals("1")) {
			        	return answer;
			        } else if (answer.equals("2")){
			        	System.out.println("Έφτασε σε μεγάλη ηλικία.");
			        	reset();
			        	return answer;
			        }
			}
			return "0";
	}
	
	private static String q4(String already_answered) throws NoSuchAnswer{
		checkpoint++;
			System.out.println("Πως έπραξε ο Ηρακλής όταν συνειδητοποίησε τι έκανε;\n" 
						+"1)Πήγε στο μαντείο των Δελφών για να μάθει πως μπορούσε να επανορθώσει. \n"
			            +"2)Αυτοκτόνησε από την θλίψη του. \n" );
			answer = in.next();
			if(answer.equals("1")) {
				System.out.println("Ιστορία με άθλους.");
				return answer;
			} else if (answer.equals("2")) {
				System.out.println("Έπειτα αυτοκτόνησε από την θλίψη του και πέθανε νωρίς στην ιστορία.");
				reset();
				return answer;
			}
			return "problem";
			
	}
	private static String q5(String already_answered) throws NoSuchAnswer{
		checkpoint++;
		int k=0;
		// System.out.println("Αφήγηση σχετικά με την Λερναία Ύδρα.");
		while (k == 0) {
		System.out.println("Με ποιόν τρόπο προσπάθησε να νικήσει την Λερναία Ύδρα;"
				+ "1)Καθώς έκοβε το κεφάλι, έκαβε ταυτόχρονα και τις πληγές"
				+ "2)Προσπάθησε να καρφώσει την καρδία της Λερναίας Ύδρας."
				+ "3)Δεν προσπάθησε και απλώς έτρεξε να ξεφύγει");
		answer = in.next();
		if(answer.equals("1")) {
			k=1;
			return answer;
		} else if (answer.equals("2")) {
			System.out.println("Τα κατάφερε, αλλά η Λερναία Ύδρα δεν πέθανε και έτσι κατάφερε να σκοτώσει τον Ηρακλή.);");
			k=1;
			reset();
		} else if (answer.equals("3")) {
			System.out.println("Τι έκανε μετά; \n"
					+ "1)Σταμάτησε να τρέχει και προσπάθησε να ανασυγκρωτηθεί. \n"
					+ "2)Συνέχισε να τρέχει μέχρι που γύρισε τον Ευρυσθέα. ");
			answer = in.next();
			if(answer.equals("1")) {
				k=0;	
			} else if (answer.equals("2")) {
				System.out.println("Ο Ευρυσθέας του υπενθύμισε γιατί κάνει τους άθλους του.");
				System.out.println("Πως έπραξε ο Ηρακλής μετά από αυτήν την υπενθύμιση;\n"
						+ "1)Γύρισε πίσω στην Λερναία Ύδρα για να την αντιμετωπίσει. \n"
						+ "2)Αυτοκτόνησε από την θλίψη του.\n");
				answer = in.next();
				if(answer.equals("1")) {
					k=0;
				} else {
					System.out.println("Αυτοκτόνησε από την θλίψη του.");
					reset();
				}
					
			}
		}
		}
		return "problem";
	}

		private static String q6(String already_answered) throws NoSuchAnswer{
			checkpoint++;
			int k=0;
			while (k==0) {
				System.out.println("Ο Ηρακλής που έσκαψε για να κατευθύνει τα νερά του Πηνειού και του Αλφειού,ώστε να καθαρίσουν οι στάβλοι του Αυγεία;"
						+ "1) Στα θεμέλια των στάβλων."
						+"2) Μέσα στους ίδιους τους στάβλους.");
				answer=in.next();
				if(answer.equals("1")) {
					k=1;
					return answer;
				} else if (answer.equals("2")){
					System.out.println("Τι αποτελέσματα είχε αυτό στους στάβλους και στην περιοχή;" 
							+ "1) Καταστράφηκαν οι στάβλοι εντελώς."
							+"2) Δεν επηρρεάστηκαν καθόλου.");
					answer=in.next();
					if(answer.equals("1")) {
						System.out.println("Τα ζώα το έσκασαν και κατέστερψαν την πόλη, με αποτέλεσμα να ζητήσουν την ευθανασία του Ηρακλή."
								+ "Επαναπροσπάεια του παίκτη.");
					} else if (answer.equals("2")){
						System.out.println("Δεν είχε κανένα αποτέλεσμα στους στάβλους και στην γύρω περιοχή. Ο Ηρακλής συνέχισε κανονικά τη ζωή του ως ένας συνηθισμένος άνθρωπος.");
						k=1;
						ordinaryPerson();
					}
				}
			}
			return answer="0";
		}

	
	private static void ordinaryPerson() {
		checkpoint--;
	}
	
	private static void reset() {
		checkpoint--;
	}
}
