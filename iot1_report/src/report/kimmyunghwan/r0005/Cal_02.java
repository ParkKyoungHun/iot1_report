package report.kimmyunghwan.r0005;

import java.util.Scanner;

public class Cal_02 {
	// 인트타입의 2개의 파라메터 변수를 받는 생성자를 하나 만들어주세요
	// 클래스안에 인트타입의 변수 2개를 선언해주시고(int a; int b; <-- 멤버변수_어디에든 사용할수 있기때문에)
	// 클래스안에 있는 변수2개에 생성자에서 받은 파라메터 변수의 값을 대입하여
	// printPlus()를 함수에서 2개의 변수를 더한 값을 출력해주세요.
	// 클래스안에 스트링 타입의 연산자를 저장하는 변수를 선언
	// 생성자에서 연산자를 저장하는 로직은 만들고
	// printCal()이라는 함수를 만들어 해당함수를 호출하였을때 알맞은 연산이 되는 프로그램 만들기

	int a;
	int b;
	String str;

	Cal_02(int a, int b, String str) {
		this.a = a;
		this.b = b;
		this.str = str;
	}

	void printCal() {
		if (str.equals("+")) { // == 은 메모리를 비교 equals는 값을 비교
			System.out.println("a + b= " + (a + b));
		} else if (str.equals("-")) { 
			System.out.println("a - b= " + (a - b));
		} else if (str.equals("*")) {  
			System.out.println("a * b= " + (a * b));
		} else if (str.equals("/")) {
			System.out.println("a / b= " + (a / b));
		} else {
			System.out.println("연산자가 틀렸어요");
		}
	}
	// void printPlus() {
	// System.out.println("a + b = " + a + b);
	// }

	public static void main(String[] args) {
		Cal_02 c = new Cal_02(10, 2, "*");
		
		c.printCal();

	}
}
