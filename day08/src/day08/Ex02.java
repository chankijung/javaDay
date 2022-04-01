package day08;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		// 컬렉션 
		// - 자료구조  - 데이터를 어떤방식으로 처리하는가?
		
		
		// 프레임워크 
		// - 틀, 형식에 맞춰져 있는 구조
		// ** 더 자주 쓰이는 용어이니 이해 필요
		// ex ) C언어는 프레임워크가 없어서 각자가 사용하는 방식, 틀이 다 달랐음
		// 호환성 문제
		// 이걸 해결(기본적인 틀을 갖게 만들어줌)
		
		
		/*
		  ArryaList
		  - 순서가 유지 되는 자료형
		  - 배열과 비슷하게 사용된다
		  - 가변적인 크기를 가지고 있다
		  - 배열에 비해 처리속도가 늦음
		 */
		
		ArrayList arr = new ArrayList();
		int a;
		arr.add("aaa");
		arr.add("ddd");
		arr.add("dsa");
	
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
		//크기는 size나 length를 이용하니 참고
		System.out.println();
		System.out.println();

		System.out.println(arr.contains("aaa"));
		System.out.println(arr.contains("aa23"));
		// 값이 있으면 처리, 없으면 pass 식으로 if문 활용가능
		
		System.out.println();
		System.out.println();
		
		System.out.println("remove는 "+arr.remove("aaa"));
		System.out.println(arr.contains("aaa"));
		// 삭제가 됐으면 true로 나옴
		// boolean bool - arr.remove("aaa");
		// if(bool == true) 삭제 성공
		// 식으로 활용
		System.out.println("---삭제 후 확인---");
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		
		System.out.println("---클리어----");
		arr.clear();
		// 해당하는 데이터를 전부 삭제
		System.out.println(arr.size());
		
		System.out.println("---값 재설정--");
		arr.add("aaa");
		arr.add("ddd");
		arr.add("dsa");
		
		System.out.println(arr.indexOf("aaa"));
		// 해당하는 값이 있으면 0
		System.out.println(arr.indexOf("111"));
		// 해당하는 값이 없으면 -1
		
		arr.set(0,"안녕");
		System.out.println(arr.get(0));
		// 치환 -- 몇번째 값을 변경하겠다
		
		
		
	}

}
