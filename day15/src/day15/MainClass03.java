package day15;

import java.util.Scanner;

class A02 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("A02");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}
public class MainClass03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str;
	A02 a = new A02();
	
	a.setDaemon(true);
	a.start();
	while(true) {
		System.out.println("입력 :");
		str= input.next();
		System.out.println(str);
	}
	//입력은 입력대로, 출력은 출력대로 따로 진행이 됨을 알 수 있다.
	
}
}
