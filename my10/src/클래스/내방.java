package 클래스;

public class 내방 {

	public static void main(String[] args) {
		텔레비전 t1 = new 텔레비전();
		t1.shape = "네모";
		t1.size = 50;
		t1.changeCh();
		t1.off();
		System.out.println(t1);
		
		텔레비전 t2 = new 텔레비전();
		
		t2.shape = "동그라미";
		t2.size = 120;
		t2.changeCh();
		t2.off();
		System.out.println(t2);
		
		
		
		
	}

}
