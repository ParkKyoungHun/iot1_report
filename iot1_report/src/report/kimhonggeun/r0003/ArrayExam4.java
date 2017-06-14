package report.kimhonggeun.r0003;

public class ArrayExam4 {
	
	public static void main(String[]args){
		int[] a = new int[10];
		
		for(int i=1;i<=10;i++){
		
			a[i-1] = i*2;
			
		}
		for(int i=1;i<=10;i++){
			System.out.print(a[i-1] + " , ");
		}System.out.println();
		
		for(int i=9;i>=0;i--){
			System.out.print(a[i] + " , ");
		}System.out.println();
		
		for(int i=0;i<10;i++){
		a[i]=20-(i*2);
		System.out.print(a[i] + " , ");
		}System.out.println();
		
		
		for(int i=1;i<=10;i++){
		a[10-i]=i*2;
		System.out.print(a[i-1] + " , ");
		}
	}
}
