package report.chasungwoo.r0004;

public class Exam2 {
	public static void main(String[] args){
		int[] a = new int[5];
		for(int i=0; i<5; i++){
			a[i] = i+1;
		}
		System.out.print("결과값은 ");
		for(int i=0; i<5; i++){
			System.out.print("a[" + i + "]은(는)" + a[i] +" ");
		}

	}

}
