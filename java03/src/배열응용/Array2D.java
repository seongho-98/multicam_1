package 배열응용;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n2 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for(int i = 0; i < n2.length; i++) {
			for(int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
