package exe2;

import java.util.Scanner;

public class CompanyServiceMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CompanyServiceImpl CSI = new CompanyServiceImpl();
        while(true){
            System.out.println("직원 관리 프로그램");
            System.out.println("1. 특정 사원 등록\t2. 모든 사원 출력\t3. 특정 사원 수정\n4. 특정 사원 검색\t5. 종료");
            int menu = input.nextInt();
            switch(menu){
                case 1:
                System.out.println("사원 이름 입력");
                String name = input.next();
                System.out.println("직급 이름 입력");
                String grade = input.next();
                CompanyDTO dto = new CompanyDTO();
                dto.setName(name);
                dto.setGrade(grade);
                CSI.saveWorker(dto);
                break;
                case 2:
                CSI.output();
                break;
                case 3:
                System.out.println("직급을 수정할 사원 이름 입력");
                String modify = input.next();
                if(CSI.search(modify)==null){
                    System.out.println("존재하지 않는 이름입니다.");
                }else{
                    CSI.modify(CSI.search(modify));
                }
                break;
                case 4:
                System.out.println("검색할 사원 이름 입력");
                String search = input.next();
                if(CSI.search(search)!=null){
                    CompanyDTO dto2 = CSI.search(search);
                    System.out.println("이름: "+dto2.getName());
                    System.out.println("직급: "+dto2.getGrade());
                    System.out.println("급여: "+dto2.getSalary());
                    System.out.println("세율: "+dto2.getTariff());
                    }else{
                        System.out.println("존재하지 않는 사원 이름입니다.");
                    }
                    break;
                case 5:System.out.println("감사합니다");
                input.close();
                System.exit(0);
                default:
                System.out.println("잘못된 접근입니다.");
                break;
            }

        }
    }
    
}
