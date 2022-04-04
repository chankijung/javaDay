package quiz02;

import java.util.Scanner;

public class Boiler {
	private int nowTemp = 16;
	private int cnt = 0;
	private int ondolTemp;
	private int futureTemp;
	private int reserTemp;
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setNowTemp(int ondolTemp) {
		this.nowTemp = ondolTemp;
	}
	public void boil1() {
		System.out.println("-----------");
		System.out.println("보일러 on");
		System.out.println("-----------");

	}
	public void goOut() {
		
		if( getCnt() == 0) {
			System.out.println("외출 on");
		setCnt(1);
		}else {
			System.out.println("외출 off");
			setCnt(0);
		}
	}
	public void inside() {
		Scanner input = new Scanner(System.in);
		System.out.println("실내 온도 입력 :");
		futureTemp = input.nextInt();
		System.out.println("현재 온도 / 실내 온도");
		System.out.println("      "+nowTemp+" / "+futureTemp);
	}
	
	public void ondol() {
		Scanner input = new Scanner(System.in);

		System.out.println("온돌 온도 입력 :");
		ondolTemp = input.nextInt();
		System.out.println("현재 온도 / 온돌 온도");
		System.out.println("      "+nowTemp+" / "+ondolTemp);
		setNowTemp(ondolTemp);
	}
	public void reserTemp() {
		Scanner input = new Scanner(System.in);
		System.out.println("예약 온도 입력 :");
		reserTemp = input.nextInt();
//		System.out.println("예약 시간 입력 :");
//		time = input.nextInt();
//		System.out.println("지속 시간 입력 :");
//		lastTime = input.nextInt();
		
	}
	
}
