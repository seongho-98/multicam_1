package 스레드;

public class 스레드1 extends Thread{

	//스레드의 run 메서드를 오버라이드하면 스레드로 할당 및 스레드로 처리가 가능
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("1번 스레드 처리중입니다"+i);
		}
	}

}
