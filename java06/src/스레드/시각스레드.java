package 스레드;

import java.util.Date;

public class 시각스레드 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println(date); //toString()으로 시, 분, 초가 찍히도록 Date가 되어있음
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //JAVA 프로그램 말고 외부 프로그램을 연결한 것임! -> try catch
			
		}
	}
}
