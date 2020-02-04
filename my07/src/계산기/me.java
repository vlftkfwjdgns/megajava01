package 계산기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField shoe;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);

		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBounds(38, 89, 97, 47);
		f.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("나이");
		label.setFont(new Font("굴림", Font.PLAIN, 40));
		label.setBounds(38, 214, 97, 47);
		f.getContentPane().add(label);

		JLabel label_1 = new JLabel("신발");
		label_1.setFont(new Font("굴림", Font.PLAIN, 40));
		label_1.setBounds(38, 322, 97, 47);
		f.getContentPane().add(label_1);

		name = new JTextField();
		name.setBackground(Color.ORANGE);
		name.setFont(new Font("굴림", Font.PLAIN, 40));
		name.setBounds(147, 85, 197, 59);
		f.getContentPane().add(name);
		name.setColumns(10);

		age = new JTextField();
		age.setFont(new Font("굴림", Font.PLAIN, 40));
		age.setColumns(10);
		age.setBackground(Color.ORANGE);
		age.setBounds(147, 206, 197, 63);
		f.getContentPane().add(age);

		shoe = new JTextField();
		shoe.setFont(new Font("굴림", Font.PLAIN, 40));
		shoe.setColumns(10);
		shoe.setBackground(Color.ORANGE);
		shoe.setBounds(147, 318, 197, 55);
		f.getContentPane().add(shoe);

		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				if (n.equals("") || n.equals("다시입력")) {
					name.setText("다시입력");
				} else {
					System.out.println("이름 출력: " + n + "님");

				}

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(356, 85, 116, 55);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = age.getText();
				// 내년 나이를 구해서, 나이 출력 아래서 넣어보세요.
				int b2 = Integer.parseInt(b);
				int nextYear = b2 + 1;
				System.out.println("나이 출력: " + b + "세");
				System.out.println("내년 나이: " + nextYear + "세");
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 40));
		button.setBackground(Color.RED);
		button.setBounds(356, 210, 116, 67);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c = shoe.getText();
				System.out.println("신발 사이즈 출력: " + c + "mm");

			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 40));
		button_1.setBackground(Color.RED);
		button_1.setBounds(356, 318, 116, 55);
		f.getContentPane().add(button_1);

		JButton button_2 = new JButton("모두 출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				String b = age.getText();
				String c = shoe.getText();
				System.out.println("이름 출력: " + n + "님");
				System.out.println("나이 출력: " + b + "세");
				System.out.println("신발 사이즈 출력: " + c + "mm");

			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 40));
		button_2.setBackground(Color.RED);
		button_2.setBounds(126, 396, 267, 55);
		f.getContentPane().add(button_2);

		JLabel lblNewLabel_1 = new JLabel("-----개인정보-----");
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(38, 27, 434, 48);
		f.getContentPane().add(lblNewLabel_1);
		// . 연산자 => 접근연산자(~에)

		f.setVisible(true);

	}
}
