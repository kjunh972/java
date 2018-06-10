package kjunh972.java;

public class 별모양으로삼각형출력하기 {

	public static void main(String[] args) {
		String star = "☆";
		int i,k,j;
		
		for (i=1; i<=9; i++)
		{
			for(j=1; j<=9-i; j++)
			{
				System.out.print("  ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print(star);
			}
			System.out.println();
		}
			
	}

}
