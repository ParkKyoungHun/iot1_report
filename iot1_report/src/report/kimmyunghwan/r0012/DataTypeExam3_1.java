package report.kimmyunghwan.r0012;

import java.util.ArrayList;
import java.util.HashMap;

public class DataTypeExam3_1 {

	public static void main(String[] args) {

		ArrayList<HashMap> numList = new ArrayList<HashMap>(); // HashMap타입 변수
		
		HashMap hm= new HashMap(); 
		hm.put("번호","1");
		hm.put("제목","게시물1");
		hm.put("작성자","홍길동");
		numList.add(hm);			//방생성
		
		HashMap hm1= new HashMap(); 
		hm1.put("번호","2");
		hm1.put("제목","게시물2");
		hm1.put("작성자","둘리");
		numList.add(hm1);
		
		HashMap hm2= new HashMap(); 
		hm2.put("번호","3");
		hm2.put("제목","게시물3");
		hm2.put("작성자","길동이");
		numList.add(hm2);
		
		//list의 방갯수는 3개 hm, hm1, hm2
		
		for (int i=0; i<numList.size(); i++){				//numList.size 방이 3개 이므로 3
			HashMap resultHm = numList.get(i);
//			System.out.println(resultHm);

			System.out.print(resultHm.get("번호")+ ",");
			System.out.print(resultHm.get("제목")+ ",");
			System.out.println(resultHm.get("작성자")+ ",");
			
			
			//hashMap 대신 dto사용
			
		}
		
		System.out.println();
	} // main End

} // class End
