package 연산자;

import javax.swing.JOptionPane;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("오늘의 몸무게");
		
		double saved = 72.2;
		
		double today = Double.valueOf(input);
		
		double change = (saved - today);
		
		if(change > 2 || change < -2 ) {
			System.out.println("성공");
		}else {
			System.out.println("다이어트 실패");
		}
	}

}
