package report.parkjonghun.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam6 {
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		ArrayList<HashMap> arrList = new ArrayList<HashMap>();
		DataTypeExam5 dte5 = new DataTypeExam5();
		
		for(int i = 0; i<2; i++){
			HashMap hm = new HashMap();
			hm = dte5.getHashMap();
			arrList.add(hm);
		}
		
		for(HashMap result : arrList){
			System.out.print(result.get("클래스") + ",");
			System.out.print(result.get("이름") + ",");
			System.out.print(result.get("나이") + ",");
			System.out.println(result.get("성별"));
		}
		
	}

}
