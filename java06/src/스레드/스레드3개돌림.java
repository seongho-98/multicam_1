package 스레드;

public class 스레드3개돌림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		배열스레드 t1 = new 배열스레드();
		시각스레드 t2 = new 시각스레드();
		카운터스레드 t3 = new 카운터스레드();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
