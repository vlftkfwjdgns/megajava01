package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메뉴판 {
	// 피자의 개수
	static int count = 10;

	public static void main(String[] args) {
		// 큰 프레임을 만들어야 함.
		// 프레임의 크기를 결정해야함.
		// 프레임을 보여지게 설정해야함.
		JFrame f = new JFrame();

		f.setSize(504, 287);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\학생방\\jhk\\my06\\미스터피자.jpg"));
		f.getContentPane().add(lblNewLabel, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showInternalMessageDialog(null, "피자 빼기");
				if (count != 0) {
					count--;					
					System.out.println("피자의 개수는 "+count+"개");
					f.setTitle("피자의 개수: " +count+"개");
				}else {
					f.setTitle("더이상 뺄 수 없습니다.");
				}
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showInternalMessageDialog(null, "피자 더하기");
				count++;
				System.out.println("피자의 개수는 "+count+"개");
				f.setTitle("피자의 개수: " +count+"개");
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);

		f.setVisible(true);

	}

}
