package report.kimmyunghwan.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam6 {

	public static void main(String[] args) {

		ArrayList<HashMap> arrList2 = new ArrayList<HashMap>();
		DataTypeExam5_1 ar5 = new DataTypeExam5_1();

		for (int i = 0; i <2; i++) {
			
			arrList2.add(ar5.getHashMap());

		}

		for (HashMap hmR1 : arrList2) {
			System.out.print(hmR1.get("클래스") + ",");
			System.out.print(hmR1.get("이름") + ",");
			System.out.print(hmR1.get("나이") + ",");
			System.out.println(hmR1.get("성별"));
		}
	}

}
