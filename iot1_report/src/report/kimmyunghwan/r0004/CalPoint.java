package report.kimmyunghwan.r0004;

import java.util.Scanner;

public class CalPoint {

	// Scanner클래스를 사용하여 6명의 학생의 점수를 직접 입력 받아주세요.
	// 6명의 학생의 총점을 출력해주세요.

  int sum;

	public void plus(int num1, int num2, int num3, int num4, int num5, int num6) {
		sum = num1 + num2 + num3 + num4 + num5 + num6;
		System.out.print(sum);
	}

	public static void main(String[] args) {

		CalPoint cp = new CalPoint();

		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력해주세요 : ");

		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		System.out.println("1번째 학생 점수: " + num1);

		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		System.out.println("2번째 학생 점수: " + num2);

		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		System.out.println("3번째 학생 점수: " + num3);

		String input4 = scanner.nextLine();
		int num4 = Integer.parseInt(input4);
		System.out.println("4번째 학생 점수: " + num4);

		String input5 = scanner.nextLine();
		int num5 = Integer.parseInt(input5);
		System.out.println("5번째 학생 점수: " + num5);

		String input6 = scanner.nextLine();
		int num6 = Integer.parseInt(input6);
		System.out.println("6번째 학생 점수: " + num6);
		
		
		cp.plus(num1, num2, num3, num4, num5, num6);
		
	}

}
