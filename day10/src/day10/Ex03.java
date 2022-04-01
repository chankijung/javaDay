package day10;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * int num =19; if(true) { num+=100;
		 * 
		 * } System.out.println(num);
		 */

		int num =19;
		if(true) {
			num+=100;
		}
		System.out.println(num);
		
		Test03 t03 = new Test03();
		
		//t03.input();
		int num1=0, num2=0;
		int a = t03.sumFunc(num1, num2);
		
		System.out.println("두 수 합 : "+a);
		
		
		int[] b = t03.input();
		System.out.println("배열 0 :"+b[0]);
		System.out.println("배열 1 :"+b[1]);
		
	}
}




