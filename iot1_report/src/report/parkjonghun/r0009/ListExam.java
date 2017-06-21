package report.parkjonghun.r0009;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam {

	public static void main(String[] args){
		ArrayList<String> arrList = new ArrayList<String>(); //String 일시 앞자리만 정렬 시킨다. 
		// 2자리 이상의 수를 정렬 시킬려고 할 시 Int로 변경 후 정렬해야한다.
		for(int i=3; i>=0; i--){
			arrList.add("" + i); // 리스트에 추가.
		}

		for(int i=0; i<arrList.size(); i++){ // 리스트의 크기
			System.out.println(arrList.get(i)); //리스트를 불러오기.
		}
		
		Collections.sort(arrList); // 정렬 시키는 함수. Collections.sort();
		Collections.reverse(arrList); // 역정렬 시키는 함수. Collections.reverse(); 
		
		for(int i=0; i<arrList.size(); i++){ // 리스트의 크기
			System.out.println(arrList.get(i)); //리스트를 불러오기.
		}
		
//		Integer[] arrInt = new Integer[10];  //arrInt[0] ~ [9]까지 주소값이 모두 같다.
//		for(int i = 0; i <= 10; i++){
//			arrInt[i] = 1;
//		}
//		System.out.println(arrInt[0] == arrInt[1]);
//		System.out.println(arrInt[0].equals(arrInt[1]));
//		
//		Integer a = 1;
//		Integer b = 1;
//		System.out.println(arrInt[0] == b);
//		
	}
}
