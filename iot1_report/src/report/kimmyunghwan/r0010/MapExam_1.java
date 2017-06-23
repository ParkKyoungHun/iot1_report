package report.kimmyunghwan.r0010;

import java.util.HashMap;
import java.util.Iterator;

public class MapExam_1 extends HashMap {
	MapExam_1() {

	}

	public String toString() {
		String result = "";
		Iterator it = this.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next(); // 방 갯수가 끝날때까지 key를 가져올수있다
			Integer value = (int) get(key); // 방 갯수가 끝날때까지 value를 가져올수있다

			result += "[" + key + ";" + value + "]\n";
		}
		if(result.equals("")){
			result = " 아무것도 없어";
		}
		return result;

	}

	public static void main(String[] args) {
		MapExam_1 me = new MapExam_1();
		me.put("A군", 50); // HashMap에서 상속받아서 사용할 수 있게 된거
		me.put("B군", 60);
		me.put("C군", 60);
		me.put("D군", 60);

		System.out.println(me);

	}

}
// 결과 값이 순서대로 나오지는 않는다. {B군=60, A군=50}
// 결과 값 순서대로 나오게 하는 법은 toString