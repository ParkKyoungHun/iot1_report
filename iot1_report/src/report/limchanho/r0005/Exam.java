package report.limchanho.r0005;

public class Exam {
	public static void main(String[] args) {
		// Rovot클래스가 가지고 있는 3가지 함수를 호출해서 결과값을 출력해주세요.
		// 단 로봇의 이름은 지로봇, 나이는 10살 입니다.
		// Cal클래스를 사용하여 더하기 빼기 곱하기 나누기 연산값을 출력해주세요.
		// 단 첫번째 변수는 10 두번째 변수는 2 입니다.

		Robot rb = new Robot("지로봇", 10);
		rb.doKick();
		rb.doRun();
		rb.doChange();

		
		for(int i=1;i<=10;i++){
			Cal c1 = new Cal(i, (11-i), "+");
			c1.printCal();
		}
//		c1.printCal();
//		c1 = new Cal(10, 2, "-");
//		c1.printCal();
//		c1 = new Cal(10, 2, "*");
//		c1.printCal();
//		c1 = new Cal(10, 2, "/");
//		c1.printCal();
	}

}
