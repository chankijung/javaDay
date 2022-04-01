package day09;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		String key =null, value = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("저장 키 입력");
		key = scan.next();
		System.out.println("저장 값 입력");
		value = scan.next();
		
		map.put(key, value);
		System.out.println(map);
	}

}
