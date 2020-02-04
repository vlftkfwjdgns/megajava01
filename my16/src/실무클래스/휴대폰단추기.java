package 실무클래스;

import java.util.HashMap;

public class 휴대폰단추기 {

	public static void main(String[] args) {
		HashMap phone = new HashMap();

		phone.put("1번", "엄마");
		phone.put("2번", "아빠");
		phone.put("3번", "친구");
		phone.put("4번", "동생");
		
		System.out.println(phone.get("2번"));
		
		
	}

}
