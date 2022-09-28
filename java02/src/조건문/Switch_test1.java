package 조건문;

public class Switch_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JAVA";

		switch (name) {

		case "JAVA":
			System.out.println("자바 강의실은 1011호입니다");
			break;
		case "C":
			System.out.println("C언어 강의실은 1001호 입니다");
			break;
		case "PYTHON":
			System.out.println("파이썬 강의실은 1101호 입니다");
			break;
		default:// 생략가능
			System.out.println("중앙 안내소로 와주시길 부탁드립니다.");
			break;
		}
	}

}
