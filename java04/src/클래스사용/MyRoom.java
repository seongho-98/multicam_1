package 클래스사용;

import 클래스만들기.Dog;
import 클래스만들기.전화기;

public class MyRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		전화기 phone = new 전화기();
		
		System.out.println(phone);
		phone.call();
		phone.picture();
		phone.size = 11;
		phone.speaker = "바나나";
		System.out.println(phone.size);
		
		전화기 phone2 = new 전화기();
		phone2.call();
		phone2.size = 120;
		System.out.println(phone2.size);
		phone2.picture();
		
		Dog myDog1 = new Dog();
		
		myDog1.backLeg();
		myDog1.frontLeg();
		
		System.out.println(myDog1.full);
		myDog1.eat();
		System.out.println(myDog1.full);

		myDog1.name = "동길이";
		myDog1.callDog();
	}

}
