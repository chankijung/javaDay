package ex01;

public class MainClass03 {
	public static void main(String[] args) {
		Ex03 e = Ex03.getInstance();
		System.out.println(e);
		Ex03 e1 = Ex03.getInstance();
		System.out.println(e1);
		Ex03 e2 = Ex03.getInstance();
		System.out.println(e2);
		Ex03 e3 = Ex03.getInstance();
		System.out.println(e3);
	}

}
