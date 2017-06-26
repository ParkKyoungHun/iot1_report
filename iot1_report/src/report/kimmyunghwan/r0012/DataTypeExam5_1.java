package report.kimmyunghwan.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam5_1 {
	Scanner scan = new Scanner(System.in);

	public HashMap getHashMap() {
		HashMap hm = new HashMap();
		System.out.println("클래스 정보를 입력하세요~~");
		hm.put("클래스", scan.nextLine());
		System.out.println("이름을 입력하세요~~");
		hm.put("이름", scan.nextLine());
		System.out.println("나이를 입력하세요~~");
		hm.put("나이", scan.nextLine());
		System.out.println("성별을 입력하세요~~");
		hm.put("성별", scan.nextLine());
		return hm;

	}

	public static void main(String[] args) {

		ArrayList<HashMap> arrList = new ArrayList<HashMap>();

		DataTypeExam5_1 dta5 = new DataTypeExam5_1();

		for (int i = 0; i < 2; i++) {
			HashMap hm = dta5.getHashMap();
			arrList.add(hm);
		}
		for (HashMap hmR : arrList) {

			System.out.println(hmR.get("클래스")+ ",");
			System.out.println(hmR.get("이름")+ ",");
			System.out.println(hmR.get("나이")+ ",");
			System.out.println(hmR.get("성별"));
			

		}
	}
}