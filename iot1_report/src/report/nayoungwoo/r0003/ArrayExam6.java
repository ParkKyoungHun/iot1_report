package report.nayoungwoo.r0003;

public class ArrayExam6 {

	public int[] Test3(int[] params) {

		int[] a = new int[params[0]];
		for (int i = params[1]; i <= params[2]; i++) {

			a[i] = (i + 1) * 2;
		}

		return a;
	}

	public void printArrVar(int[] a) {

		for (int i = 1; i <= a.length; i++) {

			System.out.println(a[i - 1]);

		}
	}

	public static void main(String args[]) {
		ArrayExam6 a6 = new ArrayExam6();
		int[] params = {10, 0, 9};
		int[] a = a6.Test3(params);
		a6.printArrVar(a);

	}
}