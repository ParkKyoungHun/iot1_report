package report.kimjeongkyu.r0007;

public class Exam11 {
	// a와 b값을 초기화 하는 Exam11생성자를 만들어주세요.
		// a와 b값을 더하기, 빼기, 나누기, 곱하기 하는 함수를 각각 4개 작성해주시고
		// 해당연산결과는 printResult()라는 함수를 호출했을때 나오게 프로그램을 작성해주시면됩니다.
		// 호출은 Exam12라는 클래스를 만들어서 그안에서 해주시기 바랍니다.
	
	protected int a;
	protected int b;
	int result;
	
	//생성자 호출을 위한 필수임 (아래)
//	public Exam11(){}
	
	public Exam11(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	protected void plus(){
		result = a+b;
	}
	
	protected void minus(){
		result = a -b;
	}
	
	protected void multi(){
		result = a * b;
	}
	
	protected void division(){
		result = a/ b;
	}
	
	protected void printResult(){
		System.out.println(result);
	}
}
