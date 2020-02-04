package 순차문;

import javax.swing.JOptionPane;

public class 순차문03 {

	public static void main(String[] args) {

		String data = JOptionPane.showInputDialog("첫번째 수는");
		String data2 = JOptionPane.showInputDialog("두번째 수는");
		
		//두 수를 입력받아서
		
		int ant = Integer.parseInt(data);
		int bnt = Integer.parseInt(data2);
		
		//더한 후
		
		int cnt = ant + bnt ;
		
		//출력: 200 + 100 = 300입니다.
		
		System.out.println(ant + " + " + bnt + " = " + cnt + "입니다.");
		JOptionPane.showMessageDialog(null, ant + " + " + bnt + " = " + cnt + "입니다.");

    } //main end
	
} //class end