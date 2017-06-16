package report.kimmyunghwan.r0005;

public class Exam2_01 {

	public static void main(String[] args) {
		// 0부터 4까지 반복하는 반복문을 작성하여
		// Cal(int a)라고 선언된 생성자를 호출하여 1부터 5까지 출력을 해보시기 바랍니다.
		Cal_02[] c = new Cal_02[5]; //Cal_02 코딩 22번째 줄에서 int a를 호출

		for (int i = 0; i <= 4; i++) {
			c[i] = new Cal_02(i+1);
		}

	}

}
