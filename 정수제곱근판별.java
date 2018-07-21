package kjunh972.java;

import java.util.Scanner;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		for (int i=1; i<=2147483647; i++)
		{
			//System.out.println("i : "+i);
			if (i*i==num)
			{
				System.out.println(num+"의 제곱근은 "+i+"입니다.");
				break;
			} else if (i==2147483647 && i*i!=num) {
				System.out.println(num+"의 제곱근은 정수 중에 없습니다.");
				
			}
		}
	}

}