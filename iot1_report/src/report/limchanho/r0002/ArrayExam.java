package report.limchanho.r0002;

public class ArrayExam {

	public void printMultipleTable(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(a[i] + "X" + b[j] + "=" + a[i] * b[i] + ",");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayExam ae = new ArrayExam();
		ae.printMultipleTable(a, b);

		// System.out.println("a?�� 길이 = " + a.length);
		// System.out.println("b?�� 길이 = " + a.length);
		// System.out.println("b?�� 첫번�? 방의 �? = " + b[0]);

		// for (int i = 0; i < b.length; i++) {
		// System.out.println("b?�� " + i + "번째 방의 �? = " + b[i]);
		// }
	}

}
