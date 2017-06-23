package report.parkjonghun.r0010;

import java.util.HashMap;
import java.util.Iterator;

public class MapExam extends HashMap {
	// 아빠 클래스는 super
	// 아들 클래스는 this
	MapExam(){
		
	}
	
	public String put(String key){
		if(!containsKey(key)){  //containsKey 키값을 찾아주는 함수
			put(key,"test");
			return "잘들어갔어요?";
		}
		return "이미 있어";
	}
	
	public String toString(){
		String result = "";
		Iterator it = keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();  //next() 함수는 읽고 다음으로 이동한다라는 뜻.
			Object value = (Object)get(key);
			result += "[" +  key + "," + value + "]\n";  // \n은 줄바꿈.
		}
		if(result.equals("")){
			result = "야 아무것도 없어 ";
		}
		
		return result;
	}

	public static void main(String[] args){
		MapExam me = new MapExam();
		me.put("A군", 50);
		me.put("B군", 60);
		me.put("C군", 70);
		me.put("D군", 80);
		System.out.println(me);
		
	}
	
}
