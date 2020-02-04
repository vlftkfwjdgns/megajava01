package 배열응용;

public class 우리가족나이 {

	public static void main(String[] args) {
		String[] num2 = {"11","22","33"};
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			sum = sum + Integer.parseInt(num2[i]);
		}
		System.out.println(sum);
		
	}

}
