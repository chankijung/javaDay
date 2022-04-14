package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		//파일 입출력
		// eclipse -> file : output stream
		// file -> eclipse : input stream
		// 각각 연결통로가 따로 있음
		
		String path = "C:/자바 취업반/자바/java_workspace/test.txt";
		File path01 = new File("C:/자바 취업반/자바/java_workspace/test01.txt");
		
		//path01.mkdir();
		//path01.delete();
		// File 타입이 좀더 기능이 많다.
		
		//FileOutputStream out = new FileOutputStream(path);
		FileOutputStream out01 = new FileOutputStream(path01);
		// 해당하는 위치에 파일이 없으면 만들어줌
		// 해당하는 위치에 파일이 있으면 지우고 새로 만듦
		
		/*
		    해당하는 위치에 파일이 없으면 만들어줌
			해당하는 위치에 파일이 있으면 지우고 새로 만듦
			그렇기 때문에 기존의 내용은 사라지고 새로운 내용으로 바뀐다.
			옵션으로 true를 넣으면 append가 된다. 기존의 내용 뒤에 이어 써준다.
		 */
	
		out01.write(97);
		out01.write('A');
		
		String str = "dkwkckzk";
		out01.write( str.getBytes() );
		//문자열을 바이트형식으로 바꿔줌
		
		// .createNewFile() : 해당 위치에 파일이 존재하면 false
		//					: 해당 위치에 파일이 존재하지 않으면 파일을 생성하고 true
		
		if(path01.createNewFile()) {
			System.out.println("새로운 파일을 생성합니다");
			FileOutputStream out02 = new FileOutputStream(path01, true);
		}else {
			System.out.println("해당 파일이 존재합니다");
		}
		out01.close();
		// close로 닫아주는게 자원 효율적 이용
		
		
	}
}
