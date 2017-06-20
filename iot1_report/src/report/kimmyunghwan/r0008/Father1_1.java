package report.kimmyunghwan.r0008;

import java.util.Scanner;

public class Father1_1 {
	int a = 3;
	Scanner scan;
	String str1, str2;
	int num1, num2;
	int result = 0;

	Father1_1() {
		scan = new Scanner(System.in);
		System.out.println("아빠 기본생성자 호출!!");
	}

	void inputFormScanner1() {
			System.out.println("초기 값을 입력해 주세요 ==> ");

			str1 = scan.nextLine();
			num1 = Integer.parseInt(str1);

		}

	void inputFormScanner2() {
			System.out.println("맥스 값을 입력해 주세요 ==> ");

			str2 = scan.nextLine();
			num2 = Integer.parseInt(str2);
	}

	void printResult() {
			
		for(int i=num1; i<=num2; i++){
			result += i;
			
		}
		System.out.println("초기값 + 맥스값 : " + result +"입니다");
	}
}


