package 순차문;

import java.util.Scanner;

public class 평균계산2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("음식점 계산 총 금액: ");
	int money = sc.nextInt();
	
	System.out.print("함께 먹은 사람 인원수: ");
	int in = sc.nextInt();
	
	System.out.println("---------------------------------");
	
	System.out.print("각자 내야 할 돈: ");
	
	double result = money / (double)in;
	//타입을 바꾸는 것 => casting(캐스팅)
	
	System.out.print((int)result+"원");

	//음식점 계산 총 금액: 446677
	//함께 먹은 사람 인원수: 6
	//---------------------------------
	//각자 내야 할 돈: 
			
		
		
		
		
		
	}

}
