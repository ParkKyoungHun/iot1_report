package report.kimjeongkyu.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam4 {
	public static void main(String[] args){
		ArrayList<HashMap> List = new ArrayList<HashMap>();
		HashMap hm = new HashMap();
		hm.put("클래스", "A");
		hm.put("이름", "홍길동");
		hm.put("나이", 20);
		hm.put("성별", "남자");
		List.add(hm);
		
		HashMap hm2 = new HashMap();
		hm2.put("클래스", "B");
		hm2.put("이름", "길정이");
		hm2.put("나이", 25);
		hm2.put("성별", "남자");
		List.add(hm2);
		
		HashMap hm3 = new HashMap();
		hm3.put("클래스", "C");
		hm3.put("이름", "윤정이");
		hm3.put("나이", 22);
		hm3.put("성별", "여자");
		List.add(hm3);
		
		HashMap hm4 = new HashMap();
		hm4.put("클래스", "D");
		hm4.put("이름", "동동이");
		hm4.put("나이", 5);
		hm4.put("성별", "여자");
		List.add(hm4);

		

			/// 이해하기.
		for(HashMap hm1 : List){
			System.out.print(hm1.get("클래스") + ",");
			System.out.print(hm1.get("이름") + ",");
			System.out.print(hm1.get("나이") + ",");
			System.out.println(hm1.get("성별"));
		}
	}
}
 
