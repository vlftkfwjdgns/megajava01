package 배열;

public class 배열간단출력 {

	public static void main(String[] args) {
		int[] age = {10, 20, 30};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		for (int x : age) {
			System.out.println(x);
		}
		
		double[] eyes = {0.7,0.9,0.9};
		
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		
		for (double d : eyes) {
			System.out.println(d);
		}
		
		
		
		
	}

}
