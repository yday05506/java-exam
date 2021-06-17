//1106 양다연
import java.util.Scanner;
public class Fruit_1106_5 {
	public static void main( String args[ ] ) {
		Scanner scan = new Scanner(System.in);
		final int apple = 1200;
		final int yellowm = 950;
		final int orange = 500;
		final int grape = 2000;
		
		System.out.println("구입한 과일의 갯수를 입력하세요.");
		System.out.print("사과 참외 오렌지 포도 : ");
		int ap = scan.nextInt( );
		int yellow = scan.nextInt( );
		int oran = scan.nextInt( );
		int grp = scan.nextInt( );

		System.out.println( );

		int give = (apple * ap) + (yellowm * yellow) + (orange * oran) + (grape * grp);
		System.out.println("총 지불금액은 " + give + "원입니다.");
		System.out.println( );

		System.out.print("지급금액 : ");
		int won = scan.nextInt( );
		System.out.println((won >= give) ? won+"원을 받아 거스름돈은 " + (won-give) + "원입니다." : won+"원을 받아 금액이 부족합니다.");
	}
}