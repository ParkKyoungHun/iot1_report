package report.kimmyunghwan.r0009;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam_1 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		hm.put(1, 1);
		// (key, value) put은 강제로 넣는것, key value

		System.out.println(hm.get(1));
		// get 가져오는것
		
		ArrayList<HashMap<Integer,Integer>> arrList = new ArrayList<HashMap<Integer,Integer>>();
		
	}

}
		//arrayList는 키값을 몰라도 되나 순차적으로 나열된거
		//HashMap은 키값을 알아야하며 결과값을 내가 정함. public HashMap() 생성자임. 리스트형태로 