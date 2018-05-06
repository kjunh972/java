package kjunh972.java;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int first = sc.nextInt();
		System.out.print("부호를 입력해주세요 : ");
		String sign = sc.next();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int second = sc.nextInt();
		
		if (sign.equals("+"))
		{
			System.out.println(first+"+"+second+"="+(first+second));
		} else if (sign.equals("-")) {
			System.out.println(first+"-"+second+"="+(first-second));
		} else if (sign.equals("*")) {
			System.out.println(first+"*"+second+"="+(first*second));
		} else if (sign.equals("/")) {
			System.out.println(first+"/"+second+"="+(first/second));
		}
	
	}

}
