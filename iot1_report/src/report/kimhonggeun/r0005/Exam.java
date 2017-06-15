package report.kimhonggeun.r0005;

public class Exam {
	public static void main(String[]args){
		//로봇 클래스가 가지고있는 3가지 함수를 호출 결과값 출력
		//로봇의 이름은 지로봇 나이는 10살
		//칼클래스 사용 더하기뺴기곱하기나누기연산값 출력
		//첫번째변수 10 두번쨰 2
		Robot r1 = new Robot("지로봇",10);
		r1.doChange();
		r1.doKick();
		r1.doRun();
		
		Cal c2 = new Cal();
		c2.str();
		
	}
}
