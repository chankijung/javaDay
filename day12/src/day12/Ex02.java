package day12;

public class Ex02 {
	int a = 10;
	public void setA(int a) {
		System.out.println(this);
		this.a = a;
		//this가 가리키는 것이 위에 있는 int a
		this.print();
		//아래 있는 print를 가리킨다(this 떼도 돼지만 이런
		//식으로 사용할 수 있음을 보여줌)
	}
	public void print() {
		System.out.println("a : "+a);
	}
}
