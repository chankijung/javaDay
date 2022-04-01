package quiz02;

import java.util.ArrayList;
import java.util.HashSet;

public class Lotto {
	
		public HashSet hashSet() {
			HashSet hs = new HashSet();
			while(hs.size()<6) {
				hs.add((int)(Math.random()*45+1));
				}
				return hs;
			
		}
		public ArrayList arrList() {
			ArrayList arr = new ArrayList();
			while(arr.size()<6) {
				int ran = (int)(Math.random()*45)+1;
				if(arr.contains(ran)== false)
					arr.add(ran);
			}
			return arr;
		}
}
