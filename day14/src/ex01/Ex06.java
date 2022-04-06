package ex01;
class Ex06_01{
	public Ex06_01(String s) {
		System.out.println(s+"부모");
	}
	public void aaa() {
		System.out.println("부모 aaaa");
	}
}
public class Ex06 extends Ex06_01 {
	public Ex06(String s) {
		super(s);
		System.out.println(s+"자식");
	}
	public void test() {
		super.aaa();
		//super는 부모를 뜻하기 때문에 
		//super를 붙여줌으로써 aaa()를 부모에서 가져옴
		
		this.aaa();
		// this는 자신을 뜻함
		//자신의 aaa() 실행
	}
	public void aaa() {
		System.out.println("자식 aaaa");
	}
	//자기 자신에게 aaa가 있으면 자기 것을 우선시
	//없으면 부모것을 가져감
}
