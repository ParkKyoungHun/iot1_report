package report.kimmyunghwan.r0003;

public class ArrayExam4_03 {

	// 메인메소드
	// 포문 1부터 10까지
	// 2의 배수가 10개가 찍히게 만들어 주세요.

	// 20,,,,,,,10,8,6,4,2 거꾸로 출력
	// int배열변수를 선언해주시고 자리수는 10개짜리로 만들어주세요.
	// 포문에서 각각의 index에 2의 배수의 값을 넣어주세요.

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i =1; i<=10; i++) {
			a[10-i] = i * 2;
			System.out.println(a[10-i]);
		}
//		for (int i =1; i<=10; i++) {
//			System.out.println(a[10-i]);
//		}
	}

}
