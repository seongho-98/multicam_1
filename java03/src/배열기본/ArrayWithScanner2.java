package 배열기본;

import java.util.Scanner;

public class ArrayWithScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[5];
		String[] arr2 = new String[3];
		
		for(int i = 0; i< arr1.length; i++) {
			System.out.print("정수 입력 : ");
			arr1[i] = sc.nextInt();
		}
		
		int sum = arr1[0] + arr1[2];
		System.out.println("합 : "+sum);
		
		for(int i = 0; i< arr2.length; i++) {
			System.out.print("언어 입력 : ");
			arr2[i] = sc.next();
		}
		String res = arr2[1] +"보다는 "+ arr2[0];
		
		System.out.println(res);
		
		
	}

}
