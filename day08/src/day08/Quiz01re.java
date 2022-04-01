package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01re {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String n;
		int m=0;
		ArrayList nameList = new ArrayList();
		ArrayList numList = new ArrayList();
		boolean bool = true;
		while(bool) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 연락처 수정");
			System.out.println("6. 종료");
			
			int num = scan.nextInt();
			switch (num) {
			
			case 1:
				
				System.out.println("이름 입력 : ");
				n = scan.next();
				if(nameList.contains(n)!= true) {
					System.out.println("연락처 입력 :");
					m = scan.nextInt();
					nameList.add(n);
					numList.add(m);
				}else {
					System.out.println("이름이 이미 존재합니다");
				}
				break;
			case 2:
				System.out.println("찾을 이름 입력: ");
				 n = scan.next();
				 if(nameList.indexOf(n)==-1) {
					 
					 System.out.println(n+"님은 목록에 없습니다");
				 }else {
					int result = nameList.indexOf(n);
					System.out.println("검색 결과 :"+nameList.get(result)+", "+numList.get(result));
				 }
				 break;
			case 3:
				System.out.println("삭제할 연락처 입력 : ");
				n = scan.next();
				int result = nameList.indexOf(n);
				if(result== -1) {
					System.out.println(n+"은 목록에 존재하지 않는 이름입니다");
				}else {
					
					System.out.print(nameList.remove(result)+",");
					System.out.println(numList.remove(result)+"을 삭제했습니다");
				}
				break;
			case 4:
				for( i=0; i<nameList.size();i++) {
					System.out.print(nameList.get(i)+", ");
					System.out.println(numList.get(i));
					
				}
				break;
			case 5:
				System.out.println("수정할 이름을 입력 : ");
				n = scan.next();
				result = nameList.indexOf(n);
				if(result == -1) {
					System.out.println("목록에 없는 이름입니다");
				}else {
					System.out.println(" 이름 : ");
					String k = scan.next();
					nameList.set(result,k);
					System.out.println(" 연락처 : ");
					m = scan.nextInt();
					numList.set(result, m);
					System.out.print("바뀐 이름과 연락처 :"+nameList.get(result)+", ");
					System.out.println(numList.get(result));
				}
				break;
			case 6 :
				bool = false;	
			}
		}
		System.out.println("종료합니다");
	}

}
