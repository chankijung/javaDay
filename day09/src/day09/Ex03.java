package day09;

public class Ex03 {
	public static void main(String[] args) {
		String str;
		str = "test";
		System.out.println(str);
		
		String str2 = new String();
		str2 = "test222";
		System.out.println(str2);
		
		str2 = "java is Easy. 그리고 programming 굿";
		System.out.println("*기본 : "+str2);
		System.out.println(str2.toUpperCase());
		System.out.println("*확"+ "인 : "+str2);
		//어퍼클래스 ( 일시적으로 대문자로 변경)
		// 다시 자기 자신을 호출하면 변경 

		
		System.out.println("확인 :" + str2);
		System.out.println(str2.toLowerCase());
		
		str="abcde";
		//   1,2,3,4,5
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println((char)(str.charAt(0)-32));
		System.out.println(str.charAt(1) =='b');
		System.out.println(str.charAt(1)=='c');
		
		
	}

}
