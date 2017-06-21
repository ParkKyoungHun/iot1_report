package report.umwoosung.r0008;

public class son0 extends Father0 {

	Son0() {
		System.out.println();

	}

	Son0(int a) {
		System.out.println("오버로딩 개념으로 추가된 아들 생성자 호출!!");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s. InpuFromScanner1();
		s. InpuFromScanner2();
	}
}