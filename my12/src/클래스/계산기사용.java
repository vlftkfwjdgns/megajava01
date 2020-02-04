package 클래스;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		
		int result = cal.add(100, 200);
		System.out.println(cal.add(200, 100));
		
		// System.out.println(cal.add());
		// void타입의 메소드를 호출한 경우에는 반환값이 없으므로 변수에 값을 넣을 수도 없고 프린트할 수도 없음..
		
		double result2 =cal.add(303.2, 100);	
		System.out.println(result2);
		
		double result3 = cal.add(303.2, 303.5);
		System.out.println(result3);
		
		String result4 = cal.add("안녕", "하세요 여러분.");
		System.out.println(result4);
		
		String result5 = cal.add("제 나이는 ", 28);
		System.out.println(result5);
		
		
		
		
		
		
	}

}
