import java.util.Scanner;

public class Hercules {
	private static Scanner in= new Scanner(System.in);
	private static String answer_given;
/*���� �� ��� ������� �������� �� ��������� �� �������� �������. 
 * ���� ��� ����� ��������� �� �������� �������������
 * a->a1->ak->ak0->ak9...
 */
	public static void main(String[] args) {
		System.out.println("� ���� ��� ����������...");
		answer_given=q1();
		answer_given=q2(answer_given);
		System.out.println("�������");
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
	 * � 1� �������: answer � �������� ��� �� ����� � �������. ������ ���� ���������� �� �� "answer_given"
	 */
	private static String q1() {
		String answer;
		System.out.println("����� ���� � ������� ��� ������; \n 1)����.\n 2)�����������.");
		answer = in.next();
		return answer;
	}

	private static String q2(String already_answered) {
		String answer = null;
		switch (already_answered){
		case "1":
			System.out.println("� ��� ������ ��� ��� ��� �� ��� ��� ���������;\n "
								+ "1)���\n "
								+ "2)���");
			answer = in.next();
			
			if (answer.equals ("1")) {
				System.out.println("1)� ��� ������� ����� ��� �� ��������� ��� ������.\n"
								 + "2)� ��� ���� � ���� �� �������� ��� ������.");
				answer += in.next();
			} else {
				System.out.println("� ������� ��� ����� ���� ��� ��� ����������� ��� ��������");
				answer += "2";
			}
				
		break;
		case "2":
			System.out.println("��� ������, ����� � ������� ��� ����� ���� ��� ����������� ��� ��������.");
			ordinaryPerson(); //� ������� �� ������ ��� ����������.
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
