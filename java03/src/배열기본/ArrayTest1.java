package 배열기본;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[5];
		System.out.println(arr1.length);
		arr1[0] = 100;
		System.out.println(arr1[0]);
		arr1[arr1.length-1] = 500;
		System.out.println(arr1[arr1.length-1]);
		arr1[2] = 200;
		System.out.println(arr1[2]);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(i +"번쨰 : "+ arr1[i]);
		}
		
		String[] place = {"울산","부산", "강릉", "가평", "전주"};
		
		char[] color = {'r','g','b', 'w', 'p'};
		
		double[] height = {192.2, 123.23, 188.88, 123.123, 142.23};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(place[i] +" " +color[i]+" "+height[i]);
		}
	}

}
