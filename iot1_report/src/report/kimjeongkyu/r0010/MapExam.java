package report.kimjeongkyu.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam extends HashMap {
	public String put(String key){
		if(!containsKey(key)){
			put(key,"test");
			return "잘들어 갔어요.";
		}
		return "이미 있어요~~~~ㅋㅋ";
	}
	
	public String toString(){
		//keySet함수와 get함수는 아빠 함수 HashMap 에 있어서 자동으로 불러옴!
		String result="";
		List<String> keys = new ArrayList<>(keySet());
		for(int i=0; i<keys.size();i++){
			String key = keys.get(i);
			Object value = (Object)get(key);
			result += "[" + key + "," + value + "]";
		}
		if(result.equals("")){
		 result ="아무것도 입력이 안됌요!";
		}
		return result;
	}
	
	
	public static void main(String[] args){
		MapExam me = new MapExam();
		String result = me.put("A-Z");
		System.out.println(me);
	}
}
