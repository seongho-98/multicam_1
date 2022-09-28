package 변수;

import javax.swing.JOptionPane;

public class 친구정보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String add = "강남구";
		
		int age = 100;
		
		String name = "고길동";
		
		String tel = "010-2222-2222";
		
		System.out.println("사는곳 : "+add+"\n이름 : "+name+"\n번호 : "+tel);
		
		String data = JOptionPane.showInputDialog("이름 입력 : ");
		System.out.println("당신이 입력한 이름인 : "+data);
	}

}
