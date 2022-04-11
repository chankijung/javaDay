package day16;
interface Int01{
	public int num=100;
	public final static String path = "aaaa";
	// 필드를 만들면 값을 처리해야함
	// 인터페이스로 변수를 만들면 더이상 값을 변경할 수 없고 static이 된다(final static)
	// 인터페이스로 변수 선언하면 공통적으로 쓰이는 것에만 사용
}

class A02{
	public final static int num=100;
}
public class Ex09 implements CommonPath{
public static void main(String[] args) {
	System.out.println(Int01.num);
	System.out.println( A02.num);
//	A02.num =12354;
//	Int01.num = 12345;
	System.out.println(path);
}

@Override
public void test() {
	// TODO Auto-generated method stub
	
}
}
