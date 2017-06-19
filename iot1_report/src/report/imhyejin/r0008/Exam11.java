package report.imhyejin.r0008;

import report.imhyejin.r0007.Exam10;

public class Exam11 extends Exam10 {

	public Exam11(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Exam11 e11 = new Exam11(10, 2);
		
		System.out.print("더한값: ");
		e11.sum();
		e11.printResult();

		System.out.print("뺀  값: ");
		e11.min();
		e11.printResult();

		System.out.print("곱한값: ");
		e11.mul();
		e11.printResult();

		System.out.print("나눈값: ");
		e11.div();
		e11.printResult();
	}
}
