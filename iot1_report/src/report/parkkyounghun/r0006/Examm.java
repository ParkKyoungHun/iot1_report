package report.parkkyounghun.r0006;

public class Examm {

	int getInt() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i == 1) {
				return i;

			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Examm e = new Examm();
		e.getInt();
	}

}
