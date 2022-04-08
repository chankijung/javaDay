package test01;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;

class AAA extends Thread{
	public void run(){
		while(true) {
			
			JFrame frame = new JFrame("test");
			
			Container c= frame.getContentPane();
			JLabel label = new JLabel("Hello GUI");
			c.add(label);
			
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setLocation(500,200);
			frame.setPreferredSize(new Dimension(400,400));
			frame.pack();
			//설정한 값을 적용
			label.setFont(new Font(null, Font.BOLD, 15));
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setText("Welcome to JAVA world");
			
			int i=0;
			for(;;i++) {
				try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				long t= System.currentTimeMillis();
				SimpleDateFormat s=
						new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
				
				label.setText(s.format(t));
				
			}
			
		
		}
	}// 반복문으로 묶어야 스레드가 멈추지않고 계속 동작함
}
public class Test02 {
	public static void main(String[] args) {
		AAA a = new AAA();
		System.out.println("main 시작");
		a.start();
		System.out.println("main 끝");
	}

}
