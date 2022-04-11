package day16;

class A{
	public void aaa() {
		
	}
}
class B extends A{
	public void aaa() {System.out.println("자식");}
	public void bbb() {System.out.println("bbb");}
	
}
public class Ex01 {
	public static void main(String[] args) {
		
		//upcasting  부모형태로 형변환
		//downcasting 자식형태로 형변환
		
		A b = new B();
		b.aaa();
		//업캐스팅
		//자식을 부모의 형태로 받는 것
		
		B bb =  (B)b;
		bb.bbb();
		//다운캐스팅
		
		//B a = new A();
		//부모를 자식의 형태로 받을 수는 없다
	}

}
