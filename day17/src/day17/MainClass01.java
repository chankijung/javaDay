package day17;


/*
 	제너릭 
 	- 가변 자료형이다.
 	- 기본 8대 자료형으로는 자료형으로는 사용할 수 없다.
 	- wrapper 자료형으로 사용해야 한다
 	- 8대 자료형은 int, char, double...
 	
 	wrapper 
 	- Integer, Character, Double, Float,...
 	- wrapper자료형은  일반자료형을 클래스타입으로 변경한 것
 	- 요즘 추세는 Integer로 만듦
 */

class AAA{
	//매개변수의 타입이 다르면 메소드 오버로딩(메소드를 다르게 인식해서 같은 이름으로 여러개 쓰는 것)
	public void sumfunc(int a, int b) {
		System.out.println(a+b);
	}
	public void sumfunc(double a, double b) {
		System.out.println(a+b);
	}
	public void sumfunc(String a, String b) {
		System.out.println(a+b);
	}
	
	
}
public class MainClass01 {
	public static void main(String[] args) {
	//	int num;
	Integer num;
	// 일반타입은 제너릭으로 쓸 수 없기때문에
	// wrapper 타입으로 쓰는 추세이다.
	AAA a = new AAA();
	a.sumfunc(10, 20);
	a.sumfunc(10.11, 20.22);
	a.sumfunc("aaa", "bbb");
	}	
}
