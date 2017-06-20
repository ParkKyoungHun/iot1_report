package report.kimhonggeun.r0007;

import report.kimhonggeun.r0006.RExam2;

public class Exam3{

	//r0006패키지에 있는 RExam2의 변수의 값을 변환하고 출력해
	//단 RExam2의 변수의 접근제어자를 바꾸시면 안되
	//함수를 선언하여 해당 문제를 풀어
	
	public static void main(String[]args){
		
		RExam2 e2= new RExam2();
		System.out.println(e2.getA());

		e2.setA(3);

		System.out.println(e2.getA());

	}
}
