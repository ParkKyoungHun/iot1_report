package report.leesangyong.r0007;

import report.leesangyong.r0008.Exam11;

public class Exam12 extends Exam11{
 Exam12(int a, int b) {
	 this.a = a;
	 this.b = b;
 }

public static void main(String[]args){
	Exam11 e12 = new Exam12(1,2);
	e12.printResult();
}
}
