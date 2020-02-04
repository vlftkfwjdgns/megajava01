package 스태틱;

public class 나의하는일 {

	public static void main(String[] args) {
		day day1 = new day("자바공부", 10, "강남");
	
		System.out.println(day.count);
		day1.play();
		day day2 = new day("여행", 15, "강원도");
		
		System.out.println(day.count);
		
		day day3 = new day("운동", 11, "피트니스");
		
		System.out.println(day.count);
		System.out.println("전체 시간은 "+day.sum);
		System.out.println("평균 시간은 "+day.sum/day.count);
		// 지역변수인 day1은 스택영역

		System.out.println(day1);

		System.out.println(day2);

		System.out.println(day3);

	}

}
