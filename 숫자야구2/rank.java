package kjunh972.java;

public class rank {
	option op = new option();
	public void rank()
	{
		if (op.score>=60)
		{
			System.out.println("현재 등급은 레전드입니다.");
		} else if (op.score>=40)
		{
			System.out.println("현재 등급은 마스터입니다.");
		} else if (op.score>=20)
		{
			System.out.println("현재 등급은 일반인입니다.");
		} else
		{
			System.out.println("현재 등급은 거지입니다.");
		}
	}
}
