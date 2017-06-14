package report.chasungwoo.r0003;

public class ArrayExam4 {
	
	
	
	public static void main(String[] args){
		
		int[] a = new int [10];
		for(int r=9; r>=0; r--){
			
			//System.out.print(r*2 + ",");
			a[r] = 20-r*2;
		}
		
		for(int k=0; k<10; k++){
			System.out.print(a[k]);
		}
		
	}

}
