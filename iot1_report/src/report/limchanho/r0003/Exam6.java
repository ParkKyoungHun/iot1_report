package report.limchanho.r0003;

public class Exam6 {

	public int[] getArrVar(int[] params) {
		int[] a = new int[params[0]];
		for (int i = params[1]; i <= params[2]; i++) {
			a[i] = (i + 1) * 2;
		}
		return a;
	}

	public void printArrayVar(int[] a) {
		for (int i = 1; i <= 10; i++) {

			System.out.println(a[i - 1]);
		}
	}

	public static void main(String[] args) {
		Exam6 e6 = new Exam6();
		int[] params = { 10, 0, 9 };
		int[] a = e6.getArrVar(params);
		e6.printArrayVar(a);

	}

}
