package quiz03;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	public ArrayList item() {
		ArrayList item = new ArrayList();
		item.add("몬스터의 가죽");
		item.add("몬스터의 이빨");
		item.add("몬스터의 척추뼈");
		item.add("몬스터의 똥");
		
		return item;
	}
	
	public int Random(int num) {
		return (int)(Math.random()*num);
	}
	
	public void display() {
		int pro= 6;
		System.out.println("1. 몬스터와 싸운다");
		System.out.println("1. 종료");
		System.out.println("----------------");
		Scanner input = new Scanner(System.in);
		int go = input.nextInt();
		if(go ==1) {
			while(true) {
				ArrayList item = item();
				int ran = Random(pro);
			}
		}
		
	}
}
