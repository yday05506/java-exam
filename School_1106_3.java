//1106 ��ٿ�
import java.util.Scanner;
public class School_1106_3 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�б� : ");
		String str = scan.nextLine( );
		System.out.print("�г� : ");
		int grade = scan.nextInt( );
		System.out.print("�� : ");
		int cls = scan.nextInt( );
		System.out.print("�̸� : ");
		String b = scan.next( );
		System.out.println( );

		System.out.println(b + "��(��) " + str + "�б� " + grade + "�г� " + cls + "���Դϴ�.");
	}
}