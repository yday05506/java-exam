//1106 ��ٿ�
import java.util.Scanner;
public class Fruit_1106_5 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);
		final int apple = 1200;
		final int yellowm = 950;
		final int orange = 500;
		final int grape = 2000;
		
		System.out.println("������ ������ ������ �Է��ϼ���.");
		System.out.print("��� ���� ������ ���� : ");
		int ap = scan.nextInt( );
		int yellow = scan.nextInt( );
		int oran = scan.nextInt( );
		int grp = scan.nextInt( );

		System.out.println( );

		int give = (apple * ap) + (yellowm * yellow) + (orange * oran) + (grape * grp);
		System.out.println("�� ���ұݾ��� " + give + "���Դϴ�.");
		System.out.println( );

		System.out.print("���ޱݾ� : ");
		int won = scan.nextInt( );
		System.out.println((won >= give) ? won+"���� �޾� �Ž������� " + (won-give) + "���Դϴ�." : won+"���� �޾� �ݾ��� �����մϴ�.");
	}
}