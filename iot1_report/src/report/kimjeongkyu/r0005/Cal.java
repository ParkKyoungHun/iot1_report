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
	String op;
	
	Cal(int a){
		System.out.println(a + "인트형변수 파라메터를 한개를 가진 생성자를 호출하셨네요!");
		this.a = a;
	}
	
	
	Cal(int n1, int n2, String inputO){
		this.a = n1;
		this.b = n2;
		
		//이게 중요함
		this.op = inputO;
	}	
	void printCal(){
		
		if(op.equals("+")){
			System.out.println(a + "+"+  b +"= " +( a + b));
		}else if(op.equals("-")){
			System.out.println(a +" - " + b +" = " + (a - b));
		}else if(op.equals("*")){
			System.out.println(a +" * " + b +" = " + (a * b));
		}else if(op.equals("/")){
			System.out.println(a +" / " + b +" = " + (a / b));
		}
		
	}	
	
	void printPlus(){
		System.out.println("a + b =" + a + b);
}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요.");
		String num1= scanner.nextLine();
		int n1  = Integer.parseInt(num1);
		
		System.out.print("원하시는 연산자를 입력해주세요.");
		String inputO= scanner.nextLine();
		
		System.out.print("두번째 숫자를 입력해주세요.");
		String num2= scanner.nextLine();
		int n2  = Integer.parseInt(num2);
		Cal call = new Cal(n1, n2, inputO);
		call.printCal();

	}
	
}
