package 생성자;

public class 노트북사용 {

	public static void main(String[] args) {
		노트북 note1 = new 노트북(1000);
		노트북 note2 = new 노트북("사성", 1000);
		
		System.out.println(note1);
		System.out.println(note2);
		
		
	}

}
