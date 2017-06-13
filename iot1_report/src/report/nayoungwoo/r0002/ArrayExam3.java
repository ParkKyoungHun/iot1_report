package report.nayoungwoo.r0002;

public class ArrayExam3 {

	public int[] getArrayVar(int initNum, int maxNum) {

		int[] a = new int[maxNum-initNum];

		for (int i = initNum-initNum; i < maxNum-initNum; i++) {

			a[i] = i + 1;

		}

		return a;
	}
	
	public void printArrayVar(int[] a) {		
		
		for (int i =a.length-1; i >= 0 ; i--) {
			
			System.out.println("a 의 "  + i + "번째 방의 값 = " +a[i]);

		}
		
	}

	public static void main(String[] args) {

		ArrayExam3 a1 = new ArrayExam3();
		int[] a = a1.getArrayVar(0, 5);
		a1.printArrayVar(a);

	}
}

// 메인 출력
