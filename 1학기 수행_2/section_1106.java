//1106 ¾ç´Ù¿¬
public class section_1106 {
	public static void main ( String args[ ] ) {
		int sum = 0;
		for (int i = 5; i <= 50; i++) {
			sum += i;
			if ( i % 5 == 0 ) System.out.print("1 ~ " + i + " --> " + sum);
		System.out.println( );
		}
	}
}