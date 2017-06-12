package report.kimseunghun.r0002;

public class ArrayExam {

	public void printMultipleTable(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (c = 0; c < b.length - 1; c++) {
				System.out.print(a[i] + "X" + b[c] + "=" + (a[i] * b[c]) + " ");
			}
			System.out.println(a[i] + "X" + b[c] + "=" + (a[i] * b[c]));
		}
	}

	public static void main(String[] args) {
		// int[] a = new int[4];
		// int[] b = { 1, 2, 3, 4, 5 };
		// System.out.println("a의길이=" + a.length);
		// System.out.println("b의길이=" + b.length);
		// for (int i = 0; i <= (b.length - 1); i++) {
		// System.out.println("b의" + (i + 1) + "번째 방의 값=" + b[i]);
		// }
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayExam ae = new ArrayExam();
		ae.printMultipleTable(a, b);
	}
}
