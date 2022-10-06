package 생성자;

public class 컴퓨터 {

	int price;
	String com;
	//public int[] monitor = new int[2];
	int height;
	int width;
	int[] monitor;

	public 컴퓨터(int price, int[] monitor) {
		this.price = price;
		this.monitor = monitor;
	}
	public 컴퓨터(int price, int height, int width) {
		this.price = price;
		this.height = height;
		this.width = width;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public 컴퓨터(int price, String com, int height, int width){
		this.price = price;
		this.com = com;
		this.height = height;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return " 컴퓨터 [price = " + price + ", com = ";
	}
}
