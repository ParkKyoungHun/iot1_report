package report.nayoungwoo.r0007;

//a와 b 값을 초기화 하는 Exam11 생성자를 만들어 주세요

// a와ㄱ값을 더하기 빼기 나누기 곱하기 하는 함수를 각각 4새 작성해주시고
// 해당 연산겨과는 printResult 라는 함수를 호출 했을때 나오게 프로그램을 작성해주시면 됩니다. 

//	호출은 Exam12라는 클래시를 만들어서 그 안에서 해주시기 바랍니다. 

public class Exam11 {

	protected int a;
	protected int b;
	protected int result;
	
	
	public Exam11(int a , int b){
		this.a = a;
		this.b = b;
	}
	
	protected void printPlus() {
		result = a + b;
	}

	protected void printMinus() {
		result = a - b;
	}

	protected void printMultiple() {
		result = a * b;
	}

	protected void printDivision() {
		result = a / b;
	}

	protected void printResult() {

		System.out.println(result);
	}

	public static void main(String[] args) {

	}
}
