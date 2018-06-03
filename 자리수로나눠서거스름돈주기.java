package kjunh972.java;

import java.util.Scanner;

public class 자리수로나눠서거스름돈주기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("돈을 지불해 주세요. 가격은 0원입니다 : ");
		int num = sc.nextInt();
		
		System.out.println(" 오만원짜리 : "+num / 50000);
		num = num % 50000;
		
		System.out.println(" 만원짜리 : "+num/10000);
		num = num % 10000;

		System.out.println(" 천원짜리 : "+num/1000);
		num = num % 1000;

		System.out.println(" 백원짜리 : "+num / 100);
		num = num % 100;

		System.out.println(" 오십원짜리 : "+num / 50);
		num = num % 50;
		
		System.out.println(" 십원짜리 : "+num / 10);

	}

}