//1106 ��ٿ�
import java.util.Scanner;
public class Deposit_1106_2 {
	public static void main( String args [ ] ) {
		Scanner scan = new Scanner(System.in);
		final int a = 12;
		
		System.out.print("����(��) : ");
		int won = scan.nextInt( );
		System.out.print("���ݱⰣ(��) : ");
		int year = scan.nextInt( );
		System.out.println( );
		
		int b = won * a * year;
		System.out.println("���� = " + b / 1000 + " �����հ� = " + (b / 1000 + won));
	}
}