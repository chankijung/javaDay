package day15;

import day10.Member;
class AAA extends Member{
	public void aaa() {
		System.out.println("aaAa");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		//Member aaa = new Member();
		// day10을 export해서 라이브러리에 추가
		
		AAA aaa2 = new AAA();
		aaa2.addr = "주소";
		System.out.println(aaa2.addr);
	}

}
