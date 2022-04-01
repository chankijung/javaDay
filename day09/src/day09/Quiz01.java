package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String key;
		int value;
		
		HashMap map = new HashMap();
		boolean bool = true;
		while(bool) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴 별 가격 보기");
			System.out.println("3. 종료");
			
			n = scan.nextInt();
			switch(n){
			case 1 :
				System.out.println("등록 할 메뉴 작성 : ");
				key= scan.next();
				if(map.containsKey(key)==false) {
				System.out.println("가격 작성 : ");
				value= scan.nextInt();
				map.put(key, value);
				
				}else {
					System.out.println("존재하는 메뉴입니다");
				}
				
				break;
			case 2 :
				Iterator iter = map.keySet().iterator();
				while(iter.hasNext()) {
					key = (String)iter.next();
					System.out.println(key+" : "+map.get(key));
				}
				System.out.println("1. 수정 2. 삭제 3. 나가기");
				int pick = scan.nextInt();
				if(pick ==1) {
					System.out.println("변경할 메뉴 입력 : ");
					String name = scan.next();
					if(map.containsKey(name)) {
						System.out.println("수정할 가격 입력 : ");
						int newPrice = scan.nextInt();
						System.out.println(map.get(name)+"->"+newPrice);
						map.replace(name, newPrice);
						System.out.println("변경 완료");
					}else {
						System.out.println("메뉴가 없습니다");
					}
				}else if(pick==2){
					System.out.println("삭제할 메뉴 입력");
					String name = scan.next();
					
					if(map.containsKey(name)) {
						map.remove(name);
						System.out.println(name+" 삭제 완료");
					}else {
						System.out.println("삭제할 메뉴가 없습니다");
					}
					
				}else {
					System.out.println("메인 화면으로 나갑니다");
				}
				break;
			case 3 :
				bool = false;
			}
		}
		System.out.println("종료합니다");
	}

}
