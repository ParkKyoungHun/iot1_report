package com.test.exam;

import java.util.HashMap;
import java.util.Iterator;

import com.test.dto.Goods;
import com.test.dto.Page;

public class Exam {
	public void printSet(HashMap<String, String> hm){
		Iterator it = hm.keySet().iterator();
		while(it.hasNext()){
			String key = it.next().toString();
			System.out.println(key + "=" + hm.get(key));
		}
	}
	public static void main(String[] args){
//		HashMap page = new HashMap();
//		page.put("nowPage", "1");
//		
//		HashMap params = new HashMap();
//		params.put("page", page);
//		params.put("commnad", "list");
		
		Page page = new Page();
		page.setNowPage(1);
		
		Goods goods = new Goods();
		goods.setPage(page);
		goods.setCommand("list");
		
	}
}
;