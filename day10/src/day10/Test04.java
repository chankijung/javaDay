package day10;

import java.util.Scanner;

public class Test04 {

	public void test(int num) {
		String s;
		if(num%2==0) {
			s="짝수";
			//System.out.println("짝수");
		}else {
			s="홀수";
			//System.out.println("홀수");
		}
		print(num,s);
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.print("수 입력 : ");
		num = scan.nextInt();
		
		test(num);
	}
	public void print(int n, String  s) {
		System.out.println(n+" = "+s);
		
		
	}
}
