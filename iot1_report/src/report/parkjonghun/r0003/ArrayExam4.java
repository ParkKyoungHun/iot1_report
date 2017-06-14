package report.parkjonghun.r0003;

public class ArrayExam4 {
	// 메인 메소드
	// 반복문 1부터 10까지 2의 배수로 출력
	// 2,4,6,8,10,12

	// int 배열변수를 선언해주시고 자리수는 10개짜리로 만들기
	// 포문에서 각각의 index에 2의 배수의 값을 넣어주세요.

	public static void main(String[] args) {
		int[] a = new int[10]; // 배열 변수

		for (int i = 1; i <= 10; i++) {
			a[i-1] = (2 * i); // a[i-1]을 해야 인덱스 0부터 값을 줄 수 있음.
			// System.out.println((a[i-1]));
		}
		for (int i = 0; i < 10; i++) {
			 //System.out.println(a[i]);
		}

		for (int i = 1; i < 10; i++) {
			
			a[10-i] = (2 * i);

			System.out.println(a[10-i]);

		}

	}

}
