package 실무클래스;

import java.util.ArrayList;

public class 스키대회 {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();

		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");

		ski.remove(1);

		System.out.println(ski);

	}

}
