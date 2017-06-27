package report.chasungwoo.r0008;

public class Son extends Father{
	//아빠 클래스에서 값을 str1, str2를 scanner클래스의 nextLine()함수를 사용하여 값을 입력받아
	//숫자값을 입력받아 정수로 변환해 주시고
	//첫번째 값은 반복문의 초기값 두번째값은 반복문의 맥스값
	//반복문만큼 i의 값을 출력하는 함수를 아빠 클래스에 선언해주시고
	// 아들클래서에서 호출화여 결과값을 나타내주세요.
	
	//아빠 클래스에서 배열변수를 선언하시고 10명의 학생의 점수를 입력받아주세요
	//단 배열변수의 데이터 탇입은 int형이어야 합니다.
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
		/*s.inputFromScanner1();
		s.inputFormScanner2();
		s.compNum();
		s.funcFor();*/
		s.studentPoints();
		s.printGrade();
	}
}

