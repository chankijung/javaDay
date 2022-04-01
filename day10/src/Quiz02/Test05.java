package Quiz02;

import java.util.Scanner;

public class Test05 {
	public int input05() {
		return new Scanner(System.in).nextInt();
	}
	public int abso(int n) {
		if(n>=0) {
			return n;
		}else {
			return -n;
		}
	}
	public void print05(int n, int re) {
		System.out.println(re+"의 절대값"+n);
	}
}
