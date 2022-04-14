package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(CommonPath.path);
		while(true) {
			int res = fis.read();
			
			if(res <0) { 
				System.out.println("res : "+res);
				break;}
			//문자는 -가 표현될 수 없음. 
			//그래서 -를 만나면 빠져나가라는 것은 문자의 끝을 만나면 빠져나오라는 뜻
			
			System.out.println( (char)res );
			//한글은 표현 안된다.
		}
	}

}
