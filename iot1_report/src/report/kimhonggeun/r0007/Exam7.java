package report.kimhonggeun.r0007;

public class Exam7 {
	//private접근제어자를 사용하여 int a,b,c 3개의 변수를 선언해
	//Exam7생성자에서 위의 3개의 변수의 값을 바꿔
	//a,b,c의 값을 리턴하는 함수 3개를 만들어
	//Exam8 클래스를 생성하여 Exam7에 선언된 a,b,c의 값을 받아 출력하는 예제를 작성해
	
	private int a;
	private int b;
	private int c;
	
	Exam7(){
		this.a=1;
		this.b=2;
		this.c=3;
	}

	public int getA(){
		return this.a;
	}
	public int getB(){
		return this.b;
	}
	public int getC(){
		return this.c;
	}
}
