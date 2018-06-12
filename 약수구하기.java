package kjunh972.java;

import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("약수를 구할 수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		int i;
		System.out.print(num+"의 약수는 ");
		
		for (i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
