package Quiz01;

import java.util.Scanner;

public class Login {
	private String saveId, savePwd;
	
	public String getSavePwd() {
		return savePwd;
	}
	public String getSaveId() {
		return saveId;
	}
	public void register() {
		Scanner input = new Scanner(System.in);
		System.out.println("저장 아이디입력");
		saveId = input.next();
		System.out.println("저장 비밀번호입력");
		savePwd = input.next();
	}
	public void userChk() {
		Scanner input = new Scanner(System.in);
		String inputId, inputPwd;
		
		//System.out.println("저장id : "+login.getSaveId());
		//System.out.println("저장pwd : "+login.getSavePwd());
		
		System.out.println("아이디입력");
		inputId = input.next();
		System.out.println("비밀번호입력");
		inputPwd = input.next();
		if(inputId.equals( getSaveId() ) 
				&& inputPwd.equals( savePwd )) {
			System.out.println("인증통과");
		}else {
			System.out.println("인증실패");
		}
	}
	public int userChk(String id, String pwd) {
		
		if(id.equals( getSaveId() ) 
				&& pwd.equals( savePwd )) {
			return 0;
		}else {
			return 1;
		}
	}
}












