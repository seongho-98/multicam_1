package 조건문;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("암호를 입력 : ");
		String pw = sc.next();
		
		String db_pw = "123123";
		
		if (pw.equals(db_pw)) {
			System.out.println("들어오세요");
		}else {
			System.out.println("출입 불가합니다.");
		}
		
	}

}
