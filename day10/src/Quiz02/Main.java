package Quiz02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Test t01 = new Test();
		int num1 = t01.input();
		int num2 = t01.input();
		
		int result =t01.diff(num1, num2);
		
		if(result == 1) {
			t01.print(num1,">",num2);
		}else if(result ==0) {
			t01.print(num1, "=", num2);
		}else {
			t01.print(num1, "<", num2);
		}
		
		
		
		//2번
		Test02 t02 = new Test02();
		
		int n3 = t02.input02();
		
		
		int result02 =t02.diff02(n3);
		if(result02 == 1) {
			t02.print02(n3," = 짝수");
		}else {
			t02.print02(n3, " = 홀수");
		}
		
		
		//3번
		Test03 t03 = new Test03();
		int n4 = t03.input03();
		int result03 = t03.diff03(n4);
		if(result03 == 1) {
			t03.print03(n4);			
		}else {
			System.out.println("3의 배수 아님");
		}
		
		
		//4번
		Test04 t04 = new Test04();
		
		int pn = t04.input04();
		int cnt =t04.primeCheck(pn);
		/*
		 * if(cnt == 2) t04.print04(pn);
		 */
		t04.print04(pn,cnt);	
		
		//5번
		Test05 t05 = new Test05();
		int n5 = t05.input05();
		int re =t05.abso(n5);
		t05.print05(re,n5);
		
	}
	

}
