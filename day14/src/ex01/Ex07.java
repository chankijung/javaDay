package ex01;
class AAA {
	
	public void aaa() {
		System.out.println("aaa");
	}
}
class BBB extends AAA{
	protected int num;
	//상속받은 자식, 같은 패키지는 접근 허용
	// 다른 패키지에선 접근 불가
	public void bbb() {
		System.out.println("bbb");
	}

}

public class Ex07 extends BBB{
	public void test() {
		num = 100;
		
		aaa();
		bbb();
		
		//자바는 다중상속이 안된다
		//그래서 상속에 상속을 함
		
	}
}
