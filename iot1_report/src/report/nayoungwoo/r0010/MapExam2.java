package report.nayoungwoo.r0010;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam2 extends HashMap<String, Integer> {

	public String toString(){
		String result ="";
		ArrayList<String> keyList = new ArrayList<String>(keySet());
		int sum = 0;
		for(int i=0;i<keyList.size();i++){
			String key = keyList.get(i);
			sum += get(key);
		}
		result += sum;
		return result;
	}
	public static void main(String[] args){
		MapExam2 me2 = new MapExam2();
		for(int i=1;i<=10;i++){
			me2.put(""+i, i);
		}
		System.out.println(me2);
	}

}
