package report.kimhonggeun.r0002;

public class ArrayExam3 {

	public int[] getArrayVar(int initNum, int maxNum){
		int[] a = new int[maxNum-initNum+1];
		for(int i=initNum-initNum;i<=maxNum-initNum;i++){
			a[i]=i+initNum;
		}
		return a;
	}
	public void getArrayVar(int[] a){
		
		for(int j=a.length-1;j>=0;j--){

			System.out.println("a의" + j + "번째 방의 값 = " + a[j]);
		}
	}
	
	public static void main(String[]args){
		
		ArrayExam3 ae = new ArrayExam3();
		int[] a = ae.getArrayVar(4, 9);
		ae.getArrayVar(a);
	}
}
