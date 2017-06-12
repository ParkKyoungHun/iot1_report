package report.ChaSungwoo.r0002;

public class ArrayExam {
	public void printMultipleTable(int[] a, int[]b){
		for(int x=0; x<a.length; x++){
		    for(int y=0; y<b.length-1; y++){
				System.out.print(a[x] + "X" + b[y] + "=" + (a[x]*b[y]) + " ");

			}
		    System.out.println(a[x] + "X"+ b.length + "=" + (a[x]*b.length));
		}
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = {1,2,3,4,5,6,7,8,9};
		
		ArrayExam ae = new ArrayExam();
		ae.printMultipleTable(a,b);
		//System.out.println("a의 길이 = " + a.length);
		//System.out.println("b의 길이 = " + b.length);
		
	}

}
