package report.limchanho.r0010;

import java.util.HashMap;
import java.util.Iterator;

public class MapExam extends HashMap {
	public String put(String key){
		//if(!containsKey(key)){
			put(key,"test");
			return "잘들어 갔어요";
		}
	
	//}
	public String toString() {//
		String result = "";//
		Iterator it = keySet().iterator();//
		while (it.hasNext()) {//
			String key = (String) it.next();//
			Integer value = (int) this.get(key);//
			result += "[" + key + "," + value + "]\n";//
		}
		if (result.equals("")) {//
			result = "암것도없어";//
		}
		return result;
	}
	
	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.put("A군", 50);
		me.put("B군", 50);
		me.put("C군", 50);
		me.put("D군", 50);
		System.out.println(me);
	}
}
