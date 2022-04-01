package day09;

import java.util.ArrayList;

public class Quiz03 {
public static void main(String[] args) {
	String str = new String("It is a fun java programming");
	ArrayList arr1 = new ArrayList();
	ArrayList arr2 = new ArrayList();
	for(int i =0; i<str.length();i++) {
		if(str.charAt(i)=='a') {
			arr1.add(i);
		}
		if(str.charAt(i)=='g') {
			arr2.add(i);
		}
	}
	System.out.println(str.length());
	System.out.println(arr1.size());
	System.out.println(arr2.size());
}
}
