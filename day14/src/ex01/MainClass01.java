package ex01;

public class MainClass01 {
	public static void main(String[] args) {
		
		Ex01 ex = new Ex01(40,20) {
			public void mul() {
				System.out.println(40*20);
			}
			//익명 중첩 클래스
			//쓸일 많이 없다
		};
		ex.sum();
		ex.sub();
		ex.mul();
		ex.div();
	}

}
