package report.kimhonggeun.r0005;

import java.util.ArrayList;

public class ExamList {

	public static void main(String[]arge){
		ArrayList<Cal> list = new ArrayList<Cal>();
		for(int i=0;i<3;i++){
			Cal c = new Cal(i);
			list.add(c);
		}

		for(int i=0;i<3;i++){
			Cal c2=list.get(i);
			System.out.println(c2.a);
		}
	}
}
