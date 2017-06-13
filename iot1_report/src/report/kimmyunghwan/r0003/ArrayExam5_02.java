package report.kimmyunghwan.r0003;

public class ArrayExam5_02 {
//강사님 코드 a[0] =10 방부터 10개의 방
	public static void main(String[] args) {

		int[] a = new int[10]; 
		
		for(int i=1; i<=10; i++){
			a[i-1] = 11-i; //인덱스는0 값은 10이 되어야하니 
			
			System.out.println(a[i-1]);
		}	
		
	}

}
