//1106 ��ٿ�
import java.util.Scanner;
public class weight_1106 {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);

		System.out.print("5���� �����Ը� �Է��Ͻÿ�. ");
		double a = 1;
		double b = 1;
		double c = 1;
		double d = 1;
		double e = 1;
		double sum = 0;
		sum = a + b + c + d + e;
		a = sc.nextDouble( );
		b = sc.nextDouble( );
		c = sc.nextDouble( );
		d = sc.nextDouble( );
		e = sc.nextDouble( );

		System.out.print("�������� �� = ");
		System.out.println(a + b + c + d + e);
		System.out.print("�������� ��� = ");
		System.out.print( (a + b + c + d + e) / sum );
		System.out.println( );
	}
}