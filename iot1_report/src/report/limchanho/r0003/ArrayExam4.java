package report.limchanho.r0003;

public class ArrayExam4 {

	// 메인메소드
	// 반복문 1부터 10까지
	// 2의 배수가 10개가 찍히게 만들어 주세요.
	// 100개의 자리수를 가지고 있는 인트형 배열변수를 만들어 주세요.
	// 위에 작성 포문에서 배열변수에 값을 넣어주시는데 2의 배수가 들어가게 만들어주세요.
	// 2,4,6,8,10,12
	// 포문에서 각각의 index에 2의 배수의 값을 넣어주세요.
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i <= 9; i++) {
			a[i] = 20-(i*2);
			//a[9-i] = (i+1)*2;
			// System.out.print(a[i-1]+",");
		}

		for (int i = 0; i <= 9; i++) {
			System.out.println("배열 a의 "+i+"번째 방의 값은=" +a[i]);

		}

	}

}