package 배열응용;

import java.util.Scanner;

public class StringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("전화번호를 입력해주세요(000-0000-0000 이나 000-000-0000 형태) >>> ");
		String input = sc.next().trim();

		sc.close();
		String[] arr = input.split("-");

		String res = "고객님의 통신사는 ";
		if (arr[0].equals("011")) {
			res += "SK";
		} else if (arr[0].equals("019")) {
			res += "LG";
		} else {
			res += "Apple";
		}

		//boolean old = false;

		if (arr[1].length() <= 3) {
			//old = true;
			res += " 오래된 폰이네요.";
		}else {
			res += " 최신 폰이군요.";
		}

		String input2 = input.replace("-", "");

		boolean valid = false;

		if (input2.length() >= 10) {
			valid = true;
		}
		//String res = "";
		if (valid) {
			//res = "고객님의 통신사는 " + telcom + "이고, 올프 폰의 여부는 " + old + "이군요.";
			System.out.println(res);
		} else {
			//res = "유효하지 않은 전화번호입니다.";
			System.out.println("유효하지 않은 전화번호입니다.");
		}

		//System.out.println(res);
	}

}
