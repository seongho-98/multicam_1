package 스레드;

import javax.swing.JOptionPane;

public class 카운터스레드 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i = 20; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i == 0) {
				JOptionPane.showMessageDialog(null,"사용시간이 다 되었습니다.");
			}
		}
	}
}
