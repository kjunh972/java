package kjunh972.java;

import java.util.Scanner;

public class 무한로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 회원가입 =====");
		System.out.print("아이디를 입력해주세요 : ");
		String newid = sc.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		String newpwd = sc.next();
		
		while(true)
		{
			System.out.println("===== 로그인 =====");
			System.out.print("본인의 아이디를 입력해주세요 : ");
			String id = sc.next();
			System.out.print("본인의 비밀번호를 입력해주세요 : ");
			String pwd = sc.next();
			
			if (newid.equals(id) && newpwd.equals(pwd))
			{
				System.out.println("로그인 성공했습니다");
				break;
			} else {
				System.out.println("다시 로그인 해주세요");
				continue;
			}
		}

	}

}
