package 순차문;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class 콘솔연습4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------나의 현금 잔고------------");
		
		System.out.print("현재 당신이 가지고 있는 돈은? ");
		// 모든 입력되는 데이터의 유형은 String!
		
		int now = sc.nextInt();
		
		System.out.print("내일 당신이 가지게 될 돈은? ");
		int tomorrow = sc.nextInt();
		
		System.out.println("-------------------------------");
		int sum = now + tomorrow;
		
		// 내일 내가 가지게 될 돈의 총액은 3000원
		System.out.println("내일 내가 가지게 될 돈의 총액은 "+sum+"원");
	}

}
