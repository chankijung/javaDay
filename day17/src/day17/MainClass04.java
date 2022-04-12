package day17;

import java.util.ArrayList;

class St{
		private String name;
		private String stNum;
		
	
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStNum() {
			return stNum;
		}
		public void setStNum(String stNum) {
			this.stNum = stNum;
		}
		
		public void print() {
			System.out.println(stNum);
			System.out.println(name);
		}
}
public class MainClass04 {
	public static void main(String[] args) {
		ArrayList<St> st = new ArrayList<St>();
		
		St s = new St();
		s.setName("홍길동");
		s.setStNum("111");
		//s.print();
		
		
		st.add(s);
		//객체가 여러개 있으면 arraylist를 사용하기 위해 add로 추가
		
//		St ss = st.get(0);
//		ss.print();
		st.get(0).print();
		
		St s01 = new St();
		s01.setName("이순신");
		s01.setStNum("112");
		
		st.add(s01);
		st.get(1).print();

		System.out.println();
		System.out.println("==============================");
		int cnt =0;
		for(int i=0;i<st.size();i++) {
			St a = st.get(i);
			a.print();
			
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("==============================");
		System.out.println();
		for(St b : st) {
			b.print();
		}
		// for each문 헷갈리지말자
		// 어레이리스트 st 값을 순서대로  b에 넣음
		//  b.print()로 출력
		System.out.println();
		System.out.println("==============================");
		ArrayList<Integer> arr =new ArrayList<Integer>();
		arr.add(111);
		arr.add(112);
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
