package report.kimmyunghwan.r0005;

public class Exam_02 {

	public static void main(String[] args) {

		// Cal_02 c = new Cal_02(10, 1, "+");
		// c = new Cal_02(9, 2, "+");
		// c = new Cal_02(8, 3, "+");
		// c = new Cal_02(7, 4, "+");
		// c.printCal();
		Cal_02 c;
		for (int i = 1; i <= 10; i++) {
			c = new Cal_02(i, (11 - i), "+");
			c.printCal();

		}

	}
}
