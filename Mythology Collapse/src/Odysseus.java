package mythologyCollapse;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
	
	class SetTimerTask extends TimerTask{
		public void run(){
		System.out.println("\nΟ Οδυσσέας είναι νεκρός! Η αρρώστια που του δημιούργησε ο λωτός τελικά τον νίκησε, αφού δεν πήρε το αντίδοτο!");
		Odysseus.backToMenu();
		}
	}
	
		
public class Odysseus {
	private static Quiz q = new Quiz();
	private static Random randValue = new Random();
	private static boolean kirki;
	private static boolean disease;
	private static int answer;
	private static boolean treasure;
	private  static Timer timer;
	private static TimerTask task;
	private static boolean end;
	
	public Odysseus() {
		initialization();
	}
	
	private static void initialization() {
		kirki= false;
		disease=false;
		treasure=false;
		end=false;	
		timer= new Timer();
		task =new SetTimerTask();
		lotofagoi();
	}
	


	public static void backToMenu() {
		System.out.println("\nΑν θέλεις να ξαναπαίξεις την πίστα του Οδυσσέα και να αλλάξεις τις αποφάσεις σου, πάτησε 1.\n"
				+ "Αλλιώς, αν θες να επιστρέψεις στο ΑΡΧΙΚΟ ΜΕΝΟΥ, πάτησε 2.\n");
		answer = Quiz.takeAnAnswer(2);
		if(answer==1) {
		initialization();
		}
	}





