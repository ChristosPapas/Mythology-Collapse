package odyssey;
import java.util.*;

public class Odyssey {
static int answer;
static int answer2;
static Scanner input = new Scanner (System.in);
	
	public static void ithaki() {
		System.out.println("���� � �������� ������ ���� �����, �������� ��� � ��������� ������� ��� ���� ������ ����������� ��� ������� ���,\n"
				+ "��� ��������, � ����� ���������������� ��� ���������� ���������.\n"
				+ "� ���� ������ ��� �� ���������� ��� ������ ��� �� ����� ��� ���������� ��� ��� ����� ��� ����� ��� ����� ���������. �� �������� � ����� ���� �� ���� ��� �������, � �� ��� ������ ��� ����� ��� ������?\n\n"
				+ "1: � ����� �� ��� �������� � 2: � ����� ��� �� ��� ��������. (������������� ��� ������ ��� ���������)");
		answer = input.nextInt();
		checkAnswer(2);
		
//������ ������� ��� ��������
		if (answer==1) {
			System.out.println("� ����� ���������� �� �������� ��� ������� ��� ����� ��� ���� ��� ����, ��� ����������� �� ������� ���� �� ��������� �� ��� ��������� �� ��� �����������.\n"
					+ "������, �� ��� �������� ��� ��� ������, � ��������� ��� �������� �� ����������� ��� ����, ����������� �� ������ ��� ���� ��� ���� ��� ��� ����������� ��� ���� ������� ���\n"
					+ "�� ������ �������.\n\n"
					+ "������������, ������, ������ ����������, ����� ������� ������� ����� ��� � ����� ������������� ��� ��������� ��� ���� � �������� ���� ��������� ����� ����.\n"
					+ "������, ������ �� �������� ��� ������ ��� ����������� ����� �����. �������� ��� ��������������� �� ��� ������� ��� �� ��� ���, ��������, �� �������� ���� ��������� ��� ������� �� ������ ��� �� ��� ����.\n"
					+ "������, � �������� ���� ����� ���� �� ��������� ������ ��� �� �������� ���� �� ���� ��� ��� ������ ��� ���� ���������� ���.");
		} else {
			System.out.println("����� �� ������� ��� ������, � �������� ������������� ������ ��� ���� ��������� ��� ��������� �� ����, ����� ���� ��� �� ��������� ����������� ������ ��� ���� ���������� ���������� ��� ������ ���...");
			death();
		}
	}
	
	
	
	public static void seirines () {
		System.out.println("���� �� ������ ��� ����� ��������, �� ������ ��� ������� ��������� ���� ��������.\n"
				+ "���� � �������� ���� ��� ������� �� ������� �� �������� ��� �������� ������ ���  ������� ��� �� �� �� ����� � ��� ��� �������.\n\n"
				+ "1: �� ����� ��� ������� � 2: ��� �� ����� ��� ������� (������������� ��� ������ ��� ����������� ���������.)");
		answer = input.nextInt();
		checkAnswer(2);
		
//������ ������� ��� ��������
		if (answer == 1) {
			System.out.println("���� ������� �� ����� ��� ��������� ��� �� ����, � �������� ������� ��� �������.\n"
					+ "���� ���������� ���� ��������, � ����� ��������� ��� �������� ���� ������ �� ��� ������. �������, ����, �� ��� ������ ��� ���������� ��� ������ ���� ������������ �� ���������� ������.");
			skyla(illness);
		} else {
			System.out.println("� �������� ���������� ��� ������ �� ���������� ���� ��������, �������� �� ����� ��� ��������� ��� �� ���� ��� ��������� �� ������ ��� �������� �� ����������.\n"
					+ "�� ��������� ���� ��������, ����, ��� ���������� ��� ������ ��� �������, ���� ��� ��������...");
			death();
		}	
	}
	
	
	
