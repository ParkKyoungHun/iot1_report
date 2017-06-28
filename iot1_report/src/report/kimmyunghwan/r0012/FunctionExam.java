package report.kimmyunghwan.r0012;

import java.util.Scanner;

public class FunctionExam {

	int[] arrNum = new int[5];

	public static void main(String[] args) {
		FunctionExam ee2 = new FunctionExam();

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < ee2.arrNum.length; i++) {

			try {

				ee2.arrNum[i] = Integer.parseInt(scan.nextLine());

			} catch (Exception e) {
				i--;													//계속 반복, for문으로 -1 하여 만족하여 for문이 실행된다
				System.out.println("다른 문자를 입력 하셨네요!!!");
			}

		}

	}
}
