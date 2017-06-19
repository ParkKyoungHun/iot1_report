package report.nayoungwoo.r0005;

public class Cal2 {

	// 각각의 멤버변수에 대입해주세요 .

	// 그리고 위의 함수를 호출했을때 원하는 결과값을 출력해주세요

	int num1;
	int num2;
	String operator;

	Cal2(int num1, int num2, String operator) {

		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;

	}

	void printPlus() {

		System.out.println(num1 + num2);
	}

	void printMinus() {
		System.out.println(num1 - num2);
	}

	void printMultiple() {
		System.out.println(num1 * num2);
	}

	void printDivision() {
		System.out.println(num1 / num2);
	}
	Cal2(){}
	public static void main(String[] args) {

		Cal2 x = new Cal2(1,2,"+");
		x.printPlus();
		x.printMinus();
		x.printMultiple();
		x.printDivision();
	}

}
