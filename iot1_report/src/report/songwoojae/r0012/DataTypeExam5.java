package report.songwoojae.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam5 {
	//키값은 그대로 두고 value 값만 입력받아서 출력하기
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList al = new ArrayList();
		ArrayList<HashMap> numList = new ArrayList<HashMap>();

		for (int i = 0; i < 2; i++) {
			System.out.println("신상정보를 입력하세요");
			HashMap hm = new HashMap(); // 선언을  for문 밖에서 하면 메모리에 덮어씀
			hm.put("클래스", scan.nextLine());
			hm.put("이름", scan.nextLine());
			hm.put("나이", scan.nextLine());
			hm.put("성별", scan.nextLine());
			numList.add(hm);
		}

		for (HashMap hm : numList) {

			System.out.print(hm.get("클래스") + ",");
			System.out.print(hm.get("이름") + ",");
			System.out.print(hm.get("나이") + ",");
			System.out.println(hm.get("성별") );
		}
	}

}
