package kjunh972.java;

public class animals extends animalsPrint{
	String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void age()
	{
		System.out.println("나이");
	}
	public void sounds()
	{
		System.out.println("소리");
	}
	public void animalNum()
	{
		System.out.println("동물원에는 개, 고양이, 돼지, 쥐, 원숭이, 소, 말, 닭, 사자, 호랑이, 양, 코끼리가 있습니다.");
	}
}
