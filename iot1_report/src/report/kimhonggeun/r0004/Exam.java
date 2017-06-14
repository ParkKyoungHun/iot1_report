package report.kimhonggeun.r0004;

public class Exam {

	
	public void printPlusResult(int a, int b){
		System.out.println("더한결과값 : " + (a+b));
	}
	
	public int getPlusResult(int a, int b){
		return a+b;
	}
	
	public static void main(String[]args){
		Exam e1 = new Exam();
		e1.printPlusResult(1, 3);
		int result = e1.getPlusResult(1, 3);
		System.out.println("더한결과값 : " + result);
		
	}
}
