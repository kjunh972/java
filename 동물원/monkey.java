package kjunh972.java;

public class monkey extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 원숭이의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("원숭이는 3살입니다.");
	}
	public void sounds()
	{
		System.out.println("원숭이의 울음 소리 : 우끼끼 우끼끼");
	}
}
