package report.kimmyunghwan.r0006;

public class Son extends Father {
	int a;

	int getAge() {

		return 25;
	}

	public static void main(String[] args) {

		Son s = new Son();
		s.a = 3;
		System.out.println(s.address);
		System.out.println(s.getAge());

		Father f = new Father();
		System.out.println(f.address);
	}

}
