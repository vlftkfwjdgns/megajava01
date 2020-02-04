package 배열;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int[] su = { 10, 20, 30, 40, 50 };

		//System.out.println(su[0] + su[1]);
		String[] jj = new String[3];
		for (int i = 0; i < jj.length; i++) {
			System.out.println("입력 >> ");
			jj[i] = sc.nextLine();

		}

		System.out.println("**" + jj[0] + "보다는 " + jj[1] + "**");

//	int[] ss = {1,2,3,4,5};
//	
//	for (int i = 0; i < ss.length; i++) {
//		System.out.print(ss[i]+" ");
//	}
//	
//	int[] dd = {11,22,33,44};
//	

	}

}
