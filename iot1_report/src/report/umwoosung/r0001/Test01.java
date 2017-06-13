package report.umwoosung.r0001;

public class Test01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			int a = 1;
			for (a = 1; a <= 8; a++) {
				System.out.print(a + "X" + i + " = " + (i * a) + ",");
			}
			System.out.println(a + "X" + i + " = " + (i * a));
		}

	}

}
// i=1
// a=