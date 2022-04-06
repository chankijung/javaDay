package ex02;

import java.util.ArrayList;

/*
	 예외 처리
	 - 프로그램에서 예외가 발생한 경우를 처리하는 것
	 
	 종류
	 강제 예외 : throw
	 예외 전가 : throws
	 예외 처리 : try, catch
	 
 */

public class MainClass01 {
	public static void main(String[] args) {
		int x=10, y=0, result = 0;
		ArrayList arr = new ArrayList();
		
		try{
			arr.add(111);
			for(int i=0; i<2; i++){
				System.out.println(arr.get(i));
			}
			result= x/y;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("문제발생");
		}catch(NullPointerException e) {
			System.out.println("널값으로는 기능을 사용할 수 없음");
			
		}catch(Exception e){
			System.out.println("범위를 벗어났습니다");
		}
		System.out.println("다음 문장들 실행");
	}
}
