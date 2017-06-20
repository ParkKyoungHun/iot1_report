package report.kimmyunghwan.r0008;

import report.kimmyunghwan.r0007.Exam11_1;

public class Exam12_1 extends Exam11_1 {

	Exam12_1(int a, int b) {
		super(a,b); //빈생성자를 안만들기 위해 만든다
		this.a = a;	
		this.b = b;
	}

	public static void main(String[] args) {
		Exam12_1 e12 = new Exam12_1(1, 2);
		e12.plus();
		e12.printResult();
	}
}