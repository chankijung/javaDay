package day17;

/*
    T : type
    E : Element (객체)
    
 */


class BBB<T>{
	//매개변수의 타입이 다르면 메소드 오버로딩(메소드를 다르게 인식해서 같은 이름으로 여러개 쓰는 것)
	public void sumfunc(T a, T b) {
		System.out.println(a+", "+b);
		System.out.println(a.getClass());
		// a.getClass() - a 가 어떤 타입을 갖고 있는지 알려줌
	}
}
public class MainClass02 {
public static void main(String[] args) {
	BBB<Integer> b = new BBB<>();
	b.sumfunc(100, 200);
	
	BBB<String> bb = new BBB<>();
	bb.sumfunc("하이", "하이");
}
}
