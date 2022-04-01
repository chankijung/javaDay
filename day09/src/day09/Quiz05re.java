package day09;

public class Quiz05re {
	public static void main(String [] args){
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		System.out.println("====변경 전 str====\n"+str);
		str = str.replace("-", ":");
		String[] arrStr = str.split("\n");
		str="";

		for(int i=0;i<arrStr.length;i++) {
			String[] reStr = arrStr[i].split(":");
			reStr[1]=reStr[1].replace(reStr[1], "1999년");
			//reStr[1]="1999년";
			str+=(reStr[0]+":"+reStr[1]+"\n");
		}
		System.out.println("====변경 후 str====\n"+str);
	}

}
