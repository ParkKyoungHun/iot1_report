package report.nayoungwoo.r0005;

public class Cal {

	/*
	 * 클래스 안에 스트링 타입의 연산자를 저장하는 변수를 선언 생성자에서 연산자를 저장하는 로직을 만들고 printCal()이라는 함수를
	 * 만들어 해당함수를 호출하였을 때 알맞은 연산이 되는 프로그램을 만들어주세요.
	 */

	int a;
	int b;
	String c;
	Cal() {
		
	}
	Cal(int a) {

		System.out.println(a + "인트형변수 파라메터를 한개를 가진 생성자를 호출하셨네요!");
		this.a = a;

	}

	Cal(int a, int b, String c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	void printCal() {
		
		if (c.equals("+")) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if (c.equals("-")) {
			System.out.println("a - b = " + (a - b));
		} else if (c.equals("*")) {
			System.out.println("a * b = " + (a * b));
		} else if (c.equals("/")) {
			System.out.println("a / b = " + (a / b));
		} else {
			System.out.println("연산자가 틀렸어요");
		}
	}

	public static void main(String[] args) {

		Cal c = new Cal(2, 3, "+");
		c.printCal();

	}
}
