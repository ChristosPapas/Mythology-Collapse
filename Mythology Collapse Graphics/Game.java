package MythologyCollapse;

public class Game {
	public static void main (String [] args) {
		ShowMessage test=new ShowMessage();
		int option=test.getOption();
		Graphics panel=new Graphics();
		if(option == 1) {
			new Perseas(panel);
		}else if( option==2){
			new  Odysseus(panel);
		}else if (option == 3 ) {
			new Hercules(panel);
		}
	}
}
