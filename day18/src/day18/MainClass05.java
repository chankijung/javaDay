package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Test05 t= new Test05();
		t.setName("홍길동");
		t.setAge(20);
		
		String path="C:/자바 취업반/자바/java_workspace/";
		
		//path = path+"홍길동" + .txt;
		path = path+t.getName()+".txt";
		
		File filePath = new File(path);
		
		try {
			if(filePath.createNewFile()) {
				FileOutputStream fos = new FileOutputStream(filePath);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				//객체 저장하는 스트림
				
				oos.writeObject(t);
				//오브젝트 값을 저장
				oos.close();
				System.out.println("저장되었습니다");
				
				
				//오류가 났던 이유 - serializable이 상속 안돼있어서
				// 해결법 : 직렬화를 하기 위해 Test05클래스에 serializable을 상속시키면 된다
				
			}else {
				System.out.println("해당 회원은 존재합니다");
				System.out.println("다른 이름으로 가입하세요");
			}}
		catch(Exception e) {
			filePath.delete();
			System.out.println("문제 발생했습니다");
		}
	
		
		
		Scanner input = new Scanner(System.in);
		String name;
		
		while(true) {
			path ="C:/자바 취업반/자바/java_workspace/";
			System.out.println("찾을 이름 입력");
			
			name = input.next();
			path= path + name + ".txt";
			File file = new File(path);
			try {
				FileInputStream fi = new FileInputStream(file);
			//	System.out.println("fi : "+fi);
				BufferedInputStream b = new BufferedInputStream(fi);
				ObjectInputStream o = new ObjectInputStream(b);
				
				Test05 a = (Test05)o.readObject();
				System.out.println("이름 : "+a.getName());
				System.out.println("나이 : "+a.getAge());
			
			}catch (Exception e) {
				System.out.println("해당 파일은 존재하지 않습니다");
			}
		}
	}
}


















