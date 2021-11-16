import java.util.Scanner;

public class Hercules {
	private static Scanner in= new Scanner(System.in);
	private static String answer_given;
/*Όπως το έχω σκεφτεί δυστυχώς οι ονομασίες θα βγαίνουν μεγάλες. 
 * Μετά την πρώτη κατηγορία θα υπάρχουν υποκατηγορίες
 * a->a1->ak->ak0->ak9...
 */
	public static void main(String[] args) {
		System.out.println("Η αρχή του παιχνιδιού...");
		answer_given=q1();
		answer_given=q2(answer_given);
		System.out.println("Ιστορία");
		System.out.println(answer_given);
		/*answer_given=q3(answer_given);
		answer_given=q4(answer_given);
		answer_given=q5(answer_given);
		answer_given=q6(answer_given);
		answer_given=q7(answer_given);
		answer_given=q8(answer_given);
		answer_given=q9(answer_given);
		answer_given=q10(answer_given);*/
	}

	/*
	 * Η 1η Ερώτηση: answer η απάντηση που θα δώσει ο χρήστης. Έπειτα αυτό επιστρέφει ως το "answer_given"
	 */
	private static String q1() {
		String answer;
		System.out.println("Ποιός ήταν ο πατέρας του Ηρακλή; \n 1)Δίας.\n 2)Αμφιτρύωνας.");
		answer = in.next();
		return answer;
	}

	private static String q2(String already_answered) {
		String answer = null;
		switch (already_answered){
		case "1":
			System.out.println("Η Ήρα ζήλευε τον Δία και αν ναι πως αντέδρασε;\n "
								+ "1)Ναι\n "
								+ "2)Όχι");
			answer = in.next();
			
			if (answer.equals ("1")) {
				System.out.println("1)Η Ήρα έστειλα φίδια για να σκοτώσουν τον Ηρακλή.\n"
								 + "2)Η Ήρα πήγε η Ίδια να σκοτώσει τον Ηρακλή.");
				answer += in.next();
			} else {
				System.out.println("Ο Ηρακλής δεν έμαθε ποτέ για τις πραγματικές του δυνάμεις");
				answer += "2";
			}
				
		break;
		case "2":
			System.out.println("Δεν ζήλευε, οπότε ο Ηρακλής δεν έμαθε ποτέ τις πραγματικές του δυνάμεις.");
			ordinaryPerson(); //Η Ιστορία με πατέρα τον Αμφιτρύωνα.
			answer = already_answered;
		break;
		}
		return already_answered + answer;
	}
	
	private static void ordinaryPerson() {
		
	}
	
	private static void reset(int checkpoint, char answergiven) {
		
	}
}
