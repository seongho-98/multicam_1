package 순차문;

import java.util.Scanner;

public class Cons_ionput_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("나의 이름은 : ");
		String name = sc.next();
		System.out.print("나의 키는 : ");
		double height = sc.nextDouble();
		System.out.print("나의 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("저녁을 먹었나요? : ");
		boolean dinner = sc.nextBoolean();
		System.out.print("나의 좌우명은? : ");
		sc.nextLine();
		String motto = sc.nextLine();
		//scanner에 남아있던 \n 가 있어서 이 부분은 바로 skip됨
		
		
		System.out.println("===================");
		
		System.out.println("내 이름은 "+name+"입니다.");
		System.out.println("내년 키는 "+(height+10)+"입니다");
		System.out.println("내년 몸무게는 "+(weight - 10)+"입니다");
		System.out.println("저는 저녁을 "+dinner+"입니다");
		System.out.println("좌우명은 "+motto+"입니다");
	}

}
