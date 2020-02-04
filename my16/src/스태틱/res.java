package 스태틱;

public class res {

	String name;
	String gender;
	int age;
	static int sum;
	static int count;
	public res(String name, String gender, int age) {
		count++;
		sum = sum+age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "res [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	// static메소드는 객체생성하지 않아도 클래스 이름으로 접근해서 사용 가능
	public static int avg() {
		return sum/count;
	}
	
	public void sociability() {
		System.out.println("나는 친화력이 있습니다.");
	}
	
	
	
	
	
	
	
	
}
