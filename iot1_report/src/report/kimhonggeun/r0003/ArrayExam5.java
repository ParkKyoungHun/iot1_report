package report.kimhonggeun.r0003;

public class ArrayExam5 {

	public static void main(String[]args){
//		int[] a= new int[10];
		
//		for(int i=1;i<=10;i++){
//			a[i-1]=(11-i);
//			System.out.print(a[i-1]+ " , ");
		
//		for(int i=0;i<10;i++){
//			a[i]=10-i;
		int[] a= new int[6];

	
		for(int i=0;i<=5;i++){
			int random = (int)(Math.random()*45)+1;
			a[i]=random;
				
			for(int j=0;j<i;j++){
				if(a[i]==a[j]){
					i--;
				}
		}
								
		}
		for(int k=0;k<6;k++){
			System.out.println(a[k]);
		}
		
	}
}