	private static void lotofagoi() {
		System.out.println("Καλωσόρισες στην πίστα του Οδυσσέα!\n");
		System.out.println("Μετά την νίκη των Αχαιών στον πόλεμο της Τροίας, ο Οδυσσέας, "
				+ "\nβασιλιάς της Ιθάκης, που ξεχώρισε για την ευστροφία του με την ιδέα του Δούρειου Ίππου,"
				+ "\nπήρε τον δρόμο της επιστροφής για την πατρίδα. Η ύβρις, όμως, που διέπραξαν οι Αχαιοί "
				+ "\nκαίγοντας τους βωμούς των θεών στην Τροία, δεν θα μπορούσε να περάσει ατιμώρητη. Έτσι, "
				+ "\nο Ποσειδώνας για να τους δυσκολέψει προκαλεί μια τεράστια θαλασσοταραχή που στέλνει τα καράβια "
				+ "\nτων ναυτών πέρα μακριά, στην χώρα των Λωτοφάγων...\n\n\n");
		System.out.println("Oι κατάκοποι από τον πόλεμο ναύτες χαροπάλευαν μέρες ολόκληρες με τα κύματα,"
				+ "\nώσπου κάποια στιγμή αντίκρισαν επιτέλους την στεριά.Καθώς η πείνα και η κούραση τούς"
				+ "\nείχαν καταβάλει, έσπευσαν αμέσως να αναζητήσουν ένα γεύμα και ένα μέρος για να ξαποστάσουν."
				+ "\nΠαντού γύρω τους υπήρχαν δέντρα με πολύχρωμους, δελεαστικούς καρπούς.Η χώρα των Λωτοφάγων, ωστόσο,"
				+ "\nδεν ήταν ένας κοινός τόπος, ήταν ένα μέρος καλυμμένο με  μαγεία σε κάθε σπιθαμή...Ακόμη και οι καρποί"
				+ "\nπου έβγαζε η γη ήταν ξεχωριστοί. "
				+ "\nΟι ναύτες, ωστόσο, θολωμένοι από την πολυήμερη πείνα δεν μπορούσαν να αντιληφθούν την μοναδικότητα του"
				+ "\nμέρους.Άρπαξαν όλοι, λοιπόν, από μερικούς καρπούς και άρχισαν να τους καταβροχθίζουν. Έτσι κι ο Οδυσσέας, "
				+ "\nπήρε κι αυτός έναν καρπό για να καταλαγιάσει την αβάσταχτη πείνα.\n\n"
				+ "Οι καρποί ήταν τριών ειδών:"
				+ "\n1. Πορτοκαλί"
				+ "\n2. Κίτρινος "
				+ "\n3. Κόκκινος "
				+ "\nΠοιόν θα διαλέξει ο Οδυσσέας;");
		answer = Quiz.takeAnAnswer(3);
		
		if(answer==1) {
			System.out.println("Χμμ, ο Οδυσσέας φαίνεται να επέλεξε τον πορτοκαλί καρπό.Υπάρχει, όμως, κάτι που δεν γνώριζε εξαρχής..."
					+ "\nΟ πορτοκαλί λωτός έχει τη μαγική ιδιότητα της αγάπης. Αναγκάζει το άτομο που θα τον γευτεί να ερωτευτεί"
					+ "\nπαράφορα το πρώτο άτομο του αντίθετου φίλου που θα αντικρίσει.Θα συμβεί,άραγε, το ίδιο και με τον  Οδυσσέα ή θα "
					+ "\nγλιτώσει από τα μάγια του λωτού; Θα το μάθουμε στη συνέχεια...");
					kirki=true;
		}else if (answer==2) {
			System.out.println("\nΑπ'ότι φαίνεται ο Οδυσσέας επέλεξε τον κίτρινο λωτό ή όπως ονομάζεται αλλιώς, τον 'Καρπό της Λύτρωσης'."
					+ "\nΟι κίτρινοι λωτοί θεωρούνταν στο νησί οι ιεροί καρποί της θεάς Αθηνάς.Δεν θα μπορούσαν, επομένως, να "
					+ "\nβλάψουν τους περαστικούς που τους δοκιμάζουν...Ήταν οι μόνοι καρποί του νησιού που δεν είχαν αλλοιωθεί από τη "
					+ "\nμαγεία του τόπου.Αφού ξεκουράστηκε, λοιπόν, ο Οδυσσέας μάζεψε τους συντρόφους του και πήραν ξανά το δρόμο για "
					+ "\nτην επιστροφή...");
		}else if (answer==3){
			System.out.println("\nΑφού ο Οδυσσέας έπιασε έναν κόκκινο καρπό από το δέντρο, έκατσε κάτω από μια σκιά για να τον απολαύσει."
					+ "\nΟ καρπός ήταν πολύ νόστιμος και πολύ χορταστικός, τόσο που ο Οδυσσέας αποφάσισε να κοιμηθεί για λίγη ώρα ώσπου "
					+ "\nνα χωνέψει.Όταν ο ήρωας ξύπνησε ένιωθε το κεφάλι του βαρύ και είχε έναν αβάσταχτο πόνο στο στήθος.Σηκώθηκε, ωστόσο,"
					+ "\nκαι έσπευσε να βρει τους συντρόφους του για να πάρουν το δρόμο της επιστροφής, αγνοώντας τα δυσοίωνα συμπτώματα...");
			disease=true;
			timer.schedule(task ,60000*(randValue.nextInt(5)+1)); //1 minute equals 60000, we give the player 1-6 minutes randomly
			//timer.cancel(); in case he gets the antidote or he gets in ithaki
			
		}
		cyclops();
	}

	
	private static void help() {
		System.out.printf("\n\n%5s\n%10s","Ο Οδυσσέας βρίσκεται σε κίνδυνο!!!!","Αν θες να τον σώσεις απάντησε σωστά στην παρακάτω ερώτηση.\n\n");
		System.out.println("Θα βοηθήσεις τον ήρωα να επιβιώσει;\nΑπάντησε:\n1. ΝΑΙ\n2. ΟΧΙ\n");
		answer = Quiz.takeAnAnswer(2);
		if(answer==1) {
			if(q.questionPicker() == true) {  //getQuestion prints the question and returns true is the answer is true or false for the opposite situation 
			System.out.println("\nΟρίστε ένα hint για τη συνέχιση του παιχνιδιού:"
					+ "\n\nΟ ήρωας είναι δηλητηριασμένος από τον κόκκινο λωτό!"
					+ "\nΗ κατάστασή του είναι πολύ σοβαρή!Για να τον σώσεις πρέπει να φτάσεις"
					+ "\nέγκαιρα στην τερατόμορφη σκύλλα!Το δηλητήριό της είναι το αντίδοτο για τη σωτηρία του Οδυσσέα!!"
					+ "\n\nΒιάσου!Ο χρόνος σου τελειώνει!!");  
			}else {
				System.out.println("\nΈχασες, δυστυχώς, την ευκαιρία σου να βοηθήσεις τον ήρωα...\nΚαλή Τύχη!!");
			}  
		}
	}
	
	
	private static void cyclops() {
		System.out.println("Μετά την χώρα των λωτοφάγων, οι επεμβάσεις των θεών τους οδήγησαν στην χώρα των Κυκλώπων. \r\n"
				+ "Εκεί, ο κύκλωπας Πολύφημος, γιος του θεού Ποσειδώνα, παίρνει διαταγές από τον πατέρα του να βρει και να σκοτώσει\r\n"
				+ "τον Οδυσσέα,που βρίσκεται πλέον στο νησί.Η Αθηνά, για να προστατεύσει τον Οδυσσέα του δίνει την δυνατότητα να\n"
				+ "διαλέξει ένα μαγικό όπλο που θα τον συντροφεύει στη διαδρομή του.\n\nΟι επιλογές που προσφέρει η Αθηνά στον Οδυσσέα είναι οι εξής:"
				+ "\n1.Ασπίδα"
				+ "\n2.Ξύλινη Λόγχη"
				+ "\n3.Σφεντόνα που ποτέ δεν αστοχεί"
				+ "\nΠοιά θα είναι η επιλογή του Οδυσσέα;\n\n");
		answer = Quiz.takeAnAnswer(3);
		cyclopsGuns(answer,randValue.nextInt(2)+1);
		
		if(end==false) {
			System.out.println("\nΚατά τον απόπλου από το νησί, ο Οδυσσέας έρχεται αντιμέτωπος με το εξής δίλημμα:\n"
					+ "1.Να αποκαλύψει το όνομά του  στον Πολύφημο και να ικανοποιήσει την αλαζονική του πλευρά.\n"
					+ "2.να αποχωρήσει αφήνοντάς τον να πιστεύει ότι τον σκότωσε ο Κανένας.\n\n");
			answer = Quiz.takeAnAnswer(2);
			if(answer==1) {
				aiolos();
			}else {
				System.out.println("Ο Οδυσσέας αποφασίζει τελικά να μην αποκαλύψει το πραγματικό του όνομα και έτσι,"
					+"\nσυνεχίζει ήρεμα το ταξίδι του για την Ιθάκη.\n\n");
			ithaki();
			}
		} else {
			death();
		}
	}
	
	
	private static void cyclopsGuns(int odGun, int cyGun) {
		System.out.println("\nO Ποσειδώνας, παρ'όλα αυτά, όντας προνοητικός, κάνει δώρο στον γιό του κι αυτός ένα κρυφό όπλο...\n");
		System.out.println("Όταν οι ναύτες φτάνουν στο νησί, αφελείς ως ήταν κατεβαίνουν στη στεριά και αρχίζουν να περιηγούνται στον ξένο τόπο."
				+ "\nΈνας από αυτούς εντοπίζει μια σπηλιά και αφού πλησιάσει λίγο παραπάνω, αντικρίζει μέσα σε αυτήν ένα πρωτόγνωρο θέαμα:"
				+ "\nΈνας τεράστιος πέτρινος, σκαλιστός βράχος δεσπόζει στη μέση της σπηλιάς και πάνω του βρίσκονται γιγαντιαίου μεγέθους τρόφιμα"
				+ "\nόλων των ειδών. Χωρίς να χάσει λεπτό, ο ναύτης τρέχει να ειδοποιήσει τους συντρόφους του κατενθουσιασμένος.Αφού συγκεντρώνονται όλοι,"
				+ "\nκατευθύνονται γρήγορα προς τη σπηλιά...Προτού, όμως, προλάβουν να επεξεργαστούν το γεγονός μπαίνει μέσα ένα τεράστιο "
				+ "\nμονόφθαλμο ον.Ήταν ο κύκλωπας Πολύφημος...\n"
				+ "Βλέποντας τους ναύτες, ο Πολύφημος απορεί με την καλή του τύχη και αμέσως αρχίζει να τους ρωτάει για τον Οδυσσέα.\n\n");
		if(odGun==1 && cyGun==1) {
			System.out.println("Αφού ο Οδυσσέας συστήνεται ως 'Kανένας', ο Πολύφημος ψάχνει ανάμεσα στους ναύτες να τον βρει.Όταν οι ναύτες αρνούνται να "
					+ "\nτον βοηθήσουν, εκείνος σε μια έκρηξη οργής εξφενδονίζει τον κεραυνό που του χάρισε ο πατέρας του προς το μέρος τους."
					+ "\nΟ Οδυσσέας για να προστατεύσει του συντρόφους του προτάσσει την ασπίδα της Αθηνάς, η οποία αντανακλά τον κεραυνό "
					+ "\nπρος τον κύκλωπα και τελικά τον αφήνει αναίσθητο. Έτσι, οι ναύτες απελευθερώνονται και αρχίζουν να τρέχουν προς το πλοίο.\n\n");
		}else if(odGun==2 && cyGun==1) {
			System.out.println("Αφού ο Οδυσσέας συστήνεται ως 'Kανένας', ο Πολύφημος ψάχνει ανάμεσα στους ναύτες να τον βρει.Όταν οι ναύτες αρνούνται να "
					+ "\nτον βοηθήσουν, εκείνος σε μια έκρηξη οργής εξφενδονίζει τον κεραυνό που του χάρισε ο πατέρας του προς το μέρος τους."
					+ "\nΟ Οδυσσέας έχοντας επιλέξει την μαγική σφεντόνα, καταφέρνει μεν να ζαλίσει τον κύκλωπα, αλλά όχι αποτελεσματικά, καθώς εκείνος"
					+ "\nσυνεχίζει να εκτοξεύει κεραυνούς, ένας από τους οποίους πετυχαίνει και τον ήρωα...\n\n");
				end=true;
		}else if(odGun==3 && cyGun==1) {
			System.out.println("Αφού ο Οδυσσέας συστήνεται ως 'Kανένας', ο Πολύφημος ψάχνει ανάμεσα στους ναύτες να τον βρει.Όταν οι ναύτες αρνούνται να "
					+ "\nτον βοηθήσουν, εκείνος σε μια έκρηξη οργής εξφενδονίζει τον κεραυνό που του χάρισε ο πατέρας του προς το μέρος τους."
					+ "\nΟ Οδυσσέας με  την λόγχη δεν μπορεί να αμυνθεί. Ο κεραυνός τον χτυπάει απευθείας και εκέινος χάνει τη ζωή του...\n\n");
			end=true;
		}else if(odGun==1 && cyGun==2) {
			System.out.println("Αφού ο Οδυσσέας συστήνεται ως 'Kανένας', ο Πολύφημος ψάχνει ανάμεσα στους ναύτες να τον βρει. Καθώς οι ναύτες βρίσκονται "
					+ "\nπαγιδευμένοι στη σπηλιά του Κύκλωπα, εκείνος αρχίζει να τους καταβροχθίζει έναν έναν εως ότου φτάνει στον Οδυσσέα. Ο Οδυσσέας,ωστόσο,"
					+ "\nέχοντας επιλέξει ως δώρο της Αθηνάς την ασπίδα, δεν μπορεί να βρει κάποιον έξυπνο τρόπο για να την αξιοποιήσει.Όταν, λοιπόν, ο κύκλωπας "
					+ "\nστρέφετσι προς αυτόν, δεν μπορεί να τον αποκρούσει και έτσι καταλήγει και αυτός στο θάνατο...\n\n");
			end=true;
		}else if(odGun==2 && cyGun==2){
			System.out.println("Αφού ο Οδυσσέας συστήνεται ως” Κανένας” ο Πολύφημος ψάχνει ανάμεσα στους ναύτες να τον βρει. Καθώς οι ναύτες βρίσκονται"
					+ "\nπαγιδευμένοι στη σπηλιά του Κύκλωπα, εκέινος αρχίζει να τους καταβροχθίζει έναν έναν. Ο Οδυσσέας, που δεν αντέχει το αποτρόπαιο θέαμα, "
					+ "\nπιάνει την ξύλινη λόγχη και την πετάει με δύναμη, πετυχαίνοντας τον κύκλωπα στο μάτι.Εκείνος χάνει την όραση που του είχε προσφέρει ο "
					+ "\nπατέρας του και εξαγριώνεται! Ο Οδυσσέας και οι σύντροφοί του κατευθύνονται γρήγορα προς το πλοίο προτού ο κύκλωπας προλάβει να το αντιληφθεί.."
					+ "\n");
		}else if(odGun==3 && cyGun==2){
			System.out.println("Αφού ο Οδυσσέας συστήνεται ως” Κανένας” ο Πολύφημος ψάχνει ανάμεσα στους ναύτες να τον βρει. Καθώς οι ναύτες βρίσκονται"
				+ "\nπαγιδευμένοι στη σπηλιά του Κύκλωπα, εκέινος αρχίζει να τους καταβροχθίζει έναν έναν. Ο Οδυσσέας, που δεν αντέχει το αποτρόπαιο θέαμα, "
				+ "\nπιάνει την σφεντόνα και με μια επιδεικτική κίνηση καταφέρνει να τυφλώσει τον κύκλωπα και να σώσει τους εναπομείναντες συντρόφους του. \n\n");
		}
	}
	
	
	
