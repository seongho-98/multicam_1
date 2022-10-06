package 생성자;

public class 일지 {

	public static int count;
	int count2;
	String doing;
	int time;
	String location;
	
	public 일지(String doing, int time, String location) {
		count++;
		count2++;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "일지 [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
}
