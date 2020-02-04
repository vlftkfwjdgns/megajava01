package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 아무거나3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0)가위, 1)바위, 2)보  >>  ");
		int me = sc.nextInt();

		switch (me) {
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

		Random r = new Random();

		int cpt = r.nextInt(3); // -21억~21억
		// 0부터 2까지를 발생시킴.

		System.out.print("computer: ");

		switch (me) {
		case 0:

			switch (cpt) {
			case 0:
				System.out.println("가위");
				System.out.println("서로 비김");
				break;
			case 1:
				System.out.println("바위");
				System.out.println("내가 졌음");
				break;
			case 2:
				System.out.println("보");
				System.out.println("내가 이겼음");
				break;
			}
		}
		switch (me) {
		case 1:

			switch (cpt) {
			case 0:
				System.out.println("가위");
				System.out.println("내가 이겼음");
				break;
			case 1:
				System.out.println("바위");
				System.out.println("서로 비김");
				break;
			case 2:
				System.out.println("보");
				System.out.println("내가 졌음");
				break;
			}
		}
		switch (me) {
		case 2:
			switch (cpt) {
			case 0:
				System.out.println("가위");
				System.out.println("내가 졌음");
				break;
			case 1:
				System.out.println("바위");
				System.out.println("내가 이겼음");
				break;
			case 2:
				System.out.println("보");
				System.out.println("서로 비김");
				break;
			}
		}
		// 0이면, computer는 가위를 냄.
		// 1이면, computer는 바위를 냄.
		// 2이면, computer는 보를 냄.

	}
}
