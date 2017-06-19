package report.nayoungwoo.r0006;

import java.util.Scanner;

public class CalExam {

	int grade(int[] arr, int num) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {

				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result = 0;

		int[] num = new int[3];
		int[] num1 = new int[3];

		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요>");
			String input = sc.nextLine();
			num[i] = Integer.parseInt(input);
			num1[i] = Integer.parseInt(input);
		}

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {
				if (j < num.length && num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;

				}
			}
		}
		CalExam c = new CalExam();
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "등 = " + num[i]);
			System.out.println(", " + c.grade(num1, num[i]) + "번째 입력한 학생");
		}
	}

}
