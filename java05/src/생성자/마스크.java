package 생성자;

public class 마스크 {
	
	public 마스크(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}
	//멤버변수(역할), 전역변수(범위), 인스턴스변수(객체 생성후 실제 존재하는 값)
	public String color;
	public int price;
	public int count;
	//멤버변수의 원본은 클래스 원본 영역에 저장되고, 객체가 생성될 때 힙 영역에 동적으로 복사됨
	
	//객체 생성후, 멤버변수를 나중에 넣어도 괜찮다면 기본 생성자를 사용하면 됨.
	//붕어빵이나 통장같이 만드는것과 동시에 뭔가를 해줘야한다면(멤버 변수의 초기화가 생성가 동시에 되어야한다면), 생성자를 사용해야함.
	//기본적으로 묵시적으로 하나는 만들어줌 -> 생성자를 만들면 묵시적으로 생성은 안해줌
	@Override
	public String toString() {
		return "마스크 [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
