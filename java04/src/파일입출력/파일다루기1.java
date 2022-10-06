package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일다루기1 {
	//파일 입출력은 예ㅊ외 처리를 해줘야함.. file, network, db 연결 등에는 없을 수도 있을 떄의 처리를 해줘야함.
	
	//외부와의 연결은 위험해서 에러 처리가 필요함
	public static void main(String[] args){
		// TODO Auto-generated method stub

		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		String dfilepath = 파일다루기1.class.getResource("").getPath();
		System.out.println(dfilepath); // 한글이 있어서 이상한 주소가 나옴...
		//System.out.println(System.getProperty("user.dir"));
		try {
			//스트림 생성
			FileWriter file = new FileWriter("file.txt"); // 이미지 파일은 만들지 못함
			
			file.write(s1 + "\n");
			file.write(s2 + "\n");
			file.write(s3 + "\n");
			
			file.close(); // 데이터를 다 보냈다고 알려주는 역할도 함! -> 이후 파일을 만듦
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("에러 발생함 : >>>"+e);
		}
		
	}
	

}
