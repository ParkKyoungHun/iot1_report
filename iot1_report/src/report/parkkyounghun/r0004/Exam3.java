package report.parkkyounghun.r0004;

public class Exam3 {
	int a = 0;
	int b = 0;
	int result = 0;
	public Exam3(){
		this.result  = 0;
	}
	public Exam3(int a, int b){
		this.a = a;
		this.b = b;
		this.result = this.a + this.b;
		int c = 1;
	}
	
	public static void main(String[] args){
		Exam3 e = new Exam3(1,2);
		e.b = 4;
		System.out.println(e.result);
		
		Exam3 e2 = new Exam3(2,2);
		System.out.println(e2.result);
	}
}
