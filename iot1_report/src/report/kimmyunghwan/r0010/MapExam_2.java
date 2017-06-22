package report.kimmyunghwan.r0010;

import java.util.HashMap;
import java.util.Iterator;

public class MapExam_2 extends HashMap {
	MapExam_2() {

	}
	
	public String toString(){
		Iterator it = this.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next(); 	//방 갯수가 끝날때까지 key를 가져올수있다
			String value = (String) get(key);	//방 갯수가 끝날때까지 value를 가져올수있다
		}
		
		return "아.. 안에 있는게 뭔지 모르겠다";
	}

	public static void main(String[] args) {
		MapExam_2 me = new MapExam_2();
		me.put("A군", 50);		// HashMap에서 상속받아서 사용할 수 있게된거
		me.put("B군", 60);
		System.out.println(me);

	}

}
//결과 값이 순서대로 나오지는 않는다. {B군=60, A군=50}
//결과 값 순서대로 나오게 하는 법은 toString