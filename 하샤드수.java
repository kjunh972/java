package kjunh972.java;

import java.util.Scanner;

public class 하샤드수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		int one = (num%100)%10;
		int ten = (num%100)/10;
		int hundred = (num-(one+(ten*10)))/100;
		int thousand = num/1000;
		hundred = hundred-(thousand*10); //자리수를 분리
		System.out.println(num);
		System.out.println(one+ten+hundred+thousand);
		if (num%(one+ten+hundred+thousand)==0)
		{
			System.out.println(num+"을 하샤드 수로 나타내면 "+(one+ten+hundred+thousand)+"입니다.");
		} else {
			System.out.println("하샤드 수가 아닙니다.");
		}
	}

}
