package report.songwoojae.r0009;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMapExam {
	// 스트링,인티저로 구성된 HashMap 변수 선언
	// HashMap 변수명은 pointHm
	// pointHm에 학생의 이름키값과 점수 밸류값을 10개 입력
	// 학생이름은 A군,B군,C군,,,
	// 해당 pointHm을 ArrayList에 추가
	// 반복문을 사용하여 ArrayList에 추가된 pointHm을 출력

/* 정답
 * public static void main(String[] args){
		String[] a = {"A군","B군","C군","D군","E군","F군","G군","H군","I군","J군"};
		ArrayList<HashMap<String, Integer>> arrList = new ArrayList<HashMap<String, Integer>>();
		for(int i=0;i<10;i++){
			HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
			hm1.put(a[i] , i*10);
			arrList.add(hm1);
		}
		for(HashMap<String, Integer> hm : arrList){
			System.out.println(hm);
		}
	}
}
 */

	public static void main(String[] args) {
		
		HashMap<String, Integer> pointHm = new HashMap<String, Integer>();
		ArrayList<HashMap<String, Integer>> arrList = new ArrayList<HashMap<String, Integer>>();
		 
		
		
		pointHm.put("A군", 99);
		arrList.add(pointHm);
		System.out.println(arrList);


		pointHm.put("B군", 56);
		
		pointHm.put("C군", 83);
		pointHm.put("D군", 73);
		pointHm.put("E군", 88);
		pointHm.put("F군", 12);
		pointHm.put("G군", 89);
		pointHm.put("H군", 43);
		pointHm.put("I군", 21);
		pointHm.put("J군", 66);

		

	}
}
