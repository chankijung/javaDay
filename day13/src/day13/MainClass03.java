package day13;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		
		// try catch : 예외처리
		// 프로그램상의 문제상황(예외) 
		// try catch로 예외상황을 처리하면
		// 문제가 터져도 프로그램이 종료되지 않고 진행 됨
		
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.println("나이 입력 : ");
		
		try {
			age = input.nextInt();
			System.out.println("당신의 나이는? "+age);
		}catch(Exception e){
			System.err.println("숫자만 입력 ");
		}
		
		System.out.println("다음 문장들 실행!!");
		System.out.println("다음 문장들 실행!!");
		System.out.println("다음 문장들 실행!!");
		System.out.println("다음 문장들 실행!!");
	}

}
