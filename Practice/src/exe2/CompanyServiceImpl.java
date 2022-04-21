package exe2;

import java.util.ArrayList;
import java.util.Scanner;

class CompanyDTO{
    private String name;
    private String grade;
    private int salary;
    private double tariff;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getTariff() {
        return this.tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }

}
public class CompanyServiceImpl implements CompanyService{

    ArrayList<CompanyDTO> arr = new ArrayList<CompanyDTO>();
    Scanner input = new Scanner(System.in);
    int salary;
    double tariff;
    String grade;
    @Override
    public void saveWorker(CompanyDTO dto) {
        moneyCalc(dto.getGrade());
        dto.setSalary(salary);
        dto.setTariff(tariff);
        arr.add(dto);
        System.out.println("저장이 완료되었습니다.");
    }
    @Override
    public void modify(CompanyDTO dto) {
        for (int i = 0; i<arr.size(); i++){
            CompanyDTO sDto = arr.get(i);
            if(dto.getName().equals(sDto.getName())){
                System.out.println("새로운 직급 입력: ");
                String grade = input.next();
                moneyCalc(grade);
                dto.setGrade(grade);
                dto.setSalary(salary);
                dto.setTariff(tariff);
                arr.set(i, dto);
                System.out.println("수정이 완료되었습니다.");
            }
            }
        }
    @Override
    public CompanyDTO search(String name) {
        for (int i =0;i<arr.size();i++){
            CompanyDTO dto = arr.get(i);
            if(name.equals(dto.getName())){
                return dto;
            }
        }
        return null;
    }
    @Override
    public void output() {
        for (int i = 0; i<arr.size();i++){
            CompanyDTO dto = arr.get(i);
            System.out.println("이름: "+dto.getName());
            System.out.println("직급: "+dto.getGrade());
            System.out.println("급여: "+dto.getSalary());
            System.out.println("세율: "+dto.getTariff());
            System.out.println("========================");
        }
        
    }

    public void moneyCalc(String grade){
        switch(grade){
            case "인턴":
            salary = 300;
            tariff = 0.01;
            break;
            case "선임":
            salary = 400;
            tariff = 0.02;
            break;
            case "책임":
            salary = 600;
            tariff = 0.03;
            break;
            default:
            System.out.println("잘못된 직급 접근입니다. 기본값인 인턴으로 저장합니다");
            grade = "인턴";
            salary = 300;
            tariff = 0.01;
        }
    }
    
}
