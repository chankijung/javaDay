package day15;
/*
  thread
  - 프로세스의 단위
  하나의 메소드(기능)을 동작시키기 위한 일꾼
  
 */
class A01 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("A01 : "+i);
		}
	}
}

class B01 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("B01 : "+i);
		}
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		A01 a =new A01();
		B01 b = new B01();
//		a.run();
//		b.run();
	
		a.setDaemon(true);
		b.setDaemon(true);
		// setDaemon을 통해 main이 종료되면 나머지 것들도 다 종료시킴
		
		
		a.start(); 
		// start는 thread가 가지고 있는 메소드
		// start를 통해 스레드가 하나씩 추가된다고 생각(일꾼 추가) 무조건 start가 필요
		
		b.start();
		
		// 스레드의 start를 이용하면 교차실행되거나 둘 중 아무거나 먼저 실행됨
		for (int i =0 ; i<15;i++) {
			System.out.println("main : "+i);
		}
		
	}

}
