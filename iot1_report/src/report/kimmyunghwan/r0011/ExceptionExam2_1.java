package report.kimmyunghwan.r0011;

import java.util.Scanner;

//강사님 코드
public class ExceptionExam2_1 {

	int result;
	int[] arrNum = new int[10];

	public static void main(String[] args) {
		ExceptionExam2_1 ex2 = new ExceptionExam2_1();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < ex2.arrNum.length; i++) {

			try {

				System.out.println("숫자를 입력해주세요~~");

				ex2.arrNum[i] = Integer.parseInt(scan.nextLine());

				System.out.println("입력하신 숫자는 ==> " + ex2.arrNum[i]);

			} catch (Exception e) {
				System.out.println("다른 문자를 입력 하셨네요!!!");
				i--;
			}

		}

	}
}
