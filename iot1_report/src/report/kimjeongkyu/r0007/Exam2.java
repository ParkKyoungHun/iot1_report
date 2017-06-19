package report.kimjeongkyu.r0007;

import report.kimjeongkyu.r0006.copy.RExam4;

public class Exam2 {
	public static void main(String[] args){
		Exam1 e1 = new Exam1();
		System.out.println(e1.a);
		System.out.println(e1.b);
		
		
		Exam1 e2 = new Exam1();
		e1.a = 4;
		e1 = new Exam1();
		System.out.println(e1.a);
		System.out.println(e1.b);
		
		RExam4 e4 = new RExam4();
	}
}
