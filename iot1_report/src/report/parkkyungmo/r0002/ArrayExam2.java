package report.parkkyungmo.r0002;

public class ArrayExam2 {

	public static void main(String[] args){
		
		int[] a= new int [6];
		
		for(int i=0;i<a.length;i++){
			a[i]=(i+1);
		}
		System.out.println("a�� ù��° ��:"+a[0]);
		System.out.println("a�� ������ ��:"+a[a.length-1]);
	}
}
