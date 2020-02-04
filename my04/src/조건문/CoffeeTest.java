package 조건문;

public class CoffeeTest {
				//자바는 camel표기법을 권장함.	 ex) CoffeeTest
				//파이썬은 snake표기법을 권장함.		ex) coffee_test
	public static void main(String[] args) {
		int price = 5600;
		int count = 5;
		
		// 25000원이 넘으면 할인 쿠폰 5000원짜리
		// 아니면 그냥 다 냄.
		
		int sum = price * count;
		
		if (sum >= 25000) {
			sum = sum - 5000;
			
		} else {
			//비워둬도 됨
		}
			System.out.println("당신이 지불할 금액은 "+sum+"원");
			
		int hour = 21;
			if (22 > hour) {
				
				System.out.println("아직 한참 남았습니다");
			} else {
					System.out.println("좀 있으면 집갑니다.");
			}
			
			
	}

}
