package day09;

import java.util.ArrayList;

public class Quiz02 {
	public static void main(String[] args) {
	String str = new String("Have a nice day Have a nice day Have a nice day");
	ArrayList arr = new ArrayList();
	int i = 0;
	for(i=0; i<str.length();i++) {
		if(str.charAt(i)=='a') {
			arr.add(i);
		}
		
	}
	System.out.println(arr);

}
}