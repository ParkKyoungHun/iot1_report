package report.parkjonghun.r0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTypeExam5 {
	Scanner scan = new Scanner(System.in);
	public HashMap getHashMap(){ //final
			HashMap hm = new HashMap();  //초기화를 여기서 해줘야 같은 값이 같은 메모리 방에 적용되지 않는다. 
			//ex) for문이 돌때마다 새로운 메모리를 생성함.
			System.out.println("클래스 정보를 입력하시오.");
			hm.put("클래스",scan.nextLine());
			System.out.println("이름 정보를 입력하시오.");
			hm.put("이름", scan.nextLine());
			System.out.println("나이 정보를 입력하시오.");
			hm.put("나이", scan.nextLine());
			System.out.println("성별 정보를 입력하시오.");
			hm.put("성별", scan.nextLine());
			//arrList.add(hm);
			return hm;
	}
	
	public void setHashMapToArrayList(ArrayList<HashMap>arrList){
		HashMap hm = new HashMap();  
		System.out.println("클래스 정보를 입력하시오.");
		hm.put("클래스",scan.nextLine());
		System.out.println("이름 정보를 입력하시오.");
		hm.put("이름", scan.nextLine());
		System.out.println("나이 정보를 입력하시오.");
		hm.put("나이", scan.nextLine());
		System.out.println("성별 정보를 입력하시오.");
		hm.put("성별", scan.nextLine());
		arrList.add(hm);
}
	
	public static void main(String[] args){
		ArrayList<HashMap> arrList = new ArrayList<HashMap>();
		DataTypeExam5 dte5 = new DataTypeExam5();
		
		for(int i = 0; i < 2; i++){
			//arrList.add(dte5.getHashMap());
			HashMap hm = dte5.getHashMap();
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
