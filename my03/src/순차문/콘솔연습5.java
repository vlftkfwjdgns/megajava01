package 순차문;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class 콘솔연습5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//<< 여행 정보 >>
		System.out.println("<< 여행 정보 >>");
		//-------------------------
		System.out.println("-------------------------");
		//- 여행지 : 제주도
		System.out.print("여행지 : ");
		
		String travel = sc.nextLine();
		
		//- 경비 : 200000원
		System.out.print("경비 : ");
		
		int pay = sc.nextInt();
		
		//- 할인율 : 0.3
		
		System.out.print("할인율 : ");
		
		double discount = sc.nextDouble();

		
		//- 실제 경비 : 140000원
		System.out.print("실제 경비 : ");
		double result = pay-(pay * discount);
		// 자바에서는 연산할 때 하나라도 실수가 들어있으면 무조건 실수!
		// 정수와 정수의 연산의 결과는 무조건 정수!
		
		System.out.println((int)result+"원");
		System.out.println("-------------------------");
		System.out.println("12월 중순에 갔을 때 가격");
		//-------------------------
		//=> 12월 중순에 갔을 때 가격

	}

}
