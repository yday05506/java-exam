//1106 양다연
import java.util.Scanner;
public class tri_no {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행을 입력하세요. >> ");
		int row=sc.nextInt( );

		for( int i=row; i >=0; i--) {
			for (int j=i; j >= 0; j--)
				System.out.print(j*i + " ");
			System.out.println( );
		}
	}
}