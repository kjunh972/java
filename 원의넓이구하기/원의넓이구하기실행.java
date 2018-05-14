package kjunh972.java;

import java.util.Scanner;

public class 원의넓이구하기실행 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력해주세요 : ");
		double R = sc.nextDouble();
		원의넓이구하기 c1 = new 원의넓이구하기(3.14,R);
		System.out.print("원의 넓이는 : ");
		c1.area();
	}

}
