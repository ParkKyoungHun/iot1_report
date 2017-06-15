package report.limchanho.r0004;

import java.util.Scanner;

public class CalPoint { // Scanner클래스를 사용하여 6명 학생의 점수를 직접 입력 받아 주세요.
						// 6명의 학생의 총점을 출력해주세요.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1번째 학생의 점수를 입력해주세요.> ");
		String inStr1 = scan.nextLine();
		System.out.println("1번째 학생의 점수는 = " + inStr1 + "입니다.");

		System.out.print("2번째 학생의 점수를 입력해주세요.> ");
		String inStr2 = scan.nextLine();
		System.out.println("2번째 학생의 점수는 = " + inStr2 + "입니다.");

		System.out.print("3번째 학생의 점수를 입력해주세요.> ");
		String inStr3 = scan.nextLine();
		System.out.println("3번째 학생의 점수는 = " + inStr3 + "입니다.");

		System.out.print("4번째 학생의 점수를 입력해주세요.> ");
		String inStr4 = scan.nextLine();
		System.out.println("4번째 학생의 점수는 = " + inStr4 + "입니다.");

		System.out.print("5번째 학생의 점수를 입력해주세요.> ");
		String inStr5 = scan.nextLine();
		System.out.println("5번째 학생의 점수는 = " + inStr5 + "입니다.");

		System.out.print("6번째 학생의 점수를 입력해주세요.> ");
		String inStr6 = scan.nextLine();
		System.out.println("6번째 학생의 점수는 = " + inStr6 + "입니다.");

		int num1 = Integer.parseInt(inStr1);
		int num2 = Integer.parseInt(inStr2);
		int num3 = Integer.parseInt(inStr3);
		int num4 = Integer.parseInt(inStr4);
		int num5 = Integer.parseInt(inStr5);
		int num6 = Integer.parseInt(inStr6);

		int plus = (num1 + num2 + num3 + num4 + num5 + num6);

		System.out.println();
		System.out.println("학생 여섯명의 총점은 ? " + plus);

	}
}
