package report.parkjonghun.r0003;

public class ArrayExam6 {//강사님 파일 보고 다시 공부하기 (로또 포함.)1
	
	public int[] getArrVar(int length, int initNum, int maxNum){
		int[] a = new int[length];
		
		for(int i=initNum; i<=maxNum; i++){
			a[i] = (i+1)*2;	
		}
		return a;
		
	}
	public void printArrVar(int[] a){
		for(int i=1; i<=10; i++){
			System.out.println(a[i-1]);
		}
	}
	
	public static void main(String[] args){
		ArrayExam6 ae = new ArrayExam6();
		int[] a = ae.getArrVar(10,0,9);
		//int ran = (int)(Math.random()*5)+1;
		ae.printArrVar(a);
		
		
	}

}
