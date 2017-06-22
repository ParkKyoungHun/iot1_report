package report.parkjonghun.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam2 extends HashMap<String, Integer> {
	// HashMap을 상속받아주세요.
	// 키 타입은 String, 밸류 타입은 Integer로 선언해주세요.  
	// 키는 아무거나 넣으셔도 되지만 밸류는 반드시 숫자만 입력하셔야 합니다.
	// 총 10개의 키값을 생성해주세요.
	// toString()함수를 오버라이딩 하여서
	// 해당 해쉬맵이 가지고 있는 전체 숫자를 더한값을 출력해주세요.
	
	public String toString(){
		String result = "";
		ArrayList<String> keyList = new ArrayList<String>(keySet());
		int sum = 0;
		for(int i=0; i<keyList.size(); i++){
			String key = keyList.get(i);
			sum += get(key);  //밸류가 인티저이기 때문에 형변화가 필요 없음.
		}
		result += sum; // result가 빈문자열 이기 때문에 result + sum 은 문자열이 됨.
		return result;
	}
	
	
	public static void main(String[] args){
		MapExam2 me2 = new MapExam2();
		
		for(int i = 1; i <=10; i++){ // 키 값과 밸류 값을 1~10까지 넣는  for문.
			me2.put(""+i, i); //me2.put(""+i(key), i(value));  
		}	
		System.out.println(me2);
		
		
	}

}
