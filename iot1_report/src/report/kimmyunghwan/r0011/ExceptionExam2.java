package report.kimmyunghwan.r0011;

import java.util.Scanner;

public class ExceptionExam2 {

	// 10개의 방을 가지고 있는 int형 배열 변수 arrNum
	// ExceptionExam2의 멤버 변수로 선언해주세요
	// for문을 돌며 Scanner 클래스의 nextLine() 함수를 사용하여 아무런 값이나 입력
	// 단 for문을 돌며 문자값이 입력됬을때 에러메세지를 나오게 해주세요.

	int result;
	int[] arrNum = new int[10];

	public static void main(String[] args) {

		try {
			ExceptionExam2 ex2 = new ExceptionExam2();

			Scanner scan = new Scanner(System.in);

			for (int i = 0; i < ex2.arrNum.length; i++) {
				System.out.println("숫자를 입력해주세요~~");
				String input = scan.nextLine();
				ex2.arrNum[i] = Integer.parseInt(input);

				System.out.println("입력하신 숫자는 ==> " + ex2.arrNum[i]);

			}

		} catch (Exception e) {
			System.out.println("숫자가 아닌 다른 문자를 입력 하셨네요!!!");
		} finally {
			System.out.println("정확하게 숫자를 입력하셨네요~~~~!!!");
		}

	}

}
