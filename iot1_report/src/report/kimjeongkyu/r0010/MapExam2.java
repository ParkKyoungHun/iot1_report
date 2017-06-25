package report.kimjeongkyu.r0010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//HashMap<String,Integer> 중요!
public class MapExam2 extends HashMap<String, Integer>{
	//HashMap을 상속받아주세요
	//키타입은 String, 벨류타입은 Integer로 선언해주세요
	// 조건 "아무거나" , "numbers"
	//총 10개의 키값을 생성해주세요
	//toString()함수를 오버라이딩 하여서
	//해당 해쉬맵이 가지고 있는 전체숫자를 더한값을 출력해주세요.	
	
	
	
	//계산을 하기위한 toString 메서드
	public String toString(){
		String result ="";		//keyset이 값 반환해주는고임
		ArrayList<String> keyList = new ArrayList<>(keySet());
		int sum =0;
		for(int i=0; i<keyList.size(); i++){
			String key = keyList.get(i);
			Integer value = (int)get(key);
			sum +=value;
			result = "총 핪은 " + sum;
			}
		return result;
	}
	
	
	//main함수에서 String 갯수와 값을 이제 집어넣는다.
	public static void main(String[] args){
		MapExam2 me2 = new MapExam2();		
		for(int i=1; i<=10; i++){
			me2.put(""+i, i);
		}
				
		System.out.println(me2);
	}
}
