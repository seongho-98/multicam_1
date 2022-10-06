package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 중국집주문화면 {
	
	static int count1;
	static int count2;
	static int count3;
	static final int PRICE1 = 5000;
	static final int PRICE2 = 6000;
	static final int PRICE3 = 4000;
	
	private static JTextField t1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("중국집 화면");
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수");
		lblNewLabel.setBounds(288, 29, 57, 49);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setText("0");
		t1.setBounds(357, 26, 116, 52);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel img = new JLabel("");
		//img.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\짜장.jpg"));
		img.setIcon(new ImageIcon("짜장.jpg")); //상대주소로 이미지 설정해줌
		img.setBounds(140, 128, 224, 240);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제금액");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(71, 391, 350, 40); // x축, y축, 라벨의 가로 크기, 세로 크기
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				img.setIcon(new ImageIcon("짬뽕.png"));
				count1++;
				t1.setText((count1+count2+count3)+"개"); //현재 주문량 변경
				
				result.setText("결제 금액 : "+(count1 * PRICE1 + count2 * PRICE2 +count3 * PRICE3));
				f.setTitle("짬뽕 : " + count1 + " 우동 : " + count2+" 짜장 : " + count3);
			}
		});
		btnNewButton.setBounds(12, 25, 75, 53);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(new ImageIcon("우동.png"));
				count2++;
				t1.setText((count1+count2+count3)+"개"); //현재 주문량 변경
				
				result.setText("결제 금액 : "+(count1 * PRICE1 + count2 * PRICE2 +count3 * PRICE3));
				f.setTitle("짬뽕 : " + count1 + " 우동 : " + count2+" 짜장 : " + count3);
				
			}
		});
		btnNewButton_1.setBounds(93, 25, 75, 53);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(new ImageIcon("짜장.jpg"));
				count3++;
				t1.setText((count1+count2+count3)+"개"); //현재 주문량 변경
				
				result.setText("결제 금액 : "+(count1 * PRICE1 + count2 * PRICE2 +count3 * PRICE3));
				f.setTitle("짬뽕 : " + count1 + " 우동 : " + count2+" 짜장 : " + count3);
			}
		});
		btnNewButton_2.setBounds(174, 25, 75, 53);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
