//1106 ��ٿ�
import java.util.Scanner;
public class multiple_1106 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 1;

		System.out.print("���� ��� : ");
		int a = sc.nextInt( );
		System.out.print("������ �� : ");
		int b = sc.nextInt( );
		System.out.println("================================");

		System.out.println("1 ~ " + b +"������ " + a + "�� ��� : ");
		if ( i % a == 0 ) System.out.println( i );
		System.out.println("1 ~ " + b +"������ " + a + "�� ����� ���� : ");
		System.out.println("1 ~ " + b +"������ " + a + "�� ����� �� : ");
			sum *= i;
			if ( i % a == 0) System.out.print(sum);
		System.out.println("================================");
	}
}