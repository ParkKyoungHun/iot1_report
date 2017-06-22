package report.kimjeongkyu.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Practice extends HashMap<String, Integer> {
	public String toString() {
		String reuslt = "";
		ArrayList<String> hey = new ArrayList<>(keySet());
		int sum = 0;
		for (int i = 0; i < hey.size(); i++) {
			String key = hey.get(i);
			Integer value = (int)get(key);
			sum += value;
			result = "총 핪은 " + sum;
		}
		return result;
	}

	public static void main(String[] args) {
		MapExam2 me2 = new MapExam2();
		String[] abc = { "a", "b" };

		for (int i = 0; i < abc.length; i++) {
			me2.put(abc[i], i + 1);
		}
		System.out.println(me2);
	}

}
