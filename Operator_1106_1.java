//1106 ��ٿ�
import java.util.Scanner;
public class Operator_1106_1 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		System.out.print("X : ");
		int x = scan.nextInt( );
		System.out.print("Y : ");
		int y = scan.nextInt( );
		System.out.println( );

		System.out.println("�� = " + ( x + y ) + " �� = " + (x > y ? x - y : y - x) + " �� = " + (x * y) + " �� = " + (x > y ? x / y : y / x));
	}
}