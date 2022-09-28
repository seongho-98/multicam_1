package 조건문;

import java.util.Date;

public class Switch_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		int month = date.getMonth() + 1;
		int day = date.getDay(); // 일요일 : 0
		
		switch (day) {
		case 0: case 6:
			System.out.println("주말엔 책 한권을 읽어봅시다");
			break;

		default:
			System.out.println("연구실로 출근!ㅋ");
			break;
		}
				
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;

		default:
			System.out.println("가을");
			break;
		}
	}

}
