package 생성자;

public class 통장만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		통장 아빠 = new 통장("홍길동", "050512-112312", 10000);
		
		System.out.println(아빠.name);
		System.out.println(아빠.ssn);
		System.out.println(아빠.money);
	}

}
