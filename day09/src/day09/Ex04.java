package day09;

public class Ex04 {
public static void main(String[] args) {
	
	String id = "   test   ";
	String idCheck = "test";
	System.out.println(id);
	System.out.println(idCheck);
	
	System.out.println(id.equals(idCheck));
	System.out.println(id.trim());
				// 양쪽에 공백 삭제
	System.out.println(idCheck.equals(id.trim()));
	
	String str = "aaa bbb ccc ddd";
	//스플릿 : 특정 문자를 기준으로 쪼개기
	
	//주소(우편번호, 주소, 상세주소)
	String s = "010242/서울/종로3";
	String[] sa= str.split("/");
	
	/*
	 * System.out.println(s[0]); System.out.println(s[1]); System.out.println(s[2]);
	 * 
	 * s[2] = "주소변경"; str = s[0] +"/"+s[1]+"/"+s[2]; System.out.println(str);
	 * 
	 * String re = str.replace("/", ";"); System.out.println(re);
	 */
	}

}
