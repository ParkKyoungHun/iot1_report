package report.kimmyunghwan.r0007;

import report.kimmyunghwan.r0006.RExam2;

public class Exam3 {
	// r0006패키지에 있는 RExam2의 변수의 값을 변환하고 출력
	// 단 Rexam2의 변수의 접근제어자를 바꾸시면 안됩니다.
	// 함수를 선언하여 해당 문제를 풀어주시기 바랍니다.
	public static void main(String[] args) {
		RExam2 re2 = new RExam2();

					//	re2.a=3; /*re2.a=3; 가 에러나는이유는 int a=3;앞에 디폴트로 되있기때문에*/
					// RExam2에서 void로 선언해줘야함
		System.out.println(re2.getA());
		System.out.println(re2.getB());
		
		re2.setA(3);
		re2.setB(4);
		
		System.out.println(re2.getA());
		System.out.println(re2.getB());

		
	}

}
