package kjunh972;

import java.util.Scanner;

public class 호텔 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sel = 0, in = 0, out = 0, room = 0;

		System.out.print("방의 갯수 : ");
		room = sc.nextInt();	

		int[] arr = new int[room];

		while (true)
		{
			System.out.print("1.입실 2.퇴실 3.보기 4.종료 : ");
			sel = sc.nextInt();
			
			if (sel==1)
			{
				System.out.print("입실하실 방의 번호 : ");
				in = sc.nextInt();
				
				if (arr[in-1]==1)
				{
					System.out.println(in+"호실은 이미 사용중인 방입니다.");
				} else {
					arr[in-1] = 1;
					System.out.println(in+"호실에 입실 하셨습니다.");
				}
			} else if (sel==2) {
				System.out.print("퇴실하실 방의 번호 : ");
				out = sc.nextInt();
				
				if (arr[out-1]==0)
				{
					System.out.println(out+"호실은 이미 빈방입니다.");
				} else {
					arr[in-1] = 0;
					System.out.println(in+"호실에 퇴실 하셨습니다.");
				}
			} else if (sel==3) {
				for (int i=0; i<room; i++)
				{
					if (arr[i]==1) {
						System.out.println((i+1)+" - 사용중");
					} else {
						System.out.println((i+1)+" - 빈방");
					}
				}
			} else if (sel==4) {
				System.out.println("프로그램 종료합니다.");
				break;
			}

		}
	}

}
