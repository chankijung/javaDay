package day10;

import java.util.Scanner;

public class Test05 {
	public int input() {
		int num = 10;
		return num;
	}
	
	public void print(int num,String  re) {
		System.out.println(num+re);
	}
	
	public void op() {
		int result = input();
		// if 짝 홀
		print(result," 짝수");
	}
	
	public int input2() {
		/*
		 * Scanner in = new Scanner(System.in); 
		 * int num = in.nextInt(); 
		 * return num;
		 * 아래와 위는 같은 방식이다.
		 */
		return new Scanner(System.in).nextInt();
	}
	public String op2(int num) {
		if(num%2==0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	public int op3(int num) {
		if(num%2==0) {
			return 0;
		}else {
			return 1;
		}
	}
	public void print2(int n, String s) {
		System.out.println(n + s);
	}
}
