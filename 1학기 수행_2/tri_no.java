//1106 ��ٿ�
import java.util.Scanner;
public class tri_no {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���. >> ");
		int row=sc.nextInt( );

		for( int i=row; i >=0; i--) {
			for (int j=i; j >= 0; j--)
				System.out.print(j*i + " ");
			System.out.println( );
		}
	}
}