package report.kimhonggeun.r0010;

import java.util.ArrayList;

public class ListExam<T> extends ArrayList{
	
	public static void main(String[]args){
		ListExam<MapExam> list = new ListExam<MapExam>();
		MapExam me = new MapExam();
		System.out.println(me);
		me.put("test", "test");
		list.add(me);
		System.out.println(me);
	}

}
