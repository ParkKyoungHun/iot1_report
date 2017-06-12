package report.kimmyunghwan.r0002;

public class Test_01 {

	public static void main(String[] args) {

		// System.out.println("1*1="+1);
		// System.out.println(a+ "X" + b + "=" + (a*b));

		for (int i = 1; i <= 9; i++) {
			int a=1;
			for (a = 1; a <= 8; a++) {
				System.out.print(i + "X" + a + "=" + (i * a) + ",");

			}
			System.out.println(i + "X" + a + "=" + (i * a));
		}
	}

}
