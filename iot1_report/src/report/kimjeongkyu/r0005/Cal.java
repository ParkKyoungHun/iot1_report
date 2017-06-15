package report.kimjeongkyu.r0005;

import java.util.Scanner;


public class Cal {
	//인트타입 2개의 파라메터 변수를 받는 생성자를 하나 만들어 주세요.
	// 클래스안에 인트타입의 변수 2개를 선언하고
	// 클래스안에 있는 변수 2개에 생성자에서 받은 파라메터 변수의 값을 대입하여
	// printPlus()를 함수에서 2개의 변수를 더한 값을 출력해주세요.
	
	//클래스안에 스트링타입의 연산자를 저장하는 변수를 선언.
	//생성자에서 연산자를 저장하는 로직을 만들고
	//printCal()이라는 함수를 만들어 해당함수를 호출하였을때 알맞은 연산이 되는 프로그램 만들기.
	
	int a;
	int b;
	String operator;
	Cal(){
		
	}
	Cal(int a){
		this.a = a;
	}
	
	Cal(int a, int b, String operator){
		this.a = a;
		this.b = b;
		this.operator = operator;
	}
	void printCal(){
		
		if(operator.equals("+")){
			System.out.println(a + " + " + b + " = " + (a + b));
		}else if(operator.equals("*")){
			System.out.println("a * b = " + (a * b));
		}else if(operator.equals("/")){
			System.out.println("a / b = " + (a / b));
		}else if(operator.equals("-")){
			System.out.println("a - b = " + (a - b));
		}else{
			System.out.println("연산자가 틀렸어요");
		}
	}
	
	public static void main(String[] args){
		Cal c = new Cal(2,3, "+");
		c.printCal();
	}
}