package report.kimmyunghwan.r0005;

public class Exam {
	
		String str;
		
		Exam(){
			
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
		Cal_02 c03 = new Cal_02(10,2,"-");
		Cal_02 c04 = new Cal_02(10,2,"*");
		Cal_02 c05 = new Cal_02(10,2,"/");
		
		
		
		c02.printCal();
		c03.printCal();
		c04.printCal();
		c05.printCal();
		
	}

}
