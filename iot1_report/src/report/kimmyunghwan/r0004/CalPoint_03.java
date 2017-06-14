package report.kimmyunghwan.r0004;

import java.util.Scanner;

// 평균을 구하고 오름차순으로
public class CalPoint_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int result = 0;
		int[] num = new int[5]; // int[5] == int{1,2,3,4,5}

		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요 ==> ");

			String input = scanner.nextLine();
			num[i] = Integer.parseInt(input);
			result += num[i];
		}
		System.out.println("입력하신 5 학생의 총점=" + (result));

		System.out.println("입력하신 5 학생의 평균=" + (result / num.length));

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				// int temp= 0;
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);

	}

}
