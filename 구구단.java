package kjunh972.java.������;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i,t;
		
		System.out.printf("���ϴ� ���� �Է��ϼ��� : ");
		t=scanner.nextInt();
		
		for (i=1; i<=9; i++)
		{
			
			System.out.printf("%d X %d = %d\n",t,i,t*i);
		}
	}

}
