package kjunh972.java;

import java.util.Scanner;

public class 콜라츠추측 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		int i = 0;
		
		while (true)
		{
			i++;
			if (i==500) //500번 반복해도 1이 안되면 -1로 
			{
				num = -1;
				break;
			} else if (num==1) {
				break;
			} else if (num%2==0) {
				num = num/2;
				continue;
			} else {
				num = num*3+1;
				continue;
			}
		}
		
		System.out.println("결과 : "+num);
	}

}
