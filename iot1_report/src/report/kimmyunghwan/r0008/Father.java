package report.kimmyunghwan.r0008;

public class Father {

	Father() {
		this(1);
		System.out.println("기본 아빠 생성자 호출!!");
	}

	Father(int a) {
		System.out.println("오버로딩 개녕으로 추가한 아빠 생성자 호출!!");
	}

	public static void main(String[] args) {
		Father f = new Father();

	}
}
