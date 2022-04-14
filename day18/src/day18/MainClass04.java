package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass04 implements CommonPath{
	public static void main(String[] args) throws Exception{
	
		FileOutputStream fos = new FileOutputStream(path);
		//기본스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//보조스트림
		
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF("한글처리 되나용");
		dos.flush();
		dos.writeUTF("내용 추가");
		dos.close();
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String str = dis.readUTF();
		String str1 = dis.readUTF();
		dis.close();
		
		System.out.println(str);
		System.out.println(str1);
	}

}
