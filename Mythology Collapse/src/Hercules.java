import java.util.Scanner;

public class Hercules {
	private static Scanner in= new Scanner(System.in);
	private static String answer_given;
/*Όπως το έχω σκεφτεί δυστυχώς οι ονομασίες θα βγαίνουν μεγάλες. 
 * Μετά την πρώτη κατηγορία θα υπάρχουν υποκατηγορίες
 * a->a1->ak->ak0->ak9...
 */
	public Hercules() {
		System.out.println("Η αρχή του παιχνιδιού...");
		answer_given=q1();
		answer_given=q2(answer_given);
		System.out.println("Ιστορία");
		System.out.println(answer_given);
		answer_given=q3(answer_given);
		answer_given=q4(answer_given);
		answer_given=q5(answer_given);
		/*answer_given=q6(answer_given);
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
		System.out.println("Ποιός ήταν ο πατέρας του Ηρακλή;\n "
							+ "1)Δίας.\n "
							+ "2)Αμφιτρύωνας.");
		answer = in.next();
		return answer;
	}

	private static String q2(String already_answered) {
		String answer = null;
		switch (already_answered){
		
		case "1":
			System.out.println("Η Ήρα ζήλευε τον Δία και αν ναι πως αντέδρασε;\n "
								+ "1)Ναι.\n "
								+ "2)Όχι.");
			answer = in.next();
			
			if (answer.equals ("1")) {
				System.out.println("1)Η Ήρα έστειλα φίδια για να σκοτώσουν τον Ηρακλή.\n"
								 + "2)Η Ήρα πήγε η ίδια να σκοτώσει τον Ηρακλή.");
				answer = in.next();
				if (answer.equals("1")) {
					return answer;
					
				} else if (answer.equals("2")) {
					System.out.println("1)Η Ήρα απέτυχε και δεν σταμάτησε να αναζητεί τρόπο εκδίκησης.\n "
									 + "2)Η Ήρα πέτυχε τον στόχο της και ο Ηρακλής πέθανε.");
					answer = in.next();
					if (answer.equals("1")) {
						return answer;
						
					} else if (answer.equals("2")) {
						System.out.println("Ο Ηρακλής πέθανε πολύ νωρίς στην Ιστορία.");
						reset(0,'a');
					}
				}
				
				
			} else if (answer.equals ("2")){
				System.out.println("Δεν ζήλευε, οπότε ο Ηρακλής δεν έμαθε ποτέ τις πραγματικές του δυνάμεις.");
				ordinaryPerson();
			}		
		break;
		
		case "2":
			System.out.println("Ο Ηρακλής μεγάλωσε ως κοινός θνητός");
			ordinaryPerson(); //Η Ιστορία με πατέρα τον Αμφιτρύωνα.
			answer =  "2";
		break;
		}
		return answer;
	}
	
	private static String q3(String already_answered) {
		String answer;
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
			        	reset(1,'2');
			        	return answer;
			        }
			}
			return "problem";
	}
	
	private static String q4(String already_answered) {
		String answer;
			System.out.println("Πως έπραξε ο Ηρακλής όταν συνειδητοποίησε τι έκανε;\n" 
						+"1)Πήγε στο μαντείο των Δελφών για να μάθει πως μπορούσε να επανορθώσει. \n"
			            +"2)Αυτοκτόνησε από την θλίψη του. \n" );
			answer = in.next();
			if(answer.equals("1")) {
				System.out.println("Ιστορία με άθλους.");
				return answer;
			} else if (answer.equals("2")) {
				System.out.println("Έπειτα αυτοκτόνησε από την θλίψη του και πέθανε νωρίς στην ιστορία.");
				reset(1,'1');
				return answer;
			}
			return "problem";
			
	}
	private static String q5(String already_answered) {
		String answer;
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
			reset(5,'1');
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
					reset(0,'2');
				}
					
			}
		}
		}
		return "problem";
	}
	
	private static void ordinaryPerson() {
		System.out.println("\n\n\nγειαααα");
	}
	
	private static void reset(int checkpoint, char answergiven) {
		System.out.println("\n\n\nγειαααα");
	}
}