	private static void aiolos() {
		if(disease==true) {
			help();	
		}
		System.out.println("Μετά την αποκάλυψη του Οδυσσέα στον Πολύφημο, ο Δίας, πατέρας του κύκλωπα, για να τιμωρήσει τον Οδυσσέα δημιουργεί τρικυμία που στέλνει το καράβι"
				+ "\nτου μακριά από την πατρίδα, στο νησί του Αιόλου. Εκεί αφού ξεκουράζονται, ο Αίολος προσφέρεται να κάνει ένα δώρο στον Οδυσσέα και τους συντρόφους του."
				+ "\nΟ Αίολος τους προσφέρει:\n1.Θησαυρό\n2.Φαγοπότι\n3.Μυστηριώδης Ασκός"
				+ "\nΤι επιλέγει ,άραγε, ο Οδυσσέας?\n\n");
		answer = Quiz.takeAnAnswer(3);
		if(answer==1) {
			System.out.println("Ο Οδυσσέας αποφασίζει τελικά να διαλέξει το χρυσάφι.Με αυτό  σκόπευε να ανταμείψει τους ναύτες όταν θα αποβιβάζονταν  στην Ιθάκη για να τους "
					+ "ευχαριστήσει για την εμπιστοσύνη που του έδειξαν στον μεγάλο αυτό αγώνα. Ωστόσο, φεύγοντας από το νησί το πλοίο βάρυνε απότομα με αποτέλεσμα οι νάυτες"
					+ "\nνα μην μπορούν να το κοντρολάρουν. Έτσι, η επιστροφή στην πατρίδα χάθηκε μέσα από τα χέρια τους για ακόμη μια φορά...\n\n");
			treasure=true;
		}else if(answer==2) {
			System.out.println("Ο Αίολος δωρίζει τελικά στους νάυτες, μετά από υπόδειξη του Οδυσσέα, φαγητό και ποτό για την επιστροφή. Ωστόσο,  παρέλειψε να τους ενημερώσει"
					+ " ότι η τροφή ήταν μαγεμένη και έτσι αφού την καταβρόχθισαν στην διαδρομή, οι άντρες έπεσαν σε λίθαργο και το καράβι παρασυρθηκε από τους ανέμους...\n\n");
		}else {
			System.out.println("“Όταν τα άστρα θα πάψουν να διαγράφουν τροχιές στον ουρανό, όταν τα πουλιά δεν θα πετούν πάνω απ’το πλοίο που σαλεύει, μόνο τότε θα ανοίξεις αυτό"
					+ "\nτον ασκό.” Αυτά ήταν τα λόγια του Αιόλου όταν παρέδιδε το ασκί στον Οδυσσέα...Για να μπορέσει να καταλάβει την πραγματική του χρησιμότητα, έπρεπε να"
					+ "\nκρατήσει τον ασκό μακριά από τα αδιάκριτα βλέμματα των ναυτών...\n\n");
					
			System.out.println("Οι ναύτες, ωστόσο, μη γνωρίζοντας το περιεχόμενο του ασκού μπαίνουν στον πειρασμό να τον ανοίξουν.\r\n"
					+ "\nΤι αποφασίζουν να κάνουν τελικά;\n1.Εμπιστεύονται τον Οδυσσέα και δεν ανοίγουν τον ασκό.\n2.Ανοίγουν τον ασκό νομίζοντας ότι κρύβει κάποιο θησαυρό.\n\n");
			answer = Quiz.takeAnAnswer(2);
			if(answer==1) {
				System.out.println("Οι ναύτες αποφασίζουν να δείξουν εμπιστοσύνη στον αρχηγό τους και έτσι δεν ανοίγουν τον μυστηριώδη ασκό, παρά την περιέργειά τους.\r\n"
						+ "Οι μέρες κυλούν λοιπόν αρμονικά ώσπου φτάνουν τελικά στην πολυαγαπημένη τους Ιθάκη.\n\n");
				end = true;
				ithaki();
			}else{
				System.out.println("Όσο ο Οδυσσέας ξεκουράζεται, οι άπληστοι ναύτες αποφασίζουν να ανοίξουν τον ασκό αναζητώντας το θησαυρό που υπέθεταν πως τους κρύβει ο "
					+ "\nήρωας. Πετάγονται τότε από τον ασκό οι θηριώδεις άνεμοι και παρασέρνουν το καράβι μίλια μακριά...\n\n");	
			}
		}
		if (end==false) {
			laistrigones();
		}
	}
	
	
	private static void laistrigones() {
		System.out.println("Επόμενη περιπέτεια του Οδυσσέα είναι η χώρα των Λαιστρυγόνων.Οι μυθικοί “κάτοικοι” του νησιού υποδέχονται τους ναύτες με άγριες διαθέσεις:"
				+ "Τεράστιες πέτρες πετάγονται στα πλοία, ενώ κάποιοι από τους συντρόφους αποτελούν το γεύμα των τεράτων...\n\n");
		System.out.println("Όσο οι νάυτες προσπαθούν να γλιτώσουν από την επίθεση των τεράτων, ένας τεράστιος βράχος εξφενδονίζεται προς το καράβι του Οδυσσέα!"
				+ "\nΘα προλάβουν οι ναύτες να αμυνθούν και να αποφύγουν την θανατηφόρα βολή?\nΟι ναύτες στρίβουν το πηδάλιο:\n1. προς τα δεξιά.\n2. προς τα αριστερά.\n\n"); 
		answer = Quiz.takeAnAnswer(2);
		if (answer== randValue.nextInt(2)+1) {
			System.out.println("Η γιγαντιαία πέτρα βρίσκει τελικά το στόχο της. Το πλήρωμα τραυτίζεται και οι επιζώντες πέφτουν στον νερό για να σωθούν. "
					+ "\nΩστόσο, η λιθοπομπή συνεχίζεται και μια από τις πέτρες πετυχαίνει τον Οδυσσέα με αποτέλεσμα να χάσει τη ζωή του...\n\n");
			end=true;
			death();
		}else {
			if(treasure==true) {
				System.out.println("Το πλοίο του Οδυσσέα μπορεί να γλίτωσε την πρόσκρουση με τον βράχο στιγμιαία, ωστόσο, ο θησαυρός είχε βαρύνει τόσο πολύ το πλοίο που"
						+ "\nοι ναύτες είχαν χάσει τον έλεγχο.Έτσι, η αναταραχή που προκαλούσε στο νερό η λιθοπομπή οδήγησε τελικά στη μοιραία προστριβή με ένα βράχο"
						+ "\nπου στοίχισε τη ζωή του ήρωα...");
				end=true;
				death();
			}else {
				toKirki();
			}
		}
	}

	
	private static void toKirki() {
		System.out.println("Ο Οδυσσέας και οι ναύτες του καταφέρνουν να γλιτώσουν και κατευθύνονται εν αγνοία τους προς έναν άλλο, ακόμη πιο τρομακτικό προορισμό, το νησί της Κίρκης.\r\n"
				+ "Όταν το πλοίο έχει πλέον ρίξει άγκυρα στη στεριά, οι πιο ατρόμητοι σύντροφοι στρέφονται σε αναζήτηση τροφής για το πλήρωμα. Για κακή τους τύχη έρχονται σε μια συνάντηση"
				+ "με τη μάγισσα Κίρκη που αφού τους δωροδοκεί με φαγοπότια, τους μετατρέπει σε ζώα.\r\nΗ ώρα περνά και οι ναύτες δεν έχουν εμφανιστεί.\r\n"
				+ "Ο Οδυσσέας πηγαίνει  να τους αναζητήσει, πέφτει όμως σε ένα λάκκο και του πέφτει το ξίφος .\r\n"
				+ "Βρίσκει το ξίφος τελικά, ή συνεχίζει χωρίς αυτό ?\n1.Βρίσκει το ξίφος.\n2.Δεν το εντοπίζει.\n\n");
		answer = Quiz.takeAnAnswer(2);
		if(answer==1 && kirki==false) {
			System.out.println("Αφού εντοπίζει το ξίφος του ο Οδυσσέας, ακολουθεί τα ίχνη των συντρόφων του και τους πετυχαίνει λίγο αργότερα, την ώρα που η Κίρκη τους μετατρέπει σε ζώα. "
					+ "\nΜε λεπτές κινήσεις την πλησιάζει χωρίς να τον δει και τη σημαδεύει με το ξίφος απειλώντας την να επαναφέρει τους συντρόφους του.Εκείνη τρομαγμένη αλλάζει τους ναύτες"
					+ "\nκαι τρέχουν να απομακρυνθούν από το σημείο αναζητώντας το πλοίο.\n\n");
					teiresias();
		}else if(answer==1 && kirki==true){
			System.out.println("\"Αφού εντοπίζει το ξίφος του ο Οδυσσέας, ακολουθεί τα ίχνη των συντρόφων του και τους πετυχαίνει λίγο αργότερα, την ώρα που η Κίρκη τους μετατρέπει σε ζώα. \r\n"
					+ "Με λεπτές κινήσεις την πλησιάζει κρυμμένος ανάμεσα στα πελώρια φυτά...Όταν, όμως, πετάγεται για να της επιτεθεί την κοιτά στα μάτια και αμέσως την ερωτεύεται παράφορα..."
					+ "\nΑφήνει κάτω, λοιπόν, το ξίφος του και παραδίνεται στα μάγια του λωτού...\n\n");
			System.out.println("Η Κίρκη, όντας και η ίδια ένα μαγικό πλάσμα, καταλαβαίνει αμέσως ότι η αντίδραση του άγνωστου νάυτη είναι αποτέλεσμα κάποιου ξορκιού.Έτσι, αποφασίζει να δώσει"
					+ "\nστον ίδιο τη δυνατότητα να διαλέξει αν θέλει πραγματικά να μείνει μαζί της ή να φύγει.Προσφέρεται, λοιπόν, να προβάλει μέσω ενός οράματος την πιο έντονή του ανάμνηση.\n\n"
					+ "Θα δεχτεί άραγε ο Οδυσσέας να εισχωρήσει η Κίρκη στις βαθύτερες σκέψεις του;\n1.Επιτρέπει στην Κίρκη να ανασύρει μνήμες.\n2.Δεν επιτρέπει στην Κίρκη να μπει στο μυαλό του.\n\n");
			answer = Quiz.takeAnAnswer(2);
					if(answer==1) {
						System.out.println("Ο Οδυσσέας, απορώντας με την πρόταση της μάγισσας, της επιτρέπει να διαβάσει το μυαλό του. Εκείνη προβάλλει τελικά τη στιγμή της γέννας του γιού του"
								+ "\nκαι αμέσως ο Οδυσσέας συνειδητοποιεί ότι στην πραγματικότητα δεν είναι ερωτευμένος μαζί της και τελικά αποφασίζει αφού ευχαριστήσει την Κίρκη να γυρίσει στην "
								+ "\nοικογένειά του.Εκείνη, εντυπωσιασμένη από την αφορίωσή του, αλλάζει ξανά τους νάυτες και τους αφήνει να φύγουν από το νησί\n\n");
						teiresias();
					}else {
						System.out.println("Ο Οδυσσέας, παρά την προθυμία της Κίρκης είναι πεπεισμένος ότι την αγαπάει βαθιά και δεν τον νοιάζει να μάθει το λόγο που προσφέρεται να του δείξει το"
								+ "\nπαρεθόν.Έτσι, αποφασίζει να μείνει μόνιμα μαζί της.");
						timer.cancel();
						backToMenu();
						end=true;
					}
		}else {
			System.out.println("Ο Οδυσσέας ανήμπορος να ετοπίσει το ξίφος και έχοντας καθυστερήσει κατευθύνεται προς τους συντρόφους του. Όταν φτάνει στο σημείο, όμως, το μόνο που"
					+ "\n βλέπει είναι ένα τραπέζι γεμάτο λαχταριστές τροφές. Πεινασμένος όπως ήταν, πέφτει με τα μούτρα στο φαϊ και βλέποντάς τον η Κίρκη, τον κινητοποιεί με ένα ξόρκι"
					+ " και τον σκοτώνει πριν προλάβει να αντισταθεί...\n\n");
			death();
		}
		
	}
	
	
	private static void death() {
		timer.cancel();
		System.out.println("Ο Οδυσσέας είναι πλέον νεκρός!Δυστυχώς δεν κατάφερε να ζήσει το 'HAPPY ENDING' των ιστοριών...\n\n");		
		backToMenu();
	}
	

		
		private static void ithaki() {
			timer.cancel();
			System.out.println("Όταν ο Οδυσσέας φτάνει στην Ιθάκη, μαθαίνει ότι η πολύχρονη απουσία του έχει αφήσει εκτεθειμένη την γυναίκα του,\n"
					+ "την Πηνελόπη, η οποία περιτριγυρίζεται από φιλόδοξους μνηστήρες.\n"
					+ "Η μόνη ελπίδα για να εισχωρήσει στο παλάτι και να σώσει την οικογένεια και τον θρόνο του είναι μια θεϊκή παρέμβαση."
					+ "\nΘα βοηθήσει η Αθηνά αυτή τη φορά τον Οδυσσέα, ή θα τον αφήσει στο έλεος της μοίρας?"
					+ "\n1. Θα δεχτεί θεϊκή βοήθεια.\n2. Η Αθηνά δεν θα μπορέσει να τον βοηθήσει.");
			answer = Quiz.takeAnAnswer(2);
			
	//έκβαση ανάλογα την απάντηση
			if (answer==1) {
				System.out.println("Η Αθηνά αποφασίζει να βοηθήσει τον Οδυσσέα για ακόμη μια φορά και έτσι, τον μεταμφιέζει σε ζητιάνο ώστε οι μνηστήρες να μην "
						+ "\nμπορέσουν να τον υποπτευθούν. Ωστόσο, σε μια επίσκεψή του στο παλάτι, η υπηρέτρια που καλείται να περιποιηθεί τον ξένο, αναγνωρίζει"
						+ "\nτο σημάδι που έχει στο πόδι του και ανακαλύπτει ότι έχει μπροστά της το χαμένο βασιλιά.\n\n"
						+ "Οργανώνονται, λοιπόν, αγώνες τοξοβολίας, στους οποίους παίρνει μέρος και ο ίδιος πετυχαίνοντας μια δοκιμασία που μόνο ο Οδυσσέας είχε "
						+ "\nκαταφέρει μέχρι τότε. Αμέσως, πετάει τα κουρέλια που φοράει και αποκαλύπτει ποιος είναι. Ξεκινάει ένα ανθρωποκυνηγητό με τον Οδυσσέα και"
						+ "\n το γιο του, Τηλέμαχο, να κυνηγάνε τους μνηστήρες και εκείνοι να τρέχου για τη ζωή τους.\n"
						+ "Τελικά, ο Οδυσσέας έχει πλέον καταφέρει μετά τα πολύχρονα βάσανά του να κερδίσει ξανά τη θέση του στο παλάτι και στην οικογένειά του.");
				backToMenu();
			} else {
				System.out.println("Χωρίς τη βοήθεια της Αθηνάς, ο Οδυσσέας αναγνωρίζεται αμέσως από τους μνηστήρες και ανήμπορος ως ήταν, χώρις όπλα για να πολεμήσει,"
						+ "\n θανατώνεται τελικά από τους φιλόδοξους κατακτητές του θρόνου του...\n");
				end=true;
				death();
			}
		}
		
		
		private static void teiresias() {
			System.out.println("Επόμενη στάση στο ατέλειωτο ταξίδι ειναι ο Άδης. Εκει συναντάει τον μάντη τειρεσία ο οποίος έχει ένα πολύ σημαντικό χρησμό για την εξέλιξη της ιστορίας.\n"
					+ " Για να πάρει το χρησμό πρέπει να απαντήσει σωστά σε ένα κουίζ:");
			if (q.questionPicker() == false) {
				System.out.println("Ο Οδυσσέας θα αναγκαστεί να συνεχίσει το ταξίδι του έχοντας χάσει αυτή τη σημαντική πληροφορία...");
			} else {
				System.out.println("\nΣαν θα βρεθείς στο νησί του Φωτός, μην αγγίξεις τα βόδια του ήλιου. Αν προβείς σε αυτή την ιεροσυλία θα έχεις υπογράψει την καταδίκη σου.\n"
						+ "Η Ιθάκη θα γίνει ακόμη πιο μακρινή για σένα και τους συντρόφους σου...\n\n");
			}
			
			seirines();
		}
		
		
		
