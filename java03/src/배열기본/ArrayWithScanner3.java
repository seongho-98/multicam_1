package 배열기본;

import java.util.Scanner;

public class ArrayWithScanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] arr1 = new String[3];
		String[] arr2 = new String[3];

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("작년에 가고 싶었던 곳은? (" + (i + 1) + ")순위 >>");
			arr1[i] = sc.next();
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("올해 가고 싶은 곳은? (" + (i + 1) + ")순위 >>");
			arr2[i] = sc.next();
		}

		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			if (arr1[i].equals(arr2[i])) {
				cnt++;
			}
		}
		System.out.println("일치하는 곳 : " + cnt);
	}

}
