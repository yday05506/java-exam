import java.util.Scanner;
public class maxmin {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� �������� �� : ");
		int data = sc.nextInt( );	//8
		System.out.print("1��° �� �Է� : ");
		int n = sc.nextInt( );
		int max = n, min = n;
		// int max = 0; min = 0;

		for (int i = 2; i <= data; i++) {
			System.out.print( i + "��° �� �Է� : ");
			n = sc.nextInt( );	//34
			if (n > max) max=n;
			else if (n < min) min=n;
		}
		System.out.println("==================================");
		System.out.println("���� ū ��  :	" + max);
		System.out.println("���� ���� �� :	" + min);
		System.out.println("==================================");
	}
}