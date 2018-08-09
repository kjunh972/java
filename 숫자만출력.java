package kjunh972.java;

import java.util.Scanner;

public class 숫자만출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String[] arr = new String [10];
		int cheak=0;
		
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
			try {
				int change = Integer.parseInt(arr[i]);
				if (change!=0)
				{
					System.out.print(change);
				}
			} catch (NumberFormatException e) {
				
			}
		}
		
	}

}
