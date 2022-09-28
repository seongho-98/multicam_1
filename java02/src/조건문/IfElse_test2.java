package 조건문;

public class IfElse_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 88;

		String result = "";

		if (score >= 90) {
			result = "A";
		} else if (score >= 85 && score < 90) {
			result = "B+";
		} else if (score >= 80 && score < 85) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else {
			result = "D";
		}

		System.out.println("당신의 학점은 ? " + result);
	}

}
