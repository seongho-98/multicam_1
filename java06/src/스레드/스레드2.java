package 스레드;

public class 스레드2 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j = 0; j < 1000; j++) {
			System.out.println("스레드 2 사용:" + j);
		}
	}

}
