package 클래스만들기;

public class 계좌 {


	public String customer;
	public String account;
	public int money;
	
	public void deposit(int money) {
		System.out.println(customer + "님이 " + account+"로 "+money+"를 입급하셨습니다.");
	}
	public void withdrawal(int money) {
		System.out.println(customer + "님이 " + account+"에서 "+money+"를 출금하셨습니다.");
	}
	
}
