package report.parkjonghun.r0009;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam {
	
	public static void main(String[] args){
		HashMap<String,Integer> hm = new HashMap<String,Integer>(); //new HashMap<String,Integer>() 은 생성자다.
		// 배열에서 [] 은 생성자가 아니다.
		hm.put("str",1);
		System.out.println(hm.get("str"));
		
		ArrayList<HashMap<String,Integer>> arrList = new ArrayList<HashMap<String,Integer>>();
		
	}

}
