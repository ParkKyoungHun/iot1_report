package r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam6 extends DataTypeExam5{

	public HashMap getHashMap(){
		HashMap hm = new HashMap();
		System.out.println("클래스 정보를 입력하세요.");
		hm.put("클래스", scan.nextLine());
		return hm;
	}


	public static void main(String[]args){
		ArrayList<HashMap> aL = new ArrayList<HashMap>();
		DataTypeExam6 dte6 = new DataTypeExam6();
		for(int i=0;i<2;i++){

			aL.add(dte6.getHashMap());
		}

		for(HashMap lists1 : aL){
			System.out.print(lists1.get("클래스") + "\t");
			System.out.print(lists1.get("이름") + "\t");
			System.out.print(lists1.get("나이") + "\t");
			System.out.println(lists1.get("성별") + "\t");
		}	
	}
}
