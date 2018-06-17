package kjunh972.java;

import java.util.Scanner;

public class 원하는수를입력받은만큼제곱하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.print("몇번 제곱할까요 : ");
		int square = sc.nextInt();
		
		int i,result=1;
		
		System.out.print(num+"을 "+square+"만큼 제곱하면 ");
		for (i=0; i<square; i++)
		{
			result*=num;
		}
		System.out.println(result+"입니다.");
	}

}
