//1106 ��ٿ�
import java.util.Scanner;
public class maxmin_1106 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i, a;
		System.out.print("�Է��� ����Ÿ�� �� : ");
		int n = sc.nextInt( );
		
		for (i = 1; i <= n; i++) {
			System.out.print(i + "��° �� �Է� : ");
			a = sc.nextInt( );
		}
		int max = i >= a;
		int min = i <= a;
		System.out.println("===============================");
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
		System.out.println("===============================");
		System.out.println( );
	}
}