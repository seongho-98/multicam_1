package 반복문;

import java.util.Scanner;

public class While_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		char stop = ' ';
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(true) {
			System.out.print("입력(1) 아이유, (2) 유재석, (3) 방탄 >> ");
			input = sc.nextInt();
			
			if (input == 1) {
				a ++;
			}else if (input == 2) {
				b ++;
			}else if (input ==3) {
				c ++;
			}else {
				continue;
			}
			
			System.out.print("끝낼까요 ? (o,x) : ");
			stop = sc.next().charAt(0);
			
			if(stop == 'o') {
				break;
			}else {
				continue;
			}
		}
		System.out.println("아이유 : " + a);
		System.out.println("유재석 : " + b);
		System.out.println("방탄 : " + c);
	}

}
