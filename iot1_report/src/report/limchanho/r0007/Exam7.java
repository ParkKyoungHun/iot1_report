package report.limchanho.r0007;

public class Exam7 {

	// private 접근제어자를 사용하여 int a b c 3개의 변수를 선언해주세요.
	// Exam7생성자에서 위의 3개의 변수의 값을 바꿔주세요.
	// abc의 값을 리턴하는 함수 3개를 만들어 주세요.
	// Exam8 클래스를 생성하여 exam7에 선언된 뮻의 값을 받아 출력하는 예제를 작성해주세요.

	private int a = 1;
	private int b = 2;
	private int c = 3;

	Exam7(int a, int b, int c) {//
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}
}
