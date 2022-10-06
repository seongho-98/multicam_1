package 상속;

public class 남자사람 extends 사람 {

	//멤버변수 
		//사람 : 2개
	//멤버메서드
		//Object : 8개
		//사람 : 2개
	
	int size;
	
	public void 달리다() {
		System.out.println("빨리달리다.");
	}

	@Override
	public String toString() {
		return "남자사람만들기 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
	
	//상속받은 것도 toString() 가능!
}
