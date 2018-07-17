package kjunh972.java;

import java.util.Scanner;

public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력해주세요 : ");
		String str = sc.nextLine();
		
		char[] Case = new char[str.length()];
		
		for (int i=0; i<str.length(); i++) //입력받은 문자를 변수에다 저장후 하나하나 배열 저장.
		{
			Case[i] = str.charAt(i);
		}
		
		if(Character.isLowerCase(Case[0]))//첫글자를 대문자로 바꾸기
			Case[0]=Character.toUpperCase(Case[0]);
		char space = ' ';
		for (int i=0; i<Case.length; i++)
		{
			if (Case[i]==' ')
			{
				if(Character.isLowerCase(Case[i+1]))//공백 다음문자를 대문자로
					Case[i+1]=Character.toUpperCase(Case[i+1]);
			}
		}
		
		for (int i=0; i<Case.length; i++)
		{
			System.out.print(Case[i]);
		}
	}

}
