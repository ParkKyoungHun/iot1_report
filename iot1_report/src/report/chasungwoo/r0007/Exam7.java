package report.chasungwoo.r0007;

public class Exam7 {
	/*private 접근자제어를 사용하여 int a,b,c 3개의 변수를 선언해주세요.
	 * Exam7 생성자에서 위의 3개의 변수의 값을 바꿔주세요.
	 * a,b,c 의 값을 리턴하는 함수 3개를 만들어 주세요.
	 * Exam8 클래스를 생성하여 Exam7에 선언된 a,b,c의 값을 받아 출력하는 예제를 작성해주세요.
	 */
	private int a = 0;
	private int b = 0;
	private int c = 0;
	
	public int initValA(int a){
		this.a = a;
		return this.a;
	}
	public int initValB(int b){
		this.b = b;
		return this.b;
	}
	public int initValC(int c){
		this.c = c;
		return this.c;
	}

}
