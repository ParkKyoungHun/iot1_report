package report.kimmyunghwan.r0006;

public class Son_01 extends Father_01 {
	int a;

	public static void main(String[] args) {

		Son_01 s = new Son_01();
		s.a = 3;
		
//		Father f = new Father(); father 클래스에 private를 사용하여서  초기화 안함
		
		System.out.println(s.getAdress());
		System.out.println(s.getAge());
		System.out.println(s.getName());
		s.setName("박경훈");
		System.out.println(s.getName());

	}

}
