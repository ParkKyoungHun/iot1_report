package report.limchanho.r0004;

import java.util.Scanner;

public class Exam0 { // for문을 이용해서 스캔

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0;
		int result1 = 0;
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 학생의 점수를 입력해주세요> ");
			String inStr = scan.nextLine();

			num[i] = Integer.parseInt(inStr); // Integer.parseInt 는 숫자로된 문자열만
												// 받아준다

			result += num[i];
			result1 = result / num.length;
		}
		System.out.println("입력하신 5학생의 점수의 총점은 = " + result);
		System.out.println("입력하신 5학생의 점수의 평균은 = " + result1);

		for (int i = 0; i < num.length; i++) {
			System.out.println("입력하신" + (i + 1) + "번째 학생의 점수 = " + num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			int tmp;
			if (num[i]<num[i+1]){
				tmp = num[i];
				num[i]=num[i+1];
				num[i+1]=num[i+2];
				num[i+2]=tmp;
				
			}
			System.out.println(num[i]);

		}
	}
}
