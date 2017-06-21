package report.limchanho.r0006;

import java.util.Scanner;

public class CalExam {

	// 반복문을 사용하여 Scanner클래스를 이용해      //리턴하면 멈춘다../..
	// 총 10명의 학생의 점수를 받아주세요.
	// 10명의 학생의 총점과 평균을 구해주세요.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int result1 = 0;
		int[] num = new int[3];
		int[] num1 = new int[3];

		for (int i = 0; i < 10; i++) {

			System.out.print((i + 1) + "번째 학생의 점수를 입력해 주세요.");
			String inStr = scan.nextLine();

			num[i] = Integer.parseInt(inStr);
			result += num[i];
			result1 = result / 10;

		}
		System.out.println("총합의 결과는?" + result);
		System.out.println("총합의 평균은?" + result1);
	}
}