package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class 프로젝트가안 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("기부 플랫폼");
		
		f.setSize(400,400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("**나눔의집");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(54, 10, 247, 55);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("사진");
		textField.setBounds(23, 78, 155, 176);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("금액입력칸");
		textField_1.setBounds(35, 304, 116, 21);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("업체 설명");
		textPane.setBounds(214, 75, 140, 179);
		f.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("후원");
		btnNewButton.setBounds(214, 303, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);
	}
}
