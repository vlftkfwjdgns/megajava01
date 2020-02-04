package 배열응용;

import java.util.Scanner;

public class 문제 {
	public static void main(String[] args) {

		// 배열값 : 66, 33, 22, 11, 99
		// 입력값 : 66
		// 위치는 1번째 입니다.

		// 입력값 : 11
		// 위치는 4번째 입니다.

		Scanner sc = new Scanner(System.in);

		int[] num = { 66, 33, 22, 11, 99 };

		for (int i = 0; i < num.length; i++) {
			System.out.print("입력값 : ");
			num[i] = sc.nextInt();
			System.out.println();
			if (66 == num[i]) {
				System.out.println("위치는 1번째입니다.");

			} else if (33 == num[i]) {
				System.out.println("위치는 2번째입니다.");

			} else if (22 == num[i]) {
				System.out.println("위치는 3번째입니다.");

			} else if (11 == num[i]) {
				System.out.println("위치는 4번째입니다.");

			} else {
				System.out.println("위치는 5번째입니다.");

			}
		}

	}
}
