package 조건문;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점심 메뉴 (짜장면, 라면, 회) : ");
		
		String menu = sc.next();
		
		switch (menu) {
		case "짜장면":
			System.out.println("천리장성 짜장면을 추천합니다");
			break;
		case "라면":
			System.out.println("라면은 역시 신라면!");
			break;
		case "회":
			System.out.println("연어 바치에서 싱싱한 연어회를 드셔보새요~");
			break;

		default:
			System.out.println("짜장면, 라면, 회를 입력해주세요");
			break;
		}
	}

}
