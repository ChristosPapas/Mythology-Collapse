package odyssey;
import java.util.Scanner;

public class Quiz {
	static int answer;
	static Scanner in = new Scanner (System.in);
	static boolean [] availableQuestions = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
	
	public static boolean questionPicker (int questionNo) {
		boolean returnVariable;
		switch (questionNo) {
			case 1:
				returnVariable = question1();
				break;
			case 2:
				returnVariable = question2();
				break;
			case 3:
				returnVariable = question3();
				break;
			case 4:
				returnVariable = question4();
				break;
			case 5:
				returnVariable = question5();
				break;
			case 6:
				returnVariable = question6();
				break;
			case 7:
				returnVariable = question7();
				break;
			case 8:
				returnVariable = question8();
				break;
			case 9:
				returnVariable = question9();
				break;
			case 10:
				returnVariable = question10();
				break;
			case 11:
				returnVariable = question11();
				break;
			case 12:
				returnVariable = question12();
				break;
			case 13:
				returnVariable = question13();
				break;
			case 14:
				returnVariable = question14();
				break;
			case 15:
				returnVariable = question15();
				break;
			case 16:
				returnVariable = question16();
				break;
			case 17:
				returnVariable = question17();
				break;
			case 18:
				returnVariable = question18();
				break;
			case 19:
				returnVariable = question19();
				break;
			default:
				returnVariable = question20();
				break;
		}
		return returnVariable;
	}
	
	
	
	
	public static boolean question1() {
		System.out.println("�� �������� �� �� ����� �������� �����;");
		System.out.println("1. ������ ����������");
		System.out.println("2. ������� �����");
		System.out.println("3. ����� ������");
		System.out.println("4. �������� ����");
		answer = in.nextInt();
		if (answer == 1) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question2() {
		System.out.println("����� ���� �� ������ ��� �������;");
		System.out.println("1. � ������ ��� � ������");
		System.out.println("2. � ���� ��� � ������");
		System.out.println("3. � ���� ��� � �������");
		System.out.println("4. � ������ ��� � ������");
		answer = in.nextInt();
		if (answer == 1) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question3() {
		System.out.println("����� ����������� ��� �������� ��� �������;");
		System.out.println("1. � ���� ����");
		System.out.println("2. � ���� ��������");
		System.out.println("3. � ��������� ��� ������");
		System.out.println("4. � ��� �����");
		answer = in.nextInt();
		if (answer == 2) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question4() {
		System.out.println("�� ����� �� �����;");
		System.out.println("1. � ���� ��� ������");
		System.out.println("2. � �����");
		System.out.println("3. � ������� �������");
		System.out.println("4. �� ������ ��� ��������� ��� ������ ������");
		answer = in.nextInt();
		if (answer == 1) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		
		}
	}
	
	public static boolean question5() {
		System.out.println("�� �������� �� �� ����� ���� ��� ������;");
		System.out.println("1. ����� ��� �������");
		System.out.println("2. ������� ������");
		System.out.println("3. ����� ���� �����");
		System.out.println("4. �������� ����");
		answer = in.nextInt();
		if (answer == 1) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		
		}
	}
	
	public static boolean question6() {
		System.out.println("����� ���� ���� � �������� �����;");
		System.out.println("1. ��� ����-�������");
		System.out.println("2. ��� ����������");
		System.out.println("3. ��� �������");
		System.out.println("4. ��� ��������");
		answer = in.nextInt();
		if (answer == 3) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		
		}
	}
	
