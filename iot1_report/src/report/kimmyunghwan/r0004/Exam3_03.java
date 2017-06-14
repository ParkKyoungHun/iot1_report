package report.kimmyunghwan.r0004;

public class Exam3_03 {
	int a = 0;
	int b = 0;
	int result = 0;

	public void Exam3_03() {
		this.result = 0;
	}

	public Exam3_03(int a, int b) {
		this.a = a; // this라는 건 클래스 안에서 선언한 변수 a를 가르킴
		this.b = b;
		this.result = this.a + this.b;
		int c = 1;
	}

	public static void main(String[] args) {
		Exam3_03 e = new Exam3_03(1, 2);
		e.b = 4;
		System.out.println(e.result);

		Exam3_03 e2 = new Exam3_03(2, 2);
		System.out.println(e2.result);

	}

}
