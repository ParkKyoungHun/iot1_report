package report.songwoojae.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam6 {
	public static void main(String[] agrs){
		ArrayList<HashMap> numList = new ArrayList<HashMap>();
		DataTypeExam5_3 dte5 = new DataTypeExam5_3();
		for(int i=0;i<2;i++){
			numList.add(dte5.getHashMap());
		}
		for(HashMap hm:numList){
			System.out.print(hm.get("클래스")+",");
			System.out.print(hm.get("이름")+",");
			System.out.print(hm.get("나이")+",");
			System.out.println(hm.get("성별"));
			
		}
		
	}

}
