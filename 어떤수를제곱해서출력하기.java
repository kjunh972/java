package kjunh972.java;

import java.util.Scanner;

public class 어떤수를제곱해서출력하기 {
	
	public static void main(String[] args) {
		System.out.println("제곱할 수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(num+"의 제곱은 "+num*num+"입니다.");
	}

}
