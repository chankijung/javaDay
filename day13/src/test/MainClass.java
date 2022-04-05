package test;

import test2.*;
import java.util.*;


public class MainClass {
public static void main(String[] args) {
	MainClass01 t = new MainClass01();
	t.test();
	
	// public void test() 와 void test() 모두 실행 됨
	// default임
	// 같은 패키지(폴더)-- 여기선 package test--에 있을 경우 생략가능함
	
	Test01 m = new Test01();
	m.test();
	//다른 패키지에 있는 메소드를 임포트하면
	// public 같은 keyword가 생략되면 에러남
	// 생략 안하면 됨
	
	Test02 s = new Test02();
	s.test();
	// 다른 패키지는 무조건 import가 필요함
	// 같은 패키지라면 import 없이 사용 가능
	
	// import test2.*; 처럼 . 뒤에 *을 붙여서 모든 것을 import할 수 있음
	// 주로 java.util.* 처럼 사용함
	
	
	Date d;
	java.sql.Date dd;
	// 이름이 Date로 같으면 다른 하나는 패키지명에 붙임

	
}
}
