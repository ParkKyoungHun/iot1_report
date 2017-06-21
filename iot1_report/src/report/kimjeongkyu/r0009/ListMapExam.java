package report.kimjeongkyu.r0009;

import java.util.HashMap;

public class ListMapExam {
	//String, Integer로 구성된 HashMap 변수를 선언해주세요
	//Hashmap변수명은 pointHm이라고 해주세요
	//pointHm에 학생의 이름키값과 점수 밸류값을 10개 넣어주세요.
	//학생이름은 A군, B군, C군 ... 으로 입력해주세요.
	//해당 pointHm을 ArrayList에 추가해주세요.
	//반복문을 사용하여 ArryList에 추가된 pointHm을 출력해주세요.

	public static void main(String[] args){
		HashMap<String,Integer> pointHm = new HashMap();
		pointHm.put("A군", 90);
		pointHm.put("B군", 80);
		System.out.println(pointHm.get("A군"));
		System.out.println(pointHm.get("B군"));
		System.out.println(pointHm.getValue());
		//HashMap = 생성자호출

	}
}
