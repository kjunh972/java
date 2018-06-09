package kjunh972.java;

public class dog extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 강아지의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("강아지는 9살입니다.");
	}
	public void sounds()
	{
		System.out.println("강아지의 울음 소리 : 멍멍");
	}
}
