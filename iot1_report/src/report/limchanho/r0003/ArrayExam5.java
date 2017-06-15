package report.limchanho.r0003;

public class ArrayExam5 {
	int[] a = new int[6];

	public void Array1() {

		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;

			a[i] = random;

			// System.out.println((i + 1) + "번째 값 =" + a[i]);
			for (int j = i + 1; j >= 0; j--) {
				j = 0;
				j--;
			}

		}

	}

	public void Array2() {
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 값 =" + a[i]);
		}

	}

	public static void main(String[] args) {

		ArrayExam5 ae5 = new ArrayExam5();
		ae5.Array1();
		ae5.Array2();

	}
}
