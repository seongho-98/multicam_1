package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 통신사 입력, 전화번호 입ㄹ겨, 가입자 입력
		// 출력 : 다이얼로그로 홍길동님은 skt에 ~~로 가입되셨습니다.
		
		String telecom = JOptionPane.showInputDialog("통신사");
		String tel = JOptionPane.showInputDialog("전화번호");
		String name = JOptionPane.showInputDialog("이름");
		
		String result = "다이얼로그로 " + name +"님은 " + telecom + "에 " +tel + "로 가입되셨습니다.";
		
		JOptionPane.showMessageDialog(null, result);
	}

}
