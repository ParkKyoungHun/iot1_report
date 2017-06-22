package report.kimhonggeun.r0010;

import java.util.HashMap;
import java.util.Iterator;

public class MapExam extends HashMap{

	MapExam(){

	}
	
	public String put(String key){
		if(!containsKey(key)){
			put(key,"test");
			return "잘들어갓다";
		}
		return "이미잇다";
	}
		
	public String toString(){
		String result = "";
		Iterator it = this.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			Object value=(Object)get(key);
			result +="["+key+","+value+"]\n";
		}
		if(result.equals("")){
			System.out.println("우랴랴랴");
		}
		return result;
		
	}

	public static void main(String[]args){
		MapExam me = new MapExam();
		me.put("A군", 50);
		me.put("B군", 60);
		System.out.println(me);


	}
}
