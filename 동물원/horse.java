package kjunh972.java;

public class horse extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 말의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("말은 13살입니다.");
	}
	public void sounds()
	{
		System.out.println("말의 울음 소리 : 히이이이이잉");
	}
}
