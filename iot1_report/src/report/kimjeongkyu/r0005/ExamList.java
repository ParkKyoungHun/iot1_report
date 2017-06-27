package report.kimjeongkyu.r0005;

import java.util.ArrayList;

public class ExamList {
	public static void main(String[] args) {
		ArrayList<Cal> list = new ArrayList<Cal>(); 		// Cal 데이터 타입 입력
		for (int i = 0; i < 3; i++) {
			Cal c = new Cal(i);
			list.add(c);
		}

		for (int i = 0; i < 3; i++) {		 //List 와 get도 함수이다.
			Cal c2 = list.get(i);
			System.out.println(c2.a);
		}
	}

}
