package kjunh972.java;

public class gameover {
	option op = new option();
	rank rn = new rank();
	
	public void gameOver()
	{
		//5out이면 탈출
		System.out.println("out : "+op.out);
		if (op.out > 4)
		{
			System.out.println("5아웃이상이므로 숫자야구를 종료합니다.");
			op.score +=3*op.stike;
			op.score +=op.ball;
			System.out.println("점수는 "+op.score+"점 입니다.");
			rn.rank();
			System.exit(0);
		}
	}
}
