package report.parkkyounghun.r0008;

public class Exam1 extends Father{
	int a = 1;
	int b = 2;
	Exam1(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(1);
	}
	
	public static void main(String[] args){
		Exam1 ex = new Exam1(1,2);
	}
}
