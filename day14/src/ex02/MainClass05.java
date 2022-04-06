package ex02;

import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age;
	System.out.println("나이입력 : ");
	try{
			age = input.nextInt();
			if(age<=0)
				throw new Exception("잘못 입력");
			//강제 예외
			// if문 써서 예외를 처리
			
			System.out.println("당신의 나이는 :"+age);}
	catch(Exception e) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}
	
}
}
