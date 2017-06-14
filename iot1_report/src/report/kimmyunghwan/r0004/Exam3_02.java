package report.kimmyunghwan.r0004;

public class Exam3_02 {
	int a = 0;
	int b = 0;
	int result = 0;

	public void Exam3() {

	}

	public Exam3_02(int a, int b) {
		this.a = a;		// this라는 건  클래스 안에서 선언한 변수 a를 가르킴
		this.b = b;
		this.result = this.a + this.b;
	}

	public static void main(String[] args) {
		Exam3_02 e = new Exam3_02(1,2);
		e.b = 4;
		System.out.println(e.result);

		Exam3_02 e2 = new Exam3_02(2,2);
		System.out.println(e2.result);

	}

}
