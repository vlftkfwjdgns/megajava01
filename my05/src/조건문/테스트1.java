package 조건문;

import java.util.Scanner;

public class 테스트1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("---------------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("---------------------------");
		System.out.println("1)짜장면, 2)짬뽕, 3)우동");
		System.out.println("---------------------------");
		System.out.print("당신의 선택은? ");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("짜장면");
		} else if (choice == 2) {
			System.out.println("짬뽕");

		} else {
			System.out.println("우동");
		}

	} // main end
} // class end
