package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass04 {
	public static void main(String[] args) {
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
			label.setText(i+"");
			
		}
		
	}

}
