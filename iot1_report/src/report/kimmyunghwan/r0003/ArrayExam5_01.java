package report.kimmyunghwan.r0003;

public class ArrayExam5_01 {

	public static void main(String[] args) {

		int[] a = new int[10]; 
		
		for(int i=1, j=11; i<=10; i++, j--){
			a[i-1] =  j-1;
			
			System.out.println(a[i-1]);
		}	
		
	}

}
