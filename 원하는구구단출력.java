package kjunh972.java;

import java.util.Scanner;

public class 원하는구구단출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력해주세요 : ");
		int num = sc.nextInt();
		
		int i = 0;
		String start = "y";
		
		while (start.equals("y"))
		{	
			i+=1;
			if (i==10)
			{
				System.out.print("계속하시겠습니까? (y or n로만 입력해주세요) : ");
				start = sc.next();
				if (start.equals("y"))
				{
					i = 0;
					System.out.print("원하는 단을 입력해주세요 : ");
					num = sc.nextInt();
				} else if (start.equals("n")) {
					System.out.println("종료합니다.");
					break;
				}
			} else {
				System.out.println(num+"X"+i+"="+(num*i));
			}
		}

	}

}
