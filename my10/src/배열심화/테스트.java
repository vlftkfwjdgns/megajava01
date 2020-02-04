package 배열심화;

public class 테스트 {

	public static void main(String[] args) {
		int[] a = {100,88,96};
		int[] b = a.clone();
		
		b[0]= 99;
		
		System.out.print("1학기 수학 점수: ");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("2학기 수학 점수: ");
		for (int c : b) {
			System.out.print(c+" ");
			
		}
		
	}

}
