package report.umwoosung.r0009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ListExam extends HashMap {

	public static void main(String[] args){
		ArrayList<HashMap<String,Integer>> arrList = new ArrayList<HashMap<String,Integer>>();
		for(int i=0;i<=10;i++){
			arrList("A",2);
		}
		Collections.sort(arrList);

		for(int i=0;i<arrList.size();i++){
			System.out.println(arrList.get(i));
		}
	}
}
