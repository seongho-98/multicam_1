package 스레드;

public class 배열스레드 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] img = {"1.png","2.png","3.png","4.png","5.png",};
		
		for(int i = 0; i < img.length; i++) {
			System.out.println("이미지 >> "+img[i]);
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