	public static void skyla (boolean illness) {
		System.out.println("����� ����� � ������ ��� � �������, ��� ��������� ����� ��� ��� �������� ���������,\n"
				+ "��� ������ ����������� ����������� �� ���������.");
		if (illness) {
			System.out.println("� �������� �������� �� �������� ��� ��������� ���");
			timer.cancel();
		}
		ilios();
	}
	
	
	public static void ilios () {
		System.out.println("����� ����������� ���� �� ���� ��� �����. ���� �� ��������� ����������� ��������� ����� ��� ����� ��� ����.\n"
				+ "�� ������� ������, ���� �� �� ���� ���? ��� �� ��� ��� �� ��������� � ��������� ��� ��������?\n\n"
				+ "1: �� ������� �� �� ����� � 2: ��� �� ������� �� �� �����; (������������� ��� ��������)");
		answer = input.nextInt();
		checkAnswer(2);
		

		if (answer == 1) {
			System.out.println("�� ��������� ��� �������� ��� ��� �����, ��������� ������ ��� �� �����.\n\n"
					+ "� ���� ��������� ��� ���� �� �������� �� �������� ��� ���� ��� ���������� �� ��� ����� ��� �������� �� ������� ���� �����.\n"
					+ "��� ��������� �� ������ ����� ���� ����� �� ���������� ��� ���� ��������� ��� �������. �� �� ����� ����� � ��������;\n\n"
					+ "1: �� ������ ��� �������� ��� ��� � 2: ��� �� ������ ��� �������� ��� ��� (������������� ��� ��������� ��������)");
			answer2 = input.nextInt();
			checkAnswer(2);
			if (answer2 == 1) {
				System.out.println("� ���� ��� ������� �� ��������� ������� ���� ����� ���� ��������� ���� �������������� ��� � ���������� ��� ���� � ��������� ����� ������");
				ithaki();
			} else {
				System.out.println("� ���� ��� ���� ��������� ��� ��� ������� ���� ������� ��������� ��� ���� �������� ����� ���� ��� ��� �������.\n"
						+ "������� ��������� ������� ��� ���� ��� ������� ��� ��� ����������, ��� ���������� ��� ��� ������� ���� ��� 7 �������� ������.");
				kalipso();
			}
		} else {
			System.out.println("� �������� ��������� �� ������ ���� ���������� ��� �� �� ���� �� ����� ��� ���� � ��������� ��� �������� ������������ ��� ������� ������ ���� ������� ");
			ithaki();
		}
	}
	
	
	public static void kalipso () {
		System.out.println("���� � �������� �� ������� ����� ��� ������� ��� �� ������� ��� � �� ������� �� ��� ������� ��� ������ �� ���������� ��� ������������� ��� ������� ?\n\n"
				+ "1: �� ������� �� ������� ��� ������ � 2: ��� �� ������� �� ������� ��� ������. (������������� ��� ������ ��� ���������� ���������)");
		answer = input.nextInt();
		checkAnswer(2);
		if (answer == 2) {
			System.out.println("� ������������� ��� � ����� ��� ������� ���� ��� �������� ��� ��� ����, ������ ������ ��� �������.\n"
					+ "� ������� ��� � ���������� ��� ����������� ����� ��� �������� ������ ��� �� ������� ��� ��������� �� ������� ��� �������� ��� ��� �� ��� ������ ��� ��� �����.");
			
		} else {
			System.out.println("� �����, ��������� ��� ������� ��� 7 ������ �� ��������� ��� ������������� ��� ������� , ������ ��� ������ �� ��� ��������� �� ����� ��� ����� ��� ����������.");
			faiakes();
		}
	}
	
	
	public static void teiresias() {
		System.out.println("������� ����� ��� ��������� ������ ����� � ����. ���� ��������� ��� ����� �������� � ������ ���� ��� ���� ��������� ������ ��� ��� ������� ��� ��������. ��� �� ������ �� ���� �� ����� ��� ���� �����, �� ����� �� ���������� ���� �����.  ��� �� ����� �� ������ ������ �� ��������� ����� �� ��� �����.");
		Random rand = new Random();
		int rand1 = rand.nextInt(20); //from 0 to 19
		
		do {
			if(Quiz.availableQuestions[rand1] == false) {
				rand1 = rand.nextInt(20);
			}
		} while (Quiz.availableQuestions[rand1] == false);
		
		Quiz.availableQuestions[rand1] = false;
		
		if (Quiz.questionPicker(rand1+1) == false) {
			System.out.println("� �������� �� ���������� �� ��������� �� ������ ��� ������� ����� ���� �� ��������� ����������");
		}
		
		seirines();
	}
	
	
	public static void faiakes() {
		System.out.println("��� ����� ��� ��� �����, � ����� ��� ������� ��� ���� ��� �������, ���� ��� ����������� ��� �������� ���� ����� ���� �� ���� �������.  �� ������� ��� ���������� ���� ������� �������� �� ��� ���������, ���� ������ �� �������� ��� � �������� ���� ���� �������. ��� ������ ������ 3 ��������� ��� ��� ������ ���� �����.");
		int counter = 0;
		Random rand = new Random();
		int rand1;
		
		for (int i=0;i<3;i++) {
			rand1 = rand.nextInt(20);
			do {
				if(Quiz.availableQuestions[rand1] == false) {
					rand1 = rand.nextInt(20);
				}
			} while (Quiz.availableQuestions[rand1] == false);
			Quiz.availableQuestions[rand1] = false;
			if (Quiz.questionPicker(rand1+1)) {
				counter++;
			}
		}
		
		if (counter >= 2) {
			System.out.println("�� ������� ��������� ��� �� ����������� ��� �� ��������� ��� ���� ������ ��� ���������� ���� ������� ������ ��� ��� ����� ��� �� ������� ���� �����. ");
		} else {
			System.out.println("�� ������� ��� ��������� ���� ��������� ��� ����������. ��� �������� ��������� ��� ��� ��� ������ ���������, ����� �� ���������� ���� �����. \r\n"
					+ "\r\n"
					+ "�������������� ��� ����� �� �� ������ ��� ������ ��� ���� ��� ������.  ���� �� ������ ��� ����������, ��� ������ ������ ��� ��������� ���� ������ ����� ����� ����� ��� ������ ���� ����� ��� ������� �� ��������� �� ����� ��� �� �������� ��� ��� ������������� �����.");
		}
		
		ithaki();
	}
	
	
	
	
	

	
	
	
	
	
	
	
	public static void checkAnswer(int noOfAnswers) {
		do {
			if (answer > noOfAnswers) {
				System.out.println("����� ��������. �������� �������� ����");
				answer = input.nextInt();
			}	
		} while (answer > noOfAnswers);
			
	}
}
