package report.limchanho.r0009;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		for (int i = 3; i >= 0; i--) {
			arrList.add("A" + 1);
		
		}

		Collections.sort(arrList);
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));

		}
	
	}

}
