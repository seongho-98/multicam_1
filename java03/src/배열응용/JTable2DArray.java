package 배열응용;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 200);

		String[] header = { "컴퓨터", "영어", "수학", "체육" };

		Random rd = new Random();
		String[][] contents = {
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
				{ ""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100)),""+(rd.nextInt(100))},
		};

		contents[0][0] = "999";
		contents[contents.length-1][3] = "999";
		JTable table = new JTable(contents, header); // 내용, 헤더 순으로 입력
		JScrollPane scroll = new JScrollPane(table); // 스크롤 안에 테이블을 넣는 평태임을 주의
		f.add(scroll); // 스크롤을 넣어줌

		f.setVisible(true);
	}

}
