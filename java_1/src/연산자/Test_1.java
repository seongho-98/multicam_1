package 연산자;

import javax.swing.JOptionPane;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char pw_saved = 'p';
		
		String pw = JOptionPane.showInputDialog("암호 입력 : ");
				
		
		if(pw.equals(Character.toString(pw_saved))) {
			System.out.println("PASS!");
		}else {
			System.out.println("재입력 바람.");
		}
	}

}
