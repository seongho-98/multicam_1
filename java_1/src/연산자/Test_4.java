package 연산자;

import javax.swing.JOptionPane;

public class Test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = JOptionPane.showInputDialog("1학기 체육 성적");
		String s2 = JOptionPane.showInputDialog("1학기 수학 성적");
		String s3 = JOptionPane.showInputDialog("1학기 영어 성적");
		String s4 = JOptionPane.showInputDialog("1학기 국어 성적");
		
		int sc1 = Integer.parseInt(s1);
		int sc2 = Integer.parseInt(s2);
		int sc3 = Integer.parseInt(s3);
		int sc4 = Integer.parseInt(s4);
			
		float res = (sc1 + sc2 + sc3 + sc4) / 4.0f ;
		System.out.println("일학기 평균 : " + res);
	}

}
