package ex01;
class Ex05_01{
	//public이 없어서 외부에서 접근 불가
	//Ex05 내에서만 사용하는 클래스가 됨
	public Ex05_01() {
		System.out.println("부모생성자");
	}
	//디폴트 생성자를 만들어두면 아래 String s를 넣어야 할때
	//넣을 수 없어서 오류가 났던 것이 해결됨
	public Ex05_01(String s){
		System.out.println(s+" :Ex05_01");
	}
}

public class Ex05 extends Ex05_01 {
	public Ex05() {
		super("넘겨줌");
		//super를 이용하면 
		//String s에 넣어줘서 디폴트 생성자 없어도 됨
		
		System.out.println("Ex05");
	}
}
