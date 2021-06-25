//1106 양다연
import java.util.Scanner;
public class multiple_1106 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 1;

		System.out.print("구할 배수 : ");
		int a = sc.nextInt( );
		System.out.print("마지막 값 : ");
		int b = sc.nextInt( );
		System.out.println("================================");

		System.out.println("1 ~ " + b +"까지의 " + a + "의 배수 : ");
		if ( i % a == 0 ) System.out.println( i );
		System.out.println("1 ~ " + b +"까지의 " + a + "의 배수의 갯수 : ");
		System.out.println("1 ~ " + b +"까지의 " + a + "의 배수의 합 : ");
			sum *= i;
			if ( i % a == 0) System.out.print(sum);
		System.out.println("================================");
	}
}