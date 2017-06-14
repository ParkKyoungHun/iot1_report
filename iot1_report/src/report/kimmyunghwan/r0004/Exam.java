package report.kimmyunghwan.r0004;

public class Exam {

	public void printPlusResult(int a, int b) {
		System.out.println("더한 결과값:" + (a + b));

	}

	public int getPlusResult(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		Exam e = new Exam(); //Exam으로 선언된 변수
		e.printPlusResult(1,3); //이걸 사용하기 위해서는 위에 변수 선언해야함
		
		int result = e.getPlusResult(1,3);
		System.out.println("더한 결과값:" + result);
	} 

}