		private static void seirines () {
			System.out.println("Μετά τον μάντη Τειρεσία, το καράβι του Οδυσσέα οδηγείται στις Σειρήνες.\n"
					+ "Εκεί ο Οδυσσέας πάνω στη λαχτάρα να ακούσει το μαγευτικό τραγούδι για το οποίο μιλούν οι ιστορίες, φτάνει στο  δίλημμα για το αν θα δεθεί ή όχι στο καταρτι.\n"
					+ "1. Θα δεθεί στο κατάρτι.\n2. Δεν θα δεθεί.");
			answer = Quiz.takeAnAnswer(2);
			
	//έκβαση ανάλογα την απάντηση
			if (answer == 1) {
				System.out.println("Αφού κλείνει τα αυτιά των συντρόφων του με κερί, ο Οδυσσέας δένεται στο κατάρτι.\n"
						+ "Όταν πλησιάζουν στις σειρήνες, ο ίδιος μαγεύεται και παρακαλά τους ναύτες να τον λύσουν.\n"
						+ "Εκείνοι, όμως, δε τον ακούνε και συνεχίζουν την πορεία τους αποφεύγοντας τα δολοφονικά τέρατα.");
				skylla();
			} else {
				System.out.println("Ο Οδυσσέας νομίζοντας ότι μπορεί να αντισταθεί στις σειρήνες, βουλώνει τα αυτιά των συντρόφων του\n"
						+ "με κερί και παραμένει να ακούει τις σειρήνες να τραγουδούν.\n"
						+ "Το μαγευτικό τους τραγούδι, όμως, τον παρασέρνει και πέφτει στη θάλασσα, όπου και πνίγεται...");
				end=true;
				death();
			}	
		}
		
		
		
