package 조건문;

import java.util.Scanner;

public class 요일처리2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 직급은? ");
		String ss = sc.next();
		switch (ss) {// 실수가 올 수 없음.
		case "사원":
			System.out.println("사원의 보너스는 1000만원입니다.");
			break;
		case "과장":
			System.out.println("과장의 보너스는 2000만원입니다.");
			break;
		case "사장":
			System.out.println("사장의 보너스는 3000만원입니다.");
			break;
		case "회장":
			System.out.println("회장의 보너스는 4000만원입니다.");
			break;
		default:
			// 위 조건이 아닐때 처리 내용
			// 생략 가능
			System.out.println("직급을 잘못 입력하셨습니다.");
		}
	} // main end
} // class end
