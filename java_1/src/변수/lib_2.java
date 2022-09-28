package 변수;

import javax.swing.JOptionPane;

public class lib_2 {

	public static void main(String[] args) {
		// 자주 쓰는 건 new 없이 사용함
		// System, JOptionPane, String, 문자 -> 숫자 변환(Integer, Float 등등)
		
		// 자주 안 쓰는 라이브러리는 new로 불러와서 사용
		
		String age = JOptionPane.showInputDialog("나이 입력");
		String hobby = JOptionPane.showInputDialog("취미 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		
		
		JOptionPane.showMessageDialog(null, "나이는 : " + age);
		JOptionPane.showMessageDialog(null, "취미는 : " + hobby);
		JOptionPane.showMessageDialog(null, "이름은 : " + name);
	}
}
