package 생성자;

public class 통장 {

	//멤버변수, 글로벌변수
	String name;
	String ssn; //주민번호
	int money;

	//new 객체 생성시 입력값을 자동 초기화, 객체 생성할 때 필요한 값을 한정시킬 수 있음.
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
}
