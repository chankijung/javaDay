package day12;

public class Ex03 {
	private int age;
	
	private String name;
	
	private int addr;
	
	//일반적으로 변수들 private으로 만든다
	// 정보은닉,캡슐화 라고 표현
	//private으로 만든 변수는 특정 메소드를 이용해 접근함
	
	public void printA() {
		System.out.println(age);
	}
	public void setAge() {
		
	}
	public void setName() {
		
	}
	public void setAddr() {
		
	}
	public void getAge() {
		
	}
	public void getName() {
		
	}
	public void getAddr() {
		
	}
	
	
	public void setting(int a) {
		age = a;
	}
	public int getter() {
		return age;
	}
	//setter와 getter는 해당하는 변수에 접근할때 사용
	//setter는 값 설정
	//getter는 값 호출
	

}
