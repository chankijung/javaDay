package day10;

import java.util.Scanner;

public class Test03 {
	public int sumFunc(int num1, int num2) {
		int sum=0;
		sum = num1 + num2;
		return sum;
	}
	
	public int[] input() {
		Scanner scan = new Scanner(System.in);
		int num1, num2, sum = 0;
		
		System.out.print("수 입력 : ");
		num1 = scan.nextInt();
		System.out.print("수 입력 : ");
		num2 = scan.nextInt();
		
		int arr [] = new int[2];
		arr[0] =num1;
		arr[1] =num2;
		
		return arr;
		
		
	}
}
