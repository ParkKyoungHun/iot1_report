package report.nayoungwoo.r0002;

public class Test {

	public void printMultiple(int initNum, int maxNum) {
		
		for (int i = initNum; i <= maxNum; i++) {
			
			int a = 1;
			
			for (a = initNum; a <= (maxNum-1); a++) {

				System.out.print(i + " X " + a + " = " + (i * a) + ",  ");

			}
				System.out.println(i + " X " + a + " = " + (i * a));
				System.out.println();
		}

	}

	public static void main(String args[]) {
		Test t1 = new Test();
		t1.printMultiple(1, 9);

	}
}
