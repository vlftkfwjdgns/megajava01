package 변수종류;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count; // 전역변수(global)
	// 멤버변수는 모두 전역변수
	// 전역변수는 자동으로 초기화!

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터");
		// f는 지역변수(local)
		// 지역변수는 자동 초기화를 안해줌.
		// 지역변수는 프로그래머가 초기화를 해주어야함.
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(320, 315);
		f.getContentPane().setLayout(null);
		JLabel result = new JLabel("0");
		// result는 지역변수
		// 프로그램은 순차적으로 실행
		// 아래의 객체들은 위에서 인식 불가
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				result.setText(count + "");

			}
		});
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD));
		btnNewButton.setBounds(12, 20, 93, 33);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("0초기화");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				result.setText(count + "");

			}
		});
		button.setFont(button.getFont().deriveFont(button.getFont().getStyle() | Font.BOLD));
		button.setBounds(117, 20, 90, 33);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("1빼기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				result.setText(count + "");

			}
		});
		button_1.setFont(button_1.getFont().deriveFont(button_1.getFont().getStyle() | Font.BOLD));
		button_1.setBounds(219, 20, 73, 33);
		f.getContentPane().add(button_1);

		result.setForeground(Color.RED);
		result.setFont(result.getFont().deriveFont(result.getFont().getStyle() | Font.BOLD, 100f));
		result.setBounds(109, 139, 170, 104);
		f.getContentPane().add(result);

		f.setVisible(true);
	}
}
