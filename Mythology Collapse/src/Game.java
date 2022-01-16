public class Game {
	private static Quiz q = new Quiz();
	public Game() {
		System.out.println("Γεια σου παίκτη \n"
				+ "Καλώς όρισε στο Mythology Collapse. To Mythology Collapse \n"
				+ "είναι ένα παιχνίδι επιλογών. Καλείστε να διαβάσετε μία ιστορία \n"
				+ "και να κάνετε επιλογές αλλάζοντας έτσι τη ροή των γεγονότων. \n"
				+ "Για να ξεκινήσετε επιλέξτε έναν παίκτη ");
		int choice;
		do {
			System.out.println("Πάτα: \n"
					+ "1) Για να πάρεις τον παίκτη Ηρακλή \n"
					+ "2) Για να πάρεις τον παίκτη Οδυσσέα \n"
					+ "3) Για να πάρεις τον παίκτη Περσέα \n"
					+ "4) Για να διακόψεις το παιχνίδι ");
			choice = q.takeAnAnswer(4);
			if(choice == 1 ) {
				new Hercules();
			} else if(choice == 2 ) {
				new Odysseus();
			}else if(choice == 3 ){
				new Perseas();
			}
		}while(choice != 4);
	}
}
