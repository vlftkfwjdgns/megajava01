package 실무클래스;

import java.util.HashSet;

public class 가방목록 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("돈");

		System.out.println(bag);

		bag.add("휴대폰");

		System.out.println(bag);
	}

}
