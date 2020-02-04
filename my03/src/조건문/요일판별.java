package 조건문;

import java.util.Scanner;

public class 요일판별 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("요일 입력: 주중 1) 주말 2)  >> ");
	int data = sc.nextInt();
	if (data == 1) {  // 비교연산자
		System.out.println("열심히 공부합시다!!");
		System.out.println("운동을 열심히 합시다.");
	} // if문 끝
	  else {
		System.out.println("열심히 놀아봅시다!!");
	} //else문 끝
  }  // main문 끝
}  // 클래스 끝