		private static void skylla() {
			System.out.println("Σειρά έχουν η Σκύλλα και η Χάρυβδη, ένα εξακέφαλο τέρας και μια τεράστια ρουφήχτρα,\n"
					+ "τις οποίες επιδεικτικά καταφέρνουν να αποφύγουν.");
			if (disease) {
				timer.cancel();
				System.out.println("Όταν ο Οδυσσέας φτάνει στη σκύλλα, με μια αριστοτεχνική κίνηση, στοχέυει στο λαιμό και την τραυματίζει θανάσιμα.\n"
						+ "Στη συνέχεια παίρνει λίγο από το δηλητήριό της και γιατρεύει με αυτό την ασθένεια που του είχε δημιουργήσει ο λωτός στην πρώτη του περιπέτεια,\n"
						+ "τη χώρα των λωτοφάγων\n\n");
				
			}
			ilios();
		}
		
		
		private static void ilios () {
			System.out.println("Πλέον οι νάυτες πλέουν προοδευτικά προς το νησί του ήλιου. Εκεί οι σύντροφοι πεινασμένοι αναζητούν τροφή στα βόδια του θεού.\n"
					+ "Θα τραφούν τελικά, όμως με τα ιερά ζώα?\n"
					+ "1. Θα τραφούν με τα βόδια.\n2. Δεν θα αγγίξουν τα βόδια.");
			answer = Quiz.takeAnAnswer(2);
			int answer2= answer;
				if (answer2 == 1)
					{System.out.println("Οι σύντροφοι που πέθαιναν από την πείνα, τρέφονται τελικά από τα βόδια και έτσι, εκπληρώνεται η προφητεία του Τειρεσία,\n"
						+ "ότι τα βάσανα του ήρωα δεν τελειώνουν εκεί...\n\n"
						+ "Ο Δίας, ωστόσο, βλεποντας όλο αυτό το διάστημα τη δυστυχία του ήρωά μας αποφασίζει να του δώσει μια ευκαιρία να γυρίσει στην Ιθάκη.\n"
						+ "Του προτείνει να φτάσει άμεσα στην Ιθάκη με αντάλλαγμα να θυσιάσει ένα πολύ αγαπημένο του πρόσωπο. Τι θα κάνει άραγε ο Οδυσσέας;\n"
						+ "1. Θα δεχτεί την προσφορά του Δία.\n2. Δεν θα τη δεχτεί.");
					answer = Quiz.takeAnAnswer(2);
				if (answer == 1) {
					System.out.println("Ο Οδυσσέας, αποδέχεται τελικά την πρόταση του Δία και έτσι, αυτός τον στέλνει με ευνοϊκούς ανέμους στην Ιθάκη. Ωστόσο, λίγο πριν φτάσει εκεί, "
							+ "\nμαθαίνει από μια τυχαία συζήτηση αγνώστων, ότι ο αγαπημένος του γιος, ο Τηλέμαχος, είναι νεκρός από άγνωστη για τους κατοίκους του νησιού αιτία...\n\n");
					ithaki();
				} else {
					System.out.println("Ο Δίας για τον τιμωρήσει για την ασέβειά του και την άρνηση της πρότασής του, στέλνει καταιγίδα που τους σκοτώνει όλους."
							+ "\nΜόνο ο Οδυσσέας καταφέρνει να γλιτώσει τελικά.\n"
							+ "Kαταλήγει, λοιπόν, ναυαγός στο νησί της Καλυψώς που τον περιθάλπει, τον ερωτεύεται και τον κρατάει εκεί για 7 ολόκληρα χρόνια.");
					kalypso();
				}
			} else {
				System.out.println("Ο Οδυσσέας καταφέρνει να πείσει τους συντρόφους του να μη φάνε τα βόδια, και έτσι, η προφητεία του Τειρεσία εκπληρώνεται και γυρνάνε τελικά στην πατρίδα...");
				ithaki();
			}
		}
		
		
		private static void kalypso () {
			System.out.println("Εκεί ο Οδυσσέας θα ξεχάσει άραγε την πατρίδα και τη γυναίκα του ή θα θελήσει με την βοήθεια της Αθηνάς να επιστρέψει στα πολυαγαπημένα του πρόσωπα ?\n\n"
					+ "1. Θα ζητήσει τη βοήθεια της Αθηνάς\n2. Θα παραμείνει στο νησί και θα περάσει την υπόλοιπη ζωή του εκεί");
			answer = Quiz.takeAnAnswer(2);
			if (answer == 2) {
				System.out.println("Η καρτερικότητα και η αγάπη της Καλυψώς κατά την παραμονή του στο νησί, μάγεψε τελικά τον Οδυσσέα.\n"
						+ "Η πατρίδα και η οικογένειά του αποτελούσαν πλέον ένα πεθαμένο όνειρο για εκέινον, που αποφάσισε να περάσει την υπόλοιπη ζωή του με την κοπέλα που τον έσωσε.");
				backToMenu();
			} else {
				System.out.println("Η Αθηνά, βλέποντας τον Οδυσσέα επι 7 χρόνια να νοσταλγεί την πολυαγαπημένη του πατρίδα , πείθει την Καλυψώ να του επιτρέψει να πάρει τον δρόμο της επιστροφής."
						+ "\nΈτσι, ο ήρωας παίρνει για ακόμη μια φορά, με την βοήθεια των θεών, το δρόμο για την πολυπόθητη πατρίδα...\n\n");
				faiakes();
			}
		}
		
		
		
		
		
