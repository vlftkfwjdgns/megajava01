package 스태틱;

public class mouse {
	String color;
	String company;
	int price;
	
	//입력을 한번에!
	public mouse(String color, String company, int price) {
		super();
		this.color = color;
		this.company = company;
		this.price = price;
	}
	
	//출력을 한번에!
	@Override
	public String toString() {
		return "mouse [color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	
	
}
