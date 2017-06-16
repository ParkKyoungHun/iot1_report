package report.chasungwoo.r0005;

public class Exam {
	//Robot 클래스에서 3가지 함수 호출 결과값 출력
	//이름 지로봇 나이 10살
	//Cal클래스 더빼곱나 연산값 출력
	//첫번째 변수는 10 두번째는 2
	int[] val1 = new int[10];
	int[] val2 = new int[10];
	void decal(){

		Cal c = new Cal();
		for(int i = 1; i<=10; i++){
			c.receiver(i, (11-i), "+");
			c.printCal();
		}

	}

	public static void main(String[] args){
		Robot rbt = new Robot("zirobot", 10);
		rbt.doKick();
		rbt.doRun();
		rbt.doChange();

		Cal cl = new Cal();
		Exam ex = new Exam();
		ex.decal();
		cl.calcIn();
		cl.printCal();
	}

}
