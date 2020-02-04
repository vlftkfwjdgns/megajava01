package db;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class 네이버회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 네이버 회원가입");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjoeun302-7\\Desktop\\네이버.png"));
		lblNewLabel.setBounds(125, 20, 222, 53);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(32, 112, 76, 36);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 22));
		lblPw.setBounds(32, 177, 76, 36);
		f.getContentPane().add(lblPw);

		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("굴림", Font.PLAIN, 22));
		lblName.setBounds(32, 247, 76, 36);
		f.getContentPane().add(lblName);

		JLabel lblTel = new JLabel("TEL");
		lblTel.setFont(new Font("굴림", Font.PLAIN, 22));
		lblTel.setBounds(32, 313, 76, 36);
		f.getContentPane().add(lblTel);

		t1 = new JTextField();
		t1.setBounds(125, 116, 244, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(125, 185, 244, 30);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(125, 251, 244, 30);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(125, 319, 244, 30);
		f.getContentPane().add(t4);

		JButton btnNewButton = new JButton("회원가입완료");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				// 입력한 값 가지고 와야 함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				// db처리 4단계
				try {
					// 1. 커넥터 설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넥터 설정 성공....");
					// 2. db연결
					String url = "jdbc:mysql://localhost:3309/shoes?useUnicode=true&characterEncoding=utf8";
					String user = "root";
					String password = "1234";

					Connection con = DriverManager.getConnection(url, user, password);

					System.out.println("2. DB연결 성공....");

					// 3. sql문을 만든다.
					String sql = "insert into member values (?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, id);
					ps.setString(2, pw);
					ps.setString(3, name);
					ps.setString(4, tel);

					System.out.println("3. SQL문 만들기 성공....");

					// 4. sql문을 mysql프로그램에 전송.

					ps.executeUpdate();
					System.out.println("4. SQL문 전송 성공....");
				} catch (Exception e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 22));
		btnNewButton.setBounds(42, 359, 305, 36);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("회원탈퇴처리");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				try {
					// 1. 커넥터 설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넥터 설정 성공....");
					// 2. db연결
					String url = "jdbc:mysql://localhost:3309/shoes";
					String user = "root";
					String password = "1234";

					Connection con = DriverManager.getConnection(url, user, password);

					System.out.println("2. DB연결 성공....");

					// 3. sql문을 만든다.
					String sql = "delete from member where id = ?";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, id);
					System.out.println("3. SQL문 만들기 성공....");

					// 4. sql문을 mysql프로그램에 전송.

					ps.executeUpdate();
					System.out.println("4. SQL문 전송 성공....");
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 22));
		button.setBounds(42, 405, 305, 36);
		f.getContentPane().add(button);

		f.setVisible(true);
	}
}
