package report.kimmyunghwan.r0005;

public class Exam3 {

	public static void main(String[] args) {
		Cal_02 c1 = new Cal_02(1,2,"+");
		c1.printCal();
		
//		c = new Cal_02();
//		c.printCal();
		
		Cal_02 c2 = new Cal_02();
		c2.printCal();
		
		
		Cal_02[] arrC = new Cal_02[2];
		arrC[0]= c1;
		arrC[1]= c2;
		
	}

}