	public static boolean question7() {
		System.out.println("����� ������ ����� ������ ����� ������� ��� �� �������� ��� ����� �� ���� ������;");
		System.out.println("1. � ������");
		System.out.println("2. � ������");
		System.out.println("3. � ���������");
		System.out.println("4. � �����");
		answer = in.nextInt();
		if (answer == 4) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		
		}
	}
	
	public static boolean question8() {
		System.out.println("����� ������� ��� ������;");
		System.out.println("1. � �����������");
		System.out.println("2. � �������");
		System.out.println("3. � ��������");
		System.out.println("4. � ��������");
		answer = in.nextInt();
		if (answer == 3) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		
		}
	}
	
	public static boolean question9() {
		System.out.println("���� ���� � ����� �������, ��� ����� ������ ��� ��� ������ ������;");
		System.out.println("1. � ���������, ������� ��� ������");
		System.out.println("2. � ��������, ���� ��� ����� �����");
		System.out.println("3. � ���������, ���� ��� ������� ����������");
		System.out.println("4. � �����, ������� ��� ������� ��������");
		answer = in.nextInt();
		if (answer == 4) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question10() {
		System.out.println("��� ��������� � ��������;");
		System.out.println("1. ��������� ��� ������� ���� �����");
		System.out.println("2. ��������� ��� ����������� ����� ��� ����� ������ ���");
		System.out.println("3. ��� ������� ��� �������� ����� �������� ��� ��� ��� ���������");
		System.out.println("4. ��������������� ��� ��� ��� ���");
		answer = in.nextInt();
		if (answer == 2) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question11() {
		System.out.println("����� � �������� ���������� ��� ����� ��� ��� ����� �� �������� ��� ������ ����� ��� ����������;");
		System.out.println("1. �������� ��� ��� ���� ����� � �������, ������ �� ����� ��� ������ ���� ��������");
		System.out.println("2. ������ �� ��� ����������, ����� ��� ��������� ��� ����� ��� ���� ������ ��� ��������");
		System.out.println("3. ������, ������ � ����������� ��� ���� �� ������ ��������.");
		System.out.println("4. ������, ������ � ����������� ��� ��� ����� �� ����� ����� ������� ��� ������");
		answer = in.nextInt();
		if (answer == 3) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question12() {
		System.out.println("�� ����� � ��������, ���� � ��������� ��� ������ �� ��������� ������� ��� ���� ���;");
		System.out.println("1. ��� �������, ������ ������� ����� ��� ������������ �� ����� ��� ��� ���������");
		System.out.println("2. �������. ��� ����� ��� �������� ���, ��� ��� ���� �� ��������� ���� ����� ��� �� �������� ���� ���� ����");
		System.out.println("3. ��� �������, ������ ���� �������� �� ��� ��������� �� ������� �����");
		System.out.println("4. �������. ��� ����� ��� �������� ���, ��� ��� ���� �� ������ ���� ����� ��� �� ���������� ��� ������ ��� �� ������� ����");
		answer = in.nextInt();
		if (answer == 4) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question13() {
		System.out.println("����� ������� ��� �������;");
		System.out.println("1. � ���������");
		System.out.println("2. � �����");
		System.out.println("3. � �������");
		System.out.println("4. � �����������");
		answer = in.nextInt();
		if (answer == 2) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question14() {
		System.out.println("����� ������� ������� ������ ��� ��� ������ ������ ��� ��� ��� ����������� ��� �������;");
		System.out.println("1. � ��������");
		System.out.println("2. � ���������");
		System.out.println("3. � �������");
		System.out.println("4. � ������");
		answer = in.nextInt();
		if (answer == 4) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question15() {
		System.out.println("�� ����� � ��������, ���� � ������� ��� ������ �� ���� ��� ������ ������;");
		System.out.println("1. ��������� ��� ������� ��� ������");
		System.out.println("2. ����������� ��� ��� �� �����, ���� ����� ������� �� �� ������� ��� �� �� ���������");
		System.out.println("3. ��� �� �����, ������ �������� ����� �������� �� ���� �� ��� �������� ��� �������� ��� �������");
		System.out.println("4. ��� ������� ��� ������ ��� ������ ���������");
		answer = in.nextInt();
		if (answer == 2) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question16() {
		System.out.println("���������� ������ � ��������� ���� ������;");
		System.out.println("1. ���, ��� ��� ��� ������ � ��� ������� ���� ��� ��������� ��� ��� ���� ��� ����� ��� ���� ��� ��� �����");
		System.out.println("2. ���, � ��������� ��� ������� �� ���������");
		System.out.println("3. ���, � ������ ��� ���������� ��� ��� ����� �� ���� ���� ������ ��� �� ���������");
		System.out.println("4. ���, � ��������� ���������� ��� ��� ������ ��� �� ���� ��� ��������");
		answer = in.nextInt();
		if (answer == 1) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question17() {
		System.out.println("����� ������� ��� ��������;");
		System.out.println("1. � �����");
		System.out.println("2. � ���� ���������");
		System.out.println("3. � �������");
		System.out.println("4. � �������");
		answer = in.nextInt();
		if (answer == 4) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question18() {
		System.out.println("����� ���� ��� ���� ����������� ������ ���� �������;");
		System.out.println("1. � ��������, � ��������� ��� � ����");
		System.out.println("2. � ���, � ����� ��� � ����������");
		answer = in.nextInt();
		if (answer == 2) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question19() {
		System.out.println("����� �� ����� ��� ������ ������ �������� ���� ������ ��� ��� ���������� ��� ��� ����������;");
		System.out.println("1. � ���� ���� �������� ���� ������� �� ��������, ����� ��� ����� �� ���������� �� ������ �� ���� �����");
		System.out.println("2. � ��� �������� �������� ���� ������� �� ��������, ����� ����� �� ����������� ���� �����");
		System.out.println("3. � ��� ������� �������� ���� ������� �� ��������, ����� � ����������� ���� �������� �� ���� ����� ���");
		System.out.println("4. �� ���������� ��� ������ ��� ��������� �� ����������� ����� �� ���� � ������� ��� �����������");
		
		answer = in.nextInt();
		if (answer == 3) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	public static boolean question20() {
		System.out.println("�� ����������� ���� �� ������ ��� �������;");
		System.out.println("1. ����������� ���������");
		System.out.println("2. ����������� �� �������� ��� ����� (����, ������� ���)");
		System.out.println("3. ����������� ��� ������� ��� ������ ���� ��� ��� ������");
		System.out.println("4. �� ���������� ��� ������ ��� ��������� �� ����������� ����� �� ���� � ������� ��� �����������");
		
		answer = in.nextInt();
		if (answer == 3) {
			System.out.println("����� ��������!");
			return true;
		} else {
			System.out.println("������� ����� ��������");
			return false;
		}
	}
	
	
}
