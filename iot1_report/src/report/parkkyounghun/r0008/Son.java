package report.parkkyounghun.r0008;

public class Son extends Father{
	// 아빠 클래스에서  배열변수를 선언하시고 10명의 학생의 점수를 입력받아주세요.
	// 단 배열변수의 데이터 타입은 int형이여야 합니다.
	// 출력함수는 아빠 클래스에서 선언해주시고
	// 호출만 아들 클래스에서 해주시기 바랍니다.
	Son(){
		System.out.println("아들 기본생성자 호출!!");
	}
	Son(int a){
		System.out.println("오버로딩 개념으로 추가된 아들 생성자 호출!!");
	}

	public static void main(String[] args){
		Son s = new Son();
		s.printIWithLoop();
	}
}
