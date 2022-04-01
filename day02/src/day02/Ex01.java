package day02;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 변수 
		 	- 데이터를 저장하기 위한 공간
		 	- 저장하기 위한 공간이기에 언제든지 값의 변경이 가능
		 	- 저장공간(변수) 이름을 지을 때 공백은 허용하지 않는다
		 	- 한글로 만들 수 있지만 만들지 않는다
		 
		 자료형(type)
		 	int : 정수를 표현 - 4byte
		 	char : 문자 표현 - 1byte
		 	flaot : 실수 표현 - 4byte
		 	double - 실수 표현 - 8byte
		 	
		 */
		/*
		 * int age = 30; double weight = 55.0; double height = 165.0;
		 * 
		 * System.out.println("나의 나이는 "+age); System.out.println("나의 키는 "+height);
		 * System.out.println("나의 몸무게는 "+weight);
		 */
		
		// 문자 하나는 '(작은 따옴표) 표현
		char ch = 'A';
//		int num = 5;
//		int ret;
		int num = 5, ret ;
		ret = ch + num;
		// ch = 'A' 가 아스키코드상에서 65라는 숫자로 표현되기 때문에
		// ch + num은 65 + 5 가 되어 70의 값이 나온다
		
		System.out.println("ret = "+ret);
		System.out.println("ch : "+ch);
		System.out.println("num : "+num);
		
		ch = 'B';
		num = 1;
		
		System.out.println("변경 후");
		
		System.out.println("ret = "+(char)ret);
		// 형변환
//		 - 자료형에 대하여 변화
//		 - 형변환 -> type casting
		
		System.out.println("ch : "+(int)ch);
		System.out.println("num : "+num);
		
	}

}
