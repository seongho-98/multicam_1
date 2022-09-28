package 조건문;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1 입력 >>");
		int input1 = sc.nextInt();
		System.out.print("숫자 2 입력 >>");
		int input2 = sc.nextInt();

		if (input1 > input2) {
			System.out.println("앞 숫자가 큼");
		} else if (input1 == input2) {
			System.out.println("같음");
		} else {
			System.out.println("뒤의 숫자가 큼");

		}
		System.out.println();
		System.out.println("당신이 좋아하는 과목은 >> ");
		String input3 = sc.next();
		
		switch (input3) {
		case "java":
			System.out.println("JSP도 같이 공부하세요~");
			break;
		case "python":
			System.out.println("Django도 같이 공부하세요~");
			break;

		default:
			System.out.println("아하! 열공하세요~");
			break;
		}
		
	}

}
