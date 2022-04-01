package day11;

/*
 	-변수-
 	- 클래스 변수 : 클래스 영역에서 만드는 변수
 	- 인스턴스(객체) 변수 : 인스턴스(객체)가 생성될 때 만들어지는 변수
 	- 지역 변수 : 특정 지역에서 생성되는 변수
 	
 	
 	-
 */

public class Ex01 {
	public static void main(String[] args) 
	{  // 이 중괄호 안에서 만드는 
		// 메소드 안에서 만드는 
		// 지역변수
		
		if(true) {
			int num = 123;
			
		}
		//System.out.println(num);
		// if문 안에서 만든 변수는 바깥에서 쓸 수 없다.
		//바깥쪽에서 만든 변수는 안쪽(작은쪽)에서 쓸 수 있다.
		// 반대는 x
		
		for(int i=0;i<5;i++) {
			System.out.println((int)(Math.random()*3)+10);
				// 0.0 ~ 0.9 까지의 수를 뽑아줌
				// 곱한 수 만큼의 범위안에서 숫자를 뽑는 개념
					// 로또 만들때 : (int)(Math.random() * 45) +1 이런식
		}
		
		
	}

}
