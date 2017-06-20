package report.chasungwoo.r0008;

public class Father {
	int a = 3;

	Father(){
		System.out.println("아빠 기본생성자 호출!!");
	}
	Father(int a){
		System.out.println("오버로딩 개념으로 추가된 아빠 생성자 호출!!");
	}
}
