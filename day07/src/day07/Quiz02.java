package day07;

import java.util.Scanner;

public class Quiz02 {
		public static void main(String[] args) {
		
			int [] arr = new int[] {10,13,17,25,30,54};
		
			Scanner input = new Scanner(System.in);
			String odd_even;
		
			System.out.println("짝수, 홀수 입력 :");
			odd_even = input.next();
		
			if(odd_even.equals("짝수")) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]%2==0) {
						System.out.println("짝수는 " +arr[i]);
						}
				}
		}
			if(odd_even.equals("홀수")) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]%2==1) {
						System.out.println("홀수는 " +arr[i]);
						}
				}
		}
		}
		


		}


