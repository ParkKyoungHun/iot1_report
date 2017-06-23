package report.limchanho.r0008;

import java.util.Scanner;

public class Father {
	// 아빠 클래스에서 배열변수를 선언하시고 10명의 학생의 점수를 입력받아주세요.
	// 단 배열변수의 데이터 타입은 int형이여야 합니다.
	// 출력함수는 아빠 클래스에서 선언해주시고
	// 호출만 아들 클래스에서 해주시기 바랍니다.

	int a = 3;
	Scanner scan;

	int initNum, maxNum;
	int[] arr = new int[10];

	Father() {
		scan = new Scanner(System.in);
		System.out.println("기본 아빠 생성자 호출!!!");
		inputFormScanner1();
		printWithLoop();
	}

	void inputFormScanner1() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요.");
			//String input = scan.nextLine();
			arr[i] = Integer.parseInt(scan.nextLine());
		}
	}

	void printWithLoop() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요.");
			System.out.println(arr[i]);
		}
	}

}
