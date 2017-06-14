package report.kimmyunghwan.r0004;

public class Exam3 {
	int a = 0;
	int b = 0;

	int result = 0;

	public void Exam3() {

	}

	public Exam3(int a, int b) {
		this.a = a;		// this라는 건  클래스 안에서 선언한 변수 a를 가르킴
		this.b = b;
		this.result = this.a + this.b;
	}

	public static void main(String[] args) {
		Exam3 e = new Exam3(1,2);
		e.b = 4;
		System.out.println(e.result);

		Exam3 e2 = new Exam3(2,2);
		System.out.println(e2.result);

	}

}
