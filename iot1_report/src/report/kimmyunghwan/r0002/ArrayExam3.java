package report.kimmyunghwan.r0002;

public class ArrayExam3 {

	public int[] getArrayVar(int initNum, int maxNum) {

		// int initNum으로 시작해서 maxNum 종료되는 반복문을 사용하여
		// 배열변수 a 값을 집어놓고 배열변수 a를 출력해주시면 됩니다.
		// 출력은 main 함수에서 출력해주세요.

		int[] a = new int[maxNum - initNum]; // 데이타 타입 선언, a라는 변수를 만드는데 int[3]
														// 3개의 방을 만듬(int[] a = ae3.getArrayVar(2, 5);일때)
		for (int i = initNum - initNum; i < maxNum - initNum; i++) { // max 값이
																		// 4일때까지
			a[i] = i + 1; // a[0] =0+1; a[1] =1+1....
		}

		return a; // 배열변수는 무조건 리턴이 있어야 에러 안남.
	}

	public static void main(String[] args) {

		ArrayExam3 ae3 = new ArrayExam3();
		// int[] a = ae3.getArrayVar(2, 5); //방개수 3개
		int[] a = ae3.getArrayVar(0, 5); // 방개수 5개
		// System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]); // or System.out.println(a[a.length]);
		}
	}

}
