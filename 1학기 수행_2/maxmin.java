import java.util.Scanner;
public class maxmin {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 데이터의 수 : ");
		int data = sc.nextInt( );	//8
		System.out.print("1번째 수 입력 : ");
		int n = sc.nextInt( );
		int max = n, min = n;
		// int max = 0; min = 0;

		for (int i = 2; i <= data; i++) {
			System.out.print( i + "번째 수 입력 : ");
			n = sc.nextInt( );	//34
			if (n > max) max=n;
			else if (n < min) min=n;
		}
		System.out.println("==================================");
		System.out.println("가장 큰 수  :	" + max);
		System.out.println("가장 작은 수 :	" + min);
		System.out.println("==================================");
	}
}