package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//입력
		Scanner input = new Scanner(System.in);
		//import 까지 하기
		
		String name;
		
		System.out.println("이름은 뭐에요? ");
		name = input.next();
		
		//입력받는 기능
		System.out.println("당신의 이름은 "+name+"이군요");
		
		
		int age;
		System.out.print("나이 입력 :");
		age = input.nextInt();
		System.out.println("당신의 나이는 "+age+"세 이군요");

		int k=0, e=0;
		char n=0;
		double d=0;
		float f=0;
		
		//첫번째 글자가 소문자인 타입의 경우에 =0으로 초기화 한다
		
		String a=null;
		//첫번째 글자가 대문자인 타입은 =null로 초기화
		
		
		
		System.out.println(a);
	}

}
