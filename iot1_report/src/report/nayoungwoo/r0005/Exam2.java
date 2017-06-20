package report.nayoungwoo.r0005;

import java.util.ArrayList;

public class Exam2 {

	public static void main(String[] args) {
	
		ArrayList<Cal> list = new ArrayList<Cal>();
		
		for (int i = 0; i < 5; i++) {

			Cal c = new Cal(i+1);	

		}
		
		for (int i = 0; i < 5; i++) {
			
			Cal c = new Cal();
			System.out.println(c.a);

		}

	}

}
