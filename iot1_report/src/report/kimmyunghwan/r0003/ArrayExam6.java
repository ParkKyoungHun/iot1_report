package report.kimmyunghwan.r0003;

public class ArrayExam6 {

	public int[] getArrVar(int length, int initNum, int maxNum) {
		int[] a = new int[length]; // 인트형a로 넘길려면 리턴 필요 // 위에 void로 선언하면 리턴이
									// 필요없다.
		for (int i = initNum; i <= maxNum; i++) {
			// for (int i = params[1]; i <= params[2]; i++) { (2)  (1)두 문자과 함께 적용 가능

			a[i] = (i + 1) * 2; 						// 1. 위에서 받은 값을 계산 a[0] = (0+1) *2 == a[0] = 2
		}
		return a; 									// 2. a 값 2를 메인 메소드(3번)로 보낸다.
	}

	public void printArrVar(int[] a) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a[i - 1]); 		// 4. a[0] 방부터 a[9] 번 방까지 프린터 a[1-1] == a[0] 값을 출력하라
		}
	}

	public static void main(String[] args) {
		ArrayExam6 ae = new ArrayExam6();
		int[] a = ae.getArrVar(10, 0, 9); // (1)
		// int[] params = {10,0,9};
		// int[] a =ae.getArrVar(params); (1)과 동일, params는 int가 늘어나는 조건으로 적용가능
		ae.printArrVar(a); 						// 3. 2번에서 보내온 값 2를 받아 4번으로 넘긴다.

	}

}
