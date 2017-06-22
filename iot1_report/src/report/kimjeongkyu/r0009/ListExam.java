package report.kimjeongkyu.r0009;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam {

	
	public static void main(String[] args){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i=3; i>=0; i--){
			arrList.add(((int)(Math.random()*45)+1));
			//add 함수 -> 프린트
		}
		
		//이게 뭐지?  --> 무조건 값을 오름차순으로 해줌 ㅋ
		Collections.sort(arrList);
	//	Collections.reverse(arrList);
		
		for(int i=0; i<arrList.size(); i++){
			//get 함수 -> 불러오기	
			System.out.println(arrList.get(i));
		}
	
		
		
	}
}
