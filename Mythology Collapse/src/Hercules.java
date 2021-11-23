import java.util.Scanner;

public class Hercules {
	private static Scanner in= new Scanner(System.in);
	private static String answer_given;
/*���� �� ��� ������� �������� �� ��������� �� �������� �������. 
 * ���� ��� ����� ��������� �� �������� �������������
 * a->a1->ak->ak0->ak9...
 */
	public static void main(String []args) {
		System.out.println("� ���� ��� ����������...");
		answer_given=q1();
		answer_given=q2(answer_given);
		System.out.println("�������");
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
	 * � 1� �������: answer � �������� ��� �� ����� � �������. ������ ���� ���������� �� �� "answer_given"
	 */
	private static String q1() {
		String answer;
		System.out.println("����� ���� � ������� ��� ������;\n "
							+ "1)����.\n "
							+ "2)�����������.");
		answer = in.next();
		return answer;
	}

	private static String q2(String already_answered) {
		String answer = null;
		switch (already_answered){
		
		case "1":
			System.out.println("� ��� ������ ��� ��� ��� �� ��� ��� ���������;\n "
								+ "1)���.\n "
								+ "2)���.");
			answer = in.next();
			
			if (answer.equals ("1")) {
				System.out.println("1)� ��� ������� ����� ��� �� ��������� ��� ������.\n"
								 + "2)� ��� ���� � ���� �� �������� ��� ������.");
				answer = in.next();
				if (answer.equals("1")) {
					return answer;
					
				} else if (answer.equals("2")) {
					System.out.println("1)� ��� ������� ��� ��� ��������� �� �������� ����� ���������.\n "
									 + "2)� ��� ������ ��� ����� ��� ��� � ������� ������.");
					answer = in.next();
					if (answer.equals("1")) {
						return answer;
						
					} else if (answer.equals("2")) {
						System.out.println("� ������� ������ ���� ����� ���� �������.");
						reset(0,'a');
					}
				}
				
				
			} else if (answer.equals ("2")){
				System.out.println("��� ������, ����� � ������� ��� ����� ���� ��� ����������� ��� ��������.");
				ordinaryPerson();
			}		
		break;
		
		case "2":
			System.out.println("� ������� �������� �� ������ ������");
			ordinaryPerson(); //� ������� �� ������ ��� ����������.
			answer =  "2";
		break;
		}
		return answer;
	}
	
	private static String q3(String already_answered) {
		String answer;
			System.out.println("����� ����� ������� � �������;\n "
				+"1)��� ������. \n "
				+"2)��� ������. \n ");
			answer = in.next();
			if(answer.equals("1")) {
				//	System.out.println("� ��� �������� �� ������� ��� �������� ��� ������ ��� �� �������� �� ������� ��� ��� �� ������ ���.");
					return answer;
			} else if (answer.equals("2")){
					System.out.println("� ������� �������� �� ������ �������� ��� ����� ������ �� ��� ������� ����� �� ������ �����. ������ ���� � ��� �������� �� ������� ��� ������� ��� ������ ��������� ��� �� �������� �� ������� ��� ��� �� ���� ������ ���.");
		 	        System.out.println("��� �������� � ������� ��� ��� ���;\n "
					+ "1)������ �� �������� �� �������� ��� ��� ��������� ��� ��� ����� �� ���������� ��� ����. \n "
					+ "2)�������� �� ��� ������� ��� ���. \n ");
			        answer = in.next();
			        if(answer.equals("1")) {
			        	return answer;
			        } else if (answer.equals("2")){
			        	System.out.println("������ �� ������ ������.");
			        	reset(1,'2');
			        	return answer;
			        }
			}
			return "problem";
	}
	
	private static String q4(String already_answered) {
		String answer;
			System.out.println("��� ������ � ������� ���� ��������������� �� �����;\n" 
						+"1)���� ��� ������� ��� ������ ��� �� ����� ��� �������� �� �����������. \n"
			            +"2)����������� ��� ��� ����� ���. \n" );
			answer = in.next();
			if(answer.equals("1")) {
				System.out.println("������� �� ������.");
				return answer;
			} else if (answer.equals("2")) {
				System.out.println("������ ����������� ��� ��� ����� ��� ��� ������ ����� ���� �������.");
				reset(1,'1');
				return answer;
			}
			return "problem";
			
	}
	private static String q5(String already_answered) {
		String answer;
		int k=0;
		// System.out.println("������� ������� �� ��� ������� ����.");
		while (k == 0) {
		System.out.println("�� ����� ����� ���������� �� ������� ��� ������� ����;"
				+ "1)����� ����� �� ������, ����� ���������� ��� ��� ������"
				+ "2)���������� �� �������� ��� ������ ��� �������� �����."
				+ "3)��� ���������� ��� ����� ������ �� �������");
		answer = in.next();
		if(answer.equals("1")) {
			k=1;
			return answer;
		} else if (answer.equals("2")) {
			System.out.println("�� ��������, ���� � ������� ���� ��� ������ ��� ���� �������� �� �������� ��� ������.);");
			k=1;
			reset(5,'1');
		} else if (answer.equals("3")) {
			System.out.println("�� ����� ����; \n"
					+ "1)��������� �� ������ ��� ���������� �� ��������������. \n"
					+ "2)�������� �� ������ ����� ��� ������ ��� ��������. ");
			answer = in.next();
			if(answer.equals("1")) {
				k=0;	
			} else if (answer.equals("2")) {
				System.out.println("� ��������� ��� ���������� ����� ����� ���� ������ ���.");
				System.out.println("��� ������ � ������� ���� ��� ����� ��� ����������;\n"
						+ "1)������ ���� ���� ������� ���� ��� �� ��� �������������. \n"
						+ "2)����������� ��� ��� ����� ���.\n");
				answer = in.next();
				if(answer.equals("1")) {
					k=0;
				} else {
					System.out.println("����������� ��� ��� ����� ���.");
					reset(0,'2');
				}
					
			}
		}
		}
		return "problem";
	}
	
	private static void ordinaryPerson() {
		System.out.println("\n\n\n�������");
	}
	
	private static void reset(int checkpoint, char answergiven) {
		System.out.println("\n\n\n�������");
	}
}
