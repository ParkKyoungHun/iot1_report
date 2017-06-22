package report.kimmyunghwan.r0010;

import java.util.HashMap;

public class MapExam extends HashMap {
	MapExam() {

	}

	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.put("A군", 50);		// HashMap에서 상속받아서 사용할 수 있게된거
		me.put("B군", 60);
		System.out.println(me);

	}

}
//결과 값이 순서대로 나오지는 않는다. {B군=60, A군=50}