package 클래스;

public class 우리가족계좌 {

	public static void main(String[] args) {
		bank father = new bank();
		father.name = "홍길동";
		father.account = "튼튼적금";
		father.money = 1000;
		System.out.println(father);
		System.out.print("아버지는 ");
		father.예금하다();

		System.out.println("-------------------------------------");

		bank mother = new bank();
		mother.name = "박길동";
		mother.account = "튼튼예금";
		mother.money = 2000;
		System.out.println(mother);

		System.out.println("-------------------------------------");

		bank daughter = new bank();
		daughter.name = "홍기사";
		daughter.account = "다음적금";
		daughter.money = 3000;
		System.out.println(daughter); 
		System.out.print("딸은 ");
		daughter.출금하다();

	}

}
