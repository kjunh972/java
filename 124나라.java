package kjunh972.java;

import java.util.Scanner;

public class 숫자124나라 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 (1~999사이의 숫자만) : ");
		int num = sc.nextInt(); 
		
		while (true)
		{
			if (num>999)
			{
				System.out.print("0~999사이의 숫자를 입력해주세요 : ");
				num = sc.nextInt();
				continue;
			} else {
				break;
			}
		}
		
		
		for (int i=0; i<3; i++)
		{
			if (num%3==i)
			{
				if (i==0)
				{
					if (num/3!=1)
						System.out.print(num/3-1);
					System.out.print(i+4);
				} else {
					if (num/3!=0)
						System.out.print(num/3);
					System.out.print(i);
				}
			}
		}
		
	}

}
