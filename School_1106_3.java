//1106 양다연
import java.util.Scanner;
public class School_1106_3 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);

		System.out.print("학교 : ");
		String str = scan.nextLine( );
		System.out.print("학년 : ");
		int grade = scan.nextInt( );
		System.out.print("반 : ");
		int cls = scan.nextInt( );
		System.out.print("이름 : ");
		String b = scan.next( );
		System.out.println( );

		System.out.println(b + "은(는) " + str + "학교 " + grade + "학년 " + cls + "반입니다.");
	}
}