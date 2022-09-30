package 배열기본;

import java.util.Scanner;

public class ArrayWithScanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("가족 수 입력 : ");
		int n = sc.nextInt();
		
		String[] arr1 = new String[n];
		int[] arr2 = new int[n];
		double[] arr3 = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("이름 입력 >> ");
			arr1[i] = sc.next();
			System.out.print("나이 입력 >> ");
			arr2[i] = sc.nextInt();
			System.out.print("키 입력 >> ");
			arr3[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr1[i]+"의 나이 :" +" "+arr2[i] +", 키 : "+arr3[i]);
		}
	}

}
