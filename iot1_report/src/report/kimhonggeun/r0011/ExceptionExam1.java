package report.kimhonggeun.r0011;

import java.util.Scanner;

public class ExceptionExam1 {

	//클래스의 멤버변수로 int num1, num2를 선언
	//멤버변수 num1과 num2값을 계산하여 int 값을 리턴하는
	//plus(), minus(), multiple(), division()함수를 4개 선언하여 이름에 맞게 연산하여 리턴
	//Scanner클래스의 nextLine()함수를 사용하여 num1의 값과 num2값을 대입해주세요
	//숫자값을 입력하지 않았을때는 클래스에서 숫자를 입력해야지!라는 문자열이 나와야합니다.
	//정살적으로 숫자 값을 입력했따면
	//위에 선언한 4개의 함수를 호출하여 값을 받아 출력하는 예제를 작성해라.
	int num1,num2;
	int result;
	int plus(){
		result = num1+num2;
		return result;
	}
	int minus(){
		result = num1-num2;
		return result;
	}
	int multiple(){
		result = num1*num2;
		return result;
	}
	int division(){
		result = num1/num2;
		return result;
	}
	public static void main(String[]args){
		try{
			Scanner scan = new Scanner(System.in);
			ExceptionExam1 ee = new ExceptionExam1();
			System.out.print("처음값 =");
			ee.num1 = Integer.parseInt(scan.nextLine());
			System.out.print("다음값 =");
			ee.num2 = Integer.parseInt(scan.nextLine());


			ee.plus();
			System.out.println(ee.result);
			ee.minus();
			System.out.println(ee.result);
			ee.multiple();
			System.out.println(ee.result);
			ee.division();
			System.out.println(ee.result);

		}catch(Exception e){
			System.out.println("숫자입력해라");
		}finally{
			System.out.println("즐");
		}
	}
}
