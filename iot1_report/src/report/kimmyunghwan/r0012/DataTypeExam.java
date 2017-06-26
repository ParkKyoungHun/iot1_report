package report.kimmyunghwan.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();//ArrayList<Integer> 데이타 타입임, 배열 리스트 (배열로 구성된 리스트)
		list1.add(1);
		list1.add(2);
			
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("가");
		list2.add("나");
		
		ArrayList<String> list3 = new ArrayList<String>(); //스트링으로 구성된 ArrayList
		list3.add("a");
		list3.add("b");
		
		HashMap<Object,ArrayList> hm = new HashMap<Object,ArrayList>();
		
		hm.put(list1.get(0),list1);
		hm.put(list2.get(0),list2);
		hm.put(list3.get(0),list3);
		
		System.out.println(hm);
		
		
	}	//main End

}	//class End
