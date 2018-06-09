package kjunh972.java;

public class mouse extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 쥐의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("쥐는 17살입니다.");
	}
	public void sounds()
	{
		System.out.println("쥐의 울음 소리 : 찍찍");
	}
}
