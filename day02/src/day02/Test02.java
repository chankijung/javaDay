package day02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name ;
		int kor =0;
		int eng =0;
		int math =0;

		
		
		System.out.println("당신의 이름은 무엇입니까?");
		name = scan.next();
		System.out.println(name+"님의 국어 점수는 : ");
		kor = scan.nextInt();
		System.out.println(name+"님의 영어 점수는 : ");
		eng = scan.nextInt();
		System.out.println(name+"님의 수학 점수는 : ");
		math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg =(total)/3;
		
		System.out.println("===================");
		System.out.println("이름 : "+name);
		System.out.println("===================");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("===================");
		System.out.println("합계 : "+total);
		System.out.println("===================");
		System.out.println("평균 : "+avg);

		

	}

}
