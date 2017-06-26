package report.parkjonghun.r0011;

import java.util.Scanner;

public class ExceptionExam1 {
	
	 // ExceptionExam1의 멤버 변수로 int num1, num2를 선언해주세요.
	// 멤버변수 num1과 num2값을 계산하여 int값을 리턴하는
	// plus() minus() multiple() division()함수를 4개선언하여 이름에 맞게 연산하여 리턴해주세요.
	// scanner 클래스의 nextLin()함수를 사용하여 num1의 값과 num2 값을 대입해주세요.
	// 숫자값을 입력하지 않았을때는 Exception에서 "숫자를 입력해야지!!"라는 문자열이 나와야 합니다.
	// 정상적으로 숫자 값을 입력했다면
	// 위에 선언한 4개의 함수를 호출하여 값을 받아 출력하는 예제를 작성해주시기 바랍니다.
	int num1;   //final int num1; (상수 : 절대 바뀌지 않는 값.) 상수 값은 멤버변수나 생성자에서 선언을 해줘야 에러가 안난다.
	//상수값 규칙 NUM_EXAM (모두 대문자로 입력하며 2단어일시 _(언더바)를 붙인다. 이유 : 
	int num2;
	int result;
	
	ExceptionExam1(){
		
	}
	
	
	int plus(){
		result = num1 + num2;
		return result; //result 를 빼고 (num1+num2)로 했었으면 result를 안써도 된다.
	}
	int minus(){
		result = num1 - num2;
		return result;
	}
	int multiple(){
		result = num1 * num2;
		return result;
	}
	int division(){
		result = num1 / num2;
		return result;
	}
	
	
	public static void main(String[] args){
		ExceptionExam1 ee1 = new ExceptionExam1();
		Scanner scan = new Scanner(System.in);
		try{ // 예외 처리 시 사용하는 try문.
			System.out.print("첫 번째 정수의 값을 입력해주세요. => ");
			String str = scan.nextLine();
			ee1.num1 = Integer.parseInt(str);
			
			System.out.print("두 번째 정수의 값을 입력해주세요. => ");
			str = scan.nextLine();
			ee1.num2 = Integer.parseInt(str);
			
			ee1.plus();
			System.out.println("두 정수를 더하기한 값은 => " + ee1.plus());
			ee1.minus();
			System.out.println("두 정수를 빼기한 값은 => " + ee1.minus());
			ee1.multiple();
			System.out.println("두 정수를 곱하기한 값은 => " +ee1.multiple());
			ee1.division();
			System.out.println("두 정수를 나누기한 값은 => " +ee1.division());
			
		}catch(Exception e){
			System.out.println("숫자를 입력해야지!!");
		}finally{
			System.out.println("에러가 나오든 안나오든 무조건 실행되게 하기!!");
		}
	}

}
