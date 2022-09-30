package 배열기본;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		for (int val : num) {
			System.out.println(val);
		}
	}

}
