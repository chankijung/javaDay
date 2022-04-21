package exe1;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		//1.특정 사원 등록 2.모든 사원 출력 3.특정 사원 수정 4.특정 사원 검색 5.종료
		int num;
		CompanyServiceImpl cs = new CompanyServiceImpl();
		Scanner input = new Scanner(System.in);
		System.out.println("직원관리 프로그램");
		System.out.println("기능 선택");
		while(true) {
			System.out.println("1. 특정 사원 등록");
			System.out.println("2. 모든 사원 출력");
			System.out.println("3. 특정 사원 수정");
			System.out.println("4. 특정 사원 검색");
			System.out.println("5. 종료");
			System.out.print(">>>>>>>>> :");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				System.out.println("사원 이름 입력");
				String name = input.next();
				System.out.println("직급 이름 입력");
				String grade = input.next();
				CompanyDTO dto = new CompanyDTO();
				dto.setName(name);
				dto.setGrade(grade);
				
				cs.saveWorker(dto);
				//특정 사원 등록
				break;
			case 2 :cs.output();
				//모든 사원 출력
				break;
			case 3 :
				System.out.println("직급 수정할 사원 입력");
				String modify = input.next();
				if(cs.search(modify)==null) {
					System.out.println("존재하지 않는 이름");
				}else {
					cs.modify(cs.search(modify));
				}
			
				//특정 사원 수정
				break;
			case 4 :
				System.out.println("검색할 사원 입력");
				String search= input.next();
				if(cs.search(search)!= null) {
					CompanyDTO dto2 = cs.search(search);
					System.out.println("이름 : "+dto2.getName());
					System.out.println("직급 : "+dto2.getGrade());
					System.out.println("급여 : "+dto2.getSalary());
					System.out.println("세율 : "+dto2.getTariff());
					System.out.println("=========================");
				}else {
					System.out.println("존재하지 않는 사원 이름입니다");
				}
				
				//특정 사원 검색1
				break;
			case 5 :System.out.println("종료합니다");
				input.close();
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 접근입니다");
				break;
			}
		}
	}

}
