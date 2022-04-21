package exe1;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyServiceImpl implements CompanyService {
	
	ArrayList<CompanyDTO> arr = new ArrayList<CompanyDTO>();
	Scanner input = new Scanner(System.in);
	String name;
	int salary;
	double tariff;
	String grade;
	
	@Override
	public void saveWorker(CompanyDTO dto) {
		//dto.getName();
		dto.getGrade();
		if(dto.getGrade().equals("인턴")) {
			salary=300;
			tariff =0.01;
		}else if(dto.getGrade().equals("선임")){
			salary=400;
			tariff =0.02;
		}else{
			salary=600;
			tariff =0.03;
		}
		dto.setSalary(salary);
		dto.setTariff(tariff);
		arr.add(dto);
		System.out.println("저장 완료");
	}

	@Override
	public void modify(CompanyDTO dto) {
		for(int i = 0; i<arr.size();i++) {
			CompanyDTO dto1 = arr.get(i);
			if(dto.getName().equals(dto1.getName())) {
				System.out.println("새로운 직급 입력 :");
				String grade = input.next();
				dto.setGrade(grade);
				if(dto.getGrade().equals("인턴")) {
					salary=300;
					tariff =0.01;
				}else if(dto.getGrade().equals("선임")){
					salary=400;
					tariff =0.02;
				}else{
					salary=600;
					tariff =0.03;
				}
				dto.setSalary(salary);
				dto.setTariff(tariff);
				
				arr.set(i, dto);
				System.out.println("수정 완료");
			}
		}
	}

	@Override
	public CompanyDTO search(String name) {
		for(int i =0; i<arr.size();i++) {
			CompanyDTO dto = arr.get(i);
			if(name.equals(dto.getName())) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public void output() {
		for(int i=0;i<arr.size();i++) {
			CompanyDTO dto = arr.get(i);
			System.out.println("이름 : "+dto.getName());
			System.out.println("직급 : "+dto.getGrade());
			System.out.println("급여: "+dto.getSalary());
			System.out.println("세율 : "+dto.getTariff());
			System.out.println("========================");
		}
		
	}
	
	

}
