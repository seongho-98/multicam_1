package 클래스만들기;

public class 전화기 {

	//main 함수를 넣지 않는다
	//전화기가 가지는 공통 성질과 기능을 정의해야함.
	
	public int size; // 전화기마다 사이즈가 다 다르니까 여기선 값을 할당하지 않음.
	public String speaker;
	//public을 안 쓰면 클래스 만들기 패키지 에서만 사용이 가능함.
	
	public void call() {
		System.out.println("전화를 거는중입니다.");
	}
	
	public void picture() {
		System.out.println("찰칵");
	}
}
