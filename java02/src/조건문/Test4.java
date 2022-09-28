package 조건문;

import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();

		int hour = date.getHours();

		if (hour <= 11) {
			System.out.println("굿모닝");
		} else if (hour <= 15) {
			System.out.println("굿애프터눈");
		} else if (hour <= 19) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}

		int month = date.getMonth();

		switch (month) {
		case 2:
			System.out.println("28일");
			break;
		case 1:
		case 3:
		case 5:
		case 8:
		case 9:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		default:
			System.out.println("30일");
			break;
		}
	}

}
