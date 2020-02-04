package 스태틱;

public class restest {

	public static void main(String[] args) {
		res r1 = new res("임아무개", "남자", 24);
		res r2 = new res("김아무개", "남자", 21);
		res r3 = new res("박아무개", "여자", 27);

		System.out.println("직원들의 평균나이는 " + res.sum / res.count);
		System.out.println("직원들은 총 " + res.count + "명");
		System.out.println(res.avg() + "세");

		String n1 = "100";
		int n2 = Integer.parseInt(n1);
		System.out.println(n2);
	}

}
