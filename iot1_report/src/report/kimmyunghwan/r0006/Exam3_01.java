package report.kimmyunghwan.r0006;

public class Exam3_01 {

	// Exam3 클래스를 함수를 넣어 변환한 클래스 다시 예제

	int getIndexFromArray(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;								// 조건에 만족하면 끝낸다.
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = new int[5]; 					// (1) 방[인덱스] 갯수

		for (int i = 0; i < 5; i++) {				// (2) 방[인덱스]의 값을 위한 for문
			a[i] = (i + 1) * 10;					//a[0]=10, a[1]=20,
		}												//a[2]=30, a[3]=40, a[4]=50

		// for(int i=0; i<5; i++){
		// System.out.println(a[i]);
		// }

		// for(int i=0; i<5; i++){
		// if(a[i]==30){
		// System.out.println("30이란 값을 가지고 있는 방의 index="+i);
		// }
		Exam3_01 e3 = new Exam3_01();		
		int idx = e3.getIndexFromArray(a, 30);
		System.out.println("30이란 값을 가지고 있는 방의 index=" + idx);
	}

}
