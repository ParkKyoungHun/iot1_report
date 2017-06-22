package report.kimmyunghwan.r0009;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMapExam {
	// 스트링, 인티저로 구성된 HashMap 변수를 선언해주세요
	// HashMap 변수명은 pointHm이라고 해주세요
	// pointHm에 학생의 이름키갑과 점수 밸류값을 10개 넣어주세요
	// 학생 이름은 A군,B군,C군,,,,으로 입력해주세요.
	// 해당 pointHm을 ArrayList에 추가해주세요
	// 반복문을 사용하여 ArrayList 에 추가된 pointHm을 출력해주세요

	// public static void main(String[] args) {
	// HashMap<String, Integer> hm1= new HashMap<String, Integer>();
	//
	// hm1.put("A군",1);
	// hm1.put("B군",1);
	// hm1.put("C군",1);
	// hm1.put("D군",1);
	// hm1.put("E군",1);
	// hm1.put("F군",1);
	// hm1.put("G군",1);
	//
	// ArrayList<HashMap<String, Integer>> arrList = new
	// ArrayList<HashMap<String, Integer>>();
	//
	public static void main(String[] args) {
		ArrayList<HashMap<String, Integer>> arrList = new ArrayList<HashMap<String, Integer>>();
		for (int i = 0; i < 10; i++) {
			HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
			hm1.put("" + i, i);
			arrList.add(hm1);
		}
		for (HashMap<String, Integer> hm : arrList) {
			System.out.println(hm);
		}
	}

}
