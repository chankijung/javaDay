package day02;

public class Test01 {
	public static void main(String[] args) {
		
		String name = "김말이";
		int age = 20;
		double height = 173.3;
		//float ki = 183.2; //4바이트인 float에 8byte인 실수를 넣어서 오류남
		float ki1 = 183.2f;
		float ki2 = (float)183.2;
		int IQ = 120;
		char grade = 'B';
		String Grade ="X";
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("키1 : "+ki1);
		System.out.println("키2 : "+ki2);
		System.out.println("아이큐 : "+IQ);
		System.out.println("등급: "+grade);
		System.out.println("등급: "+Grade);
	}

}
