package report.kimmyunghwan.r0003;

public class ArrayExam5_03 {

	// 자리수가 개인 인트형 배열변수 a를 선언
	// 총6번 반복하는 반복문에서
	// 아래에서 나오는 랜덤값을 배열변수 a에 0번째 방부터 차례로 입력

	// 45개 로또 번호 줌 중복 된 숫자 안나오게
	public static void main(String[] args) {

		int[] a = new int[6];
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			a[i] = random;

//			System.out.println((i + 1) + "번째 로또번호는: " + a[i]); //확인 하려고 출력

			for (int j = i + 1; j >= 0; j--) {
				if (j <6 && a[j] == a[i] &&  i != j) {
					j = 0;
					i--;

				}

			}
		}

		for (int i = 0; i <6; i++) {
			System.out.println((i + 1) + "번째 로또번호는: " + a[i]);
		}
	}

}
