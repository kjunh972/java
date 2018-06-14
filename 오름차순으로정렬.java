package kjunh972.java;

public class 오름차순으로정렬 {

	public static void main(String[] args) {
		int[] A = {30,20,90,70,60,1000000};//1000000은 오름차순 계산을 위해서 넣은 수
		int t = 0, a = 0, i = 0;

		for (a = 0; a < 5; a++)
		{
			for (i = 0; i < 5; i++)
			{

				if (A[i] > A[i+1])
				{
					t = A[i];
					A[i] = A[i+1];
					A[i+1] = t;	
				}
			}
			System.out.print(A[a]+" ");
		}
	}

}
