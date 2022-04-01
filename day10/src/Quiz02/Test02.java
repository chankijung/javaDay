package Quiz02;

import java.util.Scanner;

public class Test02 {
	public int input02() {
		return new Scanner(System.in).nextInt();
	}
	public int diff02(int n1) {
		if(n1 %2 == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	public void print02(int n1,String s) {
		System.out.println(n1+s);
	}
}
