package report.nayoungwoo.r0011;

public class Exam3 {

	final int a;
	
	Exam3() {
		a = 1;
	}
	
	Exam3(int num) {
		
		a = 2;
	}
	
	public static void main(String[] args) {
		Exam3 e = new Exam3();
		System.out.println(e.a);
		e= new Exam3(1);
		System.out.println(e.a);
	}
}
