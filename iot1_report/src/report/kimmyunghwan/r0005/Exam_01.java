package report.kimmyunghwan.r0005;

public class Exam_01 {
	//강사님코드
		String str;
		
		Exam_01(){
			
		}
		
	public static void main(String[] args) {
		//Robot클래스가 가지고 있는 3가지 함수를 호출해서 결과값을 출력해주세요
		//단 로봇의 이름은 지로봇, 나이는 10살입니다.
		//Cal 클래스를 사용하여 더하기 빼기 곱하기 나누기 연산값을 출력해주세요
		//단 첫번째 변수는 10 두번째 변수는 2입니다.
		
		Robot_01 r01 = new Robot_01("지로봇", 10);
		
		r01.doKick();
		r01.doRun();
		r01.doChange();
		
		Cal_02 c02 = new Cal_02(10,2,"+"); 
		c02 = new Cal_02(10,2,"*");
		c02 = new Cal_02(10,2,"/");
		
			// Cal_02는 데이타 타입 , int처럼
		
			// int a = 1;
			// int a = 2; 입력하면 안되지만, 
		
			// int a = 1;
			// 		a = 2; 하면  각각의 값을 a에 입력 할 수 있다.
		
		
		c02.printCal();
		c02.printCal();
		c02.printCal();
		c02.printCal();
		
	}

}
