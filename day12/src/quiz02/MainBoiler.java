package quiz02;

import java.util.Scanner;

public class MainBoiler {
public static void main(String[] args) {
	int nowTemp =16, ondolTemp =0, futureTemp=0,
			reserTemp=0, time=0, lastTime=0;
	int cnt =0;
	Scanner input =new Scanner(System.in);
	Boiler bo = new Boiler();
	while (true) {
		System.out.println("---보일러 가동----");
		System.out.println("1. 보일러 전원  ");
		System.out.println("	2. 외출 기능");
		System.out.println("	3. 실내온도 설정");
		System.out.println("	4. 온돌 기능");
		System.out.println("	5. 예약 기능");
		System.out.println("6. 보일러 종료 ");
		
		int n = input.nextInt();
			switch(n) {
			case 1 :
				bo.boil1();
				break;
			case 2 :
				bo.goOut();
				break;
			case 3 :
				bo.inside();
				break;
			case 4 :
				bo.ondol();
				break;
			case 5 :
				System.out.println("예약 온도 입력 :");
				reserTemp = input.nextInt();
				System.out.println("예약 시간 입력 :");
				time = input.nextInt();
				System.out.println("지속 시간 입력 :");
				lastTime = input.nextInt();
				
				break;
			case 6 :
				System.out.println("종료");
				break;
			}
		
		
	}
	
}
}
