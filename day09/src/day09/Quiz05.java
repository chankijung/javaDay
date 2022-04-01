package day09;

import java.util.ArrayList;

public class Quiz05 {
public static void main(String[] args) {
	String str = "김개똥 -2017\n홍길동구리 -2015년\n선우선녀 -2018년";
	System.out.println(str);
	System.out.println();
	
	str =str.replace(" -", " :");
	System.out.println();
	
	String[] arrStr = str.split("\n");
	str="";
	
	for(int i=0;i<arrStr.length;i++) {
		String[] reStr=arrStr[i].split(":");
		reStr[1]=reStr[1].replace(reStr[1], "1999");
		str +=(reStr[0]+":"+reStr[1]+"\n");
	}
	System.out.println("---변경후---\n"+str);
	
}
}
