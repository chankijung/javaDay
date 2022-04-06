package ex01;

public class Ex03 {
					//ex03 = d4a
	private static Ex03 ex03;
	
	private Ex03() {
		System.out.println("생성자");}
	
	public static Ex03 getInstance() {
		if(ex03 ==null) {
		ex03 = new Ex03();
		}
		return ex03;
	}
}
//싱글톤 패턴 - 자원을 효율적으로 쓰겠다는 의지
//
