package report.imhyejin.r0007;

public class Exam10 {

	protected int a, b, result;

	// a와 b값을 초기화 하는 Exam10생성자를 만들어주세요.
	// a와 b값을 더하기, 빼기, 나누기, 곱하기 하는 함수를 각각 4개 작성해주시고
	// 해당연산결과는 printResult() 라는 함수를 호출했을 때 나오게 프로그램을 작성해주시면 됩니다.
	// 호출은 Exam11라는 클래스를 만들어서 그안에서 해주시기 바랍니다.

	public Exam10() {
	}

	public Exam10(int a, int b) {
		this.a = a;
		this.b = b;
	}

	protected void sum() {
		result = this.a + this.b;
	}

	protected void min() {
		result = this.a - this.b;
	}

	protected void mul() {
		result = this.a * this.b;
	}

	protected void div() {
		result = this.a / this.b;
	}

	protected void printResult() {
		System.out.println(result);
	}

}
