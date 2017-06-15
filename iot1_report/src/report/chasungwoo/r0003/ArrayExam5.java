package report.chasungwoo.r0003;

public class ArrayExam5 {

	public static void main(String[] args){

		int[] a = new int[6];

		for(int i=0; i<6; i++){

			a[i] = (int)(Math.random()*45)+1;

			for(int j=0; j<i; j++){ 
				if(a[i] == a[j]){
					i--;
				}	
			}			
		}
		for(int k=0; k<6; k++){
			System.out.print(a[k] + " ");
		}
	}
}

