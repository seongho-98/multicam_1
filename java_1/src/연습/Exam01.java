package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가, 세 입력받아서 사각형의 면적 출
		
		int 가로 = Integer.parseInt(JOptionPane.showInputDialog("가로 입력"));
		int 세로 = Integer.parseInt(JOptionPane.showInputDialog("세로 입력"));

		
		JOptionPane.showMessageDialog(null, (세로 * 가로));
	}

}
