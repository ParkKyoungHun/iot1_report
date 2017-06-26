package report.kimhonggeun.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam5 {
	
	Scanner scan = new Scanner(System.in);
	
	public HashMap getHashMap(){
		HashMap hm1 = new HashMap();
		System.out.print("번호 :");
		hm1.put("번호", scan.nextLine());	
		System.out.print("나이 :");
		hm1.put("나이", scan.nextLine());
		System.out.print("키 :");
		hm1.put("키", scan.nextLine());
		System.out.print("이름 :");
		hm1.put("이름", scan.nextLine());
		System.out.print("성별 :");
		hm1.put("성별", scan.nextLine());
		return hm1;
	}

	public static void main(String[]args){
		ArrayList<HashMap> arr = new ArrayList<HashMap>();
		DataTypeExam5 dte = new DataTypeExam5();
		
		for(int i=0;i<5;i++){
		arr.add(dte.getHashMap());
		}
		
//		for(int i=0;i<arr.size();i++){
//			HashMap resultHm = arr.get(i);
//			System.out.print(resultHm.get("번호")+",");
//			System.out.print(resultHm.get("나이")+",");
//			System.out.print(resultHm.get("키")+",");
//			System.out.print(resultHm.get("이름")+",");
//			System.out.println(resultHm.get("성별"));
//		}
		for(HashMap hm1:arr){
			System.out.print(hm1.get("번호")+",");
			System.out.print(hm1.get("나이")+",");
			System.out.print(hm1.get("키")+",");
			System.out.print(hm1.get("이름")+",");
			System.out.println(hm1.get("성별"));
		}
	}
}
