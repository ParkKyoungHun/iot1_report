package report.nayoungwoo.r0006;

public class Exam3 {

	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i =0; i<a.length;i++) {
			
			a[i] = (i+1) *10;
		}
		for(int i =0; i <5; i++) {
			if(a[i] == 30) {
				System.out.println("30이란 값을 가지고 있는 방의 index = " + i);
			}
		}
		
	}
}
