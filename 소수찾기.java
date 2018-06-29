package kjunh972.java;

import java.util.Scanner;

public class 소수찾기 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int i,k,count;
		
		System.out.print(num+"의 약수는 ");
		for (i=2; i<=num; i++)
		{
			count=0;
			for (k=1; k<=num; k++)
			{
				if (i%k==0)
				{
					count++;
				}
			}
			
			if (count==2)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("입니다.");
	}

}
