package day18;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MainClass03 implements CommonPath{

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream(path);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 보조스트림을 만들 때는 기본스트림을 이용해서 만든다.
		// 위에서 만든 fos를 이용
		
		
		
		for(char i='0';i<'9';i++) {
			//Thread.sleep(2000);
			bos.write(i);
		}
		//bos.flush();
		bos.close();
		//close()나 flush() 둘 중 하나는 있어야 함
		//실행될 때마다 파일에 접근하는 것이 아니라
		// fos.write()는 위 코드에 따라 2초에 한번씩 글자가 써졌는데
		// bos.write()는 저장소에 저장됐다가 한번에 파일에 접근함.
		// ( 1,2,3,...8까지 한번에 나타남)
	}
}
