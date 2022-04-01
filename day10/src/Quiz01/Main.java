package Quiz01;

public class Main {
	public static void main(String[] args) {
		Name n = new Name();
		
		Age a = new Age();
		a.age = 123;
		Addr ad = new Addr();
		ad.addr = "마포구";
		
		n.namePrint();
		System.out.println("제 나이는 "+a.age+"입니다");
		System.out.println("주소는 "+ad.addr+"입니다");
	}

}
