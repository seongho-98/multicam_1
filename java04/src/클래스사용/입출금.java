package 클래스사용;

import 클래스만들기.계좌;

public class 입출금 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		계좌 account1 = new 계좌();
		계좌 account2 = new 계좌();
		계좌 account3 = new 계좌();
		
		account1.customer = "홍길동";
		account1.account = "123-12-12-12";
		account1.deposit(20000);
		System.out.println(account1.money);
		System.out.println(account1.customer);
		

		account2.customer = "이발소";
		account2.account = "567-57-57-57";
		account2.deposit(5000);
		
		account3.customer = "삼순이";
		account3.account = "789-79-78-78";
		account3.deposit(200000);
		
		System.out.println(account1.toString());
	}

}
