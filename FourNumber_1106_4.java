//1106 양다연
import java.util.Scanner;
public class FourNumber_1106_4 {
	public static void main( String args [ ] ) {
		Scanner scan = new Scanner(System.in);

		System.out.print("데이터 입력 : ");
		int a = scan.nextInt( );
		System.out.println( );

		System.out.println("1000의 자리 = " + (a / 1000));
		System.out.println("100의 자리 = " + (a / 100 % 10));
		System.out.println("10의 자리 = " + (a / 10 % 10));
		System.out.println("1의 자리 = " + (a % 10));
	}
}