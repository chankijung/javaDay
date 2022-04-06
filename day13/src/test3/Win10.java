package test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Win7Quiz{
	private HashMap map;
	private ArrayList funcList;
	//생성자 추가 부분
	public Win7Quiz(HashMap map) {
		this.map = map;
	}
	public void function(String funcName){
		if(map.containsKey(funcName)){
			System.out.println(map.get(funcName)+"동작 합니다");
		}else{System.out.println("없는 기능 입니다");}
	}
	public ArrayList getFuncList(){
		funcList = new ArrayList();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			funcList.add(it.next());
		}
		return funcList;
	}
	/*
	public void setMap() {
		map = new HashMap();
		map.put("계산기", "calc.exe");
		map.put("메모장", "notepad.exe");
	}
수정된 부분
*/
	public void display(){ 
		ArrayList list = null;
		//setMap(); //수정된 부분
		Scanner input = new Scanner(System.in);
		System.out.println("===== 환 영 합 니 다 =====");
		int sel=0;
		String funcName=null;
		while(true){
			System.out.println("1.기 능");
			System.out.println("2.off");
			System.out.print("입력 >>>> ");
			sel = input.nextInt();
			switch(sel){
				case 1:
					list=getFuncList();
					System.out.println("사용 가능 기능");
					for(int i=0;i<list.size();i++)
						System.out.println(i+1+" : "+list.get(i));
					System.out.print("사용할 기능 입력 : ");
					funcName=input.next();
					function(funcName);
					break;
				case 2:
					System.out.println("프로그램 종료 합니다!!!");
					return;
			}
		}
	}
}
public class Win10 {
	public static void main(String[] args){
		HashMap map = new HashMap();
		map.put("계산기", "calc.exe");
		map.put("메모장", "notepad.exe");
		Win7Quiz win7 = new Win7Quiz(map);
		win7.display();
	}
}
