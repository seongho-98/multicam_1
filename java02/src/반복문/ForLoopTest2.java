package 반복문;

public class ForLoopTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 33; i <223; i++) {
			sum += i;
		}
		System.out.println("3~222 더하기 : "+sum);
		
		sum = 0;
		
		for(int i =  55; i <=4500; i += 2) {
			sum += i;
		}
		System.out.println("55~4500 더하기 : "+sum);
		sum = 0;
		
		for(int i =  0; i <=6000; i += 5) {
			sum += i;
		}
		System.out.println("0~5000 더하기 : "+sum);
		
	}

}
