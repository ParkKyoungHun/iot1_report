package report.kimjeongkyu.r0003;

public class ArrayExam6 {

	
	public int[] getArrVar(int[] params){
		int[] a = new int[params[0]];
		for(int i =params[1]; i<=params[2]; i++){
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
		ArrayExam6 ae6 = new ArrayExam6();
		int[] params = {10, 0 ,9};
		int[] a = ae6.getArrVar(params);
		ae6.printArrVar(a);
	}
}	

/*
	public void formula(int initNum, int maxNum){
		int[] a = new int[10];
		for(int i =initNum; i<=maxNum; i++){
			a[10-i] = i*2;
		}
		for(int i=initNum; i<=maxNum; i++){
		System.out.println(a[i-1]);
		}
	
	}
	
	public static void main(String[] args){
		ArrayExam6 ae6 = new ArrayExam6();
		ae6.formula(3,8);
		
		System.out.println("�Ʒ��� �ζ��Լ� �ҷ��°��Դϴ�");
		ArrayExam5 ae5 = new ArrayExam5();
		ae5.lotto();
	}
}	

*/