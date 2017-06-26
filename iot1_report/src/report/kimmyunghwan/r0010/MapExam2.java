package report.kimmyunghwan.r0010;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam2 extends HashMap<String, Integer> {

	// HasnMap을 상속 받아주세요.
	// 키타입은 String, 밸류 타입은 Integer로 선언
	// 키는 아무거나 넣으셔도 되지만 밸류는 반드시 숫자만 입력하셔야 합니다.
	// 총 10개의 키값을 생성해주세요
	// toString()함수를 오버라이딩 하여서
	// 해당 해쉬맵이 가지고 있는 전체 숫자를 더한 값을 출력해주세요.

	public MapExam2() {

	}

	public String toString() {
		String result = "";
		ArrayList<String> keyList = new ArrayList<>(keySet()); // 10개의 키가 생성되었다
		int sum = 0;
		for (int i = 0; i < keyList.size(); i++) {
			String key = keyList.get(i);
			sum += get(key);

		}
		result += sum;
		return result;
	}

	public static void main(String[] args) {
		MapExam2 me2 = new MapExam2();

		for (int i = 1; i <= 10; i++) {
			me2.put("" + i, i);
		}

		System.out.println(me2);

	}

}
