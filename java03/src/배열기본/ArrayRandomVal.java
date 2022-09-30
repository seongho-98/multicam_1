package 배열기본;

import java.util.Random;

public class ArrayRandomVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		int[] arr = new int[1000];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(45);
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
