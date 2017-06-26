package report.parkjonghun.r0010;

import java.util.ArrayList;

public class ListExam<T> extends ArrayList{
	// me에 값이 없을 시 아무런 값이 없습니다라는 메시지가 출력되게 하기.
	
	public static void main(String[] args){
		ListExam list = new ListExam();
		MapExam me = new MapExam();
		//me.put("test", "test");
		list.add(me);
		System.out.println(me);
		
		
	}

}
