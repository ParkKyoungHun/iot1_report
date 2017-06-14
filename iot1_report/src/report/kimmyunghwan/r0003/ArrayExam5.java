package report.kimmyunghwan.r0003;

public class ArrayExam5 {

	public static void main(String[] args) {
		// 2차 배열
		int[][] a = new int[5][2]; // 5층짜리 아파트에서 2개동
		int[] f0 = {1,2}; //1층 1,2 값으로 초기화
		
		int[] f1 = new int[2];	//방2개
		int[] f2 = new int[2];
		int[] f3 = new int[2];
		int[] f4 = new int[2];
		
		a[0] = f0;
		
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
	
	
	}

}
