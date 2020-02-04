package 클래스;

public class 계산기 {
	// 없음 = void
	public int add(int coffee, int green) {

			return coffee + green;
	}

	public void minus(int money) {
		boolean vip = true;
		int result = money-1000;
		System.out.println("당신의 최종 결제금액: " + result);
	}
	public int multi(int hh, int count) {
		
		
		return hh * count;
	}
	public void div(int result2, int count) {
		System.out.println("1명당 내야 하는 금액: "+(result2/count));
	}
	
	
	
	
	
	
}
