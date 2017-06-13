package report.kimmyunghwan.r0002;

public class ArrayExam3_01 {

	// 1부터 10까지 찍으려면 1로 초기값
	
	public int[] getArrayVar(int initNum, int maxNum) {

		int[] a = new int[maxNum - initNum];
		for (int i = initNum - initNum; i < maxNum - initNum; i++) {
			a[i] = i + 1;
		}

		return a;
	}

	public void printArrayVar(int[] a) {
		// int[] a = new int[3]; // 인트형을 가지고 있는 배열변수를 초기화 주석처리, 위에 int[] a 적어줌

		for (int i = a.length-1; i >= 0; i--) {
			System.out.println("a의" + i + "번째 방의 값 =" + a[i]);
		}
	}

	public static void main(String[] args) {

		ArrayExam3_01 ae3 = new ArrayExam3_01();
		int[] a = ae3.getArrayVar(0, 5);
		ae3.printArrayVar(a);

	}

}
