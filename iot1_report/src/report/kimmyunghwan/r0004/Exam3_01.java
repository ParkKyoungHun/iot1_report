package report.kimmyunghwan.r0004;



public class Exam3_01 {
	int a = 0;
	// int b = 0;

	public void Exam3_01() {

	}

	public void Exam3_01(int a) {
		this.a = a;
	}

	// public void Exam3(int a, int b) { //int a는 아래 a를 가리킴

	// this.a = a; //클래스 안에서 선언된 (만든) 변수여야함, 맨위 상단 int a=0 을 가르키는것
	// b = b;
	// }

	public static void main(String[] args) {
		Exam3_01 e = new Exam3_01();
		System.out.println(e.a);
		// int a = 4;
		// 메인메소드 안에서는 맨위에 int a=0; 값에 영향을 안받고 메인메소드에서 정의한 int a=4; 값을 받아들인다
	}

}
