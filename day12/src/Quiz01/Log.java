package Quiz01;

import java.util.Scanner;

public class Log {
	private String id;
	private String pw;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	
	public void log() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		Log ex = new Log();
		while(true) {
		System.out.println("1.로그인");
		System.out.println("2.가입");
		System.out.println("3.로그아웃");
		
		switch(num) {
		case 1 :
			System.out.println("아이디 입력 : ");
			String id = input.next();
			System.out.println("비밀번호 입력 :");
			String pw = input.next();
			if(id == ex.getId() | pw == ex.getPw() ) {
				System.out.println("인증 통과");
			}else {
				System.out.println("인증 실패");
			}
			break;
		case 2:
			System.out.println("가입 id 입력 :");
			System.out.println("가입 비밀번호 입력 : ");
			String i = input.next();
			String p = input.next();
			ex.setId(i);
			ex.setPw(p);
			System.out.println("가입 완료");
			
			break;
		case 3:
			System.out.println("로그아웃");
			break;
		}
		
	}

	}
}
