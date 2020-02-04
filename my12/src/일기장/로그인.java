package 일기장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\학생방\\jhk\\my12\\스크린샷_2016-01-16_오전_9.56.09.png"));
		lblNewLabel.setBounds(114, 42, 230, 114);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아이디:");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(115, 212, 77, 33);
		f.getContentPane().add(lblNewLabel_1);

		JLabel label = new JLabel("비밀번호:");
		label.setFont(new Font("굴림", Font.PLAIN, 22));
		label.setBounds(98, 255, 100, 33);
		f.getContentPane().add(label);

		t1 = new JTextField();
		t1.setBounds(204, 207, 206, 33);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(204, 255, 206, 33);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id, pw를 공백으로 초기화
				String id = t1.getText();
				String pw = t2.getText();
				if (id.equals("root") && pw.equals("1234")) {
					// 일기쓰러 감. => diary() 필요
					일기쓰기 today = new 일기쓰기();
					today.diary();
				} else {
					JOptionPane.showMessageDialog(null, "아이디,패스워드 오류입니다.");
				}

			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\학생방\\jhk\\my12\\naver_com_20140618_233652.jpg"));
		btnNewButton.setBounds(39, 307, 197, 144);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");

			}
		});
		button.setIcon(new ImageIcon("D:\\학생방\\jhk\\my12\\리셋.jpg"));
		button.setBounds(260, 307, 185, 144);
		f.getContentPane().add(button);
		f.setSize(500, 500);

		f.setVisible(true);

	}
}
