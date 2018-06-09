package kjunh972.java;

public class chicken extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 닭의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("닭은 5살입니다.");
	}
	public void sounds()
	{
		System.out.println("닭의 울음 소리 : 꼬꼬댁 꼬꼬꼬꼬꼬...");
	}
}
