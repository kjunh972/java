package kjunh972.java;

import java.util.Scanner;

public class 완전수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		int plus = 0;
		
		for (int i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				plus+=i;
			}
		}
		
		plus-=num;
		
		if (plus==num)
		{
			System.out.println("완전수입니다.");
		} else {
			System.out.println("완전수가 아닙니다.");
		}
	}

}
