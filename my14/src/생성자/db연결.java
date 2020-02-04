package 생성자;

public class db연결 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 1. 커넥터 설정 ok...
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공...!!");
	}

}
