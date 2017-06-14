package report.kimjeongkyu.r0002;

public class ArrayExam {

	public void printMultipleTable(int[] a, int[] b){
		
		for(int i = a[0];  i<=a.length; i++){
			for(int j=b[0]; j<=b.length; j++){
				System.out.print(a[i-1]+"X"+b[j-1] + "=" + a[i-1]*b[j-1] + ", ");	
				}			
				System.out.println();	
			}
	}
	
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b=  {1,2,3,4,5,6,7,8,9};
		
		ArrayExam ae = new ArrayExam();
		ae.printMultipleTable(a, b);
		
		}
	}
