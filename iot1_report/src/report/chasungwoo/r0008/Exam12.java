package report.chasungwoo.r0008;

import report.chasungwoo.r0007.Exam11;

public class Exam12 extends Exam11 {
	
	Exam12(int a, int b){
		this.a = a;
		this.b = b;
	}

	public static void main  (String[] args){
		Exam12 ex11 = new Exam12(1,2);
		
		ex11.adder();
		ex11.printResult();
		ex11.subtractor();
		ex11.printResult();
		ex11.multiplier();
		ex11.printResult();
		ex11.divider();
		ex11.printResult();
	}
}
