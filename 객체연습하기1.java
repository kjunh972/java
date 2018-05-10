package kjunh972.java;

public class 객체연습하기1 {
	int left, right;

	public void set(int left, int right) {

		this.left = left;
		this.right = right;
	}

	public void sum(){
		System.out.println(this.left+this.right);
	}

	public void avg() {
		System.out.println((this.left+this.right)/2);
	}

	public static void main(String[] args) {
		객체연습하기1 c1 = new 객체연습하기1();
		c1.set(10,20);
		c1.sum();
		c1.avg();
		
		객체연습하기1 c2 = new 객체연습하기1();
		c2.set(20,40);
		c2.sum();
		c2.avg();
	}
}
