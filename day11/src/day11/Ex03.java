package day11;

public class Ex03 {
public static void main(String[] args) {
	Test03 t = new Test03();
	int r = t.test01();
	System.out.println("main :"+r);
	t.test02(r);
	t.test03();
}
}
