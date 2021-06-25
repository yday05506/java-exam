//1106 ¾ç´Ù¿¬
import java.util.Scanner;
public class star_1106 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.print("input N -> ");
		int n = sc.nextInt( );

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
				System.out.print( (char)('A'*i-1) );
		System.out.println( );
		}
	}
}