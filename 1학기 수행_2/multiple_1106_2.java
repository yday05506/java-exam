//1106 양다연
import java.util.Scanner;
public class multiple_1106_2 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;

		System.out.print("구할 배수 : ");
		int multi = sc.nextInt( );
		System.out.print("마지막 값 : ");
		int final_no = sc.nextInt( );
		System.out.println("================================");

		System.out.print("1 ~ " + final_no +"까지의 " + multi + "의 배수 : ");	//배수 찍기
		for (int i=1; i<=final_no; i++)
			if ( i % multi == 0 ) {
				System.out.print( i  + "  ");
				cnt++;
				sum+=i;
			}
		System.out.println( );
		System.out.println("1 ~ " + final_no +"까지의 " + multi + "의 배수의 갯수 : " + cnt);	//갯수
		System.out.println("1 ~ " + final_no +"까지의 " + multi + "의 배수의 합 : " + sum);
		System.out.println("================================");
	}
}