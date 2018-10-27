// Ver 1.0

package kjunh972.java;

public class numBaseball {

	public static void main(String[] args) {
		option op = new option();
		tutorial tt = new tutorial();
		
		op.Qtt();
		if (op.Auser.equals("yes"))
		{
			System.out.println(tt.explanation());
		}//튜토리얼
		
		for (int round=1; round<=9; round++)
		{
			op.start();
			op.overlap();
			System.out.println("==============="+op.round+"라운드입니다.===============");	
			op.user();
			op.stike();
			op.ball();
			op.out();
			op.state();
			op.gameOver();
		}
		op.score();
		op.rank();

	}

}
