package ex02;

import java.util.Scanner;

class AAA{
	public void test() {
		int i=1;
		if(i==1)
			return;
		System.out.println("다음문장 실행");
	}
	public int test2() {
		Scanner input = new Scanner(System.in);
		int x =10, y=0, result = 0;
		try {
			result = x/y;
			System.out.println("result : "+result);
			return result;
		}catch(Exception e) {
			System.out.println("문제 발생");
			return -1;
		}finally {
			System.out.println("실행");
			System.out.println("마지막에 처리하는 작업 실행");
			//finally는 try든 catch든 무조건 실행
			//input.close();
		}
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.test();
		a.test2();
		
		Scanner in = new Scanner(System.in);
		int num =0;
		while(true) {
			System.out.println("수 입력");
			try{
				num=in.nextInt();
				System.out.println("입력받은 값 : "+num);
			}catch (Exception e) {
				System.out.println("숫자입력하세요");
				in.nextLine();
				//웹에서 try catch로 묶지않으면 문제가 생기는 경우가 많음
				
			}
		}
	}

}
