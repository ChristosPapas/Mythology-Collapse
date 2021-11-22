import java.util.Scanner;
public class Perseas  {
	private boolean helmet;
	private boolean sack;
	private boolean sandals;
	private boolean shield;
	private boolean sword;
	public Perseas() {
		initiateStory();
	}
	private void initiateStory() {
		helmet=false;
		sack=false;
		sandals=false;
		shield=false;
		sword=false;
		System.out.println("Ο Περσέας φεύγει από την Σέριφο με ένα καράβι, με σκοπό να βρει την Γοργόνα Μέδουσα. \r\n"
				+ "Στη διαδρομή του συναντά τη θεά Αθηνά και το θεό Ερμή, από τους οποίους πληροφορείται πως για να σκοτώσει την Μέδουσα θα πρέπει να προμηθευτεί:\r\n"
				+ "1) Την περικεφαλαία του Άδη, ώστε αόρατος να πλησιάσει τον στόχο του.\r\n"
				+ "2) Το μαγικό σάκο που θα βάλει το τρομερό κεφάλι.\r\n"
				+ "3) Τα φτερωτά σανδάλια, επειδή η Γοργώ - Μέδουσα, έμενε σε βράχο, στη μέση της θάλασσας.\r\n"
				+ "4) Την αστραφτερή ασπίδα, απ' όπου θα έβλεπε το κεφάλι της Μέδουσας. Γιατί όποιος έβλεπε την Μέδουσα κατάματα πέτρωνε.\r\n"
				+ "5) Το κοφτερό σπαθί ή δρεπάνι, με το οποίο θα έκοβε τον σκληρό λαιμό της Γοργούς.\r\n"
				+ "Για να μπορέσει να πολεμήσει τη μέδουσα θα πρέπει να χει τουλάχιστον 3/5 όπλα.");
		System.out.println("Επίλεξε ποιο απο τα παραπάνω αντικείμενα θες να πάρεις πρώτο");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice!=1 && choice!=2 && choice!=3 && choice!=4 && choice!=5 ) {
			System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
			choice=in.nextInt();
		}
		flowadministrator("initiateStory",choice);
	}
	private void showCaseWeapons() {
		if(helmet) {
			System.out.print(" ");
		}
		if(sack) {
			System.out.print(" 👝");
		}
		if(sandals) {
			System.out.print(" ");
		}
		if(shield) {
			System.out.print(" 🛡️");
		}
		if(sword) {
			System.out.print(" 🗡️");
		}
	}
	private void flowadministrator(String story,float choice) {
		if(story.equals("initiateStory")) {
			if(choice==1) {
				helmetTale();
			}else if(choice==2) {
				sackTale();
			}else if(choice==3) {
				sandalsTale();
			}else if(choice==4) {
				shieldTale();
			}else if(choice==5) {
				swordTale();
			}
		}
		if(story.equals("swordTale")) {
			if(choice==1) {
				System.out.println("Οι φρουροί του βασιλιά Αέλα "
						+ "εμποδίζουν τον Περσέα από το να σκοτώσει τον βασιλιά τους. Παρόλα αυτά ο βασιλιάς όντας σοκαρισμένος από "
						+ "την ανδρεία του Περσέα του δίνει το σπαθί και τον αφήνει να φύγει");
				flowadministrator("null",0);
			}else if(choice==2) {
				aelasTale();
			}else if(choice==3) {
				System.out.println("Ο βασιλιάς Αέλας σοκάρεται από την αντίδραση του Περσέα να δώσει τον αδερφό του σε αντάλλαγμα για το σπαθί. \r\n"
						+ "Για αύτο κλείνει τον περσέα σε ένα κελί. Για να τον αφήσει να φύγει πρέπει να απαντήσει σωτά στην παρακάτω ερώτηση: \r\n"
						+ "Ποιος θεός έχει ως ιερό ζώο τα άλογα;\r\n");
				System.out.println("Σας παρουσιάζονται οι παρακάτω δύο επιλογές: \r\n"
						+ "1) Διόνυσος\r\\n"
						+ "2) Διας");
				Scanner in=new Scanner(System.in);
				int choice1=in.nextInt();
				while(choice1!=1 && choice1!=2 ) {
					System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
					choice1=in.nextInt();
				}
				if(choice1==1) {
					System.out.println("απάντησή σας είναι σωστή. Ο Αέλας σας δίνει το σπαθί");
					flowadministrator("null",0);
				}else {
					deathMessage();
				}
			}
		}
	}
	public static void main(String[] args) {
		Perseas story=new Perseas();
	}
	private void helmetTale() {
		
	}
	private void sackTale() {
		
	}
	private void sandalsTale() {
		
	}
	private void shieldTale() {
		
	}
	private void swordTale() {
		System.out.println("Η Αθηνά οδήγησε τον Περσέα στην χώρα των Υπερβορείων (μυθικός λαός που ζούσε στα βουνά της Ελλάδας).\r\n\""
				+ "Για να αποκτήσει το μυθικό σπαθί που θα σκοτώσει την Μέδουσα πρέπει να αντιμετωπίσει τον βασιλιά των Υπερβορείων Αέλα:\r\n"
				+ "Όταν ο Περσέας Ζητάει από τον Αέλα το σπαθί αυτός του παρουσιάζει τις εξείς 2 επιλογές:\r\n"
				+ "1) Να θυσιάσει το πιο σημαντικό άνθρωπο για εκείνον με αντάλαγμα το σπαθί\r\n"
				+ "2) Να τον Βοηθήσει στην εκστρατεία του εναντίον του αδερφού του που προσπαθεί να σφετεριστεί τον θρόνο");
		System.out.println("Σας παρουσιάζονται οι παρακάτω τρεις επιλογές");
		System.out.println("1) Ανικανοποίητος και με τις δύο επιλογές ο περσέας αρπάζει το σπαθί του και επιτίθεται στον βασιλιά");
		System.out.println("2) Ο περσέας συμφωνεί με την πρόταση του Βασιλιά να συμμαχίσει εναντίον "
				+"του αδερφού του με τον όρο να τον βοηθήσει στην μάχη εναντίον της μέδουσας");
		System.out.println("3) Ο Περσέας συμφωνεί να θυσιάσει τον Αδερφό του Μάνη με αντάλλαγαμa το σπαθί ");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice!=1 && choice!=2 && choice!=3) {
			System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
			choice=in.nextInt();
		}
		flowadministrator("swordTale",choice);
	}
	private void aelasTale() {
		
	}
	private void deathMessage() {
		System.out.println("Εχασες το παιχνίδι, πάτα 1 αν θες να σταματήσεις να παίζεις ή 2 αν "
				+ "θες να ξεκινησεις απο την αρχή η 3 αν θες να πας στο προηγούμενο checkpoint");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice!=1 && choice!=2) {
			System.out.println("Παρακαλω εισαγετε μια εγκυρη επιλογη ");
			choice=in.nextInt();
		}
		if(choice==2) {
			initiateStory();
		}
	}
}
