package 정적static;

public class 일지만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		일지[] day = new 일지[3];
		
		day[0] = new 일지("자바", 10, "부산");
		day[1] = new 일지("파이썬", 20, "울산");
		day[2] = new 일지("자바스크립트", 30, "서울");
		
		System.out.println("전체 하는 일의 시간 : " + (일지.total_h));
		System.out.println("평균 하는 일의 시간 : " + (일지.total_h / 일지.cnt));
		System.out.println((int)일지.getAve());
		
		for(int i = 0; i < day.length; i++) {
			System.out.println((i+1)+"일에는 " + (day[i].toString()));	
		}
		
		System.out.println("며칠 간 했는지 : " + (일지.cnt));
	}

}
