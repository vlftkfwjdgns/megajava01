package 배열응용;

import javax.swing.JOptionPane;

public class 배열값더하기2 {

	public static void main(String[] args) {
		// 55 50 27 15

		int[] age = new int[4];
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			age[i] = Integer.parseInt(JOptionPane.showInputDialog("우리 가족의 나이는? "));
				sum = sum +age[i];
		}
		System.out.println("우리 가족 나이의 평균은 "+sum/age.length);
	}

}
