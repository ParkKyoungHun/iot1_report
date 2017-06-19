package report.kimhonggeun.r0007;

public class Exam11 {
	
	protected int a;
	protected int b;
	protected int result;
	// a와 b값을 초기화 하는 Exam11생성자를 만들어
	// a와 b값을 더하기, 뺴기, 나누기, 곱하기 하는 함수를 각각 4개 작성해
	//해단 연산결과는 printResult()라는 함수를 호출했을때 나오게 프로그램을 작성해
	//호출은 Exam12라는 클래스를 만들어서 그안에서 해
	
	public Exam11(){}
	
	public Exam11(int a, int b){
		this.a=10;
		this.b=5;
	}
	protected void plusCal(){
		result = a+b;		
	}
	protected void minCal(){
		result = a-b;		
	}
	protected void mulCal(){
		result = a*b;		
	}
	protected void divCal(){
		result = a/b;		
	}
	protected void printResult(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		System.out.println(result);
	}
}
