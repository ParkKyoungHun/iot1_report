package report.nayoungwoo.r0002;

public class ArrayExam {

	public void printMultipleTable(int[] a, int[] b) {

		for (int j = 0; j < b.length; j++) {

			int i = 0;

			for (i = 0; i < (a.length - 1); i++) {

				System.out.print(b[j] + " x " + a[i] + " = " + a[i] * b[j] + ", ");

			}
			System.out.println(b[j] + " x " + a[i] + " = " + a[i] * b[j]);
			System.out.println();

		}
	}

	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		ArrayExam a1 = new ArrayExam();
		a1.printMultipleTable(a, b);

	}

}
