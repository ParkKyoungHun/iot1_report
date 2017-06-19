package report.kimmyunghwan.r0007;

import report.kimmyunghwan.r0006.RExam4;

public class Exam2 {

	public static void main(String[] args) {

		Exam1 e1 = new Exam1();
		System.out.println(e1.a);
		System.out.println(e1.b);

		Exam1 e2 = new Exam1(); //new 메모리 새로 생성
		e1.a = 4;
		System.out.println(e2.a);
		System.out.println(e2.b);
		RExam4 e4 = new RExam4(); //c+s+o RExam4 클릭후 임포트 해줘야함
		System.out.println(e4.a); // a
		System.out.println(e4.b);
	}

}

//RExam4 에서 int a 앞에 public 써주는 임포트를 하면 다른 패키지에 있어도 사용가능