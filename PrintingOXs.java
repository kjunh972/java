package kjunh972.java;

import java.util.Scanner;

public class PrintingOXs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		String o = "O";
		String x = "X";
		
		for (int i=0; i<num; i++)
		{
			for (int k=0; k<num-(i+1); k++)
			{
				System.out.print(o);
			}
			for (int j=0; j<i+1; j++)
			{
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
