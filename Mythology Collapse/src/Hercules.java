import java.util.Scanner;

public class Hercules {
	private static Scanner in= new Scanner(System.in);
	private static int answer_given;
/*Όπως το έχω σκεφτεί δυστυχώς οι ονομασίες θα βγαίνουν μεγάλες. 
 * Μετά την πρώτη κατηγορία θα υπάρχουν υποκατηγορίες
 * a->a1->ak->ak0->ak9...
 */
	public static void main(String[] args) {
		System.out.println("Η αρχή του παιχνιδιού...");
		answer_given=q1();
		answer_given=q2(answer_given);
		answer_given=q3(answer_given);
		answer_given=q4(answer_given);
		answer_given=q5(answer_given);
		answer_given=q6(answer_given);
		answer_given=q7(answer_given);
		answer_given=q8(answer_given);
		answer_given=q9(answer_given);
		answer_given=q10(answer_given);
	}

	private static int q1() {
		int answer;
		System.out.println("Ποιός ήταν ο πατέρας του Ηρακλή; \n 1)Δίας.\n 2)Αμφιτρύωνας.");
		answer = in.nextInt();
		return answer;
	}

	private static int q2(int already_answered) {
		int answer;
		switch (already_answered){
		case 1:
			System.out.println("Η Ήρα ζήλευε τον Δία και αν ναι πως αντέδρασε;\n 1)Ναι\n 2)Όχι");
			answer = in.nextInt();
			
			if (answer == 1) {
				System.out.println("1)Η Ήρα έστειλα φίδια για να σκοτώσουν τον Ηρακλή.\n2)Η Ήρα πήγε η Ίδια να σκοτώσει τον Ηρακλή.");
				answer += in.nextInt();
				answer=1;
			} else {System.out.println("Ο Ηρακλής δεν έμαθε ποτέ για τις πραγματικές του δυνάμεις");}
			
		
		case 2:
			System.out.println();
		}
		return in.nextInt();
	}
	private static void reset(int checkpoint, char answergiven) {
		
	}
}
