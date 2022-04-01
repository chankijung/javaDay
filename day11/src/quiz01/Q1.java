package quiz01;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =0;  // 메인화면 선택
		int cnt =0; //도전 횟수
		int com =0; // 컴퓨터 숫자
		int player =0; // 플레이어 숫자
		int score =0;
		while(true) {
			System.out.println("==Up Down Game==");
			System.out.println("   1. 게임 시작");
			System.out.println("   2. 게임 전적");
			System.out.println("   3. 게임 종료");
			System.out.println("----------------");
			num = scan.nextInt();
			switch(num) {
			case 1 :
				com = (int)(Math.random()*99+1);
				System.out.println("컴퓨터 숫자 : "+com);
				while(true) {
					System.out.print("Input Number ===> ");
					player = scan.nextInt();
					if(player == com) {
						cnt ++;
						System.out.println("정답입니다");
						System.out.println("도전 횟수는 "+cnt+"회 입니다");
						break;
					}else if(player > com) {
						cnt ++;
						System.out.println(" down ");
					}else {
						cnt ++;
						System.out.println("  up ");
					}
					
			}
			case 2 :
				System.out.println("게임 전적은");
				System.out.println(cnt);
				System.out.println("최고 기록은");
				System.out.println();
				
				
			}
		}
	}

}
