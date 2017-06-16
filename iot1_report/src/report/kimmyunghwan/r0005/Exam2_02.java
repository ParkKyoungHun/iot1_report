package report.kimmyunghwan.r0005;

public class Exam2_02 {

	public static void main(String[] args) {
	
		Cal_02[] c = new Cal_02[5];  //Cal 이라는 클래스

		for (int i = 0; i <= 4; i++) {
			c[i] = new Cal_02(i+1);
		}
		
		
		for (int i = 0; i <= 4; i++) {
		System.out.println(c[i].a); // c[i].a   .은 의
		}
	}

}
