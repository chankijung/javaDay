package ex02;

import java.io.IOException;

class BBB{
	public void test() throws Exception {
		test1();
	}
	public void test1() throws Exception {
		System.out.println("test1실행");
			Thread.sleep(0);
		ProcessBuilder pb = new ProcessBuilder("calc");
			pb.start();
	}
	//try catch도 좋지만
	// throws - 예외 전가
	// throws를 사용하면 코드는 깔끔하게 가능
	// throws Exception이 가장 큰 범위
	// 한번 전가하면 메인까지 가서 전가시켜야함
	// 장점 - 코드 깔끔
	// 단점 - try catch면 한방에 처리끝인데 throws는 계속 전가시켜야함
	
}
public class MainClass04 {
public static void main(String[] args) throws Exception {
	BBB bbb = new BBB();
	bbb.test();
}
}
