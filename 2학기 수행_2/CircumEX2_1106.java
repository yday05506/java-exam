//1106 양다연
package EXAM2;

import java.util.Scanner;

public class CircumEX2_1106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] R = new int[5];	// 지름
		int[] garo1 = new int[5];	// 가로
		int[] sero1 = new int[5];	// 세로
		int select = 0;;	// 도형 선택
		int Cir_cnt = 0;	// 원의 수
		int Squ_cnt = 0;	// 사각형의 수
		Circum Circle = new Circum(R);
		Circum Square = new Circum(garo1, sero1);
		
		for(int i = 0; i < R.length; i++) {
			System.out.print("도형 선택 (1 : 원, 2 : 사각형)");	// 도형 선택
			select = sc.nextInt();
			if(select > 2 || select < 1) {
				i--;
				System.out.println();
				continue;
			}
			if (select == 1) {
					System.out.print("반지름 입력 : ");
					R[i] = sc.nextInt();
					System.out.println("반지름 " + R[i]+ "인 원의 둘레는 " + Circle.Cir(R[i]));
					Cir_cnt++;
					System.out.println();
				}
				else if(select == 2) {
					System.out.print("가로 입력 : ");
					garo1[i] = sc.nextInt();
					System.out.print("세로 입력 : " );
					sero1[i] = sc.nextInt();
					System.out.println("가로 " + garo1[i] + "이고 세로 " + sero1[i] + "인 사각형의 둘레는 " + Circle.Squ(garo1[i], sero1[i]));
					Squ_cnt++;
					System.out.println();
				}
			}
		System.out.println("*************************************************************************************");
		System.out.println(Cir_cnt + "개의 원과 " + Squ_cnt + "의 사각형을 생성");
		for(int i = 0; i < R.length; i++) {
			System.out.println(i+1 + "번째 도형 : 둘레 " + Circle.Squ(garo1[i], sero1[i]) + "인 사각형");
			System.out.println((i+1) +  "번째 도형 : 둘레 " + Circle.Cir(R[i]) + "인 원" );
		}
		}
	}

class Circum {
	int[] R = new int[5];	// 지름 
	double PI = 3.14;	// 원주율
	int[] garo = new int[5];	// 가로
	int[] sero = new int[5];	// 세로
	
	Circum (int[] rr) {
		R = rr;
	}

	Circum (int[] ga, int[] se) {
		garo = ga;
		sero = se;
	}
	
	double Cir(int R) {
		return (2*PI*R);
	}
	
	double Squ(int garo, int sero) {
		return (2*garo) + (2*sero);
	}
	
}