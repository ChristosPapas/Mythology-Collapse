public class Game {
	private static Quiz q = new Quiz();
	public Game() {
		System.out.println("���� ��� ������ \n"
				+ "����� ����� ��� Mythology Collapse. To Mythology Collapse \n"
				+ "����� ��� �������� ��������. �������� �� ��������� ��� ������� \n"
				+ "��� �� ������ �������� ���������� ���� �� ��� ��� ���������. \n"
				+ "��� �� ���������� �������� ���� ������ ");
		int choice;
		do {
			System.out.println("����: \n"
					+ "1) ��� �� ������ ��� ������ ������ \n"
					+ "2) ��� �� ������ ��� ������ ������� \n"
					+ "3) ��� �� ������ ��� ������ ������ \n"
					+ "4) ��� �� ��������� �� �������� ");
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
