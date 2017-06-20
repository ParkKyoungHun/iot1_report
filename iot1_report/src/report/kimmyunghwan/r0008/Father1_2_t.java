package report.kimmyunghwan.r0008;

import java.util.Scanner;

public class Father1_2_t {
	int a = 3;
	Scanner scan;
	String str1, str2;
	int num1, num2;

	Father1_2_t() {
		scan = new Scanner(System.in);
		System.out.println("아빠 기본생성자 호출!!");
		inputFormScanner1();
		inputFormScanner2();
		castStringToInt();
	}

	void castStringToInt() {
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
	}

	void inputFormScanner1() {
		System.out.println("초기 값을 입력해 주세요 ==> ");

		str1 = scan.nextLine();

	}

	void inputFormScanner2() {
		System.out.println("맥스 값을 입력해 주세요 ==> ");

		str2 = scan.nextLine();

	}

	void printIWithLoop() {

		for (int i = num1; i <= num2; i++) {

			System.out.println(i);
		}

	}
}
