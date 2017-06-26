package report.parkjonghun.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam { // ArrayList는 방갯수를 설정안해줘도 되지만 배열 방수를 정해져야한다.
	//ArrayList안에 HashMap을 넣을 수 있으며 그 반대도 적용됨.
	//list 는 값을 입력 시 무조건 0부터 저장된다. 
	public static void main(String[] args){
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("가");
		list2.add("나");
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("b");
	
		HashMap<Object, ArrayList> hm = new HashMap<Object, ArrayList>();
		hm.put(list1.get(0), list1);
		hm.put(list2.get(0), list2);
		hm.put(list3.get(0), list3);
		System.out.println(hm);
		
	}
}
