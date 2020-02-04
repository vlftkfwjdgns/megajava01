package 조건문;

import java.util.Date;
import java.util.Scanner;

public class CoffeeTest2 {
	public static void main(String[] args) {
//		커피값은? 5000
//				인원수는? 3
//
//				현재 시각이 저녁 10시 이전이면 원래대로 다 내요
//				10시 이후이면 5000원을 깎아주세요.
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		System.out.print("커피값은? ");
		int price = sc.nextInt();
		
		System.out.print("인원수는? ");
		int count = sc.nextInt();
		
		int result = price*count;   // 총 가격
		
		int hour = date.getHours();	  // 시간 변수 설정
		
		if (hour>=22) {
			System.out.println(result-5000+"원");
		} else {

			System.out.println(result+"원");
		}
		
	}

}
