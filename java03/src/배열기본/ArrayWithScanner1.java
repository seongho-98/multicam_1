package 배열기본;

import java.util.Scanner;

public class ArrayWithScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 >> ");
			arr[i] = sc.nextInt();
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		int sum = 0;
		
		for(int x : arr) {
			sum += x;
		}
		
		System.out.println(sum);
		System.out.println(sum / Double.valueOf(arr.length));
		
	}

}
