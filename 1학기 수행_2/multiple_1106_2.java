//1106 ��ٿ�
import java.util.Scanner;
public class multiple_1106_2 {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;

		System.out.print("���� ��� : ");
		int multi = sc.nextInt( );
		System.out.print("������ �� : ");
		int final_no = sc.nextInt( );
		System.out.println("================================");

		System.out.print("1 ~ " + final_no +"������ " + multi + "�� ��� : ");	//��� ���
		for (int i=1; i<=final_no; i++)
			if ( i % multi == 0 ) {
				System.out.print( i  + "  ");
				cnt++;
				sum+=i;
			}
		System.out.println( );
		System.out.println("1 ~ " + final_no +"������ " + multi + "�� ����� ���� : " + cnt);	//����
		System.out.println("1 ~ " + final_no +"������ " + multi + "�� ����� �� : " + sum);
		System.out.println("================================");
	}
}