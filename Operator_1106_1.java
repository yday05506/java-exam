//1106 ¾ç´Ù¿¬
import java.util.Scanner;
public class Operator_1106_1 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		System.out.print("X : ");
		int x = scan.nextInt( );
		System.out.print("Y : ");
		int y = scan.nextInt( );
		System.out.println( );

		System.out.println("ÇÕ = " + ( x + y ) + " Â÷ = " + (x > y ? x - y : y - x) + " °ö = " + (x * y) + " ¸ò = " + (x > y ? x / y : y / x));
	}
}