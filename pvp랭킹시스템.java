package kjunh972.java;

import java.util.Random;
import java.util.Scanner;

public class pvp랭킹시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		System.out.print("1P 닉네임을 지어주세요 : ");
		String aName = sc.next();
		System.out.print("2P 닉네임을 지어주세요 : ");
		String bName = sc.next();
		System.out.print("3P 닉네임을 지어주세요 : ");
		String cName = sc.next();
		System.out.print("4P 닉네임을 지어주세요 : ");
		String dName = sc.next();
			
		int aScore = 0;
		int bScore = 0;
		int cScore = 0;
		int dScore = 0;
			
		for (int i=0; i<12; i++)
		{
			int pvp = rm.nextInt(2)+1;
			if (i==0 || i==1)
			{
				if (pvp==1)
				{
					System.out.println(aName+"님이 "+bName+"님을 pvp에서 승리하셨습니다.");
					aScore = aScore+3;
				} else {
					System.out.println(bName+"님이 "+aName+"님을 pvp에서 승리하셨습니다.");
					bScore = bScore+3;
				}
			} else if (i==2 || i==3) {
				if (pvp==1)
				{
					System.out.println(bName+"님이 "+cName+"님을 pvp에서 승리하셨습니다.");
					bScore = bScore+3;
				} else {
					System.out.println(cName+"님이 "+bName+"님을 pvp에서 승리하셨습니다.");
					cScore = cScore+3;
				}
			} else if (i==4 || i==5) {
				if (pvp==1)
				{
					System.out.println(aName+"님이 "+cName+"님을 pvp에서 승리하셨습니다.");
					aScore = aScore+3;
				} else {
					System.out.println(cName+"님이 "+aName+"님을 pvp에서 승리하셨습니다.");
					cScore = cScore+3;
				}
			} else if (i==6 || i==7)
			{
				if (pvp==1)
				{
					System.out.println(cName+"님이 "+dName+"님을 pvp에서 승리하셨습니다.");
					cScore = cScore+3;
				} else {
					System.out.println(dName+"님이 "+cName+"님을 pvp에서 승리하셨습니다.");
					dScore = dScore+3;
				}
			} else if (i==8 || i==9)
			{
				if (pvp==1)
				{
					System.out.println(aName+"님이 "+dName+"님을 pvp에서 승리하셨습니다.");
					aScore = aScore+3;
				} else {
					System.out.println(dName+"님이 "+aName+"님을 pvp에서 승리하셨습니다.");
					dScore = dScore+3;
				}
			} else if (i==10 || i==11)
			{
				if (pvp==1)
				{
					System.out.println(dName+"님이 "+bName+"님을 pvp에서 승리하셨습니다.");
					dScore = dScore+3;
				} else {
					System.out.println(bName+"님이 "+bName+"님을 pvp에서 승리하셨습니다.");
					bScore = bScore+3;
				}
			}
		}
			
		System.out.println(aName+"님의 점수 : "+aScore);
		System.out.println(bName+"님의 점수 : "+bScore);
		System.out.println(cName+"님의 점수 : "+cScore);
		System.out.println(dName+"님의 점수 : "+dScore);
	}
}
