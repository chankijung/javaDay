package day17;

import java.util.ArrayList;
class Test {
	
}
public class MainClass03 {
	 public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("aaa");
		arr.add(1111);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		//int a = arr.get(1) * 10; //어떤타입인지 알수없으니 형변환 힘들다
		//String s = arr.get(0);
		
		
		ArrayList<Integer> arr02 = new ArrayList<Integer>();
		arr02.add(111);
		// arr02.add("123"); int를 받기로 보장되어 있기 때문에 String 못넣음
		int a02 = arr02.get(0);
		
		
		ArrayList<String> arr03 = new ArrayList<String>();
		arr03.add("test");
		// arr03.add(1234); String 타입만 받기로 돼있음. int타입 x
		String a03 = arr03.get(0);
		
		
		
		
		
		
		
		
	}
}
