package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 테스트2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("사각형의 면적을 구하는 프로그램");
		System.out.println("---------------------------");
		System.out.println("가로가 7, 세로가 8");
		System.out.println("면적은 가로 * 세로");

		int ss = 7 * 8;
		if (ss >= 50) {
			System.out.println("면적이 50이상이면, 너무 넓군요");
		} else {
			System.out.println("그것이 아니면 너무 좁군요");
		}

	} // main end
} // class end
