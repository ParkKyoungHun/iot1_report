package report.parkjonghun.r0009;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMapExam {
	// 스트링,인티저로 구성된 HashMap 변수를 선언해주세요.
	// HashMap 변수명은 pointHm 이라고 해주세요.
	// pointHm에 학생의 이름 키값과 점수 밸류 값을 10개 넣어주세요.
	// 학생이름은 A군, B군, C군....으로 입력해주세요. 이름 나이 성별 
	// 해당 pointHm을 ArrayList에 추가해주세요.
	// 반복문을 사용하여 ArrayList에 추가된 pointHm을 출력해주세요.
	
	
	public static void main(String[] args){
		ArrayList<HashMap<String, Object>> arrList = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> pointHm = new HashMap<String, Object>();
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<2; i++){
			
			System.out.println("이름을 입력해주세요. => ");
			String name = scan.nextLine();
			
			System.out.println("나이를 입려해주세요. => ");
			String age = scan.nextLine();
			
			System.out.println("성별을 입력해주세요. => ");
			String gender = scan.nextLine();
			
			pointHm.put("name", name);
			pointHm.put("age", Integer.parseInt(age));
			pointHm.put("gender", gender);
			Object str = new String(" ");
			arrList.add(pointHm);
		}
		for(HashMap<String, Object> newPointHm: arrList){
			System.out.println(newPointHm);
		}
		
		
//		for(int i = 0; i < 5; i++){
//			HashMap<String, Integer> pointHm = new HashMap<String, Integer>();
//			pointHm.put(""+i, i);
//			arrList.add(pointHm);
//		}
//						
//		for(HashMap<String, Integer> newPointHm: arrList){
//			System.out.println(newPointHm);
//		}
		
	}

	

}
