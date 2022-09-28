package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class UpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ramd = new Random();
		int target = ramd.nextInt(100);
		int cnt = 0;
		int fail = 0;
		String data = JOptionPane.showInputDialog("숫자를 입력하세요");

		int data2 = Integer.parseInt(data);

		while (true) {
			cnt += 1;
			if (data2 == target) {
				System.out.println("정답!");
				break;
			} else {
				if (data2 > target) {

					System.out.println("down");
				} else {
					System.out.println("up");
				}
				fail += 1;
				data = JOptionPane.showInputDialog("숫자를 입력하세요");

				data2 = Integer.parseInt(data);
			}
		}
		System.out.println("시도 횟수 : " + cnt);
		System.out.println("틀린 수 : " + fail);

	}

}
