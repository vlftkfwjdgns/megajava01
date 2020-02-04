package 배열;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aa = { 11, 22, 33, 44 };

		for (int i = 0; i < aa.length; i++) {
			if (aa[i] == 33) {
				System.out.print(i + 1 + "번째 위치에 있음!");

			}

		}
			System.out.println();
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자 입력 >>  ");
			
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		
	}

}
