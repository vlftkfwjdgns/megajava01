package 조건문;

import java.util.Random;

public class 아무거나2 {
	public static void main(String[] args) {
		// 아무거나 내게 하는 class입니다.
		// 랜덤(Random)
		Random r = new Random();

		int cpt = r.nextInt(3); // -21억~21억
		// 0부터 2까지를 발생시킴.

		System.out.print("computer: ");
		switch (cpt) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
		// 0이면, computer는 가위를 냄.
		// 1이면, computer는 바위를 냄.
		// 2이면, computer는 보를 냄.

	}
}
