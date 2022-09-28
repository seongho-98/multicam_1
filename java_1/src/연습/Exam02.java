package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키 199.9일때 적정 몸무게 출력
		// 키 - 100 * 0.9  double.parse
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("키를 입력 : "));
		
		JOptionPane.showMessageDialog(null, "적정 무게 : " + (height - 100) * 0.9);
		
	}

}
