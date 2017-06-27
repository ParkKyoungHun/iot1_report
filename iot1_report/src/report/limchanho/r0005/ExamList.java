package report.limchanho.r0005;

import java.util.ArrayList;

public class ExamList {

	public static void main(String[] args) {
		ArrayList<Cal> list = new ArrayList<Cal>(); //list 인스턴트 변수
		for (int i = 0; i < 3; i++) {//
			Cal c = new Cal(i); //칼에 정수 i를 입력하면 
			list.add(c);
		}//

		for (int i = 0; i < 3; i++) {//
			Cal c2 = list.get(i);
			//System.out.println(c2.a);
		}//
		for (int i = 0; i < 3; i++) {//
			Cal c3 = new Cal(i, i, "");
			
			list.add(c3);
		}//

		for (int i = 0; i < 3; i++) {//
			Cal c3 = new Cal(i, i, "");
			System.out.println(c3.b +","+ c3.a);
		}//
	}
	}
