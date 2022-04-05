package day13;
class AAA{
	/*
	 생성자
	 - 반환 타입은 없으며 클래스 이름과 동일하게 만든다
	 - 초기화 목적으로 만들어 사용한다
	 - 객체 생성시 자동으로 호출된다 
	 */
	public AAA() {
		System.out.println("생성자 실행");
	}
	public AAA(String s) {
		System.out.println(s+" : 생성자 실행");
	}
	
	public void test() {
		System.out.println("test");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		
		AAA a = new AAA();
		AAA aa = new AAA("초기화 진행");
		//앞서서 사용한 ProcessBuilder와 같음
		//메인에서 생성자를 만들면 
		//무조건 디폴트 생성자를 클래스에 만들어야함
		
		a.test();
		
	}

}
