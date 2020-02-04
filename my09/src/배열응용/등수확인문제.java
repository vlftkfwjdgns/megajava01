package 배열응용;

import java.util.Arrays;

public class 등수확인문제 {
	public static void main(String[] args) {
		int[] jumsu = { 50, 80, 70, 60, 40 };
		int me = 70;
		Arrays.parallelSort(jumsu); // 정렬
		System.out.println("-----점수정렬-----");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		System.out.println();

		int index = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == me) {
				System.out.println("내위치 "+i);
				index = i;
			}
		}
		System.out.println("내 등수는 " + (jumsu.length - index) + "등");
	}
}
