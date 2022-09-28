package 반복문;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class KPOP_window {
	private static JTextField txtKpop;
	private static JTextField input1;
	private static JTextField input2;
	private static JTextField input3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		
		f.setSize(381, 549);
		f.getContentPane().setLayout(null);
		
		txtKpop = new JTextField();
		txtKpop.setEditable(false);
		txtKpop.setBackground(new Color(240, 240, 240));
		txtKpop.setFont(new Font("굴림", Font.BOLD, 17));
		txtKpop.setText("K-pop 인기투표");
		txtKpop.setHorizontalAlignment(SwingConstants.CENTER);
		txtKpop.setBounds(49, 23, 275, 39);
		f.getContentPane().add(txtKpop);
		txtKpop.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1. 아이유-라일락");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(171, 87, 153, 24);
		f.getContentPane().add(lblNewLabel);
		
		input1 = new JTextField();
		input1.setFont(new Font("굴림", Font.BOLD, 26));
		input1.setHorizontalAlignment(SwingConstants.CENTER);
		input1.setText("0표");
		input1.setBackground(new Color(240, 240, 240));
		input1.setBounds(201, 122, 116, 62);
		f.getContentPane().add(input1);
		input1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("2. 프로미스나인");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1.setBounds(171, 220, 153, 24);
		f.getContentPane().add(lblNewLabel_1);
		
		input2 = new JTextField();
		input2.setHorizontalAlignment(SwingConstants.CENTER);
		input2.setFont(new Font("굴림", Font.BOLD, 26));
		input2.setText("0표");
		input2.setColumns(10);
		input2.setBackground(SystemColor.menu);
		input2.setBounds(201, 255, 116, 62);
		f.getContentPane().add(input2);
		
		JLabel lblNewLabel_2 = new JLabel("3. 스테아씨 - ASAP");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_2.setBounds(171, 356, 153, 24);
		f.getContentPane().add(lblNewLabel_2);
		
		input3 = new JTextField();
		input3.setText("0표");
		input3.setHorizontalAlignment(SwingConstants.CENTER);
		input3.setFont(new Font("굴림", Font.BOLD, 26));
		input3.setColumns(10);
		input3.setBackground(SystemColor.menu);
		input3.setBounds(201, 391, 116, 62);
		f.getContentPane().add(input3);
		
		JButton input1_btn = new JButton("New button");
		input1_btn.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\계획표.png"));
		input1_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1_ =  input1.getText();
				int input1__ = Integer.parseInt(input1_.split("표")[0]);
				
				input1__ ++;
				
				input1.setText(input1__ + "표");
				
			}
		});
		input1_btn.setBounds(49, 87, 97, 97);
		f.getContentPane().add(input1_btn);
		
		JButton input2_btn = new JButton("New button");
		input2_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input2_ =  input2.getText();
				int input2__ = Integer.parseInt(input2_.split("표")[0]);
				
				input2__ ++;
				
				input2.setText(input2__ + "표");
				
			}
		});
		input2_btn.setBounds(49, 221, 97, 97);
		f.getContentPane().add(input2_btn);
		
		JButton input3_btn = new JButton("New button");
		input3_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input3_ =  input3.getText();
				int input3__ = Integer.parseInt(input3_.split("표")[0]);
				
				input3__ ++;
				
				input3.setText(input3__ + "표");
			}
		});
		input3_btn.setBounds(49, 357, 97, 97);
		f.getContentPane().add(input3_btn);
		
		JButton init_btn = new JButton("초기화");
		init_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1.setText("0표");
				input2.setText("0표");
				input3.setText("0표");
			}
		});
		init_btn.setBackground(new Color(136, 126, 203));
		init_btn.setBounds(134, 463, 97, 23);
		f.getContentPane().add(init_btn);
		
		f.setVisible(true);
	}
}
