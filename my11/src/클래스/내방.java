package 클래스;

public class 내방 {

	public static void main(String[] args) {

		// 클래스 객체
		// new를 하면 ㅋ믈래스의 멤버변수들이 ram에 복사가 된다.
		붕어빵틀 붕어빵1 = new 붕어빵틀();
		붕어빵1.두께 = "두껍게";
		붕어빵1.소 = "팥";

		붕어빵1.붕어빵을담다();
		붕어빵1.붕어빵을먹다();
		System.out.println("---------------------");

		붕어빵틀 붕어빵2 = new 붕어빵틀();
		붕어빵2.두께 = "얇게";
		붕어빵2.소 = "생크림";
		붕어빵2.붕어빵을담다();
		붕어빵2.붕어빵을먹다();

		System.out.println("---------------------");

		// 내방에 강아지가 한마리 필요.
		강아지 dog = new 강아지();
		dog.age = 5;
		dog.color = "노랑";
		dog.꼬리를흔들다();
		dog.사람을잘따른다();

		핸드폰 phone1 = new 핸드폰();
		phone1.두께 = "두꺼움";
		phone1.크기 = 10;
		phone1.핸드폰을킨다();
		phone1.핸드폰을끈다();
		
		System.out.println("---------------------");

		핸드폰 phone2 = new 핸드폰();
		phone2.두께 = "얇음";
		phone2.크기 = 30;
		phone2.핸드폰을킨다();
		phone2.핸드폰을끈다();
		
		System.out.println("---------------------");
		
		여자아이 girl1 = new 여자아이();
		girl1.height = 168;
		girl1.옷색깔 = "노란색";
		girl1.걷고있다();
		girl1.물마시고있다();
		
		System.out.println("---------------------");
		
		여자아이 girl2 = new 여자아이();
		girl2.height = 155;
		girl2.옷색깔 = "빨간색";
		girl2.걷고있다();
		girl2.물마시고있다();
		
		
		
	}

}
