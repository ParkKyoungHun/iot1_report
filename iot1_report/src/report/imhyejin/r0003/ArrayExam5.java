package report.imhyejin.r0003;

public class ArrayExam5 {

	// 재귀호출

	public static void main(String[] args) {

		// int[][] ap = new int[5][2];
		// int[] f0= {1,2};
		// ap[0]=f0;

		// System.out.println("ap[0]의 값 : "+ap[0]);
		// System.out.println("ap[0][0]의 값 : "+ap[0][0]);
		// System.out.println("ap[0][1]의 값 : "+ap[0][1]);

		// int[] a = new int[10];
		//
		// for (int i = 0; i < a.length; i++) {
		// a[i] = 10 - i;
		// System.out.println(a[i]);
		// }

		int[] a = new int[6];

		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			a[i] = random;
			System.out.println((i + 1) + "번째 번호는: " + a[i]);

			for (int j = i + 1; j >= 0; j--) {
				if (j > 7 && a[j] == a[i] && i != j) {
					// if (a[j] == a[i]) {
					j = 0;
					i--; // 무한루프의 늪
				}
			}
		}
	}

	// 실패

	// for (int i = 0; i < 6; i++) {
	// random = (int) (Math.random() * 45) + 1;
	//
	// for (int j = 0; j < 6; j++) {
	// if (a[j] != random) {
	// a[j] = random;
	// }else{
	// random = (int) (Math.random() * 45) + 1;
	// }
	// }
	//
	// a[i] = random;
	// System.out.print(a[i] + " ");
	// }

}
