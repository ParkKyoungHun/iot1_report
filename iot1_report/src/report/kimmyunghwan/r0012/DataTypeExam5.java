package report.kimmyunghwan.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<HashMap> arrList = new ArrayList<HashMap>();
		
	
		
		for (int i=0; i<1; i++){
			HashMap hm = new HashMap();
			System.out.println("신상정보를 입력하세요~~");
			hm.put("클래스", scan.nextLine());
			hm.put("이름", scan.nextLine());
			hm.put("나이", scan.nextLine());
			hm.put("성별", scan.nextLine());
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
