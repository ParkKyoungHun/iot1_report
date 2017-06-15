package report.kimjeongkyu.r0004;

public class Exam2 {
	
		
	//저장하지않는 바로 주는 void 함수
	public void printPlusResult(int a, int b){
		System.out.println("더한결과 값 : " + (a+b));
	}
	
	//return으로 저장해서 처리하는 함수
	public int getPlusResult(int a, int b){
		return a +b;
	}
	
	public static void main(String[] args){
		Exam2 e = new Exam2();
		e.printPlusResult(1, 3);
		
		// 아래_ result로 = 이렇게하면 return값이 result값으로 저장됨
		int result = e.getPlusResult(1,3);
		System.out.println("더한결과 값 : " + result);
	}
}
