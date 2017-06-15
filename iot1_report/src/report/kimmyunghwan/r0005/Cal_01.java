package report.kimmyunghwan.r0005;

public class Cal_01 {
	// 인트타입의 2개의 파라메터 변수를 받는 생성자를 하나 만들어주세요
	// 클래스안에 인트타입의 변수 2개를 선언해주시고(int a; int b; <-- 멤버변수_어디에든 사용할수 있기때문에)
	// 클래스안에 있는 변수2개에 생성자에서 받은 파라메터 변수의 값을 대입하여
	// printPlus()를 함수에서 2개의 변수를 더한 값을 출력해주세요.
	int a;	// (4)
	int b;

	public Cal_01(int a, int b) { // (2)
		this.a = a; // (3)  public Cal(int a, int b) 아래에서 받은 값을  상단 int a, int b에 넣고 싶기 때문에 
								//  a=a;라고 하기 보다 this.a=a;  라 사용한다
		this.b = b;

	}

	 void printPlus() {
		System.out.println("a + b = "+ (a+b)); // (5)
	}

	public static void main(String[] args) {
		Cal_01 c = new Cal_01(1,2); // (1)
		c.printPlus();
		
	}
}
