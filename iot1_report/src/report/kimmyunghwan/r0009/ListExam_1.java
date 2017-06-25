package report.kimmyunghwan.r0009;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam_1 {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		// String(숫자를 문자로인식? 단일숫자) 아니고 int면 숫자 두 자리수 이상의 수일때~

		for (int i = 0; i <= 3; i++) {
			arrList.add("" + i);

		}

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		// 소팅(정렬)하는 방법 : 콜렉션 or comparate

		Collections.sort(arrList); // Collections은 내자신만 사용이며 호출 안됨. private Collections
									// 단, String 타입 숫자 하나이기 때문에 가능한것임
									// Collections.reverse(arrList); 반대로 정렬, 단
									// String 타입 숫자 하나이기 때문에 가능한것임
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

	}

}
