package db;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.awt.HeadlessException;
import java.sql.Connection;

public class DBConnect4 {

	public static void main(String[] args)  {

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

			String id = JOptionPane.showInputDialog("id입력");
			String pw = JOptionPane.showInputDialog("pw입력");
			String name = JOptionPane.showInputDialog("name입력");
			String tel = JOptionPane.showInputDialog("tel입력");

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

}
