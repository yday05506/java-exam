//1106 ¾ç´Ù¿¬
public class section {
	public static void main ( String args[ ] ) {
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum += i;
			if ( i % 5 == 0 ) System.out.println("1 ~ " + i + " --> " + sum);
		}
		System.out.println( );
	}
}