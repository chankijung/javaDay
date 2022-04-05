package day13;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
public static void main(String[] args) {
	
	// int형태와 비슷하다
	long time = System.currentTimeMillis();
	//현재 시간을 초단위로 환산
	System.out.println(time);
	
	SimpleDateFormat simple = 
			new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	//시간에 대한 형식을 지정하는 포맷 
	//괄호 안에는 yyyy MM dd hh mm ss 이용하여 형식지정
	String s = simple.format(time);
	System.out.println(s);
	
	
	Date date = new Date();
	System.out.println(date);
	System.out.println(simple.format(date));
	
	for(int i =0; i<5;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}   //예외처리를 해줌(Thread.sleep은 try catch로 묶어주는거구나)
			// 괄호 안에 있는 숫자만큼 대기시킴
	}
	
	String ss = "calc";
	ProcessBuilder pb = new ProcessBuilder(ss);
	try {
		pb.start();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
