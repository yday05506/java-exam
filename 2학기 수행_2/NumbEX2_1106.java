//1106 양다연
package EXAM2;

public class NumbEX2_1106 {

	public static void main(String[] args) {
		Numb Num1 = new Numb((int)(Math.random() * 100) + 1, (int)(Math.random() * 100) + 1);
		Num1.bigNumber();
		Num1.smallNumber();
		
		System.out.println(Num1.bigNumber() + ", " + Num1.smallNumber() + " 중 큰 수는 " + Num1.bigNumber());
		System.out.println(Num1.bigNumber() + ", " + Num1.smallNumber() + " 중 작은 수는 " + Num1.smallNumber());
	}

}

class Numb {
	int a = 0;
	int b = 0;
	
	Numb (int aa, int bb) { 
		a = aa;
		b = bb;
	}
	
	int bigNumber () {
		if (a > b)
			return a;
		else 
			return b;
	}
	
	int smallNumber() {
		if (a < b)
			return a;
		else
			return b;
	}
}