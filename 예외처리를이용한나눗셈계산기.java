package kjunh972.java;

import java.util.Scanner;

public class 예외처리를이용한나눗셈계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.print("첫번째 숫자를 입력해주세요 : ");
			int first = sc.nextInt();
			System.out.print("두번째 숫자를 입력해주세요 : ");
			int second = sc.nextInt();
			
			try {
				int result = first/second;
				System.out.println(first+" / "+second+" = "+result);
				break;
			} catch (ArithmeticException e){
				System.out.println("0으로 나눌수 없습니다.");
				continue;
			}
		}
	}

}
