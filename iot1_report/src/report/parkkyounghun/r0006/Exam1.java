package report.parkkyounghun.r0006;

public class Exam1 {
	String print(int num){
		System.out.println("프린트함수호출");
		if(num==1){
			return "아무개";
		}
		return "저무개";
	}
	public static void main(String[] args){
		Exam1 e = new Exam1();
		String str = e.print(2);
		System.out.println(str);
	}
}
