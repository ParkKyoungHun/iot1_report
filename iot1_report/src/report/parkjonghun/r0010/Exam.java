package report.parkjonghun.r0010;

import java.util.HashMap;

public class Exam {
	 
	public static void main(String[] args){ // containsKey = 이 키가 있는지 없는지 알려주는 찾기 기능. 있을시 true, 없을 시 false 
		HashMap hm = new HashMap();
		hm.put("test", "test");
		System.out.println(hm.containsKey("test"));
	}

}
