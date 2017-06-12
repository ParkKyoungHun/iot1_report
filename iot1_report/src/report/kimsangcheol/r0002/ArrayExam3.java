package report.kimsangcheol.r0002;

public class ArrayExam3 {

	public int[] getArrayVar(int initNum, int maxNum){
		int[] a = new int[maxNum-initNum+1];
		for(int i=initNum-initNum;i<=maxNum-initNum;i++){
			a[i] = i+initNum;
		}
		return a;
	}
	
	public void printArrayVar(int[]a){
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);	
		}
	}

	public static void main(String[] args){
		ArrayExam3 ae3 = new ArrayExam3();
		int[]a = ae3.getArrayVar(23,35);
		ae3.printArrayVar(a);

	}
}
