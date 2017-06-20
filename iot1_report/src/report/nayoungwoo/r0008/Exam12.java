package report.nayoungwoo.r0008;

import report.nayoungwoo.r0007.Exam11;

public class Exam12 extends Exam11 {

	Exam12(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {

		Exam12 e2 = new Exam12(1,2);
		e2.printPlus();
		e2.printResult();

	}

}
