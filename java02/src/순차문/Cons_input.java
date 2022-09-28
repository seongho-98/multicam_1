package 순차문;

import java.util.Scanner;

public class Cons_input {

	public static void main(String[] args) {
		//Scanner 만들고 이클립스 콘솔뷰에서 입력을 받기
		
		System.out.print("이름 입력 : ");
		Scanner sc = new Scanner(System.in); //network, file, keyboard 를 설정
		String name  = sc.next();
		System.out.println("입력받은 이름 : "+name);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("내년 나이 : " + (age + 1));
		sc.close();
	}
}
		