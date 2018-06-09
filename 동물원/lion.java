package kjunh972.java;

public class lion extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 사자의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("사자은 23살입니다.");
	}
	public void sounds()
	{
		System.out.println("닭의 울음 소리 : 카아아아앙");
	}
}
