package kjunh972.java;

import java.util.Random;
import java.util.Scanner;

public class UpDown게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		int ran = rm.nextInt(99)+1;
		
		while (true)
		{
			System.out.print("숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			
			if (num > ran)
			{
				System.out.println("Down");
				continue;
			} else if (num < ran) {
				System.out.println("Up");
				continue;
			} else {
				System.out.println("일치");
				break;
			}
		}
	}

}
