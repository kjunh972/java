package kjunh972.java;

import java.util.Scanner;

public class 닫힌괄호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String[] arr = new String[100];
		int i = 0,left=0,right=0,close=0;
		
		while (true)
		{
			System.out.print("(입력을 멈추고 싶으면 0을 입력하세요) 입력하세요: ");
			String cheak = sc.next();
			if (i==99) //99번 입력하면 종료
			{
				i=i;
				break;
			} else if (cheak.equals("0")) {
				i = i;
				break;
			}
			arr[i] = cheak;
			i++;
		}
		
		for (int k=i; k<arr.length; k++) //나머지는 0으로 채우기 아니면 오류
		{
			arr[k] = "0";
		}
		
		for (i=0; i<arr.length; i++) //검사
		{
			if (arr[i].equals("("))
			{
				left++;
			} else if (arr[i].equals(")")) {
				right++;
			}
		}
		
		for (i=0; i<arr.length; i++) //마지막 괄호 확인
		{
			if (arr[i] == "0")
			{
				close = i;
				break;
			}
		}
		
		if (left==right && arr[close-1].equals(")")) //출력
		{
			System.out.println("올바른 괄호입니다.");
		} else {
			System.out.println("올바른 괄호가 아닙니다.");
		}
	}

}
