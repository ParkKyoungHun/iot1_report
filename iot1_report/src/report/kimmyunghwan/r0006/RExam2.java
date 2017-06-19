package report.kimmyunghwan.r0006;

public class RExam2 {

	int a = 1;
	int b = 2;
	
	public int getA(){
		return a; // 위에서 선언한 a값을 보내라
	}
	
	public int getB(){
		return b;
	}
	
	public void setA(int a){
		this.a=a;
	}
	
	public void setB(int b){
		this.b=b;
	}
	
//	public int getA(){
//		return a; // 위에서 선언한 a값을 보내라
//	}
//	
//	public int getB(){
//		return b;
//	}
	

	public void printA(int a) { // a와 b가 무엇이든 출력 할 수 있다. 디폴트임. 없으므로 public 써주면
		// public int a=3
		this.a=a;
		System.out.println(this.a);
	}

	public void printB(int b) {
		this.b=b;
		System.out.println(this.b);
	}

	public static void main(String[] args) {

		RExam2 re2 = new RExam2();

		System.out.println(re2.a);

		RExam2 re3 = new RExam2();
		System.out.println(re3.b);
	}

}
