package kjunh972.java;

import java.util.Scanner;

public class 수박수박수박수박수박수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++)
		{
			if (i%2==1)
			{
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
	}

}
