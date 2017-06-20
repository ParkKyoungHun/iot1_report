package report.nayoungwoo.r0007;

import java.util.Scanner;

/*Scanner 클래스의 nextLine(함수를 사용하여 초기값과 맥스값을 입력받아주세요
 * 위에서 입력받은 초기값부터 맥스값까지 반복하는 반복문을 작성해주세요 
 * 스트링 배열변수를 선언해주세요 - clear 
 * 해당 배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지 않습니다
 * 스트링 배열변수에 0번째 인덱스부터 마지막 방의 인덱스 까지 값을 받아주세요 
 * 다음 반복문에서 스트링 배열변수가 가진 모든 방의 값을 출력해주세요 
 * */
public class ArrExam2 {

	public static void main(String[] args) {
		ArrExam2 arr = new ArrExam2();
		Scanner scan = new Scanner(System.in);

		System.out.println("초기값을 입력해주세요>");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);

		System.out.println("맥스값을 입력해주세요>");
		String input2 = scan.nextLine();
		int num1 = Integer.parseInt(input2);

		String[] st = new String[num1];

		for (int i = num; i < st.length + 1; i++) {
			num = i - 1;
			System.out.print(num + ", ");
		}

	}
}