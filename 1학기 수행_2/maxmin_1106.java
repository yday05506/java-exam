//1106 양다연
import java.util.Scanner;
public class maxmin_1106 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i, a;
		System.out.print("입력할 데이타의 수 : ");
		int n = sc.nextInt( );
		
		for (i = 1; i <= n; i++) {
			System.out.print(i + "번째 수 입력 : ");
			a = sc.nextInt( );
		}
		int max = i >= a;
		int min = i <= a;
		System.out.println("===============================");
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		System.out.println("===============================");
		System.out.println( );
	}
}