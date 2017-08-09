package com.test.exam;

import java.util.HashMap;
import java.util.Iterator;

public class Exam {
	public void printSet(HashMap<String, String> hm){
		Iterator it = hm.keySet().iterator();
		while(it.hasNext()){
			String key = it.next().toString();
			System.out.println(key + "=" + hm.get(key));
		}
	}
	public static void main(String[] args){
		Exam e = new Exam();
		HashMap<String, String> hm = new HashMap<String, String> ();
		hm.put("a", "123");
		hm.put("b", "1a");
		hm.put("c", "asd");
		hm.put("d", "533");
		hm.put("e", "43");
		e.printSet(hm);
	}
}
;