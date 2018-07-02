package kjunh972.java;

import java.util.Random;
import java.util.Scanner;

public class 땅따먹기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		System.out.println("땅따먹기 게임에 오신걸 환영합니다.");
		System.out.println("땅은 4*3입니다. 같은 열을 계속해서 밟을 수 없습니다.");
		
		int[][] arr = new int[3][4];
		int i,k,one=0,two=0,three=0,cheak=0,same=0;
		
		for (i=0; i<3; i++) //땅 생성
		{
			for (k=0; k<4; k++)
			{
				arr[i][k] = rm.nextInt(8)+1;
			}
		}
		
		while (true) //중복
		{
			for (i=0; i<3; i++)
			{
				for (k=0; k<4; k++)
				{
					if (k-1==k)
					{
						arr[i][k] = rm.nextInt(8)+1;
					} else {
						same++;
					}
				}
			}
			if (same > 0)
			{
				break;
			}
		}
			
		for (i=0; i<3; i++) //땅 확인
		{
			for (k=0; k<4; k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}
		
		for (i=0; i<3; i++)
		{
			System.out.print((i+1)+"열에 있는 숫자중 하나를 골라주세요 : ");
			if (i==0)
			{
				one = sc.nextInt();
			} else if (i==1) {
				two = sc.nextInt();
			} else if (i==2) {
				three = sc.nextInt();
			}
			cheak = 0;
			
			for (k=0; k<4; k++)
			{
				if (arr[i][k]==one)
				{
					cheak++;
				} else if (arr[i][k]==two) {
					cheak++;
				} else if (arr[i][k]==three) {
					cheak++;
				}
				if (i==1)
				{
					while (true)
					{
						if (one != arr [i-1][k])
						{
							break;
						} else {
							System.out.println("같은 열에있는 숫자는 입력하실수 없습니다. 다시 입력하세요 : ");
							two = sc.nextInt();
						}
					}
				} else if (i==2)
				{
					while (true)
					{
						if (one != arr [i-1][k])
						{
							break;
						} else {
							System.out.println("같은 열에있는 숫자는 입력하실수 없습니다. 다시 입력하세요 : ");
							two = sc.nextInt();
						}
					}
				}
				if (k==3)
				{
					while (true)
					{
						if (cheak==0)
						{
							System.out.print((i+1)+"열에 없습니다. 다시 입력해주세요 : ");
							one = sc.nextInt();
						} else {
							break;
						}
					}
				}
			}
		}
		
		System.out.println("결과"+(one+two+three));
	}

}
