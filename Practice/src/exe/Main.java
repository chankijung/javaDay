package exe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DB db = new DB();
		int num;
		String userId= null; 
		String userPwd=null;
		String userName=null;
		int userAge = 0;
		String userAddr = null;
		Member m =new Member();
		Scanner input = new Scanner(System.in);
		System.out.println("꿈동산 게시판");
		
		
		while(true) {
			System.out.println("1 - 로그인");
			System.out.println("2 - 가입");
			System.out.println("3 - 종료 ");
			System.out.println(">>>>>>> :");
			num = input.nextInt();
			switch(num) {
			case 1 :
				System.out.println("아이디 입력 :");
				userId = input.next();
				System.out.println("비밀번호 입력 : ");
				userPwd = input.next();
				Member m1 =db.search(userId, userPwd);
				
				// 로그인 기능 = 검색기능이다( 검색결과 있으면 m, 틀리면 null이 리턴)
				if(m1 != null) {
					System.out.println("로그인 성공");
					System.out.println("==============");
					while(true) {
						System.out.println("1. 회원 정보 관리");
						System.out.println("2. 게시판 기능");
						int sel;
						sel = input.nextInt();
						switch(sel) {
						case 1 :
							System.out.println("회원 정보 관리 페이지");
							System.out.println("1. 마이 페이지");
							System.out.println("2. 정보수정(id X)");
							System.out.println("3. 회원 탈퇴");
							int choice;
							choice = input.nextInt();
							if(choice ==1) {
								
								//db.myPage(userId);
								Member a =db.mypage2(userId);
								System.out.println("아이디 : "+a.getId());
								System.out.println("비밀번호 : "+a.getPwd());
								System.out.println("이름 : "+a.getName());
								System.out.println("나이 : "+a.getAge());
								System.out.println("주소 : "+a.getAddr());
								//내 정보가 다 드러남
								// 아이디, 비밀번호, 이름, 나이, 주소 받아와서 출력
								// 
							}else if(choice ==2) {
								//update 활용
								
							}else if(choice == 3) {
								// delete활용
							}else {
								
							}
							break;
						case 2 :
							break;
						}
					}
				}else {
					System.out.println("로그인 실패");
					break;
				}
				// 로그인 확인
				// 로그인 시 게시판 기능 호출
				// 로그인 시 회원정보 기능 호출
				
			case 2 : 
				System.out.println("가입 아이디 입력: ");
				userId = input.next();
				System.out.println("비밀번호 입력 :");
				userPwd = input.next();
				System.out.println("이름 입력 : ");
				userName =input.next();
				System.out.println("나이 입력 : ");
				userAge =input.nextInt();
				System.out.println("주소 입력 : ");
				userAddr = input.next();
				
				db.insert(userId, userPwd, userName, userAge, userAddr);
				// 중복 확인
				// 데이터베이스 등록/
				break;
			case 3 :
				System.out.println("종료합니다");
				//종료
				break;
			}
		
		}
	}
}
