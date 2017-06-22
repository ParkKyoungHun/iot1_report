package report.kimmyunghwan.r0009;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();

		for (int i = 0; i <=3; i++) {
			arrList.add("" + i);

		}

		for (int i = 0; i <arrList.size(); i++) { // size()  --> arrayList 에 있는 함수
			System.out.println(arrList.get(i));  // get(i)  --> 함수
		}
		
	}

}
//소팅(정렬)하는 방법 : 콜렉션 ListExam_1