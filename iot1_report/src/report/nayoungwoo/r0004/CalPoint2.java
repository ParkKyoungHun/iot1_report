package report.nayoungwoo.r0004;

import java.util.Scanner;

public class CalPoint2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result = 0;

		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요>");
			String input = sc.nextLine();
			num[i] = Integer.parseInt(input);
			result += num[i];
			System.out.println("<입력된 " + (i + 1) + "번째 학생의 점수> = " + num[i] + "\n------------------------------");
		}

		System.out.println("<학생들의 점수의 총점> = " + (result) + "\n<학생들의 점수의  평균> =" + (result / num.length));

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; i<num.length; j++) {
				int tmp;
				if (num[i] < num[j]) {

					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;

				}
			}
			
		}
	}
}