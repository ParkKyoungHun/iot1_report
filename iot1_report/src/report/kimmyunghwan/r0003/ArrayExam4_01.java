package report.kimmyunghwan.r0003;

public class ArrayExam4_01 {

	// 메인메소드
	// 포문 1부터 10까지
	// 2의 배수가 10개가 찍히게 만들어 주세요.

	// 2,4,6,8,10,,,,,20

	// int 배열변수를 선언해주시고 자리수는 10개짜리로 만들어주세요
	// 포문에서 각각의 index에 2의 배수의 값을 넣어주세요.

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 1; i <= 10; i++) {
			a[i-1] = i*2; // 첫번째 방의 값은 인덱스-1 값은 0 이고  2의 배수 값을 넣어준다
			System.out.print(a[i-1]+",");

		}

	}

}
