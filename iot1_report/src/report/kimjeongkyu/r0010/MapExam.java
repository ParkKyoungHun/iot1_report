package report.kimjeongkyu.r0010;

import java.util.HashMap;

public class MapExam extends HashMap {
	MapExam(){
		
		
	}
	
	
	public static void main(String[] args){
		MapExam me = new MapExam();
		me.put("A군", 50);
		me.put("B군", 60);
		System.out.println(me);
	}
}
