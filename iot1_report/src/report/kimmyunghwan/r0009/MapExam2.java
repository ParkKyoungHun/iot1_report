package report.kimmyunghwan.r0009;

import java.util.HashMap;

public class MapExam2 {
	
	HashMap<String, Integer> hm;  //c+s+o
	
	MapExam2(){
		hm = new HashMap<String, Integer>(); 
	}
	
	public static void main(String[]  agrs){
		MapExam2 me2 = new MapExam2();
		me2.hm.put("1",1);  
			//("1",1) -->타입이 String Integer 인데 노란 에러 없애려면 7열에  <String, Integer>삽입 
			// put은 arrayList의 add와 같다.
		me2.hm.put("1",2);
		me2 = new MapExam2();  					// <------새로운 방 생성
		System.out.println(me2.hm.get("1"));	//19열에서 다시 방을 만들어서 위에 값은 null
		
		
		
		
		
		
		
	}
}
//me2.hm.put("1",1);  
//me2.hm.put("1",2);  

// 위에 대로 두개의 put 이라면 최종적인 값은 2가 된다.