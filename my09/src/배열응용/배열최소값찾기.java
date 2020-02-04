package 배열응용;

public class 배열최소값찾기 {

	public static void main(String[] args) {
		int[] num = { 90, 80, 20, 60, 70 };

		// for문을 순회하면서 거기까지의 최소값을 넣어두는 변수를 하나 지정

		int min = num[0]; // 첫번째 값을 넣어둔다.
							// 현재 min = 90
		int max = num[3];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최소값 " + min);
		System.out.println("최대값 " + max);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);

	}

}