		private static void faiakes() {
			System.out.println("Στο δρόμο για την Ιθάκη, η μοίρα τον στέλνει στο νησί των Φαιάκων.Εκεί αφού οι κάτοικοι του νησιού τον φιλοξενούν, σε μια στιγμή αδυναμίας αποκαλύπτει ότι "
					+ "\nτην συμμετοχή του στον πόλεμο της Τροίας στο πλευρό των Αχαιών. Οι Φαίακες που εξυμνούσαν τους Αχαιούς, αποφασίζουν αμέσως να τον βοηθήσουν, αφού, όμως, πρώτα πειστούν"
					+ "\nότι ο Οδυσσέας τους λέει αλήθεια. Του κάνουν λοιπόν 3 ερωτήσεις για τον πόλεμο στην Τροία.");
			int counter = 0;
			
			for (int i=0;i<3;i++) {
				if(q.questionPicker()== true) {
				counter++;
				}
			}
			
			if (counter >= 2) {
				System.out.println("Οι φαίακες πείθονται για τη γενναιότητα και τη συμμετοχή του στον πόλεμο και παραχωρούν στον Οδυσσέα εφόδια και ένα πλοίο για να γυρίσει στην Ιθάκη...\n");
			} else {
				System.out.println("Οι φαίακες δεν πιστεύουν στην συμμετοχή του στον πόλεμο. Τον διώχνουν θυμωμένοι και δεν του δίνουν τον απαραίτητο εξοπλισμό για να επιστρέψει στην Ιθάκη. \r\n"
						+ "\r\n"
						+ "Περιπλανώμενος για καιρό με τη σχεδία του, φτάνει στο νησί των μουσών.  Εκεί οι μούσες τον φροντίζουν, του δίνουν φαγητό και βλέποντας πόσο πιστός είναι στους θεούς "
						+ "\nκαι ειδικά στην Αθηνά, τον βοηθούν με εξοπλισμό να φύγει και να σαλπάρει για την πολυαγαπημένη του Ιθάκη.\n\n");
			}
			
			ithaki();
		}
		
		
	

}




