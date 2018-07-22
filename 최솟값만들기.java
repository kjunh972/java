package kjunh972.java;

import java.util.Random;

public class 최솟값만들기 {

	public static void main(String[] args) {
		Random rm = new Random();
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int result = 0;
		
		for (int i=0; i<arr1.length; i++)
		{
			arr1[i] = rm.nextInt(9)+1;
		}
		
		for (int i=0; i<arr2.length; i++)
		{
			arr2[i] = rm.nextInt(9)+1;
		}
		
		for (int i=0; i<arr1.length; i++)			//최솟값 계산 부분
		{
			result = arr1[i]*arr2[i] + result;
		}
		
		System.out.print("arr1 : ");				//arr1 출력 부분
		for (int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.print("arr2 : ");				//arr2 출력 부분
		for (int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		System.out.println("최솟값 : "+result);		//최소값 출력
	}

}
