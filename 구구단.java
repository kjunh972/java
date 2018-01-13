package kjunh972.java.구구단;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i,t;
		
		System.out.printf("원하는 단을 입력하세요 : ");
		t=scanner.nextInt();
		
		for (i=1; i<=9; i++)
		{
			
			System.out.printf("%d X %d = %d\n",t,i,t*i);
		}
	}

}
