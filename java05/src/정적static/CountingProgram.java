package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.FlowLayout;

public class CountingProgram {
	static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("카운팅프로그램");
		f.setSize(300,300);
		
		JLabel number = new JLabel("0");
		Font font = new Font("궁서", Font.BOLD, 150);
		
		number.setFont(font);
		number.setForeground(Color.red);
		
		JButton b1 = new JButton("1더하기");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				number.setText(count + "");
			}
		});;
		
		JButton b2 = new JButton("초기화");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count = 0;
				number.setText(count + "");
			}
		});;

		JButton b3 = new JButton("초기화");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count--;
				number.setText(count + "");
			}
		});;

		b1.setBackground(Color.green);
		b1.setForeground(Color.pink);
		
		b2.setBackground(Color.blue);
		b2.setForeground(Color.black);
		
		b3.setBackground(Color.green);
		b3.setForeground(Color.pink);
		
		FlowLayout flow = new FlowLayout();
		
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(number);
		
		f.setVisible(true);
	}
}
