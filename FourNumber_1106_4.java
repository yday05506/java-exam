//1106 ��ٿ�
import java.util.Scanner;
public class FourNumber_1106_4 {
	public static void main( String args [ ] ) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		int a = scan.nextInt( );
		System.out.println( );

		System.out.println("1000�� �ڸ� = " + (a / 1000));
		System.out.println("100�� �ڸ� = " + (a / 100 % 10));
		System.out.println("10�� �ڸ� = " + (a / 10 % 10));
		System.out.println("1�� �ڸ� = " + (a % 10));
	}
}