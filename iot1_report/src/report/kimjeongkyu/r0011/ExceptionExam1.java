package report.kimjeongkyu.r0011;

import java.util.Scanner;

public class ExceptionExam1 {
	// ExceptionExam1의 멤버변수 int num1, num2를 선언해주세요.
	// 멤버변수 num1과 num2값을 계산하여 int 값을 리턴하는
	// plus(), minus(), multiple(), division() 함수를 4개 선언하여 이름에 맞게 연산하여 리턴해주세요.
	// Scanner 클래스의 nextLine()함수를 사용하여 num1의 값과 num2값을 대입해주세요.
	// 숫자값을 입력하지 않았을때는 Exception에서 "숫자를 입력해야지!!!"라는 문자열이 나와야합니다.
	// 정상적으로 숫자 값을 입력했다면
	// 위에 선언한 4개의 함수를 호출하여 값을 받아 출력하는 예제를 작성해주시기 바랍니다.
	int num1, num2;
	int result;
			
	int plus() {
		result = num1 + num2;
		return result;
	}

	int minus() {
		result = this.num1 - this.num2;
		return result;
	}

	int multiple() {
		result = this.num1 * this.num2;
		return result;
	}

	int division() {
		result = this.num1 / this.num2;
		return result;
	}

	public static void main(String[] args) {
		try {
			ExceptionExam1 ee1 = new ExceptionExam1();
			Scanner scan = new Scanner(System.in);
			System.out.println("첫번재 값을 입력해주세요");
			ee1.num1 = Integer.parseInt(scan.nextLine());
			System.out.println("두번재 값을 입력해주세요");
			ee1.num2 = Integer.parseInt(scan.nextLine());

			ee1.plus();
			System.out.println("더하기 결과 값은 = " + ee1.result);
			ee1.minus();
			System.out.println("빼기 결과 값은 = " + ee1.result);
			ee1.multiple();
			System.out.println("곱하기 결과 값은 = " + ee1.result);
			ee1.division();
			System.out.println("나누기 결과 값은 = " + ee1.result);

		} catch (Exception e) {
			System.out.println("숫자를 입력해야지!!!");
			
		}finally{
			System.out.println("요건 에러나도 무조건 실행");
		}
	}
}
