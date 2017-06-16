package report.nayoungwoo.r0004;

public class Exam2 {

	public static void main(String[] args) {
		
		int []a = new int[5];
		
		for(int i =0; i <5;i++) {
			
			a[i] = i+1;
		}
		
		for(int i=0;i<5;i++) {
		// a[0] = 1 , a[1] = 2
			
			System.out.print("a[" + i + "]= " + a[i] + ", ");
		}
	}
}
