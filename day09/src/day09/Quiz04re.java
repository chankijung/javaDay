package day09;

public class Quiz04re {
	public static void main(String [] args){
		String str = new String("tESt  sTring  change   first");
		String changeStr = new String();
		int i=0;

		str = str.toLowerCase();
		if(str.charAt(0) >='a' && str.charAt(0) <='z') {
			changeStr+=(char)(str.charAt(i)-32);
			i++;
		}
		//str = test  string  change   first
		//changeStr = T
		while(i<str.length()) {
			if(str.charAt(i) != ' ') {//str(i)가 공백이 아니라면
				changeStr+=str.charAt(i);//str그대로 붙여넣음 changeStr
				i++;
				continue;
			}
			while(str.charAt(i) == ' ') {
				changeStr+=str.charAt(i);
				i++;
			}
			if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
				changeStr+=(char)(str.charAt(i)-32);
			i++;
		}
		System.out.println(str);
		System.out.println(changeStr);
		System.out.println("종료");
	}

}
