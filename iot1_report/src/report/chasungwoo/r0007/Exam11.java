package report.chasungwoo.r0007;

public class Exam11 {
	protected int a;
	protected int b;
	protected int result;
	/*a와 b값을 초기화하는 Exam11생성자를 만들어주세요.
	 * a와b값을 더하기, 빼기, 나누기, 곱하기 하는 함수를 각각 4개 작성해주시고
	 * 해당연산결과는 printResult()라는 함수를 호출했을 때 나오게 프로그램을 작성해주시면 됩니다.
	 * 호출은 Exam12라는 클래스를 만들어서 그 안에서 해주시기 바랍니다.
	 */
	public Exam11(){}
	public Exam11(int a, int b){
		this.a = a;
		this.b = b;
	}
	protected void adder(){
		result = a + b;
	}
	protected void subtractor(){
		result = a - b;
	}
	protected void multiplier(){
		result = a * b;
	}
	protected void divider(){
		result = a / b;
	}
	protected void printResult(){
		System.out.println(result);
	}

	
}
