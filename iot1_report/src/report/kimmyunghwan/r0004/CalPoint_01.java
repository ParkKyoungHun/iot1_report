package report.kimmyunghwan.r0004;

import java.util.Scanner;

//강사님 코드

public class CalPoint_01 {

	// Scanner클래스를 사용하여 6명의 학생의 점수를 직접 입력 받아주세요.
	// 6명의 학생의 총점을 출력해주세요.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int result = 0;

		for (int i = 0; i <= 5; i++) {
			System.out.println("점수를 입력해주세요 : ");

			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			System.out.println("입력하신 " + (i + 1) + " 번째 학생의 점수=" + num);
			result += num; // 합계
		}

		System.out.println("입력하신 6 학생의 총점=" + (result));

		// 아래 구문은 없어도 될거 같음.

	}

}
