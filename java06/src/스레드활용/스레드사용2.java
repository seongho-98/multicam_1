package 스레드활용;

import javax.swing.JOptionPane;

public class 스레드사용2 {
	T1 폰;
	T2 알람;
	int time;

	public 스레드사용2() {
		폰 = new T1();
		폰.start();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		스레드사용2 스레드사용 = new 스레드사용2();
	}

	public class T1 extends Thread {
		@Override
		public void run() {
			String input = JOptionPane.showInputDialog("몇 분 뒤에 알람을 설정할까요?");
			time = Integer.parseInt(input);
			알람 = new T2();
			알람.start();
			while(true) {
				System.out.println("핸드폰 사용중");
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

	public class T2 extends Thread {
		@Override
		public void run() {
						
			for(int i = time; i >0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			JOptionPane.showMessageDialog(null, "일어나실 시간이에요");
			
			알람.stop();
			
		}
	}
}
