package day07;

import java.util.Scanner;

public class Ex01 {
	/*배열 
	 * 	- 같은 자료형으로 여러개의 공간을 만드는 것
	 * 고정된 크기 <-> ArrayList 가변 크기
	 * 처리속도 ArrayList에 비해 빠름
	 * 형식
	 * 자료형 [] 변수명 = new 자료형[개수]
	 * 자료형 변수명 [] = new 자료형[개수]
	 */
	public static void main(String[] args) {
		int [] arr = new int [5];
		arr[2] = 100;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println(arr.length);
		//해당하는 배열의 크기알려줌 .length
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = 100*i;
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println("출력 : "+arr[i]);
		}
		
		double d[] = new double[] {10.1, 20.2, 30.3};
		
		// 배열을 만들자마자 초기화하여 값을 넣을 수 있다.
		
		for(int i=0; i<3; i++) {
			System.out.println("d :"+d[i]);
			}
		
		
		//이런식으로 for문 사용 가능
		//for each 문
		for(double d2 : d) {
			System.out.println(d2);
		}
		
		Scanner input = new Scanner(System.in);
		String[] name = new String[3];
		
		for(int i = 0; i < name.length ; i++) {
			System.out.println(i + ".이름입력 :");
			name[i] = input.next();
		}
		
		System.out.println("------------출력----------");
		for(String s: name) {
			System.out.println(s);
		}
		}
		
	
}
