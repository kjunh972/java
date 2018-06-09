package kjunh972.java;

public class cow extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 소의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("소는 16살입니다.");
	}
	public void sounds()
	{
		System.out.println("소의 울음 소리 : 꼬꼬댁 꼬꼬꼬꼬꼬...");
	}
}
