package 정적static;

public class 직원만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 24, "여");
		직원 work3 = new 직원("고길동", 36, "남");
		
		System.out.println("우리 회사의 직원 수 : " + 직원.total_worker);
		
		System.out.println(work1.toString());
		System.out.println(work2.toString());
		System.out.println(work3.toString());
		
		System.out.println("우리 회사의 평균 연령 : " + (int)직원.aveAge());
	}

}
