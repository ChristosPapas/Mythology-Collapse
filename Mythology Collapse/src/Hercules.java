import java.util.Scanner;

public class Hercules {
	private static Scanner in= new Scanner(System.in);
/*���� �� ��� ������� �������� �� ��������� �� �������� �������. 
 * ���� ��� ����� ��������� �� �������� �������������
 * a->a1->ak->ak0->ak9...
 */
	public static void main(String[] args) {
		System.out.println("� ���� ��� ����������...");
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
	}
	private static int q1() {
		System.out.printf("����� ���� � ������� ��� ������; \n 1)����.\n 2)�����������.");
		return in.nextInt();
	}
	private static void reset(int checkpoint, char answergiven) {
		
	}
}
