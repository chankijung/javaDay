package test3;

import java.text.SimpleDateFormat;
import java.util.Date;

class TimerQuiz1{
	private Date date;
	private SimpleDateFormat sim;

	public void setDate() {
		date = new Date();
		sim = new SimpleDateFormat("yyyy년 MM월 dd일 "
				+ "hh시 mm분 ss초");
	}
	public String getDate() {
		return sim.format(date);
	}
	public void time() {
		for(int i=0;i<10;i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MainClass {
	public static void main(String[] args) {
		TimerQuiz1 tim = new TimerQuiz1();
		tim.time();
				
	}

}
