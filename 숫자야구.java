// Ver 1.0

package kjunh972.java;

import java.util.Random;
import java.util.Scanner;

public class 숫자야구 {

	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		  
		int stike = 0;
		int ball = 0;
		int out = 0;
		
		for (int round=1; round<=3; round++)
		{
			int ram = rm.nextInt(899)+100; //100~999까지 랜덤
			System.out.println("(관리자 버프)숫자야구 수 : "+ram);
			
			int ram100 = ram-(ram%100);
			int ram1 = (ram%10);
			int ram10 = ram-(ram100+ram1);
			ram100 = ram100/100;
			ram10 = ram10/10; //랜덤함수 자리수로 분리
			
			if (ram100==ram10 || ram100==ram1 || ram10==ram1) //숫자 중복방지
			{
				ram = rm.nextInt(899)+100; //100~999까지 랜덤
				System.out.println("(관리자 버프)숫자야구 수 : "+ram);
				
				ram100 = ram-(ram%100);
				ram1 = (ram%10);
				ram10 = ram-(ram100+ram1);
				ram100 = ram100/100;
				ram10 = ram10/10; //랜덤함수 자리수로 분리
			}
			
			System.out.print("숫자를 입력해주세요 (최대 세자리 수로 입력해주세요.) : ");
			int numUser = sc.nextInt();
			
			int num100 = numUser-(numUser%100);
			int num1 = (numUser%10);
			int num10 = numUser-(num100+num1);
			num100 = num100/100;
			num10 = num10/10; //입력함수 자리수로 분리
			
			//else if 안쓴 이유는 else if 쓰면 if문 돌릴때 참이하나 나오면 바로 탈출해서 전부다 검사하기 위해
			//스트라이크와 볼 구하는 부분
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
			
			//아웃 구하는 부분
			if (stike+ball != 3*round)
			{
				out = 3*round-(stike+ball);
			}
			
			
			
			System.out.println(stike+"스트라이크 이고, "+ball+"볼이고, "+out+"아웃입니다");
		}

	}

}
