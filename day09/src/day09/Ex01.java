package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 map 
		  - 키와 값의 쌍으로 이루어진 데이터의 집합
		  - 순서는 유지되지 않는다
		  - 키의 중복은 허용하지 않으며, 값의 중복은 허용
		 */
		
		//HashMap map = new HashMap();
		//순서 고정 x
		
		LinkedHashMap map = new LinkedHashMap();
		//순서 고정
		map.put("선풍기", "100만원");
		map.put("에어컨", "500만원");
		map.put("자동차", "700만원");
		//		Key		  Value
		
		System.out.println("선풍기 : "+map.get("선풍기"));
		System.out.println("에어컨 : "+map.get("에어컨"));
		System.out.println("자동차 : "+map.get("자동차"));
		System.out.println("없는값 : "+map.get("없는값"));
		
		
		System.out.println("결과: "+map.containsKey("선풍기"));
		System.out.println("결과: "+map.containsKey("에컨어"));
		
		Object bool = map.remove("선풍기");
		System.out.println("해당값이 나오면 삭제, null이면 해당 키 없음"+bool);
		
		if(bool==null) {
			System.out.println("삭제 실패");
		}else {
			System.out.println("삭제 성공");
		}
		
		System.out.println("키 목록 : " + map.keySet());
		System.out.println("값 목록 : "+ map.values());
		
		
			// HashSet과는 다른 Set
			// 하지만 비슷한 것이라고 이해
//		Set s = map.keySet();
//		Iterator it = s.iterator();
		// s 값을 꺼내오려면 iterator 이용해야 함
		Iterator it = map.keySet().iterator();
	
		
		//위의 두줄을 아래 한줄로 줄여서 사용함
		/*
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 * 
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 * 
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 */
		/*
		 * while(it.hasNext()) { Object obj = it.next();
		 * 
		 * System.out.println(obj); }
		 */
		
		while(it.hasNext()) { 
				Object obj = it.next();
				System.out.println(obj+" : "+ map.get(obj));
				
		}
		
		
		
	}

}
