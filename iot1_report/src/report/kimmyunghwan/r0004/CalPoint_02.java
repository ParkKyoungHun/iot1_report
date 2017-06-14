package report.kimmyunghwan.r0004;

import java.util.Scanner;

//강사님 코드

public class CalPoint_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int result = 0;
		int[] num = new int[5]; // int[5] == int{1,2,3,4,5}

		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요 ==> ");

			String input = scanner.nextLine(); // nextLine에서 input에 string으로
												// 넘겨준다
			num[i] = Integer.parseInt(input); // Integer.parseInt는 숫자를 문자로 13라인에 넘겨준다

			result += num[i];// 합계
		}
		System.out.println("입력하신 5 학생의 총점=" + (result));

		// 아래 구문은 없어도 될거 같음.
		for (int i = 0; i < num.length; i++) {
			System.out.println("입력하신 " + (i + 1) + " 번째 학생의 점수=" + num[i]);
		}

	}

}
