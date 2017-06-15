package report.kimmyunghwan.r0005;

public class Cal2 {

	// int형 변수 2개를 멤버 변수로(클래스안에서 생성해야된다는 겁니다)
	// 스트링형 변수 1개를 생성해주세요
	// num1, num2, operator

	// printPlus(), printMinus(), printMultiple(),printDivision()
	// Cal2(int num1, int num2, String operator) 생성자를 선언하여
	// 각각의 멤버 변수에 대입해주세요
	// 그리고 위의 함수를 호출했을때 원하는 결과값을 출력해주세여.

	int num1;
	int num2;
	String operator;
	int result;

	Cal2(int num1, int num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;

	}

	public void pritnPlus() {
		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + (result));
	}

	public void pritnMinus() {
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + (result));
	}

	public void pritnMultiple() {
		result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + (result));
	}

	public void pritnDivision() {
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + (result));
	}

	// void printCal2() {
	// if (operator.equals("+")) {
	// System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	// } else if (operator.equals("-")) {
	// System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
	// } else if (operator.equals("*")) {
	// System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
	// } else if (operator.equals("/")) {
	// System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
	// } else {
	// System.out.println("연산자가 아닌 기호를 입력하셨네요!!!");
	// }
	// }

	public static void main(String[] args) {
		Cal2 c2 = new Cal2(20, 4, "");
		//c2.printCal2();
		 c2.pritnPlus();
		 c2.pritnMinus();
		 c2.pritnMultiple();
		 c2.pritnDivision();
	}

}
