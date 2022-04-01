package quiz02;

import java.util.HashSet;
import java.util.Scanner;



public class Quiz02 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		
		System.out.println("로 또 번 호 뽑 기");
		System.out.println("---- 시작 ----");
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		
		Lotto lo = new Lotto();
		System.out.println(lo.hashSet());
		
		System.out.println(lo.arrList());
		
		
		
		
	}

}
