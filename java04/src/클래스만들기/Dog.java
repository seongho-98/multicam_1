package 클래스만들기;

public class Dog {
	
	//공통적인 성질
	public String name;
	public boolean full = false;
	//다리는 4개, 코도 있음.. 이런건??
	public static String[] legs = {"앞발", "뒷발"};
	
	public void callDog() {
		
		System.out.println(this.name +"가 왔습니다");
	}
	
	public void eat() {
		this.full = true;
		System.out.println(this.name+"이 밥을 먹고 행복해합니다");
	}
	
	public void frontLeg() {
		System.out.println(legs[0]+"를 내밀었습니다.");
	}
	public void backLeg() {
		System.out.println(legs[1]+"를 내밀었습니다.");
	}
	
}
