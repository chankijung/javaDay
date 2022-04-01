package day10;

public class Ex05 {
	public static void main(String[] args) {
		Test05 t05 = new Test05();
		//t05.op();
		
		t05.input();
		int a = t05.input2();
		String s = t05.op2(a);
		t05.print2(a,s);
		
		int result = t05.op3(a);
		if(result==1) {
			System.out.println(a +"짝수");
		}else {
			System.out.println(a + "홀수");
		}
		
	}

}
