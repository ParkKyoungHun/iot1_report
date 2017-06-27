package report.nayoungwoo.r0011;

import report.nayoungwoo.r0010.MapExam2;

public class ExceptionExam {
	MapExam2 me2 = new MapExam2();
	MapExam2 me3;
	MapExam2 me4;
	public static void main(String[] args) {
		try{
			ExceptionExam ee = new ExceptionExam();	
			ee.me2.put("test", 123);
			ee.me3.put("test", 123);
			ee.me4.put("test", 123);
			}catch(NullPointerException e) {
				System.out.println(e.getCause());
						System.out.println("no");
					}
		
	}

}
