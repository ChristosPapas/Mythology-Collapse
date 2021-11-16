import java.util.Scanner;

public class Hercules {
	private static Scanner in= new Scanner(System.in);
/*Όπως το έχω σκεφτεί δυστυχώς οι ονομασίες θα βγαίνουν μεγάλες. 
 * Μετά την πρώτη κατηγορία θα υπάρχουν υποκατηγορίες
 * a->a1->ak->ak0->ak9...
 */
	public static void main(String[] args) {
		System.out.println("Η αρχή του παιχνιδιού...");
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
	}
	private static int q1() {
		System.out.printf("Ποιός ήταν ο πατέρας του Ηρακλή; \n 1)Δίας.\n 2)Αμφιτρύωνας.");
		return in.nextInt();
	}
	private static void reset(int checkpoint, char answergiven) {
		
	}
}
