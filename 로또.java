package kjunh972.java;

import java.util.Random;
import java.util.Scanner;

public class 로또 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rm = new Random();
		
		int[] user = new int[7];
		int[] rotto = new int[7];
		int pass=0;
		
		for (int i=0; i<7; i++)
		{
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			user[i] = sc.nextInt();
		}
		
		for (int i=0; i<7; i++)
		{
			rotto[i] = rm.nextInt(19)+1;
		}
		
		System.out.print("로또 당첨번호는 ");
		for (int i=0; i<7; i++)
		{
			System.out.print(rotto[i]+" ");
		}
		System.out.println();
		
		System.out.print("구매하신 로또 번호는 ");
		for (int i=0; i<7; i++)
		{
			System.out.print(user[i]+" ");
		}
		System.out.println();
		
		for (int i=0; i<7; i++)
		{
			if (user[i]==rotto[i])
			{
				pass++;
			}
		}
		
		if (pass==7)
		{
			System.out.println("1등입니다. 상금 100억!! 축하드립니다.");
		} else if (pass==6){
			System.out.println("2등입니다. 상금 50억!! 축하드립니다.");
		} else if (pass==5){
			System.out.println("3등입니다. 상금 1억!! 축하드립니다.");
		} else if (pass==4){
			System.out.println("4등입니다. 상금 1000만원!! 축하드립니다.");
		} else if (pass==3){
			System.out.println("5등입니다. 상금 100만원!! 축하드립니다.");
		} else if (pass==2){
			System.out.println("6등입니다. 상금 1만원!! 축하드립니다.");
		} else if (pass==1 || pass==0){
			System.out.println("꼴등입니다.. 아쉽습니다.. 위로금은 없습니다. 다음에 도전해주세요!");
		}
	}

}
