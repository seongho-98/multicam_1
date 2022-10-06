package 클래스사용;

import 클래스만들기.계산기2;

public class 계산기2사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		계산기2 cal2_1 = new 계산기2();
		
		
		System.out.println(cal2_1.add(10, 20));
		System.out.println(cal2_1.add(10, 20.01));
		System.out.println(cal2_1.add(10.01, 20.02));
		System.out.println(cal2_1.add("10", 20));
		System.out.println(cal2_1.add()[1]);
		
		int res = cal2_1.multi(5, 2);
		System.out.println(cal2_1.div(res, 3));
	}

}
