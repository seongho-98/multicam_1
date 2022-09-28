package 순차문;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class Cons_input_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나에 대한 정보 입력");
		System.out.println("=================");
		System.out.print("이름 입력 >>");
		String name = sc.next();
		System.out.print("나이 입력 >>");
		int age = sc.nextInt();
		System.out.print("취미 입력 >>");
		String hobby = sc.next();
		
		System.out.println("=================");

		System.out.println("나의 이름 : "+name);
		System.out.println("나의 나이 : "+ age + "세");
		System.out.println("나의 취미 : "+hobby);
	}

}

//		JButton b1 = new JButton();
//		JButton b2 = new JButton();
//		JTextArea text_a = new JTextArea();
//		
//		Random rand = new Random();