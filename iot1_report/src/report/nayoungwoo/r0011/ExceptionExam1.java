package report.nayoungwoo.r0011;
// ExceptionExam1 의 멤버변수로 int num1, num2를 선언해주세요 

import java.util.Scanner;

// 멤버변수 num1과 num2값을 계산하여 int 값을 리턴하는
// plus(), minus(), multiple(),division() 함수를 4개 선언하여 이름에 맞게 연산하여 리턴해주세요. 
// Scanner 클래스의 nextLine()함수를 사용하여 num1값과 num2값을 대입해주세요
// 숫자값을 입력하지 않았을때는 Exception에서 "숫자를 입력해야지!!!" 라는 문자열이 나와야합니다.
// 정상적으로 숫자값을 입력했다면 
// 위에 선언한 4개의 함수를 호출하여 값을 받아 출력하는 예제를 작성해주시기 바랍니다. 

public class ExceptionExam1 {

	final int num1;
	int num2;

	ExceptionExam1(){
		num1 = 2;
	}
	int plus(int a, int b) {

		return a + b;
	}

	int minus(int a, int b) {

		return a - b;
	}

	int multiple(int a, int b) {

		return a * b;
	}

	int division(int a, int b) {

		return a / b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력해라 2개 ");

		try {
			ExceptionExam1 e = new ExceptionExam1();

			String input = scan.nextLine();
			int num1 = Integer.parseInt(input);
			String input2 = scan.nextLine();
			int num2 = Integer.parseInt(input2);

			System.out.println(num1 + " + " + num2 + " = " + e.plus(num1, num2));
			System.out.println(num1 + " - " + num2 + " = " + e.minus(num1, num2));
			System.out.println(num1 + " x " + num2 + " = " + e.multiple(num1, num2));
			System.out.println(num1 + " / " + num2 + " = " + e.division(num1, num2));

		} catch (Exception e) {
			System.out.println("숫자를 입력해야지!!!");
		} finally {
		System.out.println("이러나");
		}
	}

}
