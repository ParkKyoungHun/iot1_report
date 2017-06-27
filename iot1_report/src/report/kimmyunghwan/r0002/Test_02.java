package report.kimmyunghwan.r0002;

public class Test_02 {


	public void printMultipleTable(int initNum, int maxNum) {
		
		for (int i = initNum ; i <= maxNum; i++) {
			int a = 1;
			for (a = initNum ; a <= maxNum; a++) {
				System.out.print(i + "X" + a + "=" + (i * a) + ",");

			}
			System.out.println(i + "X" + a + "=" + (i * a));
		}
		
		
	}

	public static void main(String[] args) {

		// System.out.println("1*1="+1);
		// System.out.println(a+ "X" + b + "=" + (a*b));
		Test_02 t02 = new Test_02();

		t02.printMultipleTable(1, 5);

		
	}

}
