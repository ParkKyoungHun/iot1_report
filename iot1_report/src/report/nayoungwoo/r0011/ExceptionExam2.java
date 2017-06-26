package report.nayoungwoo.r0011;

import java.util.Scanner;

public class ExceptionExam2 {
	// 10개의 방을 가지고 있는 int형 배열변수 arrNum을 --
	// ExceptionExam2의 멤버변수로 선언해주세요 --

	// for 문을 돌며 Scanner클래스의 nextLine()함수를 사용하여 아무런 값이나 입력해주세여
	// 단 for 문을 돌며 문자값이 입력됬을때 에러메시지를 나오게 해주세요

	int[] arrNum = new int[5];

	public static void main(String[] args) {

		ExceptionExam2 e2 = new ExceptionExam2();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < e2.arrNum.length; i++) {

			try {
				e2.arrNum[i] = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				i--;
				System.out.println("누가 문자 넣으래!!");
			}
		}
	}
}
