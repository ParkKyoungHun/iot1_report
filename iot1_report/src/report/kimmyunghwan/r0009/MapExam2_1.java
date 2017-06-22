package report.kimmyunghwan.r0009;

import java.util.HashMap;
import java.util.Iterator;


public class MapExam2_1 {

	HashMap<String, Integer> hm; // c+s+o

	MapExam2_1() {
		hm = new HashMap<String, Integer>();
	}

	public static void main(String[] agrs) {
		MapExam2_1 me2 = new MapExam2_1();
		me2.hm.put("1", 1);
		me2.hm.put("2", 2);
		me2.hm.put("3", 3);
		me2.hm.put("4", 4);
		me2.hm.put("5", 5);

//		Iterator it = me2.hm.keySet().iterator();
//		while(it.hasNext()) {
//			String key = (String)it.next();
//			System.out.print(key + ",");
//			System.out.println(me2.hm.get(key));
//		}
		
		System.out.println(me2.hm.containsKey("6")); //키 값이 있는지 확인할때~
	}
}

/*개인 설명 부분*/
// me2.hm.put("1",1);
// me2.hm.put("1",2);

// 위에 대로 두개의 put 이라면 최종적인 값은 2가 된다.