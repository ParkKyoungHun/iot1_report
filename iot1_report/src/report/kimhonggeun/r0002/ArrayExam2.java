package report.kimhonggeun.r0002;

public class ArrayExam2 {

	public static void main(String[]args){
		int[] a = new int[9];
		
		for(int i=0;i<a.length;i++){
			a[i]=(i+1);
		}
		
		System.out.println("a의 첫번째값 : " + a[0]);
		System.out.println("a의 마지막값 : " + a[a.length-1]);
	}
}
