package 반복문;

import java.util.Scanner;

public class While_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int front = 0;
		int back = 0;
		while(true) {
			System.out.print("숫자 입력1 >>");
			int input1 = sc.nextInt();
			System.out.print("숫자 입력2 >>");
			int input2 = sc.nextInt();

			if (input1 > input2) {
				System.out.println("앞의 숫자가 더 큼");
				front ++;
			} else if (input1 == input2) {
				System.out.println("같음");
			} else {
				System.out.println("뒤의 숫자가 더 큼");
				back++;
			}
			
			System.out.print("더 하시겠습니까? (x, o) : ");
			char input3 = sc.next().charAt(0);
			if(input3 == 'o') {
				continue;
			}else {
				break;
			}
		}
		System.out.println("앞의 숫자가 더 큰 경우 : " + front);
		System.out.println("뒤의 숫자가 더 큰 경우 : " + back);
	}
}
