package 정적static;
import java.util.ArrayList;

public class 일지 {

	String doing;
	int hour;
	String place;
	
	//static ArrayList<String> doings = new ArrayList<String>();
	//static ArrayList<String> places = new ArrayList<String>();
	
	static int total_h;
	static int cnt;
	
	public 일지(String doing, int hour, String place) {
		cnt++;
		total_h += hour;
		//doings.add(doing) ;
		this.doing = doing;
		this.hour = hour;
		this.place = place;
	}

	//일반메서드임.
	public static double getAve() {
		return total_h / (double)cnt;
	}
	
	@Override
	public String toString() {
		return  doing + "을 " + hour + "시간동안 " + place + "에서 했습니다.";
	}
	
}
