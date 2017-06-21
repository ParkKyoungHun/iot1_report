package report.kimmyunghwan.r0009;

import java.util.HashMap;

public class MapExam {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// hm.put("str", 1); 1인데 int 아니고 Integer라고 한 것은 기본자료형만 넣을수 있는데 int는 안되므로..

		hm.put("str", 1);
		// (key, value) put은 강제로 넣는것, key value

		System.out.println(hm.get("str"));
		// get 가져오는것
	}

}
		//arrayList는 키값을 몰라도 되나 순차적으로 나열된거
		//HashMap은 키값을 알아야하며 결과값을 내가 정함. 리스트형태로 