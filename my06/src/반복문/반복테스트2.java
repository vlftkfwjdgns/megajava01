package 반복문;

public class 반복테스트2 {
	public static void main(String[] args) {

		int count = 10;
		while (count > 0) {
			System.out.print(count + " ");
			count--; // i = i - 1;
		}

		System.out.println();

		for (int i = 1; i < 11; i++) {
			// for(초기값; 조건식; 증감식)
			System.out.print(i + " ");
		}

	}
}
