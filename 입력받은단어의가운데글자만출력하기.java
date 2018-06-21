package kjunh972.java;

import java.util.Scanner;

public class 입력받은단어의가운데글자만출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("몇글자 입력하실껍니까 : ");
		int len = sc.nextInt();
		
		String [] arr = new String [len];
		
		for (int i=0; i<len; i++)
		{
			System.out.print((i+1)+"번째 글자를 입력해주세요 : ");
			arr[i] = sc.next();
		}
		
		if (len%2==1)
		{
			int num = len/2;
			System.out.println("가운데 글자는 "+arr[num]+"입니다.");
		} else {
			int num1 = len/2-1;
			int num2 = len/2;
			System.out.println("가운데 글자는 "+arr[num1]+"이랑 "+arr[num2]+"입니다.");
		}
	}

}
