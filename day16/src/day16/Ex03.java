package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Parents{
	public void familyName() {
		System.out.println("이");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Parents par = new Parents();
		par.name();
		
		par = new Daughter();
		par.name();
		// Daughter d = new Daughter();
		// d.name();
		
		par = new Son();
		par.name();
		//Son s = new Son();
		// s.name();
		
		//parents, 부모 클래스는 모두가 공유하고 있으므로
		// 도터, 선 모두 업캐스팅으로 호출해서 각자의 메소드를 부를 수 있음
		
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1.부모 이름");
		System.out.println("2.딸 이름");
		System.out.println("3.아들 이름");
		num = scan.nextInt();
		if(num ==1) {
			par = new Parents();
			
		}else if(num ==2) {
			par = new Daughter();
		}else {
			par = new Son();
		}
		par.name();
		
		
		List lost = new ArrayList();
		Map m = new HashMap();
		//부모의 형태를 받은것
	}

}
