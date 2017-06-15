package report.chasungwoo.r0003;

public class ArrayExam6 {

	public int[] eBroker(int size){
		int[] a = new int [size];
		for(int i=1; i<=size; i++){
			a[size-i] = i*2;
		}
		return a;
	}

	public void printer(int[] a){
		for(int i=1; i<=a.length; i++){
			System.out.println(a[i-1]);	
		}
	}

	public static void main(String[] args){
		ArrayExam6 ae6 = new ArrayExam6();
		int[] a = ae6.eBroker(10);
		ae6.printer(a);

	}
}
