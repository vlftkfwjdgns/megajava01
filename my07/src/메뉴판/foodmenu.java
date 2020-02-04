package 메뉴판;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class foodmenu {
	static int count = 0; // 주문수 카운트
	// 선언!의 위치가 변수를 사용할 수 있는 범위
	static int sum = 0; // 전체 금액 계산
	static int 짜장 = 0; // 전체 금액 계산
	static int 우동 = 0; // 전체 금액 계산
	static int 짬뽕 = 0; // 전체 금액 계산
	private static JTextField t2;
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		// 지역변수
		f.getContentPane().setBackground(new Color(0, 255, 255));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("지불할 총 금액: ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel.setBounds(29, 417, 159, 34);
		f.getContentPane().add(lblNewLabel);

		t2 = new JTextField();
		t2.setForeground(new Color(255, 0, 0));
		t2.setFont(new Font("굴림", Font.PLAIN, 26));
		t2.setBounds(189, 417, 283, 34);
		f.getContentPane().add(t2);
		t2.setColumns(10);

		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 139));
		t1.setFont(new Font("굴림", Font.PLAIN, 26));
		t1.setColumns(10);
		t1.setBounds(300, 10, 172, 34);
		f.getContentPane().add(t1);

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\tjoeun302-7\\Desktop\\자장면.png"));
		img.setBounds(31, 134, 441, 273);
		f.getContentPane().add(img);

		JLabel j = new JLabel("");
		JLabel w = new JLabel("");
		JLabel e = new JLabel("");

		JButton btnNewButton = new JButton("짜장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				짜장++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				ImageIcon icon = new ImageIcon("자장면.png");
				img.setIcon(icon);

				System.out.println("짜장 주문 개수 : " + 짜장 + "그릇");
				j.setText(짜장+"개");
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 22));
		btnNewButton.setBounds(27, 10, 83, 34);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("우동");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				우동++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				// 우동그림을 img라벨에 icon으로 집어 넣어야 함.
				ImageIcon icon = new ImageIcon("우동.jpg");
				img.setIcon(icon);

				System.out.println("우동 주문 개수 : " + 우동 + "그릇");
				w.setText(우동+"개");
			}
		});
		button.setBackground(new Color(255, 255, 255));
		button.setFont(new Font("굴림", Font.PLAIN, 22));
		button.setBounds(122, 12, 83, 34);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("짬뽕");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // 증감 연산자
				짬뽕++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				img.setIcon(icon);
				
				System.out.println("짬뽕 주문 개수 : " + 짬뽕 + "그릇");
				// e.setText(짬뽕+"개");
				
			}
		});
		button_1.setBackground(new Color(173, 255, 47));
		button_1.setFont(new Font("굴림", Font.PLAIN, 22));
		button_1.setBounds(211, 10, 83, 34);
		f.getContentPane().add(button_1);

		j.setBounds(29, 54, 81, 34);
		f.getContentPane().add(j);

		w.setBounds(122, 56, 81, 34);
		f.getContentPane().add(w);

		e.setBounds(211, 54, 81, 34);
		f.getContentPane().add(e);

		f.setVisible(true);
	}

}
