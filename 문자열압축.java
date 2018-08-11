package kjunh972.java;

import java.util.Scanner;

public class 문자열압축 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[100];
		int cheak = 0;
		int count = 0;
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("(0입력하면 멈춥니다.)입력 해주세요 : ");
			arr[i] = sc.next();
			
			if (arr[i].equals("0"))
			{
				cheak = i;
				break;
			}
		}
		
		for (int i=cheak; i<arr.length; i++)
		{
			arr[i] = "0";
		}
		
		
		for (int i=0; i<arr.length; i++)
		{
			if (i>0)
			{
				if (arr[i-1].equals(arr[i]))
				{
					count++;
				} else {
					System.out.print(arr[i-1]+""+(count+1)+" ");
					count = 0;
				}
			}
		}
	}

}
