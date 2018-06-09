package kjunh972.java;

public class cat extends animals{
	public void setName(String name)
	{
		this.name = name;
		System.out.println("이 고양이의 이름은 : "+this.name);
	}
	public void age()
	{
		System.out.println("고양이는 8살입니다.");
	}
	public void sounds()
	{
		System.out.println("고양이의 울음 소리 : 미야옹");
	}
}
