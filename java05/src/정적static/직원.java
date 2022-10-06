package 정적static;

public class 직원 {

	String name;
	int age;
	String gender;
	
	static int total_worker;
	static int total_age;
	
	public 직원(String name, int age, String gender) {
		total_worker++;
		total_age += age;
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public static double aveAge() {
		return total_age / (double)total_worker;
	}

	@Override
	public String toString() {
		return "직원이름 : " + name + ", 나이 : " + age + ", 성 : " + gender;
	}
	
	
	
	
	
	
}
