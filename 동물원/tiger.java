package kjunh972.java;

public class tiger extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 호랑이의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("호랑이는 35살입니다.");
	}
	public void sounds()
	{
		System.out.println("호랑이의 울음 소리 : 크으으아아아아앙");
	}
}
