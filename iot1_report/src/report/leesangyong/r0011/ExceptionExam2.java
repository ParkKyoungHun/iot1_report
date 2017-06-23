package report.leesangyong.r0011;

import java.util.Scanner;

public class ExceptionExam2 extends Exception {
	/*
	 * 10개의 방을 가지고 있는 int형 배열변수 arrNum을 ExceptionExam2의 멤버변수로 선언해주세요 for문을 돌며
	 * Scanner 클래스의 nextLine()함수를 사용하여 아무런 값이나 입력해주세요 단 for문을 돌며 문자값이 입력되었을대
	 * 에러메세지를 나오게 해주세요.
	 */
	int arrNum[] = new int[10];

	public static void main(String[] args) {
			ExceptionExam2 e2 = new ExceptionExam2();
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i <= 9; i++) {
				try {
				System.out.println("숫자를 입력하세요");
				e2.arrNum[i] = Integer.parseInt(scan.nextLine());
				System.out.println((i + 1) + "번째 값은=" + e2.arrNum[i]);

		} 	catch (Exception e) {
			System.out.println("숫자를 입력해야지!!!");
			i--;
		}
		}
			System.out.println("수고하셨습니다");

	}
}
