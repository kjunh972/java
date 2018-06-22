package kjunh972.java;

import java.util.Scanner;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[4];
		
		for (int i=0; i<=3; i++)
		{
			System.out.print((i+1)+"번째 숫자를 입력해주세요 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("나눌 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		int k=0;
		int[] print = new int[4];
		for (int i=0; i<4; i++)
		{
			if (arr[i]%num==0)
			{
				print[k] = arr[i];
				k++;
			}
		}
		
		System.out.print("나누어지는 숫자는 : ");
		for (int i=0; i<k; i++)
		{
			System.out.print(print[i]+" ");
		}
	}

}
