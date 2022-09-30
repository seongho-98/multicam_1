package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//최초 .window Builder에서 2번 화면에서 시작하도록 했음.
// window Builder에서 직접 text field 에 값을 넣어줬음..
// 버튼 클릭할 때마다는 자동으로 label text가 바뀌도록..
public class Movie {

	//global 변수 선언
	static int pos = 2;
	//main이 static이라 main 에서 사용할 건 static을 해줘야함.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영화 제목
		
		
		
		String[] title = {
				"공조", "늑대사냥", "아바타", "육사오", "정직한 후보2"
		};
		
		//포스터 파일
		String[] img = {
				"1.png", "2.png", "3.png", "4.png", "5.png",
		}; //java03 바로 밑에 있는 이미지에 대한 경로..
		
		//평점
		String[] score = {
				"8.03", "5.48", "9.57", "8.04", "7.09"
		};
		
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setBackground(new Color(255, 255, 0));
		f.setSize(257,294);
		
		JLabel top = new JLabel("아바타");
		top.setBackground(new Color(255, 255, 0));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel middle = new JLabel("");
		middle.setHorizontalAlignment(SwingConstants.CENTER);
		//middle.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\3.png")); //이미지는 이렇게 넣어짐
		middle.setIcon(new ImageIcon(img[2]));
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		JLabel bottom = new JLabel("9.57");
		bottom.setBackground(new Color(255, 255, 0));
		bottom.setHorizontalAlignment(SwingConstants.CENTER);
		bottom.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(bottom, BorderLayout.SOUTH);
		
		JButton left_btn = new JButton("<<");
		left_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//<< 버튼 클릭했을 때 처리
				
				if(pos > 0) {
					pos = pos - 1;
					top.setText(title[pos]);
					bottom.setText(score[pos]);
					
					ImageIcon icon = new ImageIcon(img[pos]);
					middle.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "끝입니다");
				}
				
				
			}
		});
		left_btn.setBackground(new Color(0, 255, 0));
		left_btn.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(left_btn, BorderLayout.WEST);
		//
		JButton right_btn = new JButton(">>");
		right_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(pos < 4) {
					pos = pos + 1;
					top.setText(title[pos]);
					bottom.setText(score[pos]);
					
					ImageIcon icon = new ImageIcon(img[pos]);
					middle.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "끝입니다");
				} 
				
			}
		});
		right_btn.setBackground(new Color(0, 255, 0));
		right_btn.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(right_btn, BorderLayout.EAST);//
		f.setVisible(true);
	}

}
