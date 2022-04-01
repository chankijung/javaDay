package Quiz02;

import java.util.Scanner;

public class Test {
	public int diff(int n1, int n2) {
		if(n1>n2) {
			return 1;
		}else if(n1 == n2) {
			return 0;
		}else {
			return -1;
		}
	}
	public int input() {
		return new Scanner(System.in).nextInt();
	}
	public void print(int n1, String s, int n2) {
		
		System.out.println( n1+s+n2);
	}
	

}
