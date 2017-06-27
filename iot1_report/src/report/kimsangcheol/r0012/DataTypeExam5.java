package r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam5 {
	Scanner scan = new Scanner(System.in);

	public HashMap getHashMap(){

		HashMap hm = new HashMap();
		System.out.println("클래스를 입력하세요.>");
		hm.put("클래스",scan.nextLine());
		System.out.println("이름을 입력하세요.>");
		hm.put("이름",scan.nextLine());
		System.out.println("나이를 입력하세요.>");
		hm.put("나이",scan.nextLine());
		System.out.println("성별를 입력하세요.>");
		hm.put("성별",scan.nextLine());
		return hm;
	}

	public static void main(String[]args){
		DataTypeExam5 dte = new DataTypeExam5();
		ArrayList <HashMap> aL = new ArrayList<HashMap>();
		for(int i=0;i<5;i++){

			aL.add(dte.getHashMap());
		}

		for(HashMap lists1 : aL){
			System.out.print(lists1.get("클래스") + "\t");
			System.out.print(lists1.get("이름") + "\t");
			System.out.print(lists1.get("나이") + "\t");
			System.out.println(lists1.get("성별") + "\t");
		}		
	}
}
