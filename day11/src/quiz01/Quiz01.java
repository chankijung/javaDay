package quiz01;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num=0;
	int cnt=0;
	while(true) {
		System.out.println("----UpDown----");
		System.out.println("1. 게임시작");
		System.out.println("2. 게임전적");
		System.out.println("3. 게임종료");
		System.out.println("--------------");
		num = input.nextInt();
		switch(num) {
		case 1:
			int pc = (int)(Math.random()*99)+1;
			System.out.println("컴퓨터 숫자 : "+pc);
			while(true) {
				
			}
		}
			
		
	}
}
}
