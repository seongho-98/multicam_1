package 클래스사용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//여기에만 main이 있어야함.. Diary에서 main을 없애주고,, 로그인 성공 시 Diary를 새 창으로 띄움
public class Login {
	private static JTextField id_f;
	private static JTextField pw_f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(52, 67, 69));
		f.setSize(500,428);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setForeground(new Color(181, 198, 200));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(35, 144, 124, 38);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\1.png"));
		lblNewLabel_1.setBounds(66, 21, 344, 80);
		f.getContentPane().add(lblNewLabel_1);
		
		id_f = new JTextField();
		id_f.setBounds(171, 144, 228, 38);
		f.getContentPane().add(id_f);
		id_f.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setForeground(new Color(181, 198, 200));
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2.setBounds(35, 206, 124, 38);
		f.getContentPane().add(lblNewLabel_2);
		
		pw_f = new JTextField();
		pw_f.setColumns(10);
		pw_f.setBounds(171, 206, 228, 38);
		f.getContentPane().add(pw_f);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = id_f.getText();
				String pw = pw_f.getText();
				
				String saved_id = "albert";
				String saved_pw = "123213";
				
				if(!id.equals(saved_id) ||!pw.equals(saved_pw)) {
					JOptionPane.showMessageDialog(f, "아이디 혹은 비번 다름");
				}else {
					Diary diary = new Diary();
					diary.openDiary();					
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\2.png"));
		btnNewButton.setBounds(66, 275, 123, 45);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id_f.setText("");
				pw_f.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\3.png"));
		btnNewButton_1.setBounds(251, 275, 123, 45);
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);
	}
}
