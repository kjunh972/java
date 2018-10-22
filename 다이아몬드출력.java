package kjunh972;

public class 다이아몬드출력 {

	public static void main(String[] args) {
		int space = 0;

		for (int i=1; i<10; i++) //다이아몬드 윗부분
		{
			if (i%2==0)
				continue; //홀수만 출력
			space++; //공백
			for (int j=0; j<5-space; j++)
			{
				System.out.print(" ");	//공백 출력
			}
			for (int k=0; k<i; k++)
			{
				System.out.print("*"); // 별 출력
			}
			System.out.println();
		}
		
		for (int i=8; i>0; i--) //다이아몬드 아랫부분
		{
			if (i%2==0)
				continue;		
			space--;
			for (int j=5-space; j>0; j--)
			{
				System.out.print(" ");
			}
			for (int k=i; k>0; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
