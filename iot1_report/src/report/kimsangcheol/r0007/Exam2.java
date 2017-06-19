package report.kimsangcheol.r0007;

public class Exam2 {
	public static void main(String[]args){
		Exam1 e1 = new Exam1();
		System.out.println(e1.a);
		System.out.println(e1.b);
		
		Exam1 e2 = new Exam1();
		e1.a = 4;
		e1 = new Exam1();
		System.out.println(e2.a);
		System.out.println(e2.b);
	}
}