package day12;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		int k=100, e=90, m=80;
		Scanner input = new Scanner(System.in);
		Ex06 ex = new Ex06();
		
		System.out.println("국어 입력 :");
		k = input.nextInt();
		System.out.println("영어 입력 :");
		e = input.nextInt();
		System.out.println("수학 입력 :");
		m = input.nextInt();
		
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		
		System.out.println("국어 :"+ex.getKor());
		System.out.println("영어 :"+ex.getEng());
		System.out.println("수학 :"+ex.getMath());
		System.out.println("합 :"+ex.sum());
		System.out.println("평균 :"+ex.avg());
		
		
	}

}
