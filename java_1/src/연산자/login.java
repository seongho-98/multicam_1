package 연산자;

import javax.swing.JOptionPane;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "1111";
		String pw = JOptionPane.showInputDialog("비번입력");

		String id_ch = "1111";
		String pw_ch = "2222";
		
		System.out.println(id == id_ch);
		System.out.println(pw == pw_ch);
		
		System.out.println(id.equals(id_ch));
		System.out.println(pw.equals(pw_ch));
		
		if(id == id_ch && pw == pw_ch) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}

}
