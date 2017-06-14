package report.limchanho.r0002;

public class Test {
	public void printMultipleTable(int initNum, int maxNum) {
		int a = 1;
		for (int i = initNum; i <= maxNum; i++) {

			for (a = initNum; a <= maxNum - 1; a++) {

				System.out.print(i + "x" + a + "=" + (i * a) + ",");
			}
			System.out.println(i + "x" + a + "=" + (i * a));
		}

	}

	public static void main(String[] args) {

		Test t = new Test();
		t.printMultipleTable(1, 5);

	}// main
}// Test
