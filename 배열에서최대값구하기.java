package kjunh972.java.배열에서최대값구하기;

public class 배열에서최대값구하기 {

	public static void main(String[] args) {
		int i , max = 0;
		int[] Arr = {1,9,7,10,2};
		max = Arr[0];
		for (i=0; i<=4; i++)
		{
			
			if (max<Arr[i])
			{
				max=Arr[i];
			}
		}
		System.out.printf("%d",max);
	}
	}
