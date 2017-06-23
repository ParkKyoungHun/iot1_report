package report.limchanho.r0002;

public class Rotto {

	public static void main(String[] args) {
		int[] a = new int[6];
		int random = (int) (Math.random() * 45) + 1;
		
		for (int i = 0; i < 6; i++) {
			a[i] = random;

			for (int j = i; j >= 0; i--) {
				if (a[i] == random) {
					i--;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 로또번호는 : " + a[i]);
		}
	}

}
