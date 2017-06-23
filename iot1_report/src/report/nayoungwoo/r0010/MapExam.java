package report.nayoungwoo.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam extends HashMap {

	MapExam(){
		
	}
	public String put(String key){
		if(!containsKey(key)) {
			put(key,"test");
			return "잘들어 갔어요";
		}
		return "이미 있어 ";
	}
	public String toString() {
		String result = "";
		List<String> keys = new ArrayList<>(keySet());
		for (int i = 0; i< keys.size(); i++) {
			String key = keys.get(i);
			Object value = (Object)get(key);
			result += "[" + key + "," + value + "]\n";

		}

	if (result.equals("")){
		result = "노답";
	}
		return result;
	}
	
	public static void main(String[] args) {
		MapExam me = new MapExam();
		String result = me.put("abc");
	}
}
