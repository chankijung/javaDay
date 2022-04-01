package day11;

public class Test03 {
	public int test01() {
		int var = 100;
		System.out.println("test : "+var);
		return var;
	}
	public void test02(int var) {
		System.out.println("test2 : "+var);
	}
	
	public void test03() {
		for(int i=0;i<313;i++) {
			System.out.println("test3 : "+i);
			if(i==3)
				return;
		}
		System.out.println("for 다음문장");
		
		// return 자리에 break를 쓰면
		// for 다음문장이 출력되지만
		// return을 쓰면
		// retrun을 만나는 순간 종료
		//(for 다음문장이 출력 안됨)
		// 반복문 안에있다고 return이 여러번 돌지 않음
	}
	
	public int test04() {
		int num = 3;
		if(num %3 == 0) {
			return num;
		}else if(num %2 ==0){
			return -1;
		}
		return 0;
		
		// 조건이 항상 참인것은 아니기에
		// esle if를 쓰게되면 반환타입에 상응하는 return값이 없게 됌
		// 그래서 이 경우에는 else를 추가해주거나
		// return 값을 하나 지정해서 써줘야 함
	}

}
