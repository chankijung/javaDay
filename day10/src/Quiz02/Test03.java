package Quiz02;

import java.util.Scanner;

public class Test03 {
	public int input03() {
		return new Scanner(System.in).nextInt();
	}
	
	public int diff03(int n) {
		if(n%3 ==0) {
			return 1;
		}else 
			return 0;
		}
	public void print03(int n) {
		System.out.println(n);
	}

}
