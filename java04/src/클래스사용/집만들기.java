package 클래스사용;

//벽돌틀이 어디있는지 알려줌. 
import 클래스만들기.벽돌틀;

public class 집만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//모든 부품은 ram에 준비되어있어야함.
		벽돌틀 벽돌1 = new 벽돌틀();
		벽돌틀 벽돌2 = new 벽돌틀();
		
		System.out.println(벽돌1);
		//벽돌틀에 대한 주소만 있으면 변수, 메서드에도 접근 가능.. 현재는 벽돌1,2에 별돌틀에 대한 주소가 있음
		벽돌1.x = 50;
		벽돌1.y = 50;
		
		벽돌1.쌓다();
		
		벽돌2.x = 150;
		벽돌2.y = 150;
		
		벽돌2.쌓다();
		
		
	}

}
