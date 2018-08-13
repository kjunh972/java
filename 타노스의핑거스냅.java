/*
 타노스는 프로그램의 균형을 위해서는 배열의 원소 절반을 무작위로 삭제해야 한다고 믿고 있다.
타노스가 손가락을 튕겼을 때(프로그램을 실행했을 때) 입력된 배열에서 절반의 원소를 무작위로 삭제하여 리턴하는 인피니티 건틀렛 프로그램을 작성하시오.
 */

package kjunh972.java;

import java.util.Random;
import java.util.Scanner;

public class 타노스의핑거스냅 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		int[] arr = new int[rm.nextInt(9)+2];
		
		System.out.println((arr.length)+"개의 숫자를 입력해주세요.");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("숫자를 입력해주세요 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("살아남은 숫자들 ");
		for (int i=0; i<arr.length/2; i++)
		{
			System.out.print(arr[rm.nextInt(arr.length)]+" ");
		}
	}

}
