package day13;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("계산기", "calc");
		map.put("메모장", "notepad");
		
		Scanner input = new Scanner(System.in);
		String key;
		System.out.println("실행 값 입력 : ");
		key = input.next();
		
		System.out.println(key+" : "+map.get(key));
		System.out.println(map.containsKey(key));
		
		if(map.containsKey(key)==true) {
			//map.get() != null
			ProcessBuilder pb = new ProcessBuilder((String)map.get(key));
			try {
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		}else {
			System.out.println(key+"명령어는 존재하지 않습니다");
		}
		
	}

}
