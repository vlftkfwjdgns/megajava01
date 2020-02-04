package 배열응용;

import java.util.Random;

public class 여러개중최대값찾기 {

	public static void main(String[] args) {
		Random r = new Random(7);
		// 42를 넣는 것 => 씨앗(seed)값을 심는다.
		// 랜덤 값들을 동일하게 유지 가능

		int[] num = new int[100000];

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100000); // 0~99999
		}

		int max = num[1];

		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
			if (max < num[i]) {
				max = num[i];

			}

		}
		int count = 0;
		System.out.println("최대값 " + max);
		for (int i = 0; i < num.length; i++) {
			if (max == num[i]) {
				System.out.println("최대값의 자리는? " + i + "번째");
				count++;
			}
		}
		System.out.println("max값이 위치한 개수는 " + count + "개");
	}

}
