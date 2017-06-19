package report.imhyejin.r0006;

public class Test {

	public static void main(String[] args) {


		long sum = 0;
		long mul = 1;
		
		
		for (int j = 0; j <= 10; j++) {
			mul *= 10;
			sum += mul;
			System.out.println(sum);
		}
		
	}
}
