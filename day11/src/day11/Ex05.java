package day11;

public class Ex05 {
public static void main(String[] args) {
	Test05.num = 12345;
	Test05.test();
	//static 있으면
	// 객체(인스턴스)생성 없이도 사용 가능
	
	Test05 t = new Test05();
	t.test2();
	// 없으면
	// 무조건 객체(인스턴스) 생성해야 사용 가능
	
	
	// 팀프로젝트 수행시
	// 파일, 데이터베이스 경
}
}
