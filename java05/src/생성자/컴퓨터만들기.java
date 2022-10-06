package 생성자;

public class 컴퓨터만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		컴퓨터 myCom = new 컴퓨터(2000000, "Apple", 100,200);

		System.out.println(myCom.price);
		System.out.println(myCom.com);
		System.out.println(myCom.height);
		System.out.println(myCom.width);
		
		int[] monitor = new int[2];
		monitor[0] = 1000;
		컴퓨터 myCom2 = new 컴퓨터(20000,monitor);
		System.out.println(myCom2.monitor[2]);

		//컴퓨터 myCom3 = new 컴퓨터(20000, {1000, 2000} );
		//System.out.println(myCom3.height);
	}
	
	

}
