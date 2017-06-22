package report.kimjeongkyu.r0010;

import java.util.HashMap;

public class Notepad {
	public static void main(String[] args){
		HashMap hm = new HashMap();
		hm.put("room","girl");
		//containsKey는 입력한 값의 키가 있는지 없는지 체킹!
		//True or False!
		System.out.println(hm.containsKey("room"));
	}
}
