//1106 ��ٿ�
import java.util.Scanner;
public class tri_no_1106 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���. >> ");
		int a = sc.nextInt( );

		for (int i = 0; i <= a; i++) {
			for (int j = 1; j <= 1-i; j++) 
				System.out.print("*");
		System.out.println( );
		}
	}
}