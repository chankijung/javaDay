package day15;
/*
 * 오버라이딩
 	- 상속받은 메서드의 내용을 변경하여 실행되는 것
 	- 자신에 맞게 코드 변경
 	조건
 	- 부모의 메소드 이름, 매개변수, 반환타입이 같아야 한다
 	- 자식의 접근제한자는 부모의 접근제한자보다 작을 수 없다
 	private < package < protected < public
 	
 */

class A{
	public void test() {
		System.out.println("2021년 기능");
		
	}
}
class B extends A{
	public void test2() {
		System.out.println("그 외의 기능");
		
	}
	public void test() {
		System.out.println("2022222222221년 기능");
		
	}// 오버라이드 하면 부모에서 가져온 메소드를 수정가능
	// 오버라이딩 : 부모의 메소드 이름과 자식의 메소드 이름을 같게 함
	// 실행시키면 자식의 메소드가 실행됨
	// 주로 내용 변경을 하고 싶을때 오버라이딩 사용ㄴㄴ
}
public class MainClass05 {
	public static void main(String[] args) {
		B b = new B();
		b.test();
		b.test2();
	}

}
