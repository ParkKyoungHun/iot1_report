package report.nayoungwoo.r0003;

import java.util.Random;

public class Test {

	public static void main(String args[]) {
		
		new Random().ints(1,46)
							.distinct()
							.limit(6)
							.sorted()
							.forEach(System.out::println);
	}
}
