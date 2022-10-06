package 클래스사용;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3; //t3이 선언안되어있어서 에러가 났었음.. 아마 버튼보다 밑에 t3이 선언되어 있어서 그런듯

	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	public void openDiary() {
		JFrame f = new JFrame();
		

		f.getContentPane().setBackground(new Color(52, 67, 69));
		f.setSize(500,541);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘날짜");
		lblNewLabel.setForeground(new Color(181, 198, 200));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(35, 144, 124, 38);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\1.png"));
		lblNewLabel_1.setBounds(66, 21, 344, 80);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(171, 144, 228, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("제목");
		lblNewLabel_2.setForeground(new Color(181, 198, 200));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2.setBounds(35, 206, 124, 38);
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(171, 206, 228, 38);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				try {
					//스트림 생성
					FileWriter file = new FileWriter("file.txt"); // 이미지 파일은 만들지 못함
					
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					
					file.close(); // 데이터를 다 보냈다고 알려주는 역할도 함! -> 이후 파일을 만듦
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("에러 발생함 : >>>"+e1);
				}
			}
			
			
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Camera Roll\\source.png"));
		btnNewButton.setBounds(181, 418, 198, 45);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("내용");
		lblNewLabel_2_1.setForeground(new Color(181, 198, 200));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(35, 270, 124, 38);
		f.getContentPane().add(lblNewLabel_2_1);
		
		t3 = new JTextArea();
		t3.setBounds(171, 270, 228, 139);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_3 = new JLabel("파일에 저장이 되도록 할 것임!");
		lblNewLabel_3.setForeground(new Color(181, 198, 200));
		lblNewLabel_3.setBounds(12, 357, 147, 52);
		f.getContentPane().add(lblNewLabel_3);
		
		f.setVisible(true);
	}
}
