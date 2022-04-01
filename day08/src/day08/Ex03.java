package day08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 HashSet
		 - 순서가 없으며, 중복은 허용하지 않는다.
		 */
		
		HashSet set = new HashSet();
		ArrayList arr = new ArrayList();
		
		set.add("라면");
		set.add("김밥");
		set.add("돈까스");
		set.add("순대");
		arr.add("라면");
		arr.add("김밥");
		arr.add("돈까스");
		arr.add("순대");
		System.out.println("set :" + set);
		System.out.println("arr : "+ arr);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//반복자
//		System.out.print(iter.hasNext()+": ");
//		//다음 위치에 값이 있으면 True // 없으면 False
//		System.out.println(iter.next());
//		System.out.print(iter.hasNext()+": ");
//		System.out.println(iter.next());
//		System.out.print(iter.hasNext()+": ");
//		System.out.println(iter.next());
//		System.out.print(iter.hasNext()+": ");
//		System.out.println(iter.next());
//		System.out.print(iter.hasNext()+": ");
//		System.out.println(iter.next());
		
		
		//반복자를 사용할때는 hasNext와 next를 함께 잘 써야 함
		// . 찍고 사용할 수 있는 기능들은(메소드)
		// 설명에 어떤 타입이 필요한지 나타남
		// ex) iter.hasNext() 는 boolean
		// ex) iter.next() object
		// 그런데 이런 기능들을 활용하여 값을 정한 후 
		// 다른 것과 결합하여 표현하려고 하면
		// 형변환을 해줘야 할 경우가 발생하기도 함(종종)
		// String next = (String)result1 + result; 이런식
		
		
	}

}
