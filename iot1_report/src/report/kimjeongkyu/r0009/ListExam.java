package report.kimjeongkyu.r0009;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam {

	
	public static void main(String[] args){
		ArrayList<String> arrList = new ArrayList<String>();
		for(int i=3; i>=0; i--){
			//add 함수 -> 프린트
			arrList.add("" + i);
		}
		
		//이게 뭐지?
		Collections.sort(arrList);
		
		for(int i=0; i<arrList.size(); i++){
			//get 함수 -> 불러오기	
			System.out.println(arrList.get(i));
		}
	
		
		
	}
}
