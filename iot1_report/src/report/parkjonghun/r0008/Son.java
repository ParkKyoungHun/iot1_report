package report.parkjonghun.r0008;

public class Son extends Father {
	// 문제 1
	// 아빠 클래스에서 값을 str1, str2를 scanner클래스의 nextLine()함수를 사용하여 값을 입력받아주세요.
	// 숫자값을 입력받아 정수로 변환해주시고
	// 첫번째 값은 반복문의 초기값 두번째 값은 반복문의 맥스값
	// 반복문만큼 i의 값을 출력하는 함수를 아빠 클래스에 선언해주시고 
	// 아들 클래스에서 호출하여 결과갑을 나타내주세요.
	
	//문제 2
	// 아빠 클래스에서 배열변수를 선언하시고 10명의 학생의 점수를 입력받아주세요.
	// 단 배열변수의 데이터 타입은 int형이여야 합니다.
	// 출력함수는 아빠 클래스에서 선언해주시고
	// 호출만 아들 클래스에서 해주시기 바랍니다.
	
	Son(){  //super로 파더 클래스의 특정 생성자를 지목하지 않는 한 무조건 파더 클래스의 기본 생성자를 부른다.
		//super(1);
		//this(1);
		//System.out.println("기본 아들 생성자 호출!!!");
		// 6월 21일 리스트 맵 하기로함.
	}
	Son(int a){
		System.out.println("오버로딩으로 추가한 아들 생성자 호출");
	}
	
	public static void main(String[] args){
		Son s = new Son(); // 실행 시 무조건 아빠 클래스의 기본 생성자를 호출한다. (super로 지목하지 않는 한.!!)		
		//s.printNum();
		//s.scorePrint();
		s.scorePrintLoop();
	}

}
