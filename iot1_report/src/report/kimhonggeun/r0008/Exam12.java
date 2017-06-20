package report.kimhonggeun.r0008;

import report.kimhonggeun.r0007.Exam11;

public class Exam12 extends Exam11{

	Exam12(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[]args){
		
		Exam12 e2 = new Exam12(10,5);

		e2.plusCal();
		e2.printResult();
		e2.minCal();
		e2.printResult();
		e2.mulCal();
		e2.printResult();
		e2.divCal();
		e2.printResult();
		
	}
}
