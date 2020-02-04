package 조건문;

import java.util.Date;

public class 요일처리 {
	public static void main(String[] args) {

		// 지금은 몇시인가요?
		// 몇시인지를 알려주는 부품(class)가 필요함.
		Date date = new Date();
		int day = date.getDay();
		if (day == 1) {
			System.out.println("월요일");
			System.out.println("주중");
		} else if (day == 2) {
			System.out.println("화요일");
			System.out.println("주중");
		} else if (day == 3) {
			System.out.println("수요일");
			System.out.println("주중");
		} else if (day == 4) {
			System.out.println("목요일");
			System.out.println("주중");
		} else if (day == 5) {
			System.out.println("금요일");
			System.out.println("주중");
		} else if (day == 6) {
			System.out.println("토요일");
			System.out.println("주말");
		} else {
			System.out.println("일요일");
			System.out.println("주말");
		} // day가 0인 경우는 일요일!!
	} // main end
} // class end
