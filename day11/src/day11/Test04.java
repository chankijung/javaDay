package day11;

public class Test04 {
	public int cnt =100;
	//공통적으로 들어가는 변수면 바깥에 넣는다
	//		--인스턴스 변수
	//아니라면 지역변수로 각각의 메소드에서 만든다.
	
	public void test1() {
		System.out.println("test1 : "+cnt);
		cnt+=10000;
	}
	public void test2() {
		System.out.println("test2 : "+cnt);
	}
	
}
