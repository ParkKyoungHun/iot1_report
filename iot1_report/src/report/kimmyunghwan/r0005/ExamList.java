package report.kimmyunghwan.r0005;

import java.util.ArrayList;

public class ExamList {

	public static void main(String[] args) {
		ArrayList<Cal_02> list = new ArrayList<Cal_02>(); // list는 변수

		for (int i = 0; i < 5; i++) { 						// 5번을 돌린다는 뜻

			Cal_02 c = new Cal_02(1); 					// 데이터 타입 --> Cal_02
			list.add(c); 									// 순차적으로 list에 넣는다는 뜻

		}

		for (int i = 0; i < 3; i++) { 						// 출력하기 위해
			Cal_02 c2 = list.get(i); 						// i번째에 있는 인덱스 값을 c2에서 불러온다.
			System.out.println(c2.a); 
		}
	}
}
