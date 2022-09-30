package 배열기본;

public class ArraySecUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {1,2,3,4,5,6,7};
		System.out.println("s에 저장된 주소 >> " + s); // [I@626b2d4a 는 자바 식 주소 표현 법이다.
		System.out.println(s[1]+""+s[2]);
		System.out.println(s.length);
		int[] s2 = new int[5];
			//이렇게 생성하면. RAM에는 s2 주소 1개, int형 5개.. length 값 1개 총 7개가 RAM에 올라감
			//0으로 초기화해줌
		
		s2[0] = 100;
		
		System.out.println(s[s.length-1]); 
		
	}

}
