package report.kimjeongkyu.r0002;

public class ArrayExam3 {

	public int[] getArrayVar(int initNum, int maxNum){
		//initNum?���? ?��?��?��?�� maxNum?���? 종료?��?�� 반복문을 ?��?��?��?��
		//배열�??�� a?�� 값을 집어?���?, 배열�??�� a�? 출력?��?��.
		// by the way, output might be from the main formula.
		int[] a= new int[maxNum-initNum];
		for(int i=initNum-initNum; i<maxNum-initNum; i++){
			a[i] = i+1;

		
	}
		return a;
	}
	public void printArrayVar(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.println("a?�� " + i + "번째 방의 �? = " + a[i]);
		}
	}
	
	public void printArrayVarReverse(int[] a){
		for(int i=a.length-1; i>=0; i--){
			System.out.println("a?�� " + i + "번째 방의 �? = " + a[i]);
		}
	}
	
	
	
	public static void main(String[] args){
		ArrayExam3 ae3 = new ArrayExam3();
		
		// a값을 구하�? ?��?�� ???��?��?�� getArrayVar �?
		int[]a = ae3.getArrayVar(0, 5);
		
		
		// getArrayVar?��?��?��?�� 처리?�� a값을 받아 printArrayVar?��?���?
		ae3.printArrayVar(a);
		System.out.println("-----------");
		ae3.printArrayVarReverse(a);
		}
	}
	

