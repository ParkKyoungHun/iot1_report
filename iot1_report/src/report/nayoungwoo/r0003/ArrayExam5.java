package report.nayoungwoo.r0003;

public class ArrayExam5 {

	public static void main(String args[]) {

		int[] a = new int[6];
		
		for (int i = 0; i <a.length; i++) {

			int random = (int) (Math.random() * 45) + 1;
			a[i] = random;
			
			for (int j= i; j >=0;j--) {
				if(a[j] ==  a[i] && i!=j){
					j=0;
					i--;
				}
			}
		}
		for (int i =0; i< a.length; i++) {
			System.out.println((i + 1) + "번째 로또번호 = " + a[i]);
			
		}
	}

}
