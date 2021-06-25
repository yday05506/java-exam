//1106 양다연
import java.util.Scanner;
public class tri_no_1106 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행을 입력하세요. >> ");
		int a = sc.nextInt( );

		for (int i = 0; i <= a; i++) {
			for (int j = 1; j <= 1-i; j++) 
				System.out.print("*");
		System.out.println( );
		}
	}
}