package day17;

import java.util.ArrayList;
import java.util.Scanner;

class Name{
	private String name;
	private String addr;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

public class MainClass05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String name;
	String addr;
	int num;
	
	ArrayList<Name> arr = new ArrayList<Name>();
	
	
	while(true) {
		System.out.println("1. 저장");
		System.out.println("2. 모든 정보 출력");
		System.out.println("3. 이름 조회");
		
		num = input.nextInt();
		switch(num) {
		case 1 :
			System.out.println("이름 입력");
			System.out.println("주소 입력");
			name = input.next();
			addr = input.next();
			Name n = new Name();
			n.setName(name);
			n.setAddr(addr);
			
			arr.add(n);
			// 프로그램 실행중에 계속 이름이 저장됨
			
			break;
		case 2 : 
			for(int i = 0; i<arr.size(); i++) {
				System.out.println("이름 : "+arr.get(i).getName());
				System.out.println("주소 : "+arr.get(i).getAddr());
			}
			System.out.println("=======================");
			for(Name nn : arr) {
				System.out.println("이름 : "+nn.getName());
				
				System.out.println("주소 : "+nn.getAddr());
			}
			break;
		case 3 : 
			System.out.println("검색 이름 입력 : ");
			name= input.next();
			int i;
			for(i =0; i<arr.size();i++) {
				Name nn = arr.get(i);
				if(name.equals(nn.getName())) {
					System.out.println("이름 : "+nn.getName());
					System.out.println("주소 : "+nn.getAddr());
					break;
				}
			}
			if(i == arr.size()) {
				System.out.println("존재하지 않음");
			}
			break;
		}
		
	}
}
}















