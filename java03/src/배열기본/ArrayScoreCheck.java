package 배열기본;

import java.util.Random;

public class ArrayScoreCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 답안지, 대답안 공간 만들기

		int[] arr1 = new int[990];
		int[] arr2 = new int[990];

		// 랜덤하게 만들어주는 부품 만들어라
		Random rd = new Random();

		// 990번 반복해서 답안지, 대답안에 숫자를 넣어라. 1~4 범위
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rd.nextInt(3) + 1;
			arr2[i] = rd.nextInt(3) + 1;
		}

		int cnt = 0;
		// 990번 비교.. 숫자가 동일하면 점수 1을 늘려줌
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				cnt ++;
			}
		}
		
		
		// 점수 프린트
		System.out.println("점수 : " +cnt);
	}

}
