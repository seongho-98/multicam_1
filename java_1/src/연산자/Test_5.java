package 연산자;

import javax.swing.JOptionPane;

public class Test_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.14;
		String input = JOptionPane.showInputDialog("반지름 입력");
		
		double rad = Double.parseDouble(input);
		
		double res = rad * rad * pi;
		
		System.out.println(res);
	}

}
