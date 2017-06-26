package report.parkkyounghun.r0011;

public class Exam2 {
	Exam e = new Exam();
	int a = 1;
	Exam2(){
		System.out.println("Exam2생성자 호출했네?");
	}
	public static void main(String[] args){
		Exam2 e2 = new Exam2();
		System.out.println(e2.e.a);
	}
}
