package report.leekihyun.r0004;

public class Exam2 {

	public void printPlusResult(int a, int b) {
		System.out.println("더한 결과값 : " + (a + b));
	}

	public int getPlusResult(int a, int b) {
		return  a + b;
		
	}

	public static void main(String[] args){
		
		Exam2 e = new Exam2();
		e.printPlusResult(1,3);
		
		int result = e.getPlusResult(1,3);
		System.out.println("더한 결과값 :" + result);
	}
}
