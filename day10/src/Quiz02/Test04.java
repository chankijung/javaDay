package Quiz02;

import java.util.Scanner;

public class Test04 {
	public int input04() {
		return new Scanner(System.in).nextInt();
	}
	
	public int primeCheck(int n) {
		int cnt=0;
		for(int i =1; i<n+1;i++) {
			if(n%i == 0)
				cnt++;
		}
		return cnt;
	}
	
	public void print04(int n,int re) {
		if(re ==2)
			System.out.println(n+" : 소수");
		else
			System.out.println(n+" : 소수 아님");
	}

}
