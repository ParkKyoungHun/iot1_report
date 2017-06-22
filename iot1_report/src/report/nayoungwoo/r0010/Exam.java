package report.nayoungwoo.r0010;

import java.util.HashMap;

public class Exam {

	void print() {
		System.out.println("Exam의 print 함수");
	}
	
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("test", "test");
		System.out.println(hm.containsKey("test"));
		
	}
}
