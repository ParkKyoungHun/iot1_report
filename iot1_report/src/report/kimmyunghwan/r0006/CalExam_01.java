package report.kimmyunghwan.r0006;

import java.util.Scanner;

public class CalExam_01 {
	// 반복문을 사용하여 Scanner클래스를 이용해
	// 총 10명의 학생의 점수를 받아주세요.
	// 10명의 학생의 총점과 평균을 구해주세요

	public static void main(String[] args) {

		int sum = 0;
		int[] num = new int[10];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요~~!!");
			String input = scan.nextLine();
			num[i] = Integer.parseInt(input);

			// num[i] = Integer.parseInt(scan.nextLine());

			sum += num[i];
		}
		System.out.println("입력하신 점수 총합은 : " + sum);
		System.out.println("입력하신 점수 평균은 : " + (sum / 10));
		
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
			for (int i = 0; i < 10; i++) {
				System.out.print((i+1) + "등=" + num[i]);
				System.out.println("입력하신 " + (i + 1) + " 번째 학생의 점수=" + num[i]); //????확인 필요
			}
		}
	}


