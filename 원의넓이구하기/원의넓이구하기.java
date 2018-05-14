package kjunh972.java;

public class 원의넓이구하기 {
	double pi, r;

	public 원의넓이구하기(double pi, double r) {
		this.pi = pi;
		this.r = r;
	}
	
	public void area(){
		System.out.println(this.pi*(this.r*this.r));
	}
}