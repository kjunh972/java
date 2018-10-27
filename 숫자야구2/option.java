package kjunh972.java;

import java.util.Random;
import java.util.Scanner;

public class option{
	Random rm = new Random();
	Scanner sc = new Scanner(System.in);
	  
	int stike = 0;
	int ball = 0;
	int out = 0;
	int ram100 = 0;
	int ram10 = 0;
	int ram1 = 0;
	int num100 = 0;
	int num10 = 0;
	int num1 = 0;
	int round = 0;
	int score = 0;
	
	String Auser;
	
	public void start()
	{
		round++;
		int ram = rm.nextInt(899)+100; //100~999까지 랜덤
		System.out.println("(관리자 버프)숫자야구 수 : "+ram);
		
		ram100 = ram-(ram%100);
		ram1 = (ram%10);
		ram10 = ram-(ram100+ram1);
		ram100 = ram100/100;
		ram10 = ram10/10; //랜덤함수 자리수로 분리
	}
	
	public void overlap()
	{
		while (true)
		{
			if (ram100==ram10 || ram100==ram1 || ram10==ram1) //숫자 중복방지
			{
				System.out.println("중복");
				int ram = rm.nextInt(899)+100; //100~999까지 랜덤
				System.out.println("(관리자 버프)숫자야구 수 : "+ram);
			
				ram100 = ram-(ram%100);
				ram1 = (ram%10);
				ram10 = ram-(ram100+ram1);
				ram100 = ram100/100;
				ram10 = ram10/10; //랜덤함수 자리수로 분리
			} else {
				break;
			}
		}
	}
	
	public void user()
	{
		System.out.print("숫자를 입력해주세요 (최대 세자리 수로 입력해주세요.) : ");
		int numUser = sc.nextInt();
		
		num100 = numUser-(numUser%100);
		num1 = (numUser%10);
		num10 = numUser-(num100+num1);
		num100 = num100/100;
		num10 = num10/10; //입력함수 자리수로 분리
	}
	
	public void stike()
	{
		//else if 안쓴 이유는 else if 쓰면 if문 돌릴때 참이하나 나오면 바로 탈출해서 전부다 검사하기 위해
		//스트라이크 구하는 부분
		if (ram100==num100)
		{
			stike++;
		}
		if (ram10==num10) {
			stike++;
		}
		if (ram1==num1 ) {
			stike++;
		}
	}
	
	public void ball()
	{
		//볼 구하는 부분
		if (ram10 == num100) {
			ball++;
		}
		if (ram10 == num1) {
			ball++;
		}
		if (ram1 == num100) {
			ball++;
		}
		if (ram1 == num10) {
			ball++;
		}
		if (ram100 == num10) {
			ball++;
		}
		if (ram100 == num1) {
			ball++;
		}
	}
	
	public void out()
	{
		//아웃 구하는 부분
		if (stike+ball != 3*round)
		{
			out = 3*round-(stike+ball);
		}
	}
	
	public void state()
	{
		System.out.println(stike+"스트라이크 이고, "+ball+"볼이고, "+out+"아웃입니다");
	}
	
	public void Qtt()
	{
		System.out.print("튜토리얼을 듣겠습니까?(yes or no) : ");
		Auser = sc.next();
	}
	
	public void score()
	{
		score +=3*stike;
		score +=ball;
		System.out.println("점수는 "+score+"점 입니다.");
	}
	
	public void rank()
	{
		if (score>=60)
		{
			System.out.println("현재 등급은 레전드입니다.");
		} else if (score>=40)
		{
			System.out.println("현재 등급은 마스터입니다.");
		} else if (score>=20)
		{
			System.out.println("현재 등급은 일반인입니다.");
		} else
		{
			System.out.println("현재 등급은 거지입니다.");
		}
	}
	
	public void gameOver()
	{
		//5out이면 탈출
		System.out.println("out : "+out);
		if (out > 4)
		{
			System.out.println("5아웃이상이므로 숫자야구를 종료합니다.");
			score +=3*stike;
			score +=ball;
			System.out.println("점수는 "+score+"점 입니다.");
			rank();
			System.exit(0);
		}
	}
}
