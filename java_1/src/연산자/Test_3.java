package 연산자;

import javax.swing.JOptionPane;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char pw_saved = 'p';
		
		String pw = JOptionPane.showInputDialog("암호 입력 : ");
		
		String input = JOptionPane.showInputDialog("오늘의 몸무게");
		
		double saved = 72.2;
		
		double today = Double.valueOf(input);
		
		double change = (saved - today);
		
		if(pw.equals(Character.toString(pw_saved)) && (change > 2 || change < -2 )) {
			System.out.println("PASS!");
		}else {
			System.out.println("재도전");
		}
	}

}
