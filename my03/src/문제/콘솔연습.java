package 문제;

import java.util.Scanner;

public class 콘솔연습 {
	public static void main(String[] args) {
		//나에 대한 정보
		//---------------------
		//이름 입력 >> hong
		//나이 입력 >> 100
		//취미 입력 >> run
		//--------------------
		//나의 이름은 hong
		//나의 나이는 100세
		//나의 취미는 run입니다.!
		
		// 1. 콘솔에서 입력
		// 4000천개 중에서 콘솔에서 입력할 수 있는 기능을 가진 부품(class)을 램에 복사해서 사용.
		// 복사할 때 사용하는 키워드: new
		
		System.out.println("나에 대한 정보");
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		//Scanner라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용.
		System.out.print("이름 입력 >> ");
		String name = sc.next(); // 단어 입력받는 기능
		
		System.out.print("나이 입력 >> ");
		String age = sc.next(); // 단어 입력받는 기능
		
		System.out.print("취미 입력 >> ");
		String harby = sc.next(); // 단어 입력받는 기능

		System.out.println("------------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age+"세");
		System.out.println("나의 취미는 "+harby+"입니다.");

	}

}
