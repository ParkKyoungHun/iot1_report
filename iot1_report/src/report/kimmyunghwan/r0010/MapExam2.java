package report.kimmyunghwan.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam2 extends HashMap {

	// HasnMap을 상속 받아주세요.
	// 키타입은 String, 밸류 타입은 Integer로 선언
	// 키는 아무거나 넣으셔도 되지만 밸류는 반드시 숫자만 입력하셔야 합니다.
	// 총 10개의 키값을 생성해주세요
	// toString()함수를 오버라이딩 하여서
	// 해당 해쉬맵이 가지고 있는 전체 숫자를 더한 값을 출력해주세요.
	
	MapExam2(){
		
	}
	
	
	public String toString() {
		String result = "";
		ArrayList<String> keyList = new ArrayList<>(keySet());
		for (int i = 0; i < keyList.size(); i++) {
			String key = keyList.get(i);
			String value = (String) keyList.next();
			
			result += value;
		}
		return result;
	}
	
	public static void main(String[] args){
		MapExam2 me2 = new MapExam2();
		me2.put("A", 1);
		me2.put("B", 2);
		me2.put("C", 3);
		me2.put("D", 4);
		me2.put("E", 5);
		me2.put("F", 6);
		me2.put("G", 7);
		me2.put("H", 8);
		me2.put("I", 9);
		me2.put("J", 10);
		
		System.out.println(me2);
		
	}
	
	
	
	
}
