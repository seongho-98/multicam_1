package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class 프로젝트가안1 {
	private static JTextField textField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("업체 선택");
		
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("플랫폼이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel.setBounds(68, 38, 289, 39);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("기부 페이지1");
		lblNewLabel_1.setBounds(68, 109, 314, 28);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("기부 페이지2");
		lblNewLabel_1_1.setBounds(68, 147, 314, 28);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("기부 페이지3");
		lblNewLabel_1_2.setBounds(68, 188, 314, 28);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("기부 페이지1");
		lblNewLabel_1_3.setBounds(68, 226, 314, 28);
		f.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("기부 페이지1");
		lblNewLabel_1_4.setBounds(68, 262, 314, 28);
		f.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("기부 페이지1");
		lblNewLabel_1_5.setBounds(68, 297, 314, 28);
		f.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("기부 페이지1");
		lblNewLabel_1_6.setBounds(68, 332, 314, 28);
		f.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("기부 페이지1");
		lblNewLabel_1_7.setBounds(68, 366, 314, 28);
		f.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("기부 페이지1");
		lblNewLabel_1_8.setBounds(68, 398, 314, 28);
		f.getContentPane().add(lblNewLabel_1_8);
		
		textField = new JTextField();
		textField.setText("클릭하면 페이지 이동");
		textField.setBounds(168, 113, 163, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		f.setVisible(true);
	}

}
