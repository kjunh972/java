package kjunh972.java;

import java.util.Scanner;

public class 책꽃이시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String books[] = {"자바의 모든것","c언어의 대장","php 마스터 되는 길","프로그래밍 나도 고수가 될수있다","파이썬 어렵지 않아요","데이터베이스 함께 해요",""};
		int i = 0;
		
		System.out.print("어떤책을 찾으세요 : ");
		String book = sc.nextLine();
		
		for (i=0; i<=books.length; i++)
		{
			
			if (books[i].equals(book))
			{
				System.out.println(book+"이란 책을 찾았습니다.");
				break;
			} else if (i==7){
				System.out.println("찾는 책이 없습니다.");
			} else {
			}
		}
	}

}
