package report.kimmyunghwan.r0008;

public class Son extends Father {

	Son() { // 빈 생성자 만들기
		super(1);
		System.out.println("기본 아들 생성자 호출!!");
	}

	// this는 나
	// super는 상속자를 가르킴

	Son(int a) {
		System.out.println("오버로딩으로 개념으로 추가한 아들 생성자 호출!!");
	}

	public static void main(String[] args) {
		Son s = new Son(); // son이라는 생성자를 호출
		System.out.println(s);
	}
}
