//1106 양다연
import java.util.Scanner;
public class Deposit_1106_2 {
	public static void main( String args [ ] ) {
		Scanner scan = new Scanner(System.in);
		final int a = 12;
		
		System.out.print("원금(원) : ");
		int won = scan.nextInt( );
		System.out.print("예금기간(년) : ");
		int year = scan.nextInt( );
		System.out.println( );
		
		int b = won * a * year;
		System.out.println("이자 = " + b / 1000 + " 원리합계 = " + (b / 1000 + won));
	}
}