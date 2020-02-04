package 계산기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cal {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField result;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjoeun302-7\\Desktop\\cal.png"));
		lblNewLabel.setBounds(177, 10, 197, 76);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("숫자1:");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(49, 122, 73, 36);
		f.getContentPane().add(lblNewLabel_1);

		JLabel label = new JLabel("숫자2:");
		label.setFont(new Font("굴림", Font.PLAIN, 22));
		label.setBounds(49, 185, 73, 36);
		f.getContentPane().add(label);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 25));
		t1.setBounds(134, 122, 258, 41);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 25));
		t2.setColumns(10);
		t2.setBounds(134, 185, 258, 41);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. t1과 t2의 입력값을 가지고 온다.
				String t11 = t1.getText();
				String t22 = t2.getText();

				// 2. t1과 t2의 타입을 계산해주기 위해서 integer로 변환
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);

				// 3. 두 수를 더한다.
				int t333 = t111 + t222;
				// 4. 더한 결과를 result에 넣어준다.
				// 결과값: 300
				String s = String.valueOf(t333);
				result.setText(s);

			}
		});
		btnNewButton.setBounds(25, 297, 89, 41);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("빼기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();

				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);

				int t333 = t111 - t222;

				String s = String.valueOf(t333);
				result.setText(s);

			}
		});
		button.setBounds(135, 297, 89, 41);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("곱하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String t11 = t1.getText();
				String t22 = t2.getText();

				Double t111 = Double.parseDouble(t11);
				Double t222 = Double.parseDouble(t22);

				Double t333 = t111 * t222;

				String s = String.valueOf(t333);
				result.setText(s);

			}
		});
		button_1.setBounds(250, 297, 89, 41);
		f.getContentPane().add(button_1);

		JButton button_2 = new JButton("나누기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String t11 = t1.getText();
				String t22 = t2.getText();

				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);

				int t333 = t111 / t222;

				String s = String.valueOf(t333);
				result.setText(s);

			}
		});
		button_2.setBounds(369, 297, 89, 41);
		f.getContentPane().add(button_2);

		JLabel label_1 = new JLabel("결과화면:");
		label_1.setFont(new Font("굴림", Font.PLAIN, 22));
		label_1.setBounds(49, 380, 111, 36);
		f.getContentPane().add(label_1);

		result = new JTextField();
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.PLAIN, 25));
		result.setColumns(10);
		result.setBounds(161, 380, 258, 41);
		f.getContentPane().add(result);

		f.setVisible(true);
	}
}
