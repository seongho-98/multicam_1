package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 생성자오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1 = new JFrame();
		JFrame f2 = new JFrame("title"); //괄호 없애고 ctrl + space -> 자동생성 추천
		
		JButton b1 = new JButton();
		JButton b2 = new JButton("button text");
		
		Font font = new Font("궁서", 1, 50);
		b2.setFont(font);
		
		f2.setSize(300,300);
		f2.add(b2);
		
		f2.setVisible(true);
		
	}

}
