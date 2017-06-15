package report.parkkyounghun.r0005;

public class Exam2 {

	public static void main(String[] args){
		//0부터 4까지 반복하는 반복문을 작성하여
		// Cal(int a)라고 선언된 생성자를 호출하여 1부터 5까지 출력을 해보시기 바랍니다.
		Cal[] c = new Cal[5];
		for(int i=0;i<=4;i++){
			c[i] = new Cal(i+1);
		}
		c[0] = new Cal(1);
		c[1] = new Cal(2);
		c[2] = new Cal(3);
		c[3] = new Cal(4);
		c[4] = new Cal(5);
		for(int i=0;i<=4;i++){
			System.out.println(c[i].a);
		}
		System.out.println(c[0].a);
		System.out.println(c[1].a);
		System.out.println(c[2].a);
		System.out.println(c[3].a);
		System.out.println(c[4].a);
	}
}
