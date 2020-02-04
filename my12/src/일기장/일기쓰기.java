package 일기장;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기쓰기 {
	private static JTextField t1;
	private static JTextField t2;

	public void diary() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setTitle("일기 쓰기 창");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 22));
		t1.setBounds(177, 41, 243, 33);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 22));
		t2.setColumns(10);
		t2.setBounds(177, 84, 243, 33);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setFont(new Font("Monospaced", Font.PLAIN, 22));
		t3.setRows(10);
		t3.setBounds(177, 137, 243, 214);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD, 24f));
		lblNewLabel.setBounds(23, 41, 162, 33);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("오늘의 제목");
		label.setFont(label.getFont().deriveFont(label.getFont().getStyle() | Font.BOLD, 24f));
		label.setBounds(23, 84, 162, 33);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("오늘의 내용");
		label_1.setFont(label_1.getFont().deriveFont(label_1.getFont().getStyle() | Font.BOLD, 24f));
		label_1.setBounds(23, 142, 162, 49);
		f.getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("오늘의 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값들 가지고 오기.
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				// 2. 파일에 저장하기.
				try {
					FileWriter f = new FileWriter(day+".txt");
					f.write(title+"\n");
					f.write(content+"\n");
					f.close();
					JOptionPane.showMessageDialog(null, "저장완료!! 내일 또 만나요.");
					
				} catch (IOException e1) {
				 System.out.println("파일 저장중 에러가 생김");
				}
				
				
				
				
				// 3. 확인메시지 뿌리기.
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 33));
		btnNewButton.setBounds(23, 369, 397, 82);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		f.setVisible(true);
	}
}
