package 생성자;

public class 일지만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		일지 day1 = new 일지("캡스톤 수업", 2, "A13");
		System.out.println(day1.toString());
		System.out.println("static : "+일지.count); // 이렇게 접근하는걸 추천
		System.out.println(day1.count2);

		일지 day2 = new 일지("동아리 강의", 1, "A13");
		System.out.println(day1.toString());
		System.out.println("static : "+day1.count);
		System.out.println(day1.count2);
		
		일지 day3 = new 일지("교수님과 식사", 2, "라운지오");
		System.out.println(day1.toString());
		System.out.println("static : "+day1.count);
		System.out.println(day1.count2);
	}

}
