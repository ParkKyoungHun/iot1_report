package report.kimmyunghwan.r0006;

public class RExam2_1 {

	protected int a = 1;
	protected int b = 2;
	
	protected int getA(){
		return a; // 위에서 선언한 a값을 보내라
	}
	
	protected int getB(){
		return b;
	}
	
	protected void setA(int a){
		this.a=a;
	}
	
	protected void setB(int b){
		this.b=b;
	}
	
//	public int getA(){
//		return a; // 위에서 선언한 a값을 보내라
//	}
//	
//	public int getB(){
//		return b;
//	}
	

	protected void printA(int a) { // a와 b가 무엇이든 출력 할 수 있다. 디폴트임. 없으므로 public 써주면
		// public int a=3
		this.a=a;
		System.out.println(this.a);
	}

	protected void printB(int b) {
		this.b=b;
		System.out.println(this.b);
	}

	public static void main(String[] args) {

		RExam2_1 re2 = new RExam2_1();

		System.out.println(re2.a);

		RExam2_1 re3 = new RExam2_1();
		System.out.println(re3.b);
	}

}
