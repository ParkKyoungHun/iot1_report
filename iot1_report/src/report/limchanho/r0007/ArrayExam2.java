package report.limchanho.r0007;

import java.util.Scanner;

public class ArrayExam2 {
	// Scanner클래스의 nextLine()함수를 사용하여 초기값과 맥스값을 입력받아 주세요.
	// 위에서 받은 초기값부터 맥스값 까지 반복하는 반복문을 작성해주세요.
	// 스트링 배역변수를 선언해주세요.
	// 해당배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지 않습니다.
	// 해당반복문에서 Scanner 클래스의 nextLine()함수를 사용 하여 위에서 선언한
	// 스트링 배열변수에 0번째 인덱스부터 마지막 방의 인덱스까지 값을 받아주세요.
	// 다음 반복문에서 스트링배열변수가 가진 모든방의값을 출력해주세요.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("초기값을 입력해 주세요.");
		String inStr1 = scan.nextLine();
		int num1 = Integer.parseInt(inStr1);

		System.out.print("맥스값을 입력해 주세요.");
		String inStr2 = scan.nextLine();
		int num2 = Integer.parseInt(inStr2);

		String[] a = new String[(num2 - num1) + 1];

		for (int i = num1; i <= num2; i++) {
			
			a[i - num1] = scan.nextLine();

		}

		for (int i = 0; i < a.length; i++) { // a.lenth 방의 개수!
			System.out.print(a + ",");

		}

	}

}
