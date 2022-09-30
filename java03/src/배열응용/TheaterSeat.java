package 배열응용;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TheaterSeat {

	static int seat = 13000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		
		f.setSize(550,750);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		
		//int[] seat = new int[501]; // 몇자리가 예약되었는지 확인하는 용도
		
		JButton[] btn = new JButton[501];
		for (int i  = 0; i <= 500; i++) {
			btn[i] = new JButton("좌석 "+(i+1));
			f.add(btn[i]);
			
			//만들어 진 것에 action을 추가해줌
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String s = e.getActionCommand();  //버튼 위의 글자를 가지고 와준다.
					JOptionPane.showMessageDialog(f, s+" 예약 완료");
					int n = Integer.parseInt(s.split(" ")[1]) -1; //버튼의 번호를 가져옴
					btn[n].setEnabled(false);
					btn[n].setBackground(Color.red);

					
					//누를 때 마다 cnt를 0으로 하고 for 문을 돌면서 예약된 걸 다 뒤져보는데.. 좋은 코드는 아님
					int cnt = 0;
															
					for(int i = 0; i <= 500; i++) {
						if(btn[i].getBackground().equals(Color.red)) { //버튼의 색이 red면 선택이 된 것으로 판단함
							cnt++;
						}
					}
					JOptionPane.showMessageDialog(f, "예약된 좌석 : " + cnt);
					
					//추후에 다른 방식으로 출력해주는게 좋을듯
					JOptionPane.showMessageDialog(f, "결제 금액 : " + cnt * seat);
					
				}
				
				
			});
		}
		
		f.setVisible(true);
	}

}
