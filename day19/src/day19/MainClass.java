package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		DB db = new DB();
		int num, result =0 ;
		String userId, userName;
		int userAge;
		Scanner scan = new Scanner(System.in);
		String inputId; //조회용 아이디
		
		while(true) {
			System.out.println("1. 모든 정보 보기");
			System.out.println("2. 개인 정보 보기");
			System.out.println("3. 개인 정보 삭제");
			System.out.println("4. 회원 가입");
			System.out.println(">>>> : ");
			
			num = scan.nextInt();
			switch(num) {
			case 1 :
				//db.selectAll();
				ArrayList<Member> list = db.selectAll2();
				//Member는 내가 만든 클래스 타입
				if(list.size()==0) {
					System.out.println("저장데이터 없음");
				}else {
					for(int i=0;i<list.size();i++) {
					Member m = list.get(i);
					System.out.println("id : "+m.getId());
					System.out.println("name : "+m.getName());
					System.out.println("age : "+m.getAge());
					System.out.println("==================");
					}
					/*for(Member m : list) {
						System.out.println("id : "+m.getId());
						System.out.println("name : "+m.getName());
						System.out.println("age : "+m.getAge());
						System.out.println("==================");
					}*/
				}
				break;
			case 2 : 
				System.out.println("검색할 아이디 입력");
				inputId = scan.next();
			//	db.selectOne(inputId);
				Member m = db.selectOne2(inputId);
				System.out.println("=====main출력=====");
				if(m == null) {
					System.out.println("찾는 회원 없음");
				}else {
					System.out.println("id : "+m.getId());
					System.out.println("name : "+m.getName());
					System.out.println("age : "+m.getAge());
				}
				break;
			case 3 :
				System.out.println("삭제할 아이디 입력: ");
				
				inputId = scan.next();
				result =db.delete(inputId);
				if(result==0) {
					System.out.println("삭제 실패");
				}else {
					System.out.println("삭제 성공");
				}
				
				break;
			
			case 4 :
				System.out.println("회원 가입 정보 입력 페이지");
				
				System.out.println("가입 아이디 입력 :");
				userId = scan.next();
				System.out.println("가입 이름 입력 :");
				userName =scan.next();
				System.out.println("가입 나이 입력 :");
				userAge = scan.nextInt();
				db.insert(userId, userName, userAge);
				
				break;
				
				
			}
		}
	}

}
