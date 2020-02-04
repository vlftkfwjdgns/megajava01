package 클래스;

public class 커피전문점 {

	public static void main(String[] args) {
	계산기 cal = new 계산기();
		int result = cal.add(2000, 3800);
		cal.minus(result);
	
	계산기 cal2 = new 계산기();
	
	int result2 = cal2.multi(3000, 4);
	cal2.div(result2, 4);
	
	
	}

}
