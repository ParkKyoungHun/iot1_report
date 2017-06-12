package report.kimmyunghwan.r0002;

public class ArrayExam_03 {

	public void printMultipleTable(int[] a, int[] b) {

		for (int i=0; i < a.length; i++) {
			for (int j=0; j < b.length; j++) {
				System.out.print(a[i]+"X"+ b[j] + "=" + (b[j]*a[i])+",");
		
//		for (int i = 0; i < a.length; i++) {
//			int num =1;
//			System.out.println(num+"X"+ a[i]+"="+(num*b[i])+","); 1 구구단
//		}
		
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayExam_03 ae = new ArrayExam_03();
		ae.printMultipleTable(a, b);
		
	}

}
