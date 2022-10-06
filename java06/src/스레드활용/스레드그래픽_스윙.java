package 스레드활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽_스윙 extends JFrame {

	JLabel count; //스레드그래픽 아래 전역으로 사용할 변수들임
	JLabel img;
	JLabel day;
	
	카운터스레드2 t1;
	시각스레드2 t2;
	배열스레드2 t3;
	
	static 스레드그래픽_스윙 f;
	
	public 스레드그래픽_스윙() {
		
		getContentPane().setBackground(Color.green); //ContentPane()를 가져와서 setBackGround를 바꿔줘야함
		setSize(800,300);
		
		count = new JLabel("카운터");
		img = new JLabel("");
		day = new JLabel("시각");
		Font font = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		//img.setFont(font);
		day.setFont(font);
		
		add(count,BorderLayout.WEST); //JFrame을 상속받았어서 JFrame의 add 등을 이런 형태로 사용가능함
		add(img,BorderLayout.EAST);
		add(day,BorderLayout.SOUTH);
		
		setVisible(true);
		
		t1 = new 카운터스레드2();
		t2 = new 시각스레드2();
		t3 = new 배열스레드2();
		
		t1.start();
		t2.start();
		t3.start();
	}

	public static void main(String[] args) {

		// main은 start 용으로만 사용하는 게 좋음! main함수는 static이라, static 함수나 변수를 사용하는 일이 많은데, static을 최소한으로 사용해야함.
		// 나머지 것들은 객체를 생성해서 사용하도록!

		// main에서 작업은 별로 안하고, 생성자로 빼서 쓰든, 일반 메서드 내에서 작업을 많이 함
		f = new 스레드그래픽_스윙(); // 스태틱이 없는 일반 메서드에서 메인에서 처리해야할 작업을 할 수 있음.
		//코드는 메인 밖에서!
	}

	public class 시각스레드2 extends Thread { // 내부클래스 : 변수 공유 목적..! 잘 쓰이진 않음
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
				//System.out.println(date); // toString()으로 시, 분, 초가 찍히도록 Date가 되어있음
				day.setText(date.toString());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // JAVA 프로그램 말고 외부 프로그램을 연결한 것임! -> try catch

			}
		}
	}

	public class 배열스레드2 extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String[] image = { "1.png", "2.png", "3.png", "4.png", "5.png", };

			for (int i = 0; i < image.length; i++) {
				//System.out.println("이미지 >> " + img[i]);
				
				//img.setIcon());
				ImageIcon icon = new ImageIcon(image[i]);
				img.setIcon(icon);
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	public class 카운터스레드2 extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub

			for (int i = 10; i >= 0; i--) {
				//System.out.println(i);
				count.setText("카운트 >> " +i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (i == 0) {
					//JOptionPane.showMessageDialog(f, "사용시간이 다 되었습니다.");
					
					t2.stop();
					t3.stop();
					
					dispose();
					t1.stop();
					//스레드 종료에 순서를 잘 지켜줘야함! t1을 제일 먼저 종료시키면 t2.stop() 부터 적용이 안됨
				}
			}
		}
	}

}
